class Anonymous_Inner_Class {

    interface animal {
        void bark();
    }
/*
    static class dog implements animal {
    public void bark() {
    System.out.println("bow bow ");
     }
     }
 */
    // Using Anonymous inner class

    public static void main(String[] args) {
        animal dog = new animal() {
            public void bark() {
                System.out.println(" Bow    Bow ");
            }
        };

        dog.bark();

    }

}