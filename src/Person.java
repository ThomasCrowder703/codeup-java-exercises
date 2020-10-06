public class Person { //class declaration

    private String name; //creating private variable called name

    public Person(String name){ //declaring method constructor
        this.name = name; //the name being passed in should be assigned to the parameter???
    }

    public String getName(){ //get name method declaration
        return this.name; //return the passed in name
    }

    public void setName(String name){ //set name declaration
//TODO: change the name property to the passed value
        this.name = name; //the name being passed in should be assigned to the parameter???

    }
    public void sayHello(){ //sayHello method declaration
//TODO: print a message to the console using the person's name
        System.out.printf("%s says Hello!\n",this.name); // print a message using the passed in name Question: Where is the passed in name coming from? Answer: p1 value being invoked in main method
    }

    public static void main(String[] args) { //main method declaration
        Person p1 = new Person("Bob"); //new Person being created
        p1.setName("Thomas"); // overrides the constructor and sets name to Thomas. Changes name without creating a new person
        p1.sayHello(); //invoke sayHello function with p1 value

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); //outprints true

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }
}
