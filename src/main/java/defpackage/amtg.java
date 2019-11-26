package defpackage;

/* renamed from: amtg */
final class amtg extends amtd {
    amtg() {
    }

    public final int a() {
        return 0;
    }

    public final amtd a(Comparable comparable, Comparable comparable2) {
        return amtg.a(comparable.compareTo(comparable2));
    }

    public final amtd a(long j, long j2) {
        int i = j >= j2 ? j <= j2 ? 0 : 1 : -1;
        return amtg.a(i);
    }

    private static amtd a(int i) {
        if (i < 0) {
            return amtd.b;
        }
        return i <= 0 ? amtd.a : amtd.c;
    }
}
