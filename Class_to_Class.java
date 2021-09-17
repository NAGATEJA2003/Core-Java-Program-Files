class Main_Class {
    public static void main(String[] args) {
        Sub_Class sc = new Sub_Class();
        System.out.println("This Message is from main/parent class");
        sc.display();
    }
}

class Sub_Class {
    String message = "This Message is from another/sub class1";
    void display()
    {
        System.out.println(message);
        Sub_Class1 sc1 = new Sub_Class1();
        sc1.display1();
    }
}

class Sub_Class1 {
    String message = "This Message is from another/sub class2";
    void display1()
    {
        System.out.println(message);
    }
}
