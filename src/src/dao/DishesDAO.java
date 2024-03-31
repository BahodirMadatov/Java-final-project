package dao;

import helper.CSVUtil;

import model.Dishes;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class DishesDAO implements ApplienceDAO<Dishes> {
    private List<Dishes> dishes;

    public DishesDAO() {
        dishes = loadDishes();
    }

    @Override
    public List<Dishes> getAllAppliences() {
        return null;
    }

    @Override
    public Dishes getApplienceById(int id) {
        return null;
    }

    @Override
    public List<Dishes> getApplienceByName(String name) {
        return null;
    }

    @Override
    public void addApplience(Dishes applience) {

    }

    @Override
    public void updateApplience(Dishes applience) {

    }

    @Override
    public void deleteApplience(int id) {

    }

    @Override
    public List<Dishes> getAllDishes() {
        return dishes;
    }

    @Override
    public Dishes getDishesById(int id) {
        for (Dishes dish : dishes) {
            if (dish.getId() == id) {
                return dish;
            }
        }
        return null;
    }

    @Override
    public List<Dishes> getDishesByName(String name) {
        return dishes.stream()
                .filter(dish -> dish.getName().toLowerCase().contains(name))
                .collect(Collectors.toList());
    }

    @Override
    public void addDishes(Dishes dish) {
        dishes.add(dish);
        updateDishes(dishes);
    }

    @Override
    public void updateDishes(Dishes updatedDish) {
        for (int i = 0; i < dishes.size(); i++) {
            Dishes dish = dishes.get(i);
            if (dish.getId() == updatedDish.getId()) {
                dish.setName(updatedDish.getName());
                dish.setPrice(updatedDish.getPrice());
                dish.setQuantity(updatedDish.getQuantity());
                dish.setColor(updatedDish.getColor());
                break; // Exit the loop after finding a match
            }
        }
        updateDishes(dishes); // This call might be redundant, consider removing it
    }

    @Override
    public void deleteDishes(int id) {
        dishes.removeIf(dish -> dish.getId() == id);
        updateDishes(dishes);
    }

    private List<Dishes> loadDishes() {
        dishes = new ArrayList<>();
        List<String[]> data = CSVUtil.readCSV("src/items/dishes.csv");
        for (String[] row : data) {
            dishes.add(new Dishes(Integer.parseInt(row[0]), row[1], row[2], row[3], row[4]));
        }
        return dishes;
    }

    private void updateDishes(List<Dishes> dishes) {
        List<String[]> data = new ArrayList<>();
        for (Dishes dish : dishes) {
            data.add(new String[]{
                    String.valueOf(dish.getId()),
                    dish.getName(),
                    String.valueOf(dish.getPrice()),
                    String.valueOf(dish.getQuantity()),
                    dish.getColor()
            });
        }
        CSVUtil.writeCSV("src/src/items/dishes.csv", data);
    }
}