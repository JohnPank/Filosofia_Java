package com.john_pank.chapter17.task19;

import java.util.*;

/**
 * Filosofia_Java
 * Created by John Pank on 03.02.2017.
 */

class MapEntry<K, V> implements Map.Entry<K, V>{
    private K key;
    private V value;

    public MapEntry(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

    public V setValue(V v){
        V result = value;
        value = v;
        return result;
    }

    public int hashCode(){
        return (key == null ? 0 : key.hashCode())^(value == null ? 0 : value.hashCode());
    }

    public boolean equals(Object o){
        if(!(o instanceof MapEntry)) return false;
        MapEntry me = (MapEntry)o;
        return (key == null ? me.getKey() == null : key.equals(me.getKey())) && (value == null ? me.getValue() == null : value.equals(me.getValue()));
    }

    public String toString() { return key + "=" + value; }
}

public class SimpleHashMap<K, V> extends AbstractMap<K, V> {
    static final int SIZE = 997;

    @SuppressWarnings("uncheked")
    LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[SIZE];
    public V put(K key, V value){
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % SIZE;
        if(buckets[index] == null)
            buckets[index] = new LinkedList<MapEntry<K, V>>();
        LinkedList<MapEntry<K, V>>  bucket = buckets[index];
        MapEntry<K, V> pair = new MapEntry<K, V>(key, value);
        boolean found = false;
        ListIterator<MapEntry<K, V>> it = bucket.listIterator();
        while (it.hasNext()){
            MapEntry<K, V> iPair =it.next();
            if(iPair.getKey().equals(key)){
                System.out.println("double add");
                oldValue = iPair.getValue();
                it.set(pair);
                found = true;
                break;
            }
        }
        if(!found)
            buckets[index].add(pair);
        return oldValue;
    }

    @Override
    public V get(Object key) {
        int index = Math.abs(key.hashCode()) % SIZE;
        if(buckets[index] == null) return null;
        for(MapEntry<K, V> iPair : buckets[index])
            if(iPair.getKey().equals(key))
                return iPair.getValue();
        return null;
    }

    public Set<Entry<K, V>> entrySet(){
        Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K, V>>();
        for(LinkedList<MapEntry<K, V>> bucket : buckets){
            if(bucket == null) continue;
            for(MapEntry<K, V> mPair : bucket)
                set.add(mPair);
        }
        return set;
    }

    public static void main(String[] args) {
        SimpleHashMap<String, String> m =new SimpleHashMap<>();
        m.put("a", "qwer");
        m.put("b", "lkjh");
        //m.put("b", "lkjh");
        m.put("c", "dfgh");
        //m.put("c", "dfgh");
        System.out.println(m);
    }
}
