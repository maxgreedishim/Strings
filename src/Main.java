public class Main {

    public static void main(String[] args) {
        String hello = "Hello";
        String world = " World";
        String greeting = hello + world + " !";
        System.out.println(greeting);
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.substring(0,5));
        System.out.println(greeting.substring(6));
        System.out.println(greeting.substring(6) == world);
        System.out.println(greeting.substring(6).equals(world));
        System.out.println(greeting.substring(6).equals(world.trim()));
        String[] arry = greeting.split(" ");
        System.out.println("Длинна массива: " + arry.length);
        for (String s : arry) System.out.print(s);
        System.out.println("");
        System.out.println(String.join("_", arry));
        String test = "Your implementation should return the string backwards.";
        arry = test.split("s..",3);
        System.out.println(arry[2]);


    }
}
