package ru.tsystems.autotest;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        listSample();

    }

    public static List<User> intersection(List<User> list1, List<User> list2) {
        List<User> result = new ArrayList<>();
        result.retainAll(list2);
        return result;
    }

    public static Set<User> intersection(Set<User> set1, Set<User> set2) {
        Set<User> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }


    private static void listSample() {
        User user1 = new User(15, "Anna");
        User user2 = new User(19, "Petra");
        User user3 = new User(21, "Mary");
        User user4 = new User(25, "John");

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user2);

        for ( User user : list ) {

            System.out.println(list.indexOf(user) + " " + user);

        }
        setSample();
        mapSample();
    }

    private static void setSample() {
        HashSet<User> set = new HashSet<>();
        set.add(new User(15, "Anna"));
        set.add(new User(19, "Petra"));
        set.add(new User(21, "Mary"));
        set.add(new User(25, "John"));
        set.add(new User(19, "Petra"));

        System.out.println();
        for ( User str : set ) {
            System.out.println(str);
        }
    }

    private static void mapSample() {
        Map<Integer, User> map = new HashMap<>();
        map.put(1, new User(15, "Anna"));
        map.put(2, new User(19, "Petra"));
        map.put(3, new User(21, "Mary"));
        map.put(4, new User(25, "John"));
        map.put(2, new User(19, "Petra"));
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
        for ( Integer key : keySet ) {

            for ( User value : map.values() )

                System.out.println("key: " + key + ", value:" + " " + value);

        }

        System.out.println();
        final Set<Map.Entry<Integer, User>> entries = map.entrySet();
        for ( Map.Entry<Integer, User> entry : entries ) {
            System.out.println("entry: key: " + entry.getKey() + ", value: " + entry.getValue());

        }
    }
}

