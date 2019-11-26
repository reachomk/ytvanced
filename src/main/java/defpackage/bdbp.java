package defpackage;

/* renamed from: bdbp */
final class bdbp implements Comparable {
    public final bcvl a;
    private final Long b;
    private final int c;

    bdbp(bcvl bcvl, Long l, int i) {
        this.a = bcvl;
        this.b = l;
        this.c = i;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        bdbp bdbp = (bdbp) obj;
        int compareTo = this.b.compareTo(bdbp.b);
        return compareTo == 0 ? bdbk.a(this.c, bdbp.c) : compareTo;
    }
}
