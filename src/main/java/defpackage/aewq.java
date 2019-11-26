package defpackage;

/* renamed from: aewq */
final class aewq implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ long b;
    private final /* synthetic */ aewo c;

    aewq(aewo aewo, int i, long j) {
        this.c = aewo;
        this.a = i;
        this.b = j;
    }

    public final void run() {
        this.c.b.a(this.a, this.b);
    }
}
