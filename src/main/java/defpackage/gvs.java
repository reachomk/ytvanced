package defpackage;

/* renamed from: gvs */
final class gvs implements gvx {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ gvt c;

    gvs(gvt gvt, String str, String str2) {
        this.c = gvt;
        this.a = str;
        this.b = str2;
    }

    public final void a(asco asco) {
        this.c.g.ao.setText(asco.e);
        this.c.d.a(this.a);
        arle arle = this.c.c;
        if (arle != null) {
            arle.a(this.b);
        }
        apol apol = this.c.e;
        apoa apoa = asco.f;
        if (apoa == null) {
            apoa = apoa.c;
        }
        apol.copyOnWrite();
        apoi apoi = (apoi) apol.instance;
        if (apoa != null) {
            apoi.e = apoa;
            apoi.a |= 8;
            this.c.f.dismiss();
            return;
        }
        throw new NullPointerException();
    }

    public final void a(int i, String str) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            this.c.a.c((CharSequence) str);
        } else if (i2 != 2) {
            this.c.g.ah.a(str);
        } else {
            this.c.b.c((CharSequence) str);
        }
    }
}
