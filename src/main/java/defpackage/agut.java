package defpackage;

import java.util.Comparator;

/* renamed from: agut */
final class agut implements Comparator {
    private final /* synthetic */ aguu a;

    public final int compare(Object obj, Object obj2) {
        return a(obj2) - a(obj);
    }

    private final int a(Object obj) {
        return this.a.e.containsKey(obj) ? ((Integer) this.a.e.get(obj)).intValue() : -1;
    }

    /* synthetic */ agut(aguu aguu) {
        this.a = aguu;
    }
}
