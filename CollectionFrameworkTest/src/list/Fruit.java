package list;

public class Fruit implements Cloneable{
    private String name;
    private int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    

    @Override
    public String toString() { //println 시에 toString은 따로 호출하지 않아도 자동 호출됨
        return "[ " + this.name + ": " + this.price + " ]";
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public int getPrice() {
        return price;
    }



    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    protected Fruit clone() throws CloneNotSupportedException{
        return (Fruit) super.clone();
    }
}
