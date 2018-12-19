import java.util.List;

public class PaymentAutomation {
    private DataGatherer dataGatherer = new DataGatherer();


    public void produceStatistic() {
        List<Employee> employees = dataGatherer.asList();

        showTransfers(employees);


        ProduceStatistics statistics = new ProduceStatistics();
        Integer totalPeyment = statistics.calculateTotalPayment(employees);
        System.out.println("Total amount paid: " + totalPeyment);

        String highestSalaryDepartment = statistics.calculateHighestSalaryDepartment(employees);
        System.out.println("Most paying department: " + highestSalaryDepartment);

        String highestSalary = statistics.findHighestSalary(employees);
        System.out.println("Highest salary employee: " + highestSalaryDepartment);


    }


    private void showTransfers(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println("Transfer successful: " + employee.getSalary() + " to account " + employee.getAccount());
        }
    }
}
