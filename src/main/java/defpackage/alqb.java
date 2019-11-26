package defpackage;

import android.net.Uri;

/* renamed from: alqb */
public final class alqb {
    public final alsc a;
    public final xhf b;
    public final afsa c;
    public final acum d;
    public final xsc e;
    public final xhf f;

    public alqb(alsc alsc, xhf xhf, xhf xhf2, afsa afsa, acum acum, xsc xsc) {
        this.a = alsc;
        this.b = xhf;
        this.f = xhf2;
        this.c = afsa;
        this.d = acum;
        this.e = xsc;
    }

    public final void a(xhf xhf, Uri uri, afsw afsw, int i) {
        xhf.b(new alqa(this, uri.buildUpon().appendEncodedPath("v1/cache/").appendPath("summary").build(), afsw, i));
    }
}
