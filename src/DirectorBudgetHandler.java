public class DirectorBudgetHandler extends BaseBudgetHandler{

    public CustomerBudget handler(CustomerBudget budget){
            budget.setApproved(true);
            System.out.println("O Diretor tratou o orçamento e aprovou" );
            return budget;
    }
}
