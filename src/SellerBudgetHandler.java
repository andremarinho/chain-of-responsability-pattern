public class SellerBudgetHandler extends BaseBudgetHandler{

    public CustomerBudget handler(CustomerBudget budget){
        if (budget.getTotal() <= 1000){
            budget.setApproved(true);
            System.out.println("O vendedor tratou o orçamento e aprovou"  );
            return budget;
        }
        return super.handler(budget);
    }
}
