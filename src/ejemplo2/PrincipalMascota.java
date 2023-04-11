package ejemplo2;

import ejemplo1.ObjectSerializer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalMascota {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner x = new Scanner(System.in);
        List<Mascota2> mascotaList = new ArrayList<>();

        int opcion = 0;
        do{
            System.out.println("1. Guardar 2. Leer 3. Salir");
            opcion = x.nextInt();
            switch (opcion){
                case 1:{
                    System.out.println("Nombre mascota: ");
                    String nom = x.next();
                    System.out.println("Raza  mascota: ");
                    String raza = x.next();
                    System.out.println("Vacunas mascota: ");
                    int vacunas = x.nextInt();
                    mascotaList.add(new Mascota2(nom, raza, vacunas));
                    ObjectSerializer.writeObjectToFile(mascotaList, "mascotas.ax");
                    System.out.println("Object written to file");
                    break;
                }
                case 2:{
                    System.out.println("Object read from file:");
                    mascotaList.forEach(System.out::println);
                    break;
                }
                case 3:{
                    opcion = 3;
                    break;
                }
            }
        }while(opcion != 3);

    }
}
