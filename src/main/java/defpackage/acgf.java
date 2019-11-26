package defpackage;

/* renamed from: acgf */
final /* synthetic */ class acgf implements Runnable {
    private final acfn a;
    private final int b;
    private final boolean c;
    private final long d;

    acgf(acfn acfn, int i, boolean z, long j) {
        this.a = acfn;
        this.b = i;
        this.c = z;
        this.d = j;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.d);
    }
}
