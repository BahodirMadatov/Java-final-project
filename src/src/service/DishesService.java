package service;

import dao.DishesDAO;
import model.Dishes;

import java.util.List;

public class DishesService {
    private DishesDAO dishesDAO;

    public DishesService(DishesDAO dishesDAO) {
        this.dishesDAO = dishesDAO;
    }

    public List<Dishes> getAllDishes() {
        return dishesDAO.getAllAppliences();
    }

    public Dishes getDishesById(int id) {
        return dishesDAO.getApplienceById(id);
    }

    public List<Dishes> getDishesByName(String name) {
        return dishesDAO.getApplienceByName(name);
    }

    public void addDishes(Dishes dishes) {
        dishesDAO.addApplience(dishes);
    }

    public void updateDishes(Dishes dishes) {
        dishesDAO.updateApplience(dishes);
    }

    public void deleteDishes(int id) {
        dishesDAO.deleteApplience(id);
    }
}
