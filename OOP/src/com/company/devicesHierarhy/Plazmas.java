package com.company.devicesHierarhy;

public class Plazmas extends TVs {

    public int pixelCountX;
    public int pixelCountY;

    public Plazmas(String name){
        super(name);
    }

    public int getPixelCountX() {
        return pixelCountX;
    }

    public void setPixelCountX(int pixelCountX) {
        this.pixelCountX = pixelCountX;
    }

    public int getPixelCountY() {
        return pixelCountY;
    }

    public void setPixelCountY(int pixelCountY) {
        this.pixelCountY = pixelCountY;
    }
}
