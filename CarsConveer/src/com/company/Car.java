package com.company;

public class Car {

    String name;
    Boolean body;
    int wheel;
    int  seat;
    int door;
    int window;
    boolean steeringWheel;
    boolean painting;
    boolean polishing;

    public Car(Builder builder) {
        this.name = builder.name;
        this.body = builder.body;
        this.wheel = builder.wheel;
        this.seat = builder.seat;
        this.door = builder.door;
        this.window = builder.window;
        this.steeringWheel = builder.steeringWheel;
        this.painting = builder.painting;
        this.polishing = builder.polishing;
    }

    public static class Builder{
        String name;
        Boolean body;
        int wheel;
        int  seat;
        int door;
        int window;
        boolean steeringWheel;
        boolean painting;
        boolean polishing;
// Getters
        public String getName() {
            return name;
        }

        public Boolean getBody() {
            return body;
        }

        public int getWheel() {
            return wheel;
        }

        public int getSeat() {
            return seat;
        }

        public int getDoor() {
            return door;
        }

        public int getWindow() {
            return window;
        }

        public boolean isSteeringWheel() {
            return steeringWheel;
        }

        public boolean isPainting() {
            return painting;
        }

        public boolean isPolishing() {
            return polishing;
        }

        //Setters
        public Builder setWheel(int wheel) {
            this.wheel = wheel;
            return this;
        }

        public Builder setSeat(int seat) {
            this.seat = seat;
            return this;
        }

        public Builder setDoor(int door) {
            this.door = door;
            return this;
        }

        public Builder setWindow(int window) {
            this.window = window;
            return this;
        }

        public Builder setSteeringWheel(boolean steeringWheel) {
            this.steeringWheel = steeringWheel;
            return this;
        }

        public Builder setPainting(boolean painting) {
            this.painting = painting;
            return this;
        }

        public Builder setPolishing(boolean polishing) {
            this.polishing = polishing;
            return this;
        }

        public Builder(String name, Boolean body) {
            this.name = name;
            this.body = body;
        }


        public Car build(){
            if (this.body != null && this.name != null && this.painting != false && this.steeringWheel != false
                    && this.door >1 && this.seat > 1 && this.window >1 && this.wheel == 4 && this.polishing != false){
                return new Car(this);
            }else {
                throw new NullPointerException("Some parameter is not initialized");
            }


        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", body=" + body +
                ", wheel=" + wheel +
                ", seat=" + seat +
                ", door=" + door +
                ", window=" + window +
                ", steeringWheel=" + steeringWheel +
                ", painting=" + painting +
                ", polishing=" + polishing +
                '}';
    }
}
