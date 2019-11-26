package defpackage;

/* renamed from: acgk */
final /* synthetic */ class acgk implements Runnable {
    private final acgj a;
    private final aspf b;

    acgk(acgj acgj, aspf aspf) {
        this.a = acgj;
        this.b = aspf;
    }

    public final void run() {
        auzi auzi;
        acgj acgj = this.a;
        aspf aspf = this.b;
        acfi acfi = acgj.a;
        aspb aspb = aspf.c;
        if (aspb == null) {
            aspb = aspb.c;
        }
        if (aspb.a == 146983145) {
            auzi = (auzi) aspb.b;
        } else {
            auzi = auzi.f;
        }
        acfi.a(auzi);
    }
}
