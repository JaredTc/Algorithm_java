package clasificacion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Clasificacion {

    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            Scanner sn = new Scanner(System.in);
            int opcion;
            String alf;
            System.out.println("1. Validador Consola");
            System.out.println("2. Validador GUI");
            System.out.println("3. Salir");
            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    Scanner dato = new Scanner(System.in);
                    System.out.println("Ingresa una cadena");
                    alf = dato.nextLine();

                    for (int i = 0; i < alf.length(); i++) {
                        if (Character.toString(alf.charAt(i)).matches("[A-Z]*")) {
                            System.out.println(alf.charAt(i));
                        }
                    }
                    for (int i = 0; i < alf.length(); i++) {
                        if (Character.toString(alf.charAt(i)).matches("[1-9]*")) {
                            System.out.println(alf.charAt(i));
                        }
                    }
                    for (int i = 0; i < alf.length(); i++) {
                        if (Character.toString(alf.charAt(i)).matches("[a-z]*")) {
                            System.out.println(alf.charAt(i));
                        }
                    }
                    break;

                case 2:
                    Validator vl = new Validator();
                    vl.setVisible(true);

                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 3");
            }

        }

    }

}
