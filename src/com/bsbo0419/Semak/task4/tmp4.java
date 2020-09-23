package com.bsbo0419.Semak.task4;

import java.util.HashSet;

public class tmp4 {
    static public HashSet<Cat> cats = new HashSet<>();
    public static class Cat{
        public static Cat CreateCats(){
            cats.add(new Cat());
            cats.add(new Cat());
            Cat tmp11 = new Cat();
            cats.add(tmp11);
            return tmp11;
        }
    }
    public Cat returnCat(){
        //Cat todelete = Cat.CreateCats();
        return Cat.CreateCats();
    }
    public void show(){
        for(Cat x: cats){
            System.out.println(x);
        }
    }
}
