package defpackage;

/* renamed from: pal */
final /* synthetic */ class pal implements Runnable {
    private final pak a;
    private final nzw b;

    pal(pak pak, nzw nzw) {
        this.a = pak;
        this.b = nzw;
    }

    public final void run() {
        pak pak = this.a;
        pak.a.a(this.b);
    }
}
