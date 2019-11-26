package defpackage;

import java.util.Comparator;

/* renamed from: bavv */
final class bavv implements Comparator {
    private final /* synthetic */ bavy a;

    bavv(bavy bavy) {
        this.a = bavy;
    }

    public final int compare(Object obj, Object obj2) {
        int a = this.a.a(obj) - this.a.a(obj2);
        return a == 0 ? obj.getClass().getName().compareTo(obj2.getClass().getName()) : a;
    }
}
