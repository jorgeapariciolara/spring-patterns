package com.example.springpatterns.patterns.structural.proxy;

public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    /**
     * Sets the proxy
     */
    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    /**
     * Creates and image if none exists
     * and prints it
     */
    public void show() {
        // El objeto realImage se crea solo la primera vez
        if (realImage == null) {
            this.realImage = new RealImage(fileName);
        }
        realImage.show();
    }
}
