public class Menu {
    private String MenuName;
    private int IdMenu;
    private int nbrMenuItems;
 
 
// Set + Get for Name ---------------
    public void setName(String name) {
        MenuName = name;
    }
 
    public String getName() {
        return MenuName;
    }
// Finish --------------------------
 
// Set + Get for Id ---------------
 
    public void setId(int id) {
        IdMenu = id;
    }
 
    public int getId() {
        return IdMenu;
    }
// Finish -------------------------
 
// Set + Get for Name ---------------
    public void setItemsnbre(int items) {
        nbrMenuItems = items;
    }
 
    public int getItemsnbre() {
        return nbrMenuItems;
    }
 
 
    public void InfoMenu() {
       
        System.out.println("Name: " + MenuName);
        System.out.println("Menu ID: " + IdMenu);
        System.out.println("Number Of Items: " + nbrMenuItems);
 
    }
}