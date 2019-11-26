package defpackage;

import android.net.Uri;

/* renamed from: fzl */
public final class fzl extends wv {
    public final bcaa c;
    private final fzm d;
    private final fzo e;

    public fzl(bcaa bcaa, fzm fzm, fzo fzo) {
        this.c = bcaa;
        this.d = fzm;
        this.e = fzo;
    }

    public final void a(String str, fzv fzv) {
        if (fzv.d) {
            String fzv2 = fzv.toString();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(fzv2).length());
            stringBuilder.append(str);
            stringBuilder.append(" : ");
            stringBuilder.append(fzv2);
            xtl.c(stringBuilder.toString());
            wq wqVar = (wq) this.c.get();
            xu xuVar = new xu();
            amqw.b(fzv.d);
            int i = fzv.e;
            amqw.b(fzv.d);
            String str2 = fzv.f;
            xuVar.c = i;
            xuVar.d = str2;
            xuVar.a(7, 0);
            wqVar.a(xuVar.a());
        }
    }

    public final void b() {
        a("onPrepare()", this.d.e());
    }

    public final void f() {
        fzv fzv;
        fzm fzm = this.d;
        if (fzm.d()) {
            fzm.b().f();
            fzv = fzv.a;
        } else {
            fzv = fzv.c;
        }
        a("onPlay()", fzv);
    }

    public final void e() {
        a("onPrepareFromUri()", fzv.b);
    }

    public final void a(Uri uri) {
        fzm fzm = this.d;
        bdfi h = bdfi.h();
        fzm.d.a(uri.getPath().equals("/playlist") ? uri.buildUpon().path("watch").build() : uri, null, new fzp(fzm, h, uri));
        h.b().a(new fzk(this), bcvn.a());
    }

    public final void i() {
        a("onPause()", this.d.e());
    }

    public final void n() {
        fzm fzm = this.d;
        fzm.a().E();
        fzm.a().w();
        a("onStop()", fzv.a);
    }

    public final void a(long j) {
        this.d.b().a(j);
        a("onSeekTo()", fzv.a);
    }

    public final void k() {
        fzv fzv;
        fzm fzm = this.d;
        if (fzm.d()) {
            fzm.b().k();
            fzv = fzv.a;
        } else {
            fzv = fzv.c;
        }
        a("onSkipToPrevious()", fzv);
    }

    public final void j() {
        fzv fzv;
        fzm fzm = this.d;
        if (fzm.d()) {
            fzm.b().j();
            fzv = fzv.a;
        } else {
            fzv = fzv.c;
        }
        a("onSkipToNext()", fzv);
    }

    public final void m() {
        this.d.b().m();
        a("onRewind()", fzv.a);
    }

    public final void l() {
        this.d.b().l();
        a("onFastForward()", fzv.a);
    }

    public final void a(vo voVar) {
        auac auac;
        fzv fzv;
        float f = voVar.b;
        if (f < 0.0f) {
            auac = auac.INDIFFERENT;
        } else if (voVar.a == 2 && f == 1.0f) {
            auac = auac.LIKE;
        } else {
            auac = auac.DISLIKE;
        }
        fzo fzo = this.e;
        String k = this.d.a().k();
        if (k == null) {
            fzv = fzv.a;
        } else if (fzo.a.a()) {
            fzo.b.a();
            fzr fzr = new fzr(fzo);
            Runnable runnable = ankh.a;
            int ordinal = auac.ordinal();
            if (ordinal == 0) {
                aazv a = fzo.c.a();
                a.g();
                a.c(k);
                xan.a(fzo.c.a(a), fzo.e, fzr, new fzq(fzo, k, auac), runnable);
            } else if (ordinal != 1) {
                aazu c = fzo.c.c();
                c.g();
                c.c(k);
                xan.a(fzo.c.a(c), fzo.e, fzr, new fzs(fzo, k, auac), runnable);
            } else {
                aazs b = fzo.c.b();
                b.g();
                b.c(k);
                xan.a(fzo.c.a(b), fzo.e, fzr, new fzt(fzo, k, auac), runnable);
            }
            fzv = fzv.a;
        } else {
            fzv = fzv.c;
        }
        a("onSetRating()", fzv);
    }

    public final void c() {
        a("onPrepareFromMediaId()", fzv.b);
    }

    public final void g() {
        a("onPlayFromMediaId()", fzv.b);
    }

    public final void d() {
        a("onPrepareFromSearch()", fzv.b);
    }

    public final void h() {
        a("onPlayFromSearch()", fzv.b);
    }
}
