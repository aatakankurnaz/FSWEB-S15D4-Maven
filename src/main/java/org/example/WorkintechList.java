package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WorkintechList extends ArrayList<Object> {

    @Override
    public boolean add(Object element) {
        if (!this.contains(element)) {
            return super.add(element); // Eleman zaten mevcut değilse ekle
        }
        return false; // Eleman zaten mevcutsa ekleme yapılmaz
    }

    @Override
    public boolean remove(Object element) {
        boolean removed = super.remove(element);
        if (removed) {
            sort(); // Eleman silindikten sonra listeyi sırala
        }
        return removed;
    }

    public void sort() {
        Collections.sort(this, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Comparable && o2 instanceof Comparable) {
                    return ((Comparable) o1).compareTo(o2);
                }
                return 0; // Eğer karşılaştırılamıyorsa sıralama yapılmaz
            }
        });
    }
}