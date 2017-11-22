package com.company.devicesHierarhy;

import com.company.Manufacturers;

import java.math.BigDecimal;

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

    public Servers(String name){
        super(name);
    }

    public Servers(String name, int power){
        super(name);
        super.setPower(power);
    }

    //Скидка на сервера
    public BigDecimal discountPrice(double discount){
        BigDecimal discountSum = ((new BigDecimal(this.getPrice())).subtract(taxAmountCalc())).multiply(new BigDecimal(discount)).divide(new BigDecimal(100));
        return ((new BigDecimal(this.getPrice())).subtract(taxAmountCalc()).subtract(discountSum)).setScale(2, BigDecimal.ROUND_DOWN);
    }

    /*1. Обеспечьте возможность хранения информации об общем количестве процессоров у ваших серверов.
    Доступ к этой информации у пользователя должен быть только на чтение и вне зависимости от наличия серверов в программе.
*/

    @Override
    public String toString() {
        return "Servers [" +
                "name='" + name + '\'' +
                " ]";
    }

    @Override
    public DeviceType getType() {
        return DeviceType.Server;
    }
}
