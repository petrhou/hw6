public static void main(String[] args) {
    // Создаем массив машин для тестирования
    Car[] cars = {
        new Car(1, "Toyota", "Camry", 2020, "Black", 25000, "AB123CD"),
        new Car(2, "Honda", "Civic", 2019, "White", 22000, "EF456GH"),
        new Car(3, "Toyota", "Corolla", 2021, "Red", 20000, "IJ789KL"),
        new Car(4, "BMW", "X5", 2018, "Blue", 45000, "MN012OP"),
        new Car(5, "Toyota", "RAV4", 2015, "Silver", 18000, "QR345ST")
    };
    
    // Тестируем метод getCarByBrend
    Car[] toyotaCars = getCarByBrend(cars, "Toyota");
    System.out.println("Найдено Toyota: " + toyotaCars.length);
    
    // Тестируем метод getCarByBrendAndYearOperational
    Car[] oldToyotaCars = getCarByBrendAndYearOperational(cars, "Toyota", 5);
    System.out.println("Toyota старше 5 лет: " + oldToyotaCars.length);
    
    for (Car car : oldToyotaCars) {
        System.out.println(car.getBrand() + " " + car.getModel() + " " + car.getYear() + " года");
    }
}