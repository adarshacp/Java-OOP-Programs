abstract class Animal{
    abstract void makeSound();
    void eat(){
        System.out.println("Dog Can eat biscuit");
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog Barks");
    }
}

class New{
    public static void main(String [] args){
        Dog d = new Dog();
        d.makeSound();
        d.eat();
    }
}