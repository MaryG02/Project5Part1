
public class methods {
    // Part 1.
    public static void main(String[] args) {
    print("Hello");
    ItemCost("Book", 5);
    ItemCost("TV", 300);
    int n = add(10, 23);
    print(Integer.toString(n));
    }
    public static void print(String toPrint) {
        System.out.println(toPrint);
    }
    // Call a method inside another method
    static void ItemCost(String item, int cost) {
        print(item + " costs " + cost + " dollars");
    }
    static int add(int x, int y){
        return x+y;
    }

}
