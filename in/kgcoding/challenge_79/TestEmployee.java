package in.kgcoding.challenge_79;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Akash",28,25000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Chotan");
        System.out.println(emp.getEmployeeDetails());
    }
}
