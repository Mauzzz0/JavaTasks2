package com.bsbo0419.Semak.task3;


public class tmp3 {
    public static class Cat{
        static Cat[] cats = new Cat[10];
        static int counter = 0;

        public static Cat returnCat(){
            Cat tmp = new Cat();
            cats[counter] = tmp;
            counter++;
            return tmp;
        }

        public static void printCaps(){
            for(int i=0; i<10 ; i++){
                System.out.println(cats[i]);
            }
        }
    }

    public void _main(){
        for (int i=0; i<10; i++){
        Cat tmp = Cat.returnCat();

    }
        Cat.printCaps();
    }
}
