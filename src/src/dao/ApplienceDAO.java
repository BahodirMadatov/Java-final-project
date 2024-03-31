package dao;

import model.Applience;
import model.Dishes;

import java.util.List;
public interface ApplienceDAO<T extends Applience> {
    List<T> getAllAppliences();
    T getApplienceById(int id);
    List<T> getApplienceByName(String name);
    void addApplience(T applience);
    void updateApplience(T applience);
    void deleteApplience(int id);

    List<Dishes> getAllDishes();

    Dishes getDishesById(int id);

    List<Dishes> getDishesByName(String name);

    void addDishes(Dishes dish);

    void updateDishes(Dishes updatedDish);

    void deleteDishes(int id);
}
