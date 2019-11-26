package defpackage;

/* renamed from: amaz */
final /* synthetic */ class amaz implements Runnable {
    private final amav a;
    private final ambi b;

    amaz(amav amav, ambi ambi) {
        this.a = amav;
        this.b = ambi;
    }

    public final void run() {
        amav amav = this.a;
        amav.c.add(this.b);
        amav.c();
    }
}
