package com.company;

import com.company.devicesHierarhy.*;

public class Main {

    public static void main(String[] args) {
/*1. Создайте иерархию классов для устройств, в которую входят компьютеры, плееры и телевизоры. Компьютеры, в свою очередь
делятся на ноутбуки и сервера. Телевизоры делятся на плазменные и ЭЛТ. Каждое устройство имеет наименование и мощность.
Компьютеры имеют объём оперативной памяти, ноутбуки – вес, сервера – количество процессоров. Плееры поддерживают несколько
форматов воспроизведения. Телефизоры имеют диагональ экрана. Плазменные телевизоры имеют разрешение X:Y,
а ЭЛТ телевизоры – частоту развёртки.





*/


        //2. Создайте несколько объектов этих классов и выведите информацию  о них на экран.
        // Создаем обьект ноутбук
        /*Laptops laptop = new Laptops("Dell", 1024);
        laptop.weight = 2;
        laptop.name = "HP";
        laptop.DDRCapacity = 4000;

        System.out.println("Name " + laptop.name + " Weight " + laptop.weight + " DDRCapacity " + laptop.DDRCapacity);
*/
        // Создаем обьект плеер
        /*Players player = new Players("Iriver");
        player.name = "Walkman";
        player.playbackType[0] = "Forward";
        player.playbackType[1] = "Backward";

        System.out.println("Name " + player.name + " Playback type " + player.playbackType[0]);
*/
        //Plazmas plazma = new Plazmas("LG!");

        /*plazma.name = "LG";
        plazma.pixelCountX = 1920;
        plazma.pixelCountY = 1080;

        System.out.println("Name " + plazma.name + " Rezolution " + plazma.pixelCountX + "x" + plazma.pixelCountY);
*/

        //3. Предусмотрите возможность создания устройств без указания мощности и возможность изменения мощности
        //уже созданным устройствам позднее. Создайте ноутбук без указания мощности и назначьте этому ноутбуку мощность.


        //Laptops laptop1 = new Laptops("555", 555);

        //laptop1.setPower(300);


         /*4. Создайте метод, устанавливающий мощность устройству. Метод должен возвращать само устройство.
    Переопределите этод метод для компьютеров. Создайте такой же метод, устанавливающий объём памяти для компьютеров.
    Используйте эти методы на практике.*/


        /*Computers myPC = new Laptops("PC111", 444);
        myPC.setPower(300);
        myPC.setDDRCapacity(4096);
        System.out.println("DDR Capacity = " + myPC.DDRCapacity);
        myPC.setPower(400);
*/


        /*
        7. Предусмотрите возможность сравнения (больше/меньше) различных устройств. Сравнение компьютеров проводите по
        количеству оперативной памяти, телевизоров – по размеру диагонали, остальных устройств – по потребляемой мощности.
        */
  /*      myPC.compare(laptop);
*/

        //Practice 12
        //Task1
        //Create a couple of servers
        //Servers server1 = new Servers("X", 5);
        //Servers server2 = new Servers("Y", 10);
  /*      System.out.println(Servers.getTotalCoreCount());
        System.out.println(server1.getDeviceID());
        System.out.println(server2.getDeviceID());
        server1.setCoresCount(99);
*/
      /*4. Создайте генератор электричества с определённой мощностью. Предусмотрите возможность включения устройств в сеть через соседнее устройство
      (т.е. одно в другое (только 1:1)). Присоедините ваши устройства к генератору(те, которым хватило мощности) и распечатайте получившуюся цепочку.
      Разорвите одно соединение и выведите цепочку подключенных устройств. Не используйте массивы.
*/

      PowerGenerator philips = new PowerGenerator("philips", 8000);

      Laptops dellLaptop = new Laptops("Vostro1540", 888, 200, Manufacturers.Konia);
      dellLaptop.setPower(1000);


      TVs zenit = new ELTs("Zenit", 220, Manufacturers.Совтяжтрансмаш);
      zenit.setPower(2000);


      Servers serverM = new Servers("MAC", 12, 400, 450, Manufacturers.GL);
      serverM.setPower(5000);


      Players iRiver = new Players("Iriver");
      iRiver.setPower(500);


      Plazmas samsung = new Plazmas("XsuperPuper", 230, Manufacturers.Konia);
      samsung.setPower(2000);


      philips.connectDevice(dellLaptop).connectDevice(zenit).connectDevice(serverM).connectDevice(iRiver).connectDevice(samsung);
        System.out.println(philips.deviceChain());
      serverM.unplugDevice();
        System.out.println(philips.deviceChain());


      //Practice 13

        Computers myDell = new Laptops("myDell", 400, 500, Manufacturers.GL);
        System.out.println(myDell.getDDRCapacity());
      System.out.println(myDell.toString());

      //Pactice 15
      myDell.plugBattary(Battary.b1);
      System.out.println(myDell.getBattary().calculateTime(myDell));

      myDell.setPrice(10);
      System.out.println("Pay " + myDell.taxAmountCalc() + " taxes for this " + myDell.name);

      //Создам несколько устройств и посчитаю их мощность

      Device [] devices = new Device[]{
        new Players("Iriver",50),
        new Laptops("HPone", 100),
        new Servers("Oct", 200)

      };

      System.out.println("Total power = " + Device.calculateDevicesPower(devices));

      //Создам сервер
      Servers server = new Servers("Octopus");
      server.setPrice(1000);
      System.out.println("With a discount, my server " + server.name + " will cost " + server.discountPrice(5));
    }


}