

public class Main {
    public static void main(String[] args) {
     Animal Lion = new Animal();
     Lion.Name ="Simba";
     Lion.age=12;
     Lion.color="Red";
     System.out.println("About Lion: ");
     System.out.println(Lion.Name);
     System.out.println(Lion.age);
     System.out.println(Lion.color);


        Animal Dog = new Animal("Naji", 60, "Green");
        System.out.println("Name of dog: "+Dog.Name+"\nAge of dog: "+Dog.age+"\nColor of dog: "+Dog.color);


        //System.out.println(Dog);

        Animal.into(3,5,6);



    }
}