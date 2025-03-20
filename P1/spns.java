package P1;

public class spns {
    public spns(){
        SameClassNew s = new SameClassNew();
        System.out.println("b value is "+s.b); // ✅ Default access (inside same package)
        System.out.println("c value is "+s.c); // ✅ Protected access (inside same package)
        System.out.println("d value is "+s.d); // ✅ Public access (everywhere)
    }
}
