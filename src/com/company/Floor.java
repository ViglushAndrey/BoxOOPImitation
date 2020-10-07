package com.company;

/**
 * Created by IntelliJ IDEA.
 * BoxOOPImitation.Floor
 *
 * @Autor: Andrey
 * @DateTime: 01.10.2020|16:30
 * @Version: Floor: 1.0
 */
public class Floor extends Rectangle {
    private String first_coating_material;
    private String type_of_floor_covering;
    private String color;
    private boolean underfloor_heating_function;
    private boolean noise_isolation_function;
    private int price;


    public Floor() {
    }

    public Floor(String first_coating_material, String type_of_floor_covering, String color, boolean underfloor_heating_function, boolean noise_isolation_function, int price) {
        this.first_coating_material = first_coating_material;
        this.type_of_floor_covering = type_of_floor_covering;
        this.color = color;
        this.underfloor_heating_function = underfloor_heating_function;
        this.noise_isolation_function = noise_isolation_function;
        this.price = price;
    }

    public Floor(double length, double width, String first_coating_material, String type_of_floor_covering, String color, boolean underfloor_heating_function, boolean noise_isolation_function, int price) {
        super(length, width);
        this.first_coating_material = first_coating_material;
        this.type_of_floor_covering = type_of_floor_covering;
        this.color = color;
        this.underfloor_heating_function = underfloor_heating_function;
        this.noise_isolation_function = noise_isolation_function;
        this.price = price;
    }

    public String getFirst_coating_material() {
        return first_coating_material;
    }

    public void setFirst_coating_material(String first_coating_material) {
        this.first_coating_material = first_coating_material;
    }

    public String getType_of_floor_covering() {
        return type_of_floor_covering;
    }

    public void setType_of_floor_covering(String type_of_floor_covering) {
        this.type_of_floor_covering = type_of_floor_covering;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isUnderfloor_heating_function() {
        return underfloor_heating_function;
    }

    public void setUnderfloor_heating_function(boolean underfloor_heating_function) {
        this.underfloor_heating_function = underfloor_heating_function;
    }

    public boolean isNoise_isolation_function() {
        return noise_isolation_function;
    }

    public void setNoise_isolation_function(boolean noise_isolation_function) {
        this.noise_isolation_function = noise_isolation_function;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double Area(){
        return this.getLength() * this.getWidth();
    }


    @Override
    public String toString() {
        return " Floor { \n" +
                " first_coating_material = '" + first_coating_material + '\'' + ',' +
                "\n type_of_floor_covering = '" + type_of_floor_covering + "'," +
                "\n color = '" + color + '\'' + ',' +
                "\n underfloor_heating_function = " + underfloor_heating_function + ',' +
                "\n noise_isolation_function = " + noise_isolation_function + ',' +
                "\n price = " + price + "$." +
                "\n }";
    }
}
    