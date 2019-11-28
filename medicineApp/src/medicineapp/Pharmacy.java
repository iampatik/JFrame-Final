package medicineapp;

import java.util.ArrayList;


public class Pharmacy {
    
    ArrayList<Orders> orderList = new ArrayList<Orders>();
    ArrayList<User> userList = new ArrayList<User>();
    ArrayList<Medicine> medicineList = new ArrayList<Medicine>();
    Pharmacist pharmacist = new Pharmacist("Admin","Admin");

    public ArrayList<Orders> getOrderList() {
        return orderList;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public Pharmacy() {
    }
    
    public Medicine addMedicine(Medicine e, Pharmacist a){
        return a.addMedicine(e, this);
    }
    
    public Medicine removeMedicine(Medicine e, Pharmacist a){  
        return a.removeMedicine(e, this);
    }

    public Pharmacist getPharmacist() {
        return pharmacist;
    }
    
    public Orders removeOrder(Pharmacy e , int inputs){
    Orders b = new Orders();
    for (int i = 0; i < e.getOrderList().size(); i++) {
        if (e.getOrderList().get(i).getId() == inputs) {
            b = e.getOrderList().get(i);
        }
    }         
    return b;
    }
    
    public Medicine decMedicine(Pharmacy a, int inputs){
        Medicine e = new Medicine();
        for(int i = 0; i< a.getMedicineList().size();i++){
            for(int j = 0; j<a.getOrderList().size();j++){
                if(a.getMedicineList().get(i).getId() == a.getOrderList().get(j).getMedId() && a.getOrderList().get(j).getId() == inputs){
                    if(a.getMedicineList().get(i).getStock()>=a.getOrderList().get(j).getQuantity()){
                        a.getMedicineList().get(i).setStock(a.getMedicineList().get(i).getStock()-a.getOrderList().get(j).getQuantity());
                        if(a.getMedicineList().get(i).getStock() == 0){
                            a.getMedicineList().remove(a.getMedicineList().get(i));
                            a.getPharmacist().updateId(a);                      
                        }
                        else {
                            e = a.getMedicineList().get(i);
                            return e;
                        } 
                    }
                    else {
                        outOfStock();
                    }
                }
            }
        }
        return e;
    }
    
    public void outOfStock(){
        System.out.println("Sorry! Insufficient stock!");
    }

}
