package com.bsbo0419.Semak.task2;

public class tmp2 {
    public class Cat{
        String name;
        Cat mom;
        Cat dad;

        public Cat(String _name,Cat _mom, Cat _dad){
            name = _name;
            mom = _mom;
            dad = _dad;
        }
    }

    public void _main(){
        Cat grandpa = new Cat("aa",null,null); // Папин папа
        Cat grandma = new Cat("aa",null,null); // Мамина мама
        Cat dad = new Cat("aa",null, grandpa);
        Cat mom = new Cat("aa",grandma,null);
        Cat son = new Cat("aa",dad,mom);
        Cat daughter = new Cat("aa",dad, mom);
    }
}
