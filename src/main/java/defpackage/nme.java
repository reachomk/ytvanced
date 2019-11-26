package defpackage;

/* renamed from: nme */
final class nme implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ long b;
    private final /* synthetic */ nlz c;

    nme(nlz nlz, long j, long j2) {
        this.c = nlz;
        this.a = j;
        this.b = j2;
    }

    public final void run() {
        this.c.a.a(this.a, this.b);
    }
}
