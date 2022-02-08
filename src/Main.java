public class Main {

    public static void main(String[] args) {
        CustomerBudget budget = new CustomerBudget(1000);
        SellerBudgetHandler handler = new SellerBudgetHandler();
        handler.setNext(new ManagerBudgetHandler()).setNext(new DirectorBudgetHandler());

        handler.handler(budget);

    }
}
