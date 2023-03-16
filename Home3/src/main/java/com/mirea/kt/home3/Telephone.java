/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.home3;

/**
 *
 * @author afana
 */
public class Telephone implements Comparable<Telephone>{
    private String model;
    private String sernomer;
    private String colour;
    private boolean tip;

    public Telephone(String model, String sernomer, String colour, boolean tip) {
        this.model = model;
        this.sernomer = sernomer;
        this.colour = colour;
        this.tip = tip;
    }

    @Override
    public int compareTo(Telephone o){
        return model.compareTo(o.getmodel());
    }

    public String getmodel() {
        return model;
    }

    public String getsernomer() {
        return sernomer;
    }

    public String getcolour() {
        return colour;
    }

    public boolean istip() {
        return tip;
    }
}