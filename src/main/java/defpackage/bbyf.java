package defpackage;

/* renamed from: bbyf */
final class bbyf implements Comparable {
    public final Runnable a;
    public volatile boolean b;
    private final long c;
    private final int d;

    bbyf(Runnable runnable, Long l, int i) {
        this.a = runnable;
        this.c = l.longValue();
        this.d = i;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        bbyf bbyf = (bbyf) obj;
        int a = bbow.a(this.c, bbyf.c);
        return a == 0 ? bbow.a(this.d, bbyf.d) : a;
    }
}
