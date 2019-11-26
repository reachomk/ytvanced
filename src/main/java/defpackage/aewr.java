package defpackage;

/* renamed from: aewr */
final class aewr implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ int b;
    private final /* synthetic */ aewo c;

    aewr(aewo aewo, int i, int i2) {
        this.c = aewo;
        this.a = i;
        this.b = i2;
    }

    public final void run() {
        this.c.b.b(this.a, this.b);
    }
}
