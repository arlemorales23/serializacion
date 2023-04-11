package ejemplo3;



import ejemplo1.ObjectSerializer;
import ejemplo3.modelo.Mascota;
import ejemplo3.respositorio.CrudRepositorio2;
import ejemplo3.respositorio.MascotaListRepositorio;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class VistaPrincipal {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String opc = "1";
        CrudRepositorio2 repo = new MascotaListRepositorio();

        do {
            Scanner s = new Scanner(System.in);
            System.out.print("Menu \n 1. Agregar  \n 2. Listar \n 3. Editar " +
                    "\n 4. Eliminar \n 5. Contar \n 6. Salir \n =>");
            opc = s.next();
            switch (opc) {
                case "1": {
                    System.out.print("ingrese id del registro mascota: ");
                    Integer i = s.nextInt();
                    System.out.println("Ingrese nombre: ");
                    String nom = s.next();
                    System.out.println("ingrese Raza: ");
                    String raza = s.next();
                    repo.crear(new Mascota(i, nom, raza));
                    break;
                }
                case "2": {
                    List<Mascota> mascotas = repo.listar();
                    mascotas.forEach(System.out::println);
                    break;
                }
                  case "3": {
                    System.out.println("===== editar ====");
                    System.out.print("ingrese id del registro mascota: ");
                    Integer i = s.nextInt();
                    System.out.print("ingrese nombre: ");
                    String nom = s.next();
                    System.out.print("ingrese Raza: ");
                    String raza = s.next();
                    Mascota beaActualizar = new Mascota(i, nom, raza);
                    repo.editar(beaActualizar);
                    break;
                }
                case "4": {
                    System.out.println("===== eliminar ======");
                    System.out.print("ingrese id del registro: ");
                    Integer id = s.nextInt();
                    repo.eliminar(id);
                    repo.listar().forEach(System.out::println);
                    break;
                }
                case "5": {
                    System.out.println("===== total ===== ");
                    System.out.print("Total registros: " + repo.total() +"\n");
                    break;
                }
                case "6": {
                    opc = "6";
                    break;
                }
            }
        } while (opc != "6");
    }
    }


