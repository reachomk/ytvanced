package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: absd */
public final class absd implements cgu {
    private final ka a;
    private final int b;
    private final int c;
    private final wxg d;
    private cfz e;

    public absd(ka kaVar, int i, int i2, wxg wxg) {
        this.a = kaVar;
        this.b = i;
        this.c = i2;
        this.d = wxg;
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void b(Drawable drawable) {
    }

    public final void b(cgr cgr) {
    }

    public final void c() {
    }

    public final void a(cfz cfz) {
        this.e = cfz;
    }

    public final cfz d() {
        return this.e;
    }

    public final void c(Drawable drawable) {
        wxg wxg = this.d;
        if (wxg != null) {
            wxg.a(this.a, null);
        }
    }

    public final void a(Drawable drawable) {
        this.a.a(null);
    }

    public final void a(cgr cgr) {
        if (chv.a(this.b, this.c)) {
            cgr.a(this.b, this.c);
            return;
        }
        int i = this.b;
        int i2 = this.c;
        StringBuilder stringBuilder = new StringBuilder(163);
        stringBuilder.append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        stringBuilder.append(i);
        stringBuilder.append(" and height: ");
        stringBuilder.append(i2);
        stringBuilder.append(", provide the correct dimensions in the constructor.");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, chb chb) {
        obj = (Drawable) obj;
        this.a.a((Drawable) obj);
        wxg wxg = this.d;
        if (wxg != null) {
            wxg.a(this.a, obj);
        }
    }
}
