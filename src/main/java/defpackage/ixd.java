package defpackage;

import android.content.SharedPreferences;

/* renamed from: ixd */
public final class ixd extends abnu {
    private final SharedPreferences g;
    private final zzl h;
    private final zyw i;
    private final abnt j = new ixc();
    private final abnb k = new ixf();

    public ixd(SharedPreferences sharedPreferences, zzl zzl, zyw zyw) {
        this.g = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.h = zzl;
        this.i = zyw;
    }

    public final boolean f() {
        return true;
    }

    public final String a() {
        if (b()) {
            return "youtube-android-so";
        }
        aume aume;
        arvt b = this.h.b();
        if (b != null) {
            aume = b.e;
            if (aume == null) {
                aume = aume.af;
            }
            if (aume.Q) {
                return "youtube-android-pb";
            }
        }
        b = this.h.b();
        if (b != null) {
            aume = b.e;
            if (aume == null) {
                aume = aume.af;
            }
            if (aume.P) {
                if ("androidyt".equals(this.a)) {
                    return "youtube-android";
                }
            }
        }
        return this.a;
    }

    public final boolean b() {
        boolean z = false;
        if (this.b) {
            return false;
        }
        if (this.g.getBoolean("dogfood_suggest_send_visitor_id_signed_out", false)) {
            return true;
        }
        apxn a = this.i.a();
        if (a != null) {
            aulu aulu = a.e;
            if (aulu == null) {
                aulu = aulu.bw;
            }
            if (aulu.aj) {
                z = true;
            }
        }
        return z;
    }

    public final String c() {
        arvt b = this.h.b();
        if (b == null) {
            return null;
        }
        axdg axdg = b.o;
        if (axdg == null) {
            axdg = axdg.f;
        }
        return axdg.b;
    }

    public final boolean d() {
        if (b()) {
            return true;
        }
        return this.d;
    }

    public final abnb e() {
        if (b()) {
            return this.k;
        }
        return null;
    }

    public final boolean g() {
        arvt b = this.h.b();
        if (b == null) {
            return false;
        }
        aume aume = b.e;
        if (aume == null) {
            aume = aume.af;
        }
        if (aume.j) {
            return true;
        }
        return false;
    }

    public final abnt h() {
        return this.j;
    }

    public final boolean i() {
        arvt b = this.h.b();
        if (b == null) {
            return false;
        }
        aume aume = b.e;
        if (aume == null) {
            aume = aume.af;
        }
        if (aume.i) {
            return true;
        }
        return false;
    }

    public final int j() {
        arvt b = this.h.b();
        if (b == null || (b.a & 64) == 0) {
            return -1;
        }
        aume aume = b.e;
        if (aume == null) {
            aume = aume.af;
        }
        return aume.k;
    }

    public final boolean k() {
        arvt b = this.h.b();
        if (b == null) {
            return false;
        }
        aume aume = b.e;
        if (aume == null) {
            aume = aume.af;
        }
        return aume.l;
    }

    public final boolean l() {
        arvt b = this.h.b();
        if (b == null) {
            return false;
        }
        aume aume = b.e;
        if (aume == null) {
            aume = aume.af;
        }
        return aume.m;
    }

    public final int m() {
        arvt b = this.h.b();
        if (b == null) {
            return 0;
        }
        aume aume = b.e;
        if (aume == null) {
            aume = aume.af;
        }
        return aume.w;
    }
}
