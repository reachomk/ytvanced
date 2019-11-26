package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;

/* renamed from: fkj */
public final class fkj implements t {
    public final aizy a;
    public boolean b = false;
    private final Activity c;
    private final xci d;
    private final bapu e;
    private final fkg f;
    private final fku g;
    private final fkq h;
    private final zyw i;
    private final ajam j;
    private final ajjz k;
    private final bdfu l = new bdfu();
    private final ajkk m = new fki(this);

    public fkj(Activity activity, xci xci, bapu bapu, fkg fkg, fku fku, fkq fkq, aizy aizy, ajam ajam, ajjz ajjz, zyw zyw) {
        this.c = activity;
        this.d = xci;
        this.e = bapu;
        this.f = fkg;
        this.g = fku;
        this.h = fkq;
        this.a = aizy;
        this.j = ajam;
        this.k = ajjz;
        this.i = zyw;
    }

    public final void a(af afVar) {
    }

    public final void aw_() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final boolean a(View view) {
        boolean z = false;
        if (this.f.a() != 1) {
            ajmq q = this.a.q();
            fku fku = this.g;
            if (fku.d.b() == 3 && fku.a(q) && fku.c(q) && !fku.a.isInPictureInPictureMode() && !fku.a.isChangingConfigurations()) {
                ejd c = fku.c.c();
                if (c != null && !c.k() && c.b() && fku.b.c()) {
                    this.h.a();
                    fkp f = f();
                    Rect rect = new Rect();
                    view.getGlobalVisibleRect(rect);
                    try {
                        z = f.a.enterPictureInPictureMode(f.b().setSourceRectHint(rect).build());
                    } catch (IllegalStateException e) {
                        afpc.a(2, afpf.main, "Error entering picture and picture", e);
                    }
                    return z;
                }
            }
            if (this.g.d.b() == 3 && fku.a(q) && !fku.c(q) && !fku.b(q)) {
                this.h.a(q);
            }
        }
        return false;
    }

    public final void B_() {
        if (this.f.a() != 1) {
            this.b = false;
            this.k.a(this.m);
            this.d.a((Object) this, voy.class, new fkl(this));
            if (foh.w(this.i)) {
                this.l.a();
                this.l.a(this.j.Q().d.f().a(emg.a(this.i, 4, 1)).a(new fkk(this), fkn.a));
                return;
            }
            this.d.a((Object) this, ahkr.class, new fkm(this));
        }
    }

    public final void C_() {
        if (this.f.a() != 1) {
            this.b = true;
            this.l.a();
            this.d.b(this);
            this.k.b(this.m);
        }
    }

    public final fkp f() {
        return (fkp) this.e.get();
    }

    public final void a(ahkr ahkr) {
        if (this.c.isInPictureInPictureMode()) {
            ajmq q = this.a.q();
            if (fku.a(q) && !fku.c(q)) {
                this.a.w();
                this.h.a(q);
            }
        }
        fkp f = f();
        if (!amqq.a(f.f, ahkr)) {
            f.j = true;
            f.f = ahkr;
        }
        if (!this.a.s()) {
            f().a(null);
        }
        f().a();
    }
}
