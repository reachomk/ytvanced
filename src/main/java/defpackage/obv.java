package defpackage;

/* renamed from: obv */
final /* synthetic */ class obv implements Runnable {
    private final obr a;
    private final int b;
    private final long c;
    private final long d;

    obv(obr obr, int i, long j, long j2) {
        this.a = obr;
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    public final void run() {
        obr obr = this.a;
        obr.a.a(this.b, this.c, this.d);
    }
}
