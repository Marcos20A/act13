import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author Marco
 */

interface anonClass
{
void anonMethod();
}

interface intFuncional{
    String intFun(ArrayList<String> a);
}

interface metReferencia{
    void metRef(ArrayList<String> a);
}


public class main {
   
     String nom1,nom2,nom3,nom4,nom5,nom6,nom7,nom8,nom9,nom10;
    
    public static void main(String[] args) {
        
         Scanner sn = new Scanner(System.in);
        ArrayList<String> List = new ArrayList<>();
        
        System.out.println("Bienvenido al ordenador de nombres :D");
        //se agregan los nombres o frases, que quiere comparar (puse nombres porque es mucho mas corto y sencillo de ver que una frase)
        
        List.add("Marcos Adil");
        
        List.add("Aldo Garcia");
        
        List.add("Uriel Jesus");
        
        List.add("Carlos Morales");
        
        List.add("Martin Hernandez");
        
        List.add("Juan Velazquez");
        
        List.add("Valeria Mendoza");
        
        List.add("Karol Cruz");
        
        List.add("Brandon");
        
        List.add("Eligio Moscoso");
        
    /*System.out.println("Ingrese la primera frase/nombre");
    
        List.add();
        
        List.add();
        
        List.add();
        
        List.add();
        
        List.add();
        
        List.add();
        
        List.add();
        
        List.add();
        
        List.add();
        
        List.add();*/

        anonClass anon = new anonClass() {
            @Override
            
            public void anonMethod() {
                
                class compararAlfab implements Comparator<String>{
                    public int compare(String n1, String n2){
                        return n1.compareTo(n2);
                    }
                }

                List.sort(new compararAlfab());
                System.out.println("-------------------------------------");
                System.out.println("Nombres alfabéticamente con clase anónima:");

                for (String Alfabetico : List) {
                    System.out.println("Nombre: "+Alfabetico);
                }

                class compararLong implements Comparator<String>{
                    public int compare(String n1, String n2){

                        int l1 = n1.length();
                        int l2 = n2.length();

                        if(l1 > l2){
                            return 1;
                        }
                        else if (l1 < l2){
                            return -1;
                        }
                        return 0;
                    }
                }

                List.sort(new compararLong());
                System.out.println("-------------------------------------");
                System.out.println("Nombres por longitud con clase anónima:");

                for(String Long : List){
                    System.out.println("Nombre: "+Long);
                }
            }
        };

        class Ordenar {

    class compararAlfab implements Comparator<String> {
        public int compare(String n1, String n2) {
            return n1.compareTo(n2);
        }

    }

    void ordenarAlf(ArrayList<String> a) {
        
        a.sort(new compararAlfab());
        System.out.println("-------------------------------------");
        System.out.println("Nombres alfabéticamente con método de referencia:");

        for (String Alfab : a) {
            System.out.println("Nombre: "+Alfab);
        }
    }


    class compararLongi implements Comparator<String> {
        public int compare(String n1, String n2) {

            int a1 = n1.length();
            int a2 = n2.length();

            if (a1 > a2) {
                return 1;
            } else 
                if (a1 < a2) {
                return -1;
            }
            return 0;
        }
    }

    void ordenarLong(ArrayList<String> a) {
        
        a.sort(new compararLongi());
        System.out.println("-------------------------------------");
        System.out.println("Nombres por longitud con método de referencia:");

        for (String Longi : a) {
            System.out.println("Nombre: "+Longi);
        }
    }


}
        anon.anonMethod();
        System.out.println();

        intFuncional lambda = (a) -> {
            class compararAlfabe implements Comparator<String>{
                public int compare(String n1, String n2){
                    return n1.compareTo(n2);
                }
            }

            List.sort(new compararAlfabe());
            System.out.println("-------------------------------------");
            System.out.println("Nombres alfabéticamente con lambda:");

            for (String Alfabetico : List) {
                System.out.println("Nombre: "+ Alfabetico);
            }

            class compararLongit implements Comparator<String>{
                public int compare(String n1, String n2){

                    int c1 = n1.length();
                    int c2 = n2.length();

                    if(c1 > c2){
                        return 1;
                    }
                    else if (c1 < c2){
                        return -1;
                    }
                    return 0;
                }
            }

            List.sort(new compararLongit());
            System.out.println("-------------------------------------");
            System.out.println("Nombres por longitud con lambda:");

            for(String Longit : List){
                System.out.println("Nombre: "+Longit);
            }
            return null;
        };

        lambda.intFun(List);
        Ordenar Lista = new Ordenar();
        
        metReferencia ordenadaAlf = Lista::ordenarAlf;
        ordenadaAlf.metRef(List);

        metReferencia ordenadaLong = Lista::ordenarLong;
        ordenadaLong.metRef(List);
        
        System.out.println("-------------------------------------");
        System.out.println("Adiosin :D");
        
    }
    
}
