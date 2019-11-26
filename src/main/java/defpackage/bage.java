package defpackage;

/* renamed from: bage */
final class bage implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ int b;
    private final /* synthetic */ bagf c;

    bage(bagf bagf, int i, int i2) {
        this.c = bagf;
        this.a = i;
        this.b = i2;
    }

    public final void run() {
        if (this.a <= 0 || this.b <= 0) {
            this.c.a.getHolder().setSizeFromLayout();
        } else {
            this.c.a.getHolder().setFixedSize(this.a, this.b);
        }
    }
}
