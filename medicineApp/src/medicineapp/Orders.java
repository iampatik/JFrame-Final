package medicineapp;

import java.util.ArrayList;


public class Orders {
    private int id;
    private String orderedName;
    private int userId;
    private double amount;
    private int medId;
    private int quantity;
    
    public Orders(){}
    
    public Orders(int id, int userId,int medId, String orderedName, int quantity, double amount){
        this.id = id;
        this.userId = userId;
        this.medId = medId;
        this.orderedName = orderedName;
        this.quantity = quantity;
        this.amount = amount;
    }
    
    public Orders(Orders e){
        this(e.getId(), e.getUserId(),e.getMedId(), e.orderedName, e.quantity, e.getAmount());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getOrderedName() {
        return orderedName;
    }

    public int getMedId() {
        return medId;
    }

    public void setMedId(int medId) {
        this.medId = medId;
    }
    
    

    public void setOrderedName(String orderedName) {
        this.orderedName = orderedName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("%10s %5s %20s %5s %20s %5s %15s %5s %10s", id , userId, orderedName, quantity,amount);
    }
    
}
