package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    //date menu last updated
    //ArrayList containing all of the menu items from the MenuItem class
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    //constructor
    public Menu(Date lastUpdated, ArrayList<MenuItem> items)    {
        this.lastUpdated = lastUpdated;
        this.items = items;
    }

    //getters & setters
    public Date getLastUpdated()    {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems()   {
        return items;
    }

    public void setLastUpdated(Date lastUpdated)    {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items)  {
        this.items = items;
    }


}
