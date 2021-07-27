from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")

    car = Car("ABC852", Account("Julian Perez","84512663"))
    car.passenger = 2
    print(vars(car))
    print(vars(car.driver))
