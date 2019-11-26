package defpackage;

/* renamed from: pan */
final /* synthetic */ class pan implements Runnable {
    private final pak a;
    private final int b;
    private final int c;
    private final int d;
    private final float e;

    pan(pak pak, int i, int i2, int i3, float f) {
        this.a = pak;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
    }

    public final void run() {
        pak pak = this.a;
        pak.a.a(this.b, this.c, this.d, this.e);
    }
}
