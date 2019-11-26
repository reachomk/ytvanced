package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: afdy */
public final class afdy extends afbp {
    public aetv A;
    public final aefc a;
    public final xhv b;
    public final afjc c;
    public final Handler d;
    public aeuy e = aeuy.e;
    public aeuy f;
    public aajs g;
    public String h;
    public aajj i;
    public afkh j;
    public float k;
    public float l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v = 0;
    public boolean w;
    public boolean x;
    public afif y;
    public afif z;

    public afdy(affx affx, aefc aefc, xhv xhv, afjc afjc) {
        Object handler = new Handler(Looper.getMainLooper());
        super(affx);
        this.a = (aefc) amqw.a((Object) aefc);
        this.b = (xhv) amqw.a((Object) xhv);
        this.c = (afjc) amqw.a((Object) afjc);
        this.d = (Handler) amqw.a(handler);
    }

    public final afne a(aajs aajs, affa affa, String str, aajj aajj, afkh afkh, aeuy aeuy, float f, float f2, boolean z, int i) {
        aeuy aeuy2 = aeuy;
        y();
        aajs aajs2 = aajs;
        this.g = aajs2;
        String str2 = str;
        this.h = str2;
        afkh afkh2 = afkh;
        this.j = afkh2;
        aajj aajj2 = aajj;
        this.i = aajj2;
        float f3 = f;
        this.k = f3;
        float f4 = f2;
        this.l = f4;
        this.e = aeuy2;
        int i2 = i;
        this.v = i2;
        this.f = new afen(this, aeuy2);
        return h().a(aajs2, affa, str2, aajj2, afkh2, this.f, f3, f4, z, i2);
    }

    public final void a(boolean z) {
        y();
        super.a(z);
    }

    public final void p() {
        y();
        super.p();
    }

    public final void a(afkh afkh) {
        this.j = afkh;
        super.a(afkh);
    }

    public final void r() {
        this.j = null;
        super.r();
    }

    public final void a(float f) {
        this.k = f;
        super.a(f);
    }

    public final void b(float f) {
        this.l = f;
        super.b(f);
    }

    public final void a(Runnable runnable, aeuy aeuy, afif afif) {
        this.d.post(new afeb(this, aeuy, afif, runnable));
    }

    public final boolean x() {
        return this.w ^ 1;
    }

    public static afif a(afif afif, String str) {
        if ("qoe.livewindow".equals(afif.a())) {
            return new afif("qoe.restart.livewindow", afif.b);
        }
        String a = afif.a();
        String a2 = afht.a(afif.c);
        int length = String.valueOf(a).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 11) + String.valueOf(str).length()) + String.valueOf(a2).length());
        stringBuilder.append("e.");
        stringBuilder.append(a);
        stringBuilder.append(";action.");
        stringBuilder.append(str);
        stringBuilder.append(";");
        stringBuilder.append(a2);
        Object stringBuilder2 = stringBuilder.toString();
        return new afif("qoe.restart", afif.b, stringBuilder2);
    }

    public final void y() {
        this.g = null;
        this.i = null;
        this.h = null;
        this.m = 0;
        this.n = 0;
        this.p = false;
        this.o = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = 0;
        this.w = false;
        this.x = false;
        this.y = null;
        this.A = null;
        this.z = null;
    }

    public final void a(aajj aajj, afif afif, String str) {
        this.w = true;
        this.e.a(afdy.a(afif, str));
        if (aajj.ay()) {
            h().a(false);
            return;
        }
        this.x = false;
        h().p();
    }

    public static boolean a(aajj aajj, afif afif) {
        if (!(afif instanceof afjl)) {
            if (aajj.d == null) {
                Set unmodifiableSet;
                awdg awdg = aajj.c;
                if ((awdg.b & 8192) != 0) {
                    axbf axbf = awdg.D;
                    if (axbf == null) {
                        axbf = axbf.n;
                    }
                    if (axbf.b.size() != 0) {
                        axbf axbf2 = aajj.c.D;
                        if (axbf2 == null) {
                            axbf2 = axbf.n;
                        }
                        unmodifiableSet = Collections.unmodifiableSet(new HashSet(axbf2.b));
                        aajj.d = unmodifiableSet;
                    }
                }
                unmodifiableSet = Collections.emptySet();
                aajj.d = unmodifiableSet;
            }
            if (aajj.d.contains(afif.a())) {
                return true;
            }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ String l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ float s() {
        return super.s();
    }

    public final /* bridge */ /* synthetic */ void q() {
        super.q();
    }

    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    public final /* bridge */ /* synthetic */ aerm k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ int j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ int i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ int w() {
        return super.w();
    }

    public final /* bridge */ /* synthetic */ long v() {
        return super.v();
    }

    public final /* bridge */ /* synthetic */ long u() {
        return super.u();
    }

    public final /* bridge */ /* synthetic */ long t() {
        return super.t();
    }

    public final /* bridge */ /* synthetic */ long o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ boolean g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ boolean f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ aahr e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ aahr d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ afgv a(aajs aajs, aajj aajj, boolean z, afgt afgt, int i) {
        return super.a(aajs, aajj, z, afgt, i);
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ void bx_() {
        super.bx_();
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }
}
