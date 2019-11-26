package defpackage;

/* renamed from: jcq */
public final class jcq {
    public final jcm a;
    public final boolean b;
    public String c;
    public boolean d;

    public jcq(jcm jcm, boolean z) {
        this.b = z;
        this.a = jcm;
    }

    public final void a() {
        this.d = true;
        jcm jcm = this.a;
        jcm.a.a(jcm, this);
    }

    public final void a(String str) {
        if (!this.d) {
            this.c = str;
        }
    }
}
