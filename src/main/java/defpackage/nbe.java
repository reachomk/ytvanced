package defpackage;

/* renamed from: nbe */
final /* synthetic */ class nbe implements Runnable {
    private final nbd a;
    private final CharSequence b;

    nbe(nbd nbd, CharSequence charSequence) {
        this.a = nbd;
        this.b = charSequence;
    }

    public final void run() {
        nbd nbd = this.a;
        nbd.a.a(this.b);
    }
}
