public abstract class BaseBudgetHandler {

    protected BaseBudgetHandler next;

    public BaseBudgetHandler setNext(BaseBudgetHandler next){
        this.next = next;
        return next;
    }

    public CustomerBudget handler(CustomerBudget budget){
        if (next != null){
            return next.handler(budget);
        }
        return budget;
    }

}
