package lesson17;

public class Phone {
    protected int number;
    protected String model;
    protected double weight;

    public Phone() {
        number = 0;
        model = "";
        weight = 0.0;
    }
    public Phone (int number, String model, double weight){
        this (number, model);
        this.weight = weight;
    }
    public Phone (int number, String model ){
        this.number = number;
        this.model = model;
    }
    public void receiveCall (String name){
        System.out.println("Звонит " + name);
    }
    public void receiveCall(String name, int number){
        System.out.println("Звонит " + name + " номер " + number);
    }
    public void getNumber (){
        System.out.println("Номер " + number);
    }

    public String toString() {
        return "У номера "+ number + " модель телефона " + model + " весом " + weight;

    }
}
