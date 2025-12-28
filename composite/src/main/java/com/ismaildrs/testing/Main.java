package com.ismaildrs.testing;

public class Main {
    public static void main(String[] args) {

        Composant root = new Composite("Composite 1");
        Composant composite2 = new Composite("Composite 2");

        ((Composite) root).add(composite2);
        ((Composite) root).add(new Element("Element 11"));
        ((Composite) root).add(new Element("Element 12"));
        ((Composite) root).add(new Element("Element 13"));

        ((Composite) composite2).add(new Element("Element 21"));
        ((Composite) composite2).add(new Element("Element 22"));

        root.operation();
    }
}
