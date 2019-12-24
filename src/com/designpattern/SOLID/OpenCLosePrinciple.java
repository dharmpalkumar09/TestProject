package com.designpattern.SOLID;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

enum Color{

    RED, GREEN, BLUE
}

enum Size{
    SMALL,MEDIUM,LARGE,YUGE
}

interface Specification<T>{

    boolean isSatisfied(T item);
}

interface FIlters<T>{
    Stream<T> filter(List<T> item,Specification<T> speac);
}

public class OpenCLosePrinciple {

    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);

        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);
        List<Product> products = Arrays.asList(apple, tree, house);

        ProductFilter productFilter = new ProductFilter();
        System.out.println("Green Product(Old)");
        productFilter.filterByClolor(products,Color.GREEN).forEach(p -> System.out.println("- "+p.name +" is Green"));

        BetterFilter betterFilter = new BetterFilter();

        betterFilter.filter(products,new colorSpecification(Color.GREEN)).forEach(p -> System.out.println("- "+p.name + " is Green"));
    }

}

class BetterFilter implements FIlters<Product>{
    @Override
    public Stream<Product> filter(List<Product> item, Specification<Product> speac) {
        return item.stream().filter(p -> speac.isSatisfied(p));
    }
}

class colorSpecification implements Specification<Product>{

    private Color color;

    public colorSpecification(Color color){
        this.color = color;
    }
    @Override
    public boolean isSatisfied(Product product) {
        return product.colour == color;
    }
}

class sizeSpecification implements Specification<Product>{
    private Size size;

    public sizeSpecification(Size size){
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.size == size;
    }
}

class Product{

    public String name;
    public Color colour;
    public Size size;

    public Product(String name,Color color,Size size){
        this.colour = color;
        this.name = name;
        this.size = size;
    }
}

class ProductFilter{

    public Stream<Product> filterByClolor(List<Product> product, Color color){
        return product.stream().filter(p -> p.colour == color);
    }

    public Stream<Product> filterBySize(List<Product> product, Size size){

        return product.stream().filter(p -> p.size == size);
    }

    public Stream<Product> filterBySizeAndCOlor(List<Product> product,Color color,Size size){

        return product.stream().filter(p -> p.colour == color && p.size == size);
    }
}
