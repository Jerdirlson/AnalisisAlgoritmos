import java.util.Iterator;
import java.util.Scanner;

import doublee.linked.DoubleLinkedList;
import interfaces.categories.Categoria;
import interfaces.node.NodeInterface;

public class App {
    private static DoubleLinkedList<Object> Categories = new DoubleLinkedList<>();
    public static void main(String[] args) throws Exception {

        //Crear las categorias.
        Categoria[] categoriasArray = {
            new Categoria("Computadores"),
            new Categoria("Celulares"),
            new Categoria("Electrodomesticos"),
            new Categoria("TV"),
            new Categoria("Accesorios" ),
            new Categoria("Videojuegos"),
            new Categoria("Audio y video"),
        };

        for (Categoria categoria : categoriasArray) {
            Categories.add(categoria);
        }



         Scanner scanner = new Scanner(System.in);
         Integer choice;
         String CategoriaAgregar;
         String CategoriaEliminar;
         String indiceCategoria;
         Iterator<NodeInterface<Object>> iteratorCategorie = Categories.iterator();


         do {
            System.out.println("MENU:");
            System.out.println("1. Agregar Categoria");
            System.out.println("2. Eliminar una categoria");
            System.out.println("3. Mostrar categorias");
            System.out.println("4. Agregar o eliminar un producto a alguna categoria");

            System.out.print("Ingrese su elección: ");
            choice = scanner.nextInt();
            

            switch (choice) {
                case 1:
                    System.out.println("Ingrese el nombre de la categoria");
                    CategoriaAgregar = scanner.next();

                    while(iteratorCategorie.hasNext()){
                        NodeInterface<Object> node1 = iteratorCategorie.next();
                        System.out.println(node1.getObject() == CategoriaAgregar);
                        if (!node1.isEquals(CategoriaAgregar)) {
                            System.out.println("Esta intentando meter una categoria que ya existe");
                            break;
                        }
                    }
                    Categories.add(CategoriaAgregar);
                    break;
                    case 2:
                    System.out.println("Ingrese el nombre de la categoria a eliminar");
                    CategoriaEliminar = scanner.next();
                    boolean existeEliminar = false;

                    Iterator<NodeInterface<Object>> iteratorEliminar = Categories.iterator();
                    while (iteratorEliminar.hasNext()) {
                        NodeInterface<Object> node1 = iteratorEliminar.next();
                        if (node1.getObject().toString().equals(CategoriaEliminar)) {
                            Categories.remove(node1);
                            System.out.println("Categoría eliminada: " + CategoriaEliminar);
                            existeEliminar = true;
                            break;
                        }
                    }

                    if (!existeEliminar) {
                        System.out.println("La categoría no existe: " + CategoriaEliminar);
                    }
                    break;
                case 3:
                    Iterator<NodeInterface<Object>> iterator1 = Categories.iterator();
                    while(iterator1.hasNext()){
                        NodeInterface<Object> node1 = iterator1.next();
                        System.out.print(node1.getObject() + " ");
                    }

                    break;

                case 4:
                    do {
                        System.out.println("Elija el nombre de la categoria a ingresar el producto");

                        while(iteratorCategorie.hasNext()){
                            NodeInterface<Object> node1 = iteratorCategorie.next();
                            System.out.print(node1.getObject() + " ");
                        }
                        indiceCategoria = scanner.next();

                        while(iteratorCategorie.hasNext()){
                            NodeInterface<Object> node1 = iteratorCategorie.next();
                            
                            if (!node1.isEquals(indiceCategoria)) {
                                System.out.println("No existe esa categoria.");
                                break;
                            }

                        }                    
                        
                    } while (indiceCategoria == "");
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
            
                default:
                System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
         } while (choice != 0);

        
        Iterator<NodeInterface<Object>> iterator = Categories.iterator();
        while(iterator.hasNext()){
            NodeInterface<Object> node1 = iterator.next();
            System.out.print(node1.getObject() + " ");
        }

    }
}
