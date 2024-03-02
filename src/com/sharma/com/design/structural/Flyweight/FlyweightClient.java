package com.sharma.designPattern.structural.Flyweight;

/*
    Flyweight design pattern is used when we need to create a lot of Objects of a class.
    Since every object consumes memory space that can be crucial for low memory devices,
    such as mobile devices or embedded systems,
    flyweight design pattern can be applied to reduce the load on memory by sharing objects.

    To apply flyweight pattern, we need to divide Object property into intrinsic and extrinsic properties.
    Intrinsic properties make the Object unique
    extrinsic properties are set by client code and used to perform different operations.

    Usage examples:
    The Flyweight pattern has a single purpose: minimizing memory intake.
    If your program doesn’t struggle with a shortage of RAM, then you might just ignore this pattern for a while.

    JDK Examples :
        java.lang.Integer#valueOf(int) (also Boolean, Byte, Character, Short, Long and BigDecimal)

Example :
    The Flyweight uses sharing to support large numbers of objects efficiently. Modern web browsers use this technique to prevent loading same images twice.
    When browser loads a web page, it traverse through all images on that page.
    Browser loads all new images from Internet and places them the internal cache.
    For already loaded images, a flyweight object is created, which has some unique data like position within the page,
    but everything else is referenced to the cached one.

Example :Angry birds game.
    Angry birds is one of the most entertaining and trending game now a days and most of the people loved to play
    this game on daily basis. Let us see how we can implement flyweight pattern with the help of this game.
    In Angry birds game assume, if we want to create 20000 red colour angry bird
    what we will do is that we will create 20000 angry bird object and fill it with red colour.
    So, if we create 20000 object then it will occupy more memory and affect the performance of the game
    so to avoid this complexity we can do one thing that according to Flyweight design pattern we can create only
    one object without any colour and pushes into Hash-map.

 */


public class FlyweightClient {
    private static final String colors[] = { "Red", "Orange", "Blue", "Yellow", "Pink" };

    public static void main(String[] args) {
        for(int i=0; i < 20; ++i) {
            AngryBird angrybird = (AngryBird)BirdFactory.getAngryBird(getRandomColor());

            angrybird.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
}
