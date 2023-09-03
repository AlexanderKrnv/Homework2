public class Main {
    public static void main(String[] args) {

        Phone phone1=new Phone("+7(917)-199-66-20", "Apple iPhone 13",140);
        Phone phone2 = new Phone("+7(902)-372-95-53","Samsung Galaxy S22", 167);
        Phone phone3 = new Phone("+7(937)-654-21-34", "Xiaomi Redmi 12", 198);



        System.out.println("Информация о первом телефоне:");
        System.out.println(phone1.toString());
        System.out.println("------------------------------");
        System.out.println("Информация о втором телефоне:");
        System.out.println(phone2.toString());
        System.out.println("------------------------------");
        System.out.println("Информация о третьем телефоне:");
        System.out.println(phone3.toString());
        System.out.println("------------------------------");

        //пример вызова метода receiveCall()
        System.out.println("Результаты вызовов метода receiveCall(): ");
        System.out.println(phone1.receiveCall("Иван"));
        System.out.println(phone2.receiveCall("Андрей"));
        System.out.println(phone3.receiveCall("Мария"));

        //пример вызова метода getNumber()
        System.out.println("Результаты вызовов метода getNumber: ");
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());


    }
}