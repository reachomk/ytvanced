package defpackage;

import android.net.Uri;

/* renamed from: mmx */
public abstract class mmx {
    public afsu a;
    private wxi b;
    private final /* synthetic */ mmv c;

    /* Access modifiers changed, original: final */
    public final void a() {
        wxi wxi = this.b;
        if (wxi != null) {
            wxi.a();
            this.b = null;
        }
        afsu afsu = this.a;
        if (afsu != null) {
            afsu.a();
            this.a = null;
        }
    }

    public abstract boolean b();

    public abstract boolean c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    /* Access modifiers changed, original: final */
    public final void a(aygk aygk, String str) {
        Uri e = aklb.e(aygk);
        if (e == null) {
            this.c.d();
            return;
        }
        this.b = wxi.a(new mmz(this.c, str));
        mmv mmv = this.c;
        mmv.d.b(e, wxl.a(mmv.a, this.b));
    }

    /* synthetic */ mmx(mmv mmv) {
        this.c = mmv;
    }
}
