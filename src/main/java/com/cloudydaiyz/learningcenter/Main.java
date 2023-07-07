package com.cloudydaiyz.learningcenter;

import com.cloudydaiyz.learningcenter.playground.ResourceReader;

// This is just a test Main class
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ResourceReader rr = new ResourceReader();
        rr.readFromResources("test.txt");
    }
}