import java.util.List;

class tempCodeRunnerFile {

    static class Employee {

        private String name;

        public Employee(String name) {

            this.name = name;

        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {

        List<Employee> employees = List.of(new Employee("Santosh"), new Employee("Narasimha"),
                new Employee("Yogi"));

        System.out.println(employees);

    }

}