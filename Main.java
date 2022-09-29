


/// Урок 7: Основи ООП
/*public abstract class Car {

    private String model;
    private String color;
    private int maxSpeed;

    public abstract void gas();

    public abstract void brake();

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}*/
    /*public static void main(String[] args) {

        Person tom = new Person("Tom");
        tom.viewName();

        Employee sam = new Employee("Sam", "Google");
        sam.viewName();
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public void viewName() {
        System.out.println("Name:" + name);
    }
}

class Employee extends Person {

    private String company;

    public Employee(String name, String company) {
        super(name);
        this.company = company;
    }

    public void viewName() {
        System.out.println(getName());
    }
}*/
/*    public static void main(String[] args) {

        Person tom = new Person ("Tom", 35, "Kolasa 2", "71458");
        tom.viewName(); // public
        tom.viewAge();
        tom.viewAddress(); // private
        tom.viewPhone(); // protected

        System.out.println(tom.name);
        System.out.println(tom.age); // protected
        System.out.println(tom.address); //private
        System.out.println(tom.phone); //public
    }
}

class Person {
    String name;
    protected int age;
    public String address;
    private String phone;

    public Person(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public void viewName() {
        System.out.println(name);
    }
    void viewAge() {
        System.out.println(age);
    }
    private void viewAddress() {
        System.out.println(address);
    }
    protected void viewPhone() {
        System.out.println(phone);
    }*/



 /*   public static class Cat {
      String name;
      int age;

      // конструктор для класса Cat
      public Cat(String name, int age) {
          this.name = name;
          this.age = age;
      }

      public void say() {
          System.out.println("Мяу!");
      }

      public void jump() {
          System.out.println("Jump");
      }

      public static void main(String[] args) {

          Cat sima = new Cat("Sima", 6);
          Cat napas = new Cat("Napas", 10);
          System.out.println(sima.name + ", " + sima.age);
          System.out.println(napas.name + ", " + napas.age);

          sima.say();
          napas.jump();
      }
  }*/
/*        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }*/

/*        int[] nums = new int[4];
          int[] nums = {1, 2, 3};

        System.out.println(nums[nums.length - 1]);

        int[] num1 = new int[]{0, 1, 2, 3, 4, 5};
        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }*/

        /*int[][] num2 = new int[][]{{0, 1, 2, 3}, {4, 5, 6, 7}};
        for (int i = 0; i < num2.length; i++) {
            for (int j = 0; j < num2[i].length; j++) {
                System.out.printf("%d ", num2[i][j]);
            }
            System.out.println();
        }*/
        /*Cat sima = new Cat();
        sima.name = "Сіма";
        sima.age = 6;*/



    /*public static void main(String[] args){
        Person tom = new Person();
        tom.name = "Tom";
        tom.age = 34;
        System.out.println(tom.name + " " + tom.age);
     }
    static class Person {
        String name;
        int age;

    }*/
