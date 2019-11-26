package defpackage;

/* renamed from: tpa */
abstract class tpa implements Comparable, Runnable {
    private final int a;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = ((tpa) obj).a;
        int i2 = this.a;
        if (i > i2) {
            i = -1;
        } else if (i < i2) {
            return 1;
        } else {
            i = 0;
        }
        return i;
    }

    /* synthetic */ tpa(bre bre) {
        this.a = bre.ordinal();
    }
}
