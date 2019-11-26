package defpackage;

/* renamed from: uao */
public final class uao {
    public final bcat a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final bcab f;
    public final String g;
    public final Boolean h;
    public final bcbb i;

    public uao(bcat bcat, Long l, Long l2, Long l3, Long l4, bcab bcab, String str, Boolean bool, bcbb bcbb) {
        this.a = bcat;
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = l4;
        this.f = bcab;
        this.g = str;
        this.h = bool;
        this.i = bcbb;
    }

    public final String toString() {
        return String.format("StatsRecord:\n  elapsed: %d\n  current: %d\n  Primes version: %d\n  version name #: %d\n  customName: %s\n", new Object[]{this.b, this.c, this.d, this.e, this.g});
    }
}
