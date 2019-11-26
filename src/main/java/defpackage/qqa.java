package defpackage;

/* renamed from: qqa */
public class qqa {
    public final String c;
    public final qcd d;
    public boolean e = false;

    qqa(String str) {
        this.c = str;
        this.d = new qcd();
    }

    /* Access modifiers changed, original: protected */
    public void a(qcb qcb) {
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void c(qcb qcb) {
        if (this.e) {
            qcb.a();
            return;
        }
        this.e = true;
        try {
            a(qcb);
        } catch (Exception unused) {
        }
    }
}
