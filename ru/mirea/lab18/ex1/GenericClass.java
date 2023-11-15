package ru.mirea.lab18.ex1;

import java.io.Serializable;

public class GenericClass<T extends Comparable<String>, V extends Animal & Serializable, K> {
    private T t;
    private V v;
    private K k;

    public GenericClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public void printClasses() {
        System.out.println(t.getClass());
        System.out.println(v.getClass());
        System.out.println(k.getClass() + "\n");
    }

    @Override
    public String toString() {
        return "GenericClass @ (" + t + ", " + v + ", " + k + ").";
    }
}