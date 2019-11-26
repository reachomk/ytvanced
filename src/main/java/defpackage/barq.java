package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: barq */
public final class barq {
    public static final barq b = new barq(Collections.emptyMap());
    public final Map a;

    private barq(Map map) {
        this.a = map;
    }

    public final Object a(bars bars) {
        return this.a.get(bars);
    }

    public static barp a() {
        return new barp(b);
    }

    public final barp b() {
        return new barp(this);
    }

    public final String toString() {
        return this.a.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            barq barq = (barq) obj;
            if (this.a.size() == barq.a.size()) {
                for (Entry entry : this.a.entrySet()) {
                    if (barq.a.containsKey(entry.getKey())) {
                        if (!amqq.a(entry.getValue(), barq.a.get(entry.getKey()))) {
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        for (Entry entry : this.a.entrySet()) {
            i += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return i;
    }

    /* synthetic */ barq(Map map, byte b) {
        this(map);
    }
}
