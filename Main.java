public static Car[] getCarByBrendAndYearOperational(Car[] cars, String brend, int years) {
    int currentYear = java.time.Year.now().getValue();
    int count = 0;
    
    // Считаем сколько машин подходит под критерии
    for (Car car : cars) {
        int yearsOperational = currentYear - car.getYear();
        if (car.getBrand().equalsIgnoreCase(brend) && yearsOperational > years) {
            count++;
        }
    }
    
    // Создаем массив нужного размера
    Car[] result = new Car[count];
    int index = 0;
    
    // Заполняем массив
    for (Car car : cars) {
        int yearsOperational = currentYear - car.getYear();
        if (car.getBrand().equalsIgnoreCase(brend) && yearsOperational > years) {
            result[index++] = car;
        }
    }
    
    return result;
}