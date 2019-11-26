package defpackage;

import java.util.Collections;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: amzb */
public final class amzb {
    public static final amzb a = new amzb(Collections.unmodifiableSortedMap(new TreeMap()));
    public final SortedMap b;
    private Integer c = null;
    private String d = null;

    private amzb(SortedMap sortedMap) {
        this.b = sortedMap;
    }

    public final void a(amyp amyp) {
        for (Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Set<Object> set = (Set) entry.getValue();
            if (set.isEmpty()) {
                ((amyq) amyp).a(str, null);
            } else {
                for (Object a : set) {
                    ((amyq) amyp).a(str, a);
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof amzb) && ((amzb) obj).b.equals(this.b);
    }

    public final int hashCode() {
        if (this.c == null) {
            this.c = Integer.valueOf(this.b.hashCode());
        }
        return this.c.intValue();
    }

    public final String toString() {
        if (this.d == null) {
            StringBuilder stringBuilder = new StringBuilder();
            amyq amyq = new amyq("[ ", " ]", stringBuilder);
            a(amyq);
            amyq.a();
            this.d = stringBuilder.toString();
        }
        return this.d;
    }

    static {
        amze amze = new amze();
        Collections.unmodifiableSortedSet(new TreeSet());
    }
}
