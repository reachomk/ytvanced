package defpackage;

/* renamed from: aesr */
final class aesr implements Runnable {
    private final /* synthetic */ aesu a;
    private final /* synthetic */ Exception b;

    aesr(aesu aesu, Exception exception) {
        this.a = aesu;
        this.b = exception;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
