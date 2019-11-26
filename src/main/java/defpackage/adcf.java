package defpackage;

import java.util.Set;

/* renamed from: adcf */
public final class adcf extends acxv {
    private String f;
    private String g;
    private String h;
    private String i;

    protected adcf(int i, boolean z) {
        super("mdx_command", i, z);
    }

    public final dik a() {
        a("method_start", this.f);
        a("start_channel_type", this.g);
        a("method_received", this.h);
        a("end_channel_type", this.i);
        return super.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(xbb xbb, Set set, Set set2) {
        if (xbb instanceof adcj) {
            adcj adcj = (adcj) xbb;
            this.f = adcj.a;
            this.g = adcj.b;
        }
        super.a(xbb, set, set2);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(xbb xbb) {
        boolean a = super.a(xbb);
        if ((xbb instanceof adck) && this.h == null) {
            adck adck = (adck) xbb;
            this.h = adck.a;
            this.i = adck.b;
        }
        return a;
    }
}
