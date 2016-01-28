package com;

/**
 * Created by us9522 on 28.01.2016.
 */
public class Controller {

    public static void main(String[] args) {

        //ця змінна, це кількість створеного тобою транспорту
        int count = 3;

        //На рахунок цих двох рядків що знизу такох погугли чому я так написав
        Transport tr1 = new Car("car","bmw","white");
        System.out.println("tr1 = " + tr1.toString());
        ////////


        //І масив...тут такох погугли, і постарайся зрозуміти чому елемент масиву типу transport,
        //а я пишу new Car, new Plane, new Yacht
        Transport[] transport = new Transport[count];

        transport[0] = new Car("car", "mercedes", "black");
        transport[1] = new Plane("plane", "boeing", "white");
        transport[2] = new Yacht("yacht", "activa", "white");

        for(int i = 0; i < count; i++){
            System.out.println(transport[i].toString());
            transport[i].function();
        }

    }

}
