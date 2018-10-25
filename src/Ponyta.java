public class Ponyta implements Horse{
    //constructors
    private String name;
    private int weight;

    public Ponyta(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
    }
    public String toString()
    {
        String horseName = "";
        horseName = "Name: "+this.name + ", Weight: "+this.weight+";";
        return horseName;
    }

    public String getName(){return this.name;}
    public int getWeight(){return this.weight;}
}
