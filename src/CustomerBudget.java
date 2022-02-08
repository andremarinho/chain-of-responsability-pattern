public class CustomerBudget {
    private boolean approved = false;
    private double total;

    public CustomerBudget(double total){
       this.total = total;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public double getTotal() { return this.total; }
}
