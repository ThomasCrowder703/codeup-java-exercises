abstract class Employee {
    protected String name;
    protected String department;
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }

    public abstract String work();

    public void sayHello(){
        System.out.printf("Hello my name is %s I work in %s", this.name, this.department);
    }
}


