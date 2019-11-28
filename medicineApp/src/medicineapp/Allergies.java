
package medicineapp;


public class Allergies extends Medicine{
    
    public Allergies(int id, String genericName, String brandName, String medicineType,double price, int stock) {
        super(id,genericName, brandName, medicineType,price, stock);
    }

    public Allergies(Medicine info) {
        this(info.getId(),info.getGenericName(), info.getBrandName(), info.getMedicineType(),info.getPrice(), info.getStock());
    }
    
    public Allergies(){
        this(new BodyPain());
    }
    
    public Allergies(int size, Medicine e){
        super(size,e.getGenericName(), e.getBrandName(), e.getMedicineType(),e.getPrice(), e.getStock());
    }
    
    public Allergies(String genericName, String brandName, String medicineType,double price, int stock) {
        super(genericName, brandName, medicineType,price, stock);
    }
    
    @Override
    public String toString() {
        return String.format("Generic name: %s \nBrand Name: %s\nMedicine Type: %s\nPrice: %.2f\nStock: %d",super.getGenericName(),super.getBrandName(),super.getMedicineType(),super.getPrice(),super.getStock());
    }
    
}
