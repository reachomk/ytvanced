package defpackage;

/* renamed from: airz */
final /* synthetic */ class airz implements Runnable {
    private final wxg a;
    private final Exception b;

    airz(wxg wxg, Exception exception) {
        this.a = wxg;
        this.b = exception;
    }

    public final void run() {
        this.a.a(null, this.b);
    }
}
