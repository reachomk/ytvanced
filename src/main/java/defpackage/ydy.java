package defpackage;

/* renamed from: ydy */
final /* synthetic */ class ydy implements Runnable {
    private final ydw a;
    private final int b;

    ydy(ydw ydw, int i) {
        this.a = ydw;
        this.b = i;
    }

    public final void run() {
        ydw ydw = this.a;
        ydw.a.e(this.b);
    }
}
