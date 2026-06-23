
class TeamMember {
    protected String name;

    public TeamMember(String name) {
        this.name = name;
    }
}


interface BonusEligible {
    void calculateBonus();
}


class Employee extends TeamMember implements BonusEligible {

    public Employee(String name) {
        super(name);
    }

    
    public void calculateBonus() {
        System.out.println("Calculating standard employee bonus...");
    }
}


class Contractor extends TeamMember {

    public Contractor(String name) {
        super(name);
    }
}


public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John");
        emp.calculateBonus();

        Contractor contractor = new Contractor("Mike");

        System.out.println("Contractor: " + contractor.name);
    }
}
