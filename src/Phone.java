public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(){
        number="";
        model="";
        weight=0;

    }
    public Phone(String number, String model, int weight){
        this.number=number;
        this.model=model;
        this.weight=weight;
    }
    public Phone(String number, String model){
        this.number=number;
        this.model=model;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String receiveCall( String name){
        return "Звонит "+ name;
    }
    public String getNumber(){
        return number;
    }
    public String getModel(){
        return model;
    }
    public int getWeight(){
        return weight;
    }
    @Override
    public String toString() {
        return String.format("Номер телефона: %s \nМодель телефона: %s \nВес телефона в граммах: %d",
                number, model, weight);
    }
}
