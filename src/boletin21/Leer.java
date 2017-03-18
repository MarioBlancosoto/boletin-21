
package boletin21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Leer {
    
    Scanner sc;
    File ficheiro;
    PrintWriter p =null;
   ArrayList <String> lista = new ArrayList<String>();
  
   
    public void engadir(String nomeFicheiro){
     
       
       
       
            ficheiro = new File (nomeFicheiro);
        try {
            
            p = new PrintWriter(new FileWriter(nomeFicheiro,true));
            
            for(int i=0;i<lista.size();i++){
                p.print(lista.get(i)+"");
            }
            p.println();
            
        } catch (IOException ex) {
            System.out.println("Erro"+ex);
        }
          finally{
          p.close();
          
        }
            
         
      
        
    }
    public void mostrarLista(String nomeFicheiro){
      sc = new Scanner(nomeFicheiro);
      ficheiro = new File(nomeFicheiro);
      String cadena = JOptionPane.showInputDialog("Introduce la cadena de caracteres");
       JOptionPane.showMessageDialog(null,cadena);
      cadena = sc.nextLine();
      String palabras[]= cadena.split(" ");
      for(int i=0;i<palabras.length;i++){
          lista.add(palabras[i]);
      }
      Collections.sort(lista);
      engadir(nomeFicheiro);
      
    }
   
}
