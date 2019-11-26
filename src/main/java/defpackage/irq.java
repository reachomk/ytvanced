package defpackage;

/* renamed from: irq */
final /* synthetic */ class irq implements Runnable {
    private final irr a;

    irq(irr irr) {
        this.a = irr;
    }

    public final void run() {
        this.a.f();
    }
}
