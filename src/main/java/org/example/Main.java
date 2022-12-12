package org.example;

import org.example.dataAccess.CarDao;

public class Main {
    public static void main(String[] args) {
        CarDao carDao=new CarDao();
        System.out.println(carDao.getAll());

    }
}