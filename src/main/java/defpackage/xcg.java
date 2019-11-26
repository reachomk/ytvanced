package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: xcg */
public final class xcg implements xcb {
    public final Map a;

    public xcg() {
        this.a = new TreeMap();
    }

    public xcg(Comparator comparator) {
        this.a = new TreeMap(comparator);
    }

    public final Iterator iterator() {
        return new xcf(this);
    }

    public final boolean a(Object obj, Object obj2) {
        LinkedList linkedList = (LinkedList) this.a.get(obj);
        if (linkedList == null) {
            linkedList = new LinkedList();
            this.a.put(obj, linkedList);
        }
        linkedList.addLast(obj2);
        return true;
    }

    public final void a() {
        this.a.clear();
    }

    public final boolean a(Object obj) {
        for (LinkedList contains : this.a.values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(Object obj) {
        for (Entry entry : this.a.entrySet()) {
            LinkedList linkedList = (LinkedList) entry.getValue();
            if (linkedList.remove(obj)) {
                if (linkedList.isEmpty()) {
                    this.a.remove(entry.getKey());
                }
                return true;
            }
        }
        return false;
    }
}
