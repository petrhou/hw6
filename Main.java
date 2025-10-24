public class Main {
    
    public static Car[] getCarByBrend(Car[] cars, String brend) {
        int count = 0;
        
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brend)) {
                count++;
            }
        }
        
        Car[] result = new Car[count];
        int index = 0;
        
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brend)) {
                result[index++] = car;
            }
        }
        
        return result;
    }
    
    public static Car[] getCarByBrendAndYearOperational(Car[] cars, String brend, int years) {
        int currentYear = java.time.Year.now().getValue();
        int count = 0;
        
        for (Car car : cars) {
            int yearsOperational = currentYear - car.getYear();
            if (car.getBrand().equalsIgnoreCase(brend) && yearsOperational > years) {
                count++;
            }
        }
        
        Car[] result = new Car[count];
        int index = 0;
        
        for (Car car : cars) {
            int yearsOperational = currentYear - car.getYear();
            if (car.getBrand().equalsIgnoreCase(brend) && yearsOperational > years) {
                result[index++] = car;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Car[] cars = {
            new Car(1, "Toyota", "Camry", 2020, "Black", 25000, "AB123CD"),
            new Car(2, "Honda", "Civic", 2019, "White", 22000, "EF456GH"),
            new Car(3, "Toyota", "Corolla", 2021, "Red", 20000, "IJ789KL"),
            new Car(4, "BMW", "X5", 2018, "Blue", 45000, "MN012OP"),
            new Car(5, "Toyota", "RAV4", 2015, "Silver", 18000, "QR345ST")
        };
        
        Car[] toyotaCars = getCarByBrend(cars, "Toyota");
        System.out.println("Найдено Toyota: " + toyotaCars.length);
        
        Car[] oldToyotaCars = getCarByBrendAndYearOperational(cars, "Toyota", 5);
        System.out.println("Toyota старше 5 лет: " + oldToyotaCars.length);
        
        for (Car car : oldToyotaCars) {
            System.out.println(car.getBrand() + " " + car.getModel() + " " + car.getYear() + " года");
        }
    }
}