package com.company.devicesHierarhy;

import com.company.Manufacturers;

public class Servers extends Computers {

    private int coresCount;

    private static int totalCoreCount = 0;



    public static int getTotalCoreCount() {
        return totalCoreCount;
    }

    public void setCoresCount(int coresCount) {
        totalCoreCount = totalCoreCount - this.coresCount;
        this.coresCount = coresCount;
        totalCoreCount +=coresCount;

    }

    public Servers(String name, int coresCount, int DDRCapacity, int power, Manufacturers manufacturer){
        super(name, DDRCapacity, power, manufacturer);
        this.coresCount = coresCount;
        totalCoreCount +=coresCount;
    }

    /*1. Обеспечьте возможность хранения информации об общем количестве процессоров у ваших серверов.
    Доступ к этой информации у пользователя должен быть только на чтение и вне зависимости от наличия серверов в программе.
*/



}
