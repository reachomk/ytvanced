package defpackage;

/* renamed from: obt */
final /* synthetic */ class obt implements Runnable {
    private final obr a;
    private final String b;
    private final long c;
    private final long d;

    obt(obr obr, String str, long j, long j2) {
        this.a = obr;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    public final void run() {
        obr obr = this.a;
        obr.a.b(this.b, this.c, this.d);
    }
}
