package TOMATO;

import java.util.ArrayList;

public class RestaurentManager {
    public static RestaurentManager instance = null;

    ArrayList<Restaurent> restaurents = new ArrayList<Restaurent>();
    private RestaurentManager() {}
    public static RestaurentManager getInstance() {
        if (instance == null) {
            instance = new RestaurentManager();
        }
        return instance;
    }

    public String addRestaurent(Restaurent r) {
        restaurents.add(r);
        return "Restaurent added successfully.";
    }

    public String removeRestaurent(Restaurent r) {
        restaurents.remove(r);
        return "Restaurent removed successfully.";
    }

    public ArrayList<Restaurent> searchByLocation(String location) {
        ArrayList<Restaurent> results = new ArrayList<Restaurent>();
        for (Restaurent r : restaurents) {
            if (r.getRestaurentLocation().equalsIgnoreCase(location)) {
                results.add(r);
            }
        }
        return results;
    }
}
