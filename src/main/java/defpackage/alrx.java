package defpackage;

import java.util.Comparator;

/* renamed from: alrx */
final /* synthetic */ class alrx implements Comparator {
    public static final Comparator a = new alrx();

    private alrx() {
    }

    public final int compare(Object obj, Object obj2) {
        alrc alrc = (alrc) obj2;
        int a = alru.a((alrc) obj);
        int a2 = alru.a(alrc);
        if (a > a2) {
            a = -1;
        } else if (a == a2) {
            return 0;
        } else {
            a = 1;
        }
        return a;
    }
}
