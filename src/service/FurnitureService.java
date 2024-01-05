package service;

import module.Furniture;

import java.util.HashMap;
import java.util.Map;

public class FurnitureService {
    private Map<Integer, Furniture> furnitureMap;
    private Integer furnitureIx;

    public FurnitureService() {
        this.furnitureIx = 0;
        this.furnitureMap = new HashMap<>();
    }

    public String create(Integer key, Furniture furniture) {
        furniture.setId(++this.furnitureIx);
        if (!this.furnitureMap.containsKey(key)) {
            this.furnitureMap.put(key, furniture);
            return String.format("Furniture with %d key created successfully", key);
        }
        return String.format("Furniture database with %d id already exist!", key);
    }

    public String getAll(Integer key) {
        if (furnitureMap.containsKey(key)) {
            return this.furnitureMap.get(key).get();
        }
        return String.format("Furniture with %d key isn't found!", key);
    }


    public String updateFurniture(Integer key, Integer furnitureID, Furniture newFurniture) {
        if (this.furnitureMap.containsKey(key)) {
            Furniture furniture = furnitureMap.get(key);
            newFurniture.setId(furniture.getId());
            if (newFurniture.getId().equals(furnitureID)) {
                furnitureMap.replace(key, this.furnitureMap.get(key), newFurniture);
                return String.format("Furniture with %d key %d : id updated successfully", key, furnitureID);
            }
        }
        return String.format("Furniture with %d key isn't found!", key);

    }

    public String deleteFurniture(Integer key, Integer furnitureID) {
        Furniture furniture = furnitureMap.get(key);
        if (this.furnitureMap.containsKey(key)) {
            furniture.getId().equals(furnitureID);
            this.furnitureMap.remove(key, this.furnitureMap.get(key));
            return String.format("Furniture with %d key %d : id deleted successfully", key, furnitureID);
        }
        return String.format("Furniture with %d key isn't found!", key);
    }


}
