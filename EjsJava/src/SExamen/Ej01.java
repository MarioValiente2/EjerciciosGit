package SExamen;

import java.io.IOException;
import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) throws IOException {
        char respuesta = '0';
        int salir = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Elige una opcion: A(SUMA DE IMPARES), B(MAYÚSCULAS Y MINÚSCULAS), C(INFO PERSONAL), D(SALIR)");
            respuesta = (char) System.in.read();
            System.in.read();
            switch (respuesta) {
                case 'A':
                    int numero = 0;
                    int cont = 0;
                    int num2 = 0;
                    int suma = 0;

                    System.out.println("Introduzca numeros");
                    do {
                        cont = 0;
                        numero = scanner.nextInt();
                        num2 = numero;
                        if (numero != 1 && numero != -1) {
                            while (cont != 2 && num2 > 1) {
                                if (numero % num2 == 0) {
                                    cont++;
                                }
                                num2--;
                            }
                            if (cont < 2) {
                                System.out.println("El numero es primo");
                                suma = suma + numero;
                            } else
                                System.out.println("El numero no es primo");
                        }
                    } while (numero != 1 && numero != -1);
                    System.out.println("La suma de numeros primos es:" + suma);
                    break;
                case 'B':
                    System.out.println("Introduzca texto");
                    char letra;
                    do {
                        letra = (char) System.in.read();
                        if (letra >= 65 && letra <= 90 || letra==32) {
                            System.out.print(letra);
                        }else if (letra >= 97 && letra <= 122) {
                            letra = (char) (letra - 32);
                            System.out.print(letra);
                        }
                    } while (letra != 10);
                    System.out.println();
                    break;
                case 'C':

                    System.out.println("Introduzca Nombre");
                    String nombre=scanner.nextLine();
                    System.out.println("Introduzca Apellido 1");
                    String apellido=scanner.nextLine();
                    System.out.println("Introduzca Apellido 2");
                    String apellido2=scanner.nextLine();
                    System.out.println("Introduzca DNI");
                    String dni=scanner.nextLine();
                    StringBuilder raices=new StringBuilder(nombre.substring(0,1)).append(apellido.toLowerCase(), 0,3).append(apellido2.toLowerCase(),0,3).append(dni,6,9);
                    System.out.println(raices);
                    break;
                case 'D':
                    salir = 2;
                    break;
                default:
                    System.out.println("Esa opción no vale");
            }
        } while (salir != 2);

    }
}
