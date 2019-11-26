package defpackage;

import android.view.Surface;

/* renamed from: aexq */
abstract class aexq {
    public afkh a;
    public boolean b;
    public final /* synthetic */ aexj c;

    aexq(aexj aexj) {
        this.c = aexj;
    }

    public abstract void a();

    /* Access modifiers changed, original: 0000 */
    public boolean a(float f) {
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(long j) {
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(affw affw) {
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(String str, aajj aajj, aeuy aeuy, aajs aajs) {
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(boolean z) {
        return false;
    }

    public abstract afaj b();

    /* Access modifiers changed, original: 0000 */
    public boolean b(float f) {
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean c() {
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public void d() {
    }

    /* Access modifiers changed, original: final */
    public final boolean a(afkh afkh) {
        this.a = afkh;
        return afkh != this.c.f.i;
    }

    /* Access modifiers changed, original: protected */
    public void e() {
        this.c.a(0);
    }

    /* Access modifiers changed, original: final */
    public final void f() {
        synchronized (this.c) {
            aewh aewh = this.c.t;
            if (aewh != null) {
                aewh.b();
                this.c.t = null;
            }
            aewh = this.c.s;
            if (aewh != null) {
                aewh.b();
                this.c.s = null;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void g() {
        afkn afkn;
        int a;
        afkh afkh = this.a;
        Surface surface = null;
        if (afkh == null || !afkh.n()) {
            afkn = afkn.NONE;
            a = a(null) | a(null);
        } else {
            afkn = this.a.o();
            if (!this.b) {
                surface = this.a.k();
            }
            a = surface != this.c.u ? a(surface) : 0;
            ofb h = this.a.h();
            if (h != null) {
                a |= a(h);
            }
            if (a != 0) {
                this.c.g.a(this.a);
            }
        }
        if (a != 0) {
            afaj b = b();
            if (b != null) {
                b.c.a(afkn.ordinal());
            }
        }
    }

    private final boolean a(Surface surface) {
        aexj aexj = this.c;
        if (aexj.u != surface) {
            try {
                aexj.y.a(surface, afne.ANDROID_EXOPLAYER_V2);
                aexj = this.c;
                oak a = aexj.e.a(aexj.k);
                a.a(1);
                a.a((Object) surface);
                a.a();
                a.c();
                this.c.u = surface;
                return true;
            } catch (InterruptedException e) {
                a("player.fatalexception", e);
            }
        }
        return false;
    }

    private final boolean a(ofb ofb) {
        aexj aexj = this.c;
        if (aexj.v != ofb) {
            try {
                oak a = aexj.e.a(aexj.l);
                a.a(10000);
                a.a((Object) ofb);
                a.a();
                a.c();
                this.c.v = ofb;
                return true;
            } catch (InterruptedException e) {
                a("player.fatalexception", e);
            }
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final void a(String str, Object obj) {
        a(new afif(8, str, this.c.o(), obj));
    }

    /* Access modifiers changed, original: final */
    public final void a(afif afif) {
        afaj b = b();
        if (b != null) {
            b.c.a(afif);
        }
        if (afif.d()) {
            this.c.x();
        }
    }
}
