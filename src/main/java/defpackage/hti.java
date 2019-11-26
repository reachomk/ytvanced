package defpackage;

/* renamed from: hti */
public final class hti implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ htf b;

    public hti(htf htf, String str) {
        this.b = htf;
        this.a = str;
    }

    public final void run() {
        htf htf = this.b;
        htf.a(this.a, htf.a());
    }
}
