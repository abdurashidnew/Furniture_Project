package module;

public class Furniture {

    private Integer id;
    private String name;
    private String color;
    private Double cost;

    public Furniture(String name, String color, Double cost) {
        this.name = name;
        this.color = color;
        this.cost = cost;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }


    public String get() {
        return "Furniture "+
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", cost=" + cost + " $" ;
    }
}
