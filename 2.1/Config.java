public class Config {
    private String color;
    private long weight;

    private static Config instance = new Config();

    private Config(){

    }

    public static Config getInstance(){
        return instance;
    }

    public void showContent(){
        System.out.println(this.color +" "+this.weight);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }
}
