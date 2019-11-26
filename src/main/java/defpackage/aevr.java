package defpackage;

/* renamed from: aevr */
final /* synthetic */ class aevr implements Runnable {
    private final aevp a;
    private final long b;
    private final long c;

    aevr(aevp aevp, long j, long j2) {
        this.a = aevp;
        this.b = j;
        this.c = j2;
    }

    public final void run() {
        aevp aevp = this.a;
        aevp.c.a(aevp.d, this.b, this.c);
    }
}
