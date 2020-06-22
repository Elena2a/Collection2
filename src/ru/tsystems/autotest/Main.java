package ru.tsystems.autotest;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> user = new ArrayList<>();
        User user1 = new User(15, "Anna");
        User user2 = new User(19, "Peter");
        user.add(user1);
        user.add(user2);


        listSample();
        setSample();
        mapSample();
    }

    public static List<User> userIntersection(List<User> A, List<User> B) {
        List<User> user = new ArrayList<>();
        for ( User a : A ) {
            if (B.contains(a)) {
                user.add(a);
            }
        }
        return user;
    }

    public static Set<User> intersection(Set<User> set1, Set<User> set2) {
        Set<User> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    private static void listSample() {
        List<User> user = new ArrayList<>();
        user.add(new User(15, "Anna"));
        user.add(new User(19, "Petra"));
        user.add(new User(21, "Mary"));
        user.add(new User(25, "John"));
        user.add(new User(19, "Petra"));
        System.out.println(user);
        for ( int i = 0; i < user.size(); i++ ) {

            System.out.println(user.get(i));
        }
        for ( User str : user )
            System.out.println(str);
    }

    private static void setSample() {
        HashSet<User> user = new HashSet<>();
        user.add(new User(15, "Anna"));
        user.add(new User(19, "Petra"));
        user.add(new User(21, "Mary"));
        user.add(new User(25, "John"));
        user.add(new User(19, "Petra"));
        System.out.println(user);

        System.out.println();
        for ( User str : user ) {
            System.out.println(str);
        }
    }

    private static void mapSample() {
        Map<Integer, User> map = new HashMap<>();
        map.put(1, new User(15, "Anna"));
        map.put(2, new User(19, "Petra"));
        map.put(1, new User(21, "Mary"));
        map.put(3, new User(25, "John"));
        map.put(4, new User(19, "Petra"));
        System.out.println("map size: " + map.size());
        System.out.println();
        final Set<Integer> keySet = map.keySet();
        for ( Integer key : keySet ) {
            System.out.println("key: " + key);
        }
        System.out.println();
        final Collection<User> values = map.values();
        for ( User value : values ) {
            System.out.println("value: " + value);
        }
        System.out.println();
        final Set<Map.Entry<Integer, User>> entries = map.entrySet();
        for ( Map.Entry<Integer, User> entry : entries ) {
            System.out.println("entry: key: " + entry.getKey() + ", value: " + entry.getValue());
        }

    }
}

