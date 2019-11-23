package com.debilEnterprise;

public class Main {

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();

        cat cat = new cat();
        cat.climb();

        dog dog = new dog();
        dog.run();
    }

    public interface fly {
        void fly();
    }

    public interface climb {
        void climb();
    }

    public interface run {
        void run();
    }


    public static class cat implements climb {
        @Override
        public void climb() {

        }
    }

    public static class dog implements run {

        @Override
        public void run() {

        }
    }

    public static class Duck implements fly {
        @Override
        public void fly() {
            System.out.println("первый полетел");
        }
    }


}
