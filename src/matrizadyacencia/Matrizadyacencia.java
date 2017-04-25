package matrizadyacencia;

import java.util.ArrayList;
import java.util.Scanner;

public class Matrizadyacencia {

    public static void main(String[] args) {

        String num;
        int sw = 1;

        // Definir la lista de nodos.
        ArrayList<Node> nodes = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        //Agregar nodos a la lista.
        while(sw!=0) {

            
            System.out.println("Digite la informacion del nodo");
            num = entrada2.nextLine();
            Node n = new Node(num);
            System.out.println("Desea añadir nodos? Si=1, No=0");
            sw = entrada.nextInt();
            nodes.add(n);

        }

        /* n = new Node("B");
        nodes.add(n);
        n = new Node("C");
        nodes.add(n);
        n = new Node("D");
        nodes.add(n);
        n = new Node("E");
        nodes.add(n);
        n = new Node("F");
        nodes.add(n);*/
        //Definir matriz de adyacencia e ingresar nodos.
        
        
        int[][] graph = {{0, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 0}, {1, 0, 0, 0, 1, 1}, {1, 0, 0, 0, 0, 1},
        {1, 1, 1, 0, 0, 0}, {1, 0, 1, 1, 0, 0}};

        new GraphViewer(nodes, graph);

    }

}
