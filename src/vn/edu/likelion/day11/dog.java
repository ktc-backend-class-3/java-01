package vn.edu.likelion.day11;

public class dog implements DefaultInterfaceAnimal1, DefaultInterfaceAnimal2 {
    @Override
    public void run() {
        DefaultInterfaceAnimal1.super.run();
    }
}
