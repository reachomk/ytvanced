package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: agdo */
public final class agdo {
    private static final int e = acwc.MANGO_WATCH_PAGE_LANDSCAPE_DOWNLOAD_BUTTON.dU;
    private static final int f = acwc.MANGO_WATCH_PAGE_PORTRAIT_DOWNLOAD_BUTTON.dU;
    private static final int g = acwc.MANGO_VIDEO_FORMAT_SELECTION_DIALOG_DOWNLOAD_AND_PLAY_BUTTON.dU;
    public final Context a;
    public final xua b;
    public final String c;
    public final xah d;
    private final xsc h;
    private final ahcz i;
    private final bcaa j;
    private final agem k;
    private final SharedPreferences l;
    private final zzl m;

    public agdo(Context context, xsc xsc, xua xua, String str, ahcz ahcz, xah xah, bcaa bcaa, agem agem, SharedPreferences sharedPreferences, zzl zzl) {
        this.a = context;
        this.h = xsc;
        this.b = xua;
        this.c = str;
        this.i = ahcz;
        this.d = xah;
        this.j = bcaa;
        this.k = agem;
        this.l = sharedPreferences;
        this.m = zzl;
    }

    /* Access modifiers changed, original: final */
    public final void a(String str) {
        f(e(str));
        f(c(str));
    }

    /* Access modifiers changed, original: final */
    public final void a(String str, boolean z) {
        xvd.a(str);
        xak.b();
        agpw agpw = new agpw();
        agxj.a(agpw, str);
        agxj.a(agpw, 2);
        agxj.c(agpw, z);
        agxj.d(agpw, this.b.a());
        a(d(str), 100, agpw);
    }

    /* Access modifiers changed, original: final */
    public final void a(String str, avsi avsi, byte[] bArr, boolean z) {
        xak.b();
        agpw agpw = new agpw();
        agxj.b(agpw, ahdl.a(avsi, 360));
        agxj.a(agpw, bArr);
        agxj.a(agpw, str);
        agxj.a(agpw, 3);
        agxj.c(agpw, z);
        agxj.d(agpw, this.b.a());
        ((agxq) this.d.b(this.a)).a(this.c, g(str), 100, agpw);
    }

    /* Access modifiers changed, original: final */
    public final void b(String str) {
        ((agxq) this.d.b(this.a)).a(g(str), 512);
    }

    /* Access modifiers changed, original: final */
    public final String c(String str) {
        return String.format(Locale.US, "%s:%s:master", new Object[]{this.c, str});
    }

    /* Access modifiers changed, original: final */
    public final String d(String str) {
        return String.format(Locale.US, "%s:%s:thumb", new Object[]{this.c, str});
    }

    /* Access modifiers changed, original: final */
    public final String e(String str) {
        return String.format(Locale.US, "%s:%s", new Object[]{this.c, str});
    }

    private final String g(String str) {
        return String.format(Locale.US, "%s:%s:ad", new Object[]{this.c, str});
    }

    private final void a(String str, int i, agpw agpw) {
        xak.b();
        ((agxq) this.d.b(this.a)).a(this.c, str, i, agpw);
    }

    public final void f(String str) {
        ((agxq) this.d.b(this.a)).a(str, 512);
    }

    /* Access modifiers changed, original: final */
    public final void a(String str, String str2, String str3, avsi avsi, int i, boolean z, int i2, agqq agqq, boolean z2, int i3, boolean z3) {
        xak.b();
        agfi agfi = (agfi) this.j.get();
        agpw agpw = new agpw();
        agxj.b(agpw, ahdl.a(avsi, 360));
        agxj.h(agpw, i);
        byte[] h = agfi.h(str2);
        if (h == null) {
            h = zzp.b;
        }
        agxj.a(agpw, h);
        agxj.a(agpw, str2);
        boolean z4 = true;
        agxj.a(agpw, i2 == 0);
        if (agqq != agqq.DEFER_FOR_DISCOUNTED_DATA) {
            z4 = false;
        }
        agxj.b(agpw, z4);
        agxj.c(agpw, agfi.g(str2));
        agxj.d(agpw, i3);
        agxj.c(agpw, z2);
        agxj.d(agpw, z3);
        agxj.d(agpw, this.b.a());
        if (str != null) {
            agxj.b(agpw, str);
        }
        if (!TextUtils.isEmpty(str3)) {
            agxj.c(agpw, str3);
        }
        if (z) {
            ahcz ahcz = this.i;
            xan.a(ahcz.a.a(new ahdd(ahcz, str2)), aniv.a, ahdg.a);
        }
        agxj.c(agpw, this.h.a());
        agxj.e(agpw, this.k.c());
        agxj.f(agpw, this.k.d());
        agxj.a(agpw, this.k.e());
        agxj.b(agpw, this.k.f());
        arvt b = this.m.b();
        avoa avoa = b.h;
        if (avoa == null) {
            avoa = avoa.w;
        }
        if (avoa.n) {
            avoa avoa2 = b.h;
            if (avoa2 == null) {
                avoa2 = avoa.w;
            }
            agxj.g(agpw, avoa2.o);
        }
        agxj.a(agpw, !agmn.a(this.m.b(), this.l) ? 4 : 7);
        str = c(str2);
        int i4 = 210;
        if (i2 == 0) {
            int g = ((agfi) this.j.get()).g(str2);
            if (!(g == e || g == f || g == g)) {
                i4 = 200;
            }
        } else {
            i4 = 150;
        }
        a(str, i4, agpw);
    }
}
