package com.company.devicesHierarhy;

import com.company.Manufacturers;

public final class Plazmas extends TVs {

    public int pixelCountX;
    public int pixelCountY;

    public Plazmas(String name, int power, Manufacturers manufacturer){
        super(name, power, manufacturer);
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
