package defpackage;

/* renamed from: aeqa */
public final /* synthetic */ class aeqa implements Runnable {
    private final aepu a;
    private final float b;

    public aeqa(aepu aepu, float f) {
        this.a = aepu;
        this.b = f;
    }

    public final void run() {
        aepu aepu = this.a;
        aepu.d.a(this.b);
    }
}
