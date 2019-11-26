package defpackage;

/* renamed from: amkv */
final class amkv implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ amkw b;

    amkv(amkw amkw, boolean z) {
        this.b = amkw;
        this.a = z;
    }

    public final void run() {
        this.b.b(this.a);
    }
}
