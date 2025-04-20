public class employee {
    public double baseSalary() {
        return 50000;
    }

    static class Manager extends employee {
        double bonus;

        Manager() {
            this.bonus = 20000;
        }

        @Override
        public double baseSalary() {
            return super.baseSalary() + bonus;
        }
    }

    static class Worker extends employee {
        double deduction;

        Worker() {
            this.deduction = 10000;
        }

        @Override
        public double baseSalary() {
            return super.baseSalary() - deduction;
        }
    }
}

class Test {
    public static void main(String[] args) {
        employee e = new employee();
        employee.Manager manager = new employee.Manager();
        employee.Worker worker = new employee.Worker();

        System.out.println("Base employee salary: " + e.baseSalary());
        System.out.println("Manager salary: " + manager.baseSalary());
        System.out.println("Worker salary: " + worker.baseSalary());
    }
}
