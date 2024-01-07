public class App {
    public static void main(String[] args) throws Exception {
        String[] nasserSkills = {"Java", "Python","SQL"};
        Employee razan = new Employee("Razan", "IT", 2000); 
        Manager fares = new Manager("Fares", "HR", 3000, 20);
        Director jamal = new Director("Jamal", "IT", 3500, 25000);
        SalesPerson fatma = new SalesPerson("Fatma","Accounting", 1800, 170);
        Engineer nasser = new Engineer("Nasser", "IT", 2300, nasserSkills);

        System.out.println(razan);
        System.out.println(fares);
        System.out.println(jamal);
        System.out.println(fatma);
        System.out.println(nasser);

    }
}
