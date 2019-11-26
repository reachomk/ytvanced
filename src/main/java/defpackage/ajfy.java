package defpackage;

import android.os.Parcelable;

/* renamed from: ajfy */
public final class ajfy extends ajps {
    private final ajfs a;
    private ajfm b;
    private String c;

    public ajfy(ajfs ajfs) {
        this.a = (ajfs) amqw.a((Object) ajfs, (Object) "factory cannot be null.");
    }

    public final void a(aetv aetv, String str) {
    }

    public final Parcelable d() {
        ajfm ajfm = this.b;
        return ajfm != null ? ajfm.a() : null;
    }

    public final void a(Parcelable parcelable, ajpr ajpr) {
        this.b = this.a.a((ajfq) parcelable);
    }

    private final ajfm a(aakj aakj, String str) {
        if (!aakj.n().j()) {
            return null;
        }
        if (aakj.b().equals(this.c)) {
            return this.b;
        }
        if (!(aakj.t() == null || aakj.m().a == null)) {
            this.b = this.a.a(aakj.t(), aakj.m().a, str, aakj.h());
            this.c = aakj.b();
        }
        return this.b;
    }

    public final void a(ahkn ahkn) {
        int ordinal = ahkn.a.ordinal();
        if (ordinal == 4) {
            a(ahkn.c, ahkn.f);
        } else if (ordinal == 6) {
            a(ahkn.b, ahkn.e);
        } else if (ordinal == 9) {
            ajfm ajfm = this.b;
            if (ajfm != null) {
                ajfm.b();
            }
        }
    }

    public final void a(ahkm ahkm) {
        ajfm ajfm = this.b;
        if (ajfm != null) {
            ajfm.a(ahkm);
        }
    }

    public final void b(String str) {
        ajfm ajfm = this.b;
        if (ajfm != null) {
            ajfm.b();
        }
    }

    public final void c() {
        ajfm ajfm = this.b;
        if (ajfm != null) {
            ajfm.b();
        }
        this.c = null;
        this.b = null;
    }
}
