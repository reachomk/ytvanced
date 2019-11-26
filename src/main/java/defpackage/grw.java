package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: grw */
public abstract class grw implements akmw {
    public static final Uri k = akmx.a(4, "subscribe_button", "channelId");

    public abstract Uri a();

    public abstract String b();

    public abstract long c();

    public abstract long d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract Boolean g();

    public abstract axxd h();

    public abstract axxl i();

    public abstract aphv j();

    public abstract grz k();

    public final akmw a(akmw akmw) {
        if (!(akmw instanceof grw)) {
            return this;
        }
        long c;
        grw grw;
        grw grw2;
        grw grw3 = (grw) akmw;
        long c2;
        if (c() > 0 || grw3.c() > 0) {
            c = c();
            c2 = grw3.c();
        } else {
            c = d();
            c2 = grw3.d();
        }
        if (c != 0 && (c2 == 0 || c2 > c)) {
            grw = this;
            grw2 = grw3;
        } else {
            grw2 = this;
            grw = grw3;
        }
        grz b = grw2.k().a(grw2.g() != null ? grw2.g() : grw.g()).a(Math.max(c(), grw3.c())).b(Math.max(d(), grw3.d()));
        if (grw2.h() == null && grw2.i() == null && grw2.j() == null) {
            b.a(grw.h()).a(grw.i()).a(grw.j());
        }
        return b.c();
    }

    public static Uri a(String str) {
        return !TextUtils.isEmpty(str) ? k.buildUpon().appendPath(str).build() : null;
    }

    public static grw a(akmx akmx, String str) {
        amqw.a((Object) akmx);
        if (!TextUtils.isEmpty(str)) {
            akmw a = akmx.a(grw.a(str));
            if (a instanceof grw) {
                return (grw) a;
            }
        }
        return null;
    }

    public static grz b(String str) {
        amqw.a(TextUtils.isEmpty(str) ^ 1);
        grx grx = new grx();
        if (str != null) {
            grx.b = str;
            grx.c = new xvf();
            Uri a = grw.a(str);
            if (a != null) {
                grx.a = a;
                grx.b(false);
                grx.a(false);
                grx.b(0);
                grx.a(0);
                return grx;
            }
            throw new NullPointerException("Null uri");
        }
        throw new NullPointerException("Null channelId");
    }

    public static grz a(axwa axwa) {
        axxl axxl;
        axxd axxd;
        amqw.a((Object) axwa);
        grz a = grw.b(axwa.e).a(Boolean.valueOf(axwa.o));
        axvw axvw = axwa.s;
        if (axvw == null) {
            axvw = axvw.c;
        }
        aphv aphv = null;
        if (axvw.a != 119226798) {
            axxl = null;
        } else {
            axvw = axwa.s;
            if (axvw == null) {
                axvw = axvw.c;
            }
            if (axvw.a == 119226798) {
                axxl = (axxl) axvw.b;
            } else {
                axxl = axxl.k;
            }
        }
        a = a.a(axxl);
        axvw = axwa.s;
        if (axvw == null) {
            axvw = axvw.c;
        }
        if (axvw.a != 136076983) {
            axxd = null;
        } else {
            axvw = axwa.s;
            if (axvw == null) {
                axvw = axvw.c;
            }
            if (axvw.a == 136076983) {
                axxd = (axxd) axvw.b;
            } else {
                axxd = axxd.h;
            }
        }
        a = a.a(axxd);
        aphj aphj = axwa.r;
        if (aphj == null) {
            aphj = aphj.d;
        }
        if ((aphj.a & 2) != 0) {
            aphj = axwa.r;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphv = aphj.c;
            if (aphv == null) {
                aphv = aphv.s;
            }
        }
        return a.a(aphv).b(axwa.J).a(axwa.K);
    }
}
