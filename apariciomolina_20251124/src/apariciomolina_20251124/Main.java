/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apariciomolina_20251124;

public class Main {

    public static void main(String[] args) {
        GrafoRecursivo grafo = new GrafoRecursivo(4);
        
        grafo.insertarNodo('A');//indice 0
        grafo.insertarNodo('B');//indice 1
        grafo.insertarNodo('C');//indice 2
        grafo.insertarNodo('D');//indice 3
        
        grafo.conectar(0, 1);//A,B
        grafo.conectar(0, 2);//A,C
        grafo.conectar(1, 3);//B,D
        grafo.conectar(2, 3);//C,D
        
        System.out.println("Recorrido o Depth First Search, desde el nodo A");
        
        grafo.dfs(0);
        //teoricamente el recorrido es:
        //visita nodo a
        //luego visita nodo b(seria el primer adyacente de a)
        //luego visita d(que seria el adyacente de b)
        //luego retrocede(vuelve a la raiz) y visita c(que seria el adyacente no visitado de a)
    }
    
}
