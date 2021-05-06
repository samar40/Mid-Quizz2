package com.example.quizz_2;

import android.app.Application;

import java.util.ArrayList;

public class CarsData extends Application {
    public static ArrayList<Car> carsData;

    @Override
    public void onCreate() {
        super.onCreate();
        carsData = new ArrayList<>();
        carsData.add(new Car("Honda","city","honda","03014726502"));
        carsData.add(new Car("Toyota","vitz","toyota","03222228091"));
        carsData.add(new Car("Suzuki","cultus","suzuki","03217040071"));
    }
}
