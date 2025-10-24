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