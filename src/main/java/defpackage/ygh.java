package defpackage;

/* renamed from: ygh */
final /* synthetic */ class ygh implements Runnable {
    private final ygg a;
    private final ygs b;
    private final int c;

    ygh(ygg ygg, ygs ygs, int i) {
        this.a = ygg;
        this.b = ygs;
        this.c = i;
    }

    public final void run() {
        ygg ygg = this.a;
        this.b.a(ygg.i, this.c);
    }
}
