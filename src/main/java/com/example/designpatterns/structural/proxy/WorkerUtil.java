package com.example.designpatterns.structural.proxy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WorkerUtil {

    public static List<Worker> getWorkerList() {

        Worker rana = new Worker("Rana", "123", false);
        Worker elif = new Worker("Elif", "1234", false);
        Worker sena = new Worker("Sena", "12345", true);

        List<Worker> workerList = new ArrayList<>();
        workerList.add(rana);
        workerList.add(elif);
        workerList.add(sena);

        return workerList;

    }

    public static Map<String, Worker> getUserNameWorkerMap() {

        List<Worker> workerList = getWorkerList();

        Map<String, Worker> map = new LinkedHashMap<>();

        for (Worker worker : workerList) {
            map.put(worker.getUserName(), worker);
        }
        return map;
    }

    public static Worker getWorkerByUserName(String userName){

        Map<String, Worker> map = getUserNameWorkerMap();

        Worker worker = map.get(userName);

        return worker;
    }

    public static boolean isUserValid(String userName, String password) {

        boolean isUserValid = false;

        Worker worker = getWorkerByUserName(userName);

        if (worker != null){
            isUserValid = worker.getPassword().equals(password);
        }
        return isUserValid;
    }
}
