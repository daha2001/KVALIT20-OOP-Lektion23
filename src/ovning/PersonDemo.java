package ovning;

public class PersonDemo {
    public static void main(String[] args) {

        Person p1 = new Person("daniel", "ekuddsvägen 6", "8801140255");
        System.out.println(p1);

        p1.setNamn("DANIEL");
        System.out.println(p1);

    }
}
