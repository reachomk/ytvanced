package defpackage;

/* renamed from: aepz */
public final /* synthetic */ class aepz implements Runnable {
    private final aepu a;
    private final float b;

    public aepz(aepu aepu, float f) {
        this.a = aepu;
        this.b = f;
    }

    public final void run() {
        aepu aepu = this.a;
        aepu.d.b(this.b);
    }
}
