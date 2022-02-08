public class ManagerBudgetHandler extends BaseBudgetHandler{

    public CustomerBudget handler(CustomerBudget budget){
        if (budget.getTotal() <= 2000){
            budget.setApproved(true);
            System.out.println("O gerente tratou o orçamento e aprovou" );
            return budget;
        }
        return super.handler(budget);
    }
}
