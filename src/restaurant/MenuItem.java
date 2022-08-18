package restaurant;

public class MenuItem {

    private String name;
    private String description;
    private String category;
    private double price;
    private int calories;
    private boolean newItem;

    //constructor
    public MenuItem(String name, String description, String category, double price, int calories, boolean newItem)  {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.calories = calories;
        this.newItem = newItem;
    }

    //getters & setters
    public String getName() {
        return name;
    }

    public String getDescription()  {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice()    {
        return price;
    }

    public int getCalories()    {
        return calories;
    }

    public boolean getNewItem() {
        return newItem;
    }

    public void setName(String name)   {
        this.name = name;
    }

    public void setDescription(String description)    {
        this.description = description;
    }

    public void setCategory(String category)   {
        this.category = category;
    }

    public void setPrice(double price)  {
        this.price = price;
    }

    public void setCalories(int calories)   {
        this.calories = calories;
    }

    public void setNewItem(boolean newItem)    {
        this.newItem = newItem;
    }

}
