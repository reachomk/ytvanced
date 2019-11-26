package defpackage;

/* renamed from: baep */
final class baep implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ long b;
    private final /* synthetic */ bael c;

    baep(bael bael, long j, long j2) {
        this.c = bael;
        this.a = j;
        this.b = j2;
    }

    public final void run() {
        this.c.a.a(this.a, this.b);
    }
}
