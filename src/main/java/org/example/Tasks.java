package org.example;

public class Tasks {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("The first task");
        taskOne();

        // taskTwo();
        System.out.println(" ");
        System.out.println("The second task");
        System.out.println(processConcatOne("Hello", " Word!", String::concat));
        System.out.println(processConcatTwo("Hallo", " Welt!", String::concat));
        System.out.println(processConcatThree("こんにちは [kon ni chi ha]", " ワールド [warudo]!", String::concat));
    }

    public static void taskOne() {

         Printable generalPrint = new Printable() {
            @Override
            public void print() {
                System.out.println("We are starting the print");
            }
        };


         Printable posterPrint = new Printable() {
            @Override
            public void print() {
                System.out.println("We are starting to print posters");
            }
        };

         Printable photoPrint = new Printable() {
            @Override
            public void print() {
                System.out.println("We are starting to print photos");
            }
        };

        generalPrint.print();
        posterPrint.print();
        photoPrint.print();
    }
    @FunctionalInterface
    public interface Printable {
        void print();
    }



    // taskTwo();
    public static String processConcatOne(String a, String b, Concationable <String,String > concationable){
        return  concationable.concat(a,b);
    }

    public static String processConcatTwo(String a, String b, Concationable <String,String > concationable){
        return  concationable.concat(a,b);
    }

    public static String  processConcatThree(String a, String b, Concationable <String,String > concationable){
        return  concationable.concat(a,b);
    }
}
@FunctionalInterface
interface Concationable <T, V>{
    String concat (T t,V v);
}


