package com.paulosa.questao7;

import com.paulosa.arrays.Array;

import java.util.ArrayList;
import java.util.List;

public class Conjunto {
   private ArrayList<String> elementos = new ArrayList<>();

   public void adicionarElemento(String elemento){
    if (elementos.contains(elemento)){
        System.out.println("Elemento ja adicionado");
    } else {
        elementos.add(elemento);
    }
   }

   public void conferirElemento(String elemento){
       if (elementos.contains(elemento)){
           System.out.println("Elemento ja existente no conjunto");
       }
   }

   public Conjunto uniao(Conjunto outroConjunto){
       Conjunto novoConjunto = new Conjunto();
       for (String elemento : this.elementos){
           novoConjunto.adicionarElemento(elemento);
       }
       for (String elemento : outroConjunto.elementos){
           novoConjunto.adicionarElemento(elemento);
       }
       return novoConjunto;
   }

   public void exibir(){
       System.out.println("Conunto: " + elementos);
   }
    public Conjunto inter(Conjunto outroConjunto){
       Conjunto novoConjunto = new Conjunto();
       for (String elemento : this.elementos){
           if (outroConjunto.elementos.contains(elemento)){
               novoConjunto.adicionarElemento(elemento);
           }
       }
       return novoConjunto;
    }
    public Conjunto menos(Conjunto outroConjunto){
       Conjunto novoConjunto = new Conjunto();
       for (String elemento : this.elementos){
           if (!outroConjunto.elementos.contains(elemento)){
               novoConjunto.adicionarElemento(elemento);
           }
       }
       return novoConjunto;
    }
}
