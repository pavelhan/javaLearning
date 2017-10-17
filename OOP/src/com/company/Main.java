package com.company;

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
        Laptops laptop = new Laptops();
        laptop.weight = 2;
        laptop.name = "HP";
        laptop.DDRCapacity = 4000;

        System.out.println("Name " + laptop.name + " Weight " + laptop.weight + " DDRCapacity " + laptop.DDRCapacity);

        // Создаем обьект плеер
        Players player = new Players();
        player.name = "Walkman";
        player.playbackType[0] = "Forward";
        player.playbackType[1] = "Backward";

        System.out.println("Name " + player.name + " Playback type " + player.playbackType[0]);

        Plazmas plazma = new Plazmas();

        plazma.name = "LG";
        plazma.pixelCountX = 1920;
        plazma.pixelCountY = 1080;

        System.out.println("Name " + plazma.name + " Rezolution " + plazma.pixelCountX + "x" + plazma.pixelCountY);


        //3. Предусмотрите возможность создания устройств без указания мощности и возможность изменения мощности
        //уже созданным устройствам позднее. Создайте ноутбук без указания мощности и назначьте этому ноутбуку мощность.


        Laptops laptop1 = new Laptops();

        laptop1.setPower(300);


         /*4. Создайте метод, устанавливающий мощность устройству. Метод должен возвращать само устройство.
    Переопределите этод метод для компьютеров. Создайте такой же метод, устанавливающий объём памяти для компьютеров.
    Используйте эти методы на практике.*/


        Computers myPC = new Computers();
        myPC.setPower(300);
        myPC.setDDRCapacity(4096);
        System.out.println("DDR Capacity = " + myPC.DDRCapacity);
        myPC.setPower(400);










    }


}