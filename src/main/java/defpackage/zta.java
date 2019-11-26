package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: zta */
public final class zta {
    public static final zth a = new zth();
    public final Activity b;
    public final Context c;
    public final Executor d;
    public final sfg e;
    private final afpu f;
    private final acum g;

    zta(Activity activity, afpu afpu, acum acum, Executor executor, tbg tbg, tlj tlj, tet tet, tln tln, tlm tlm, tdu tdu, tmp tmp, tmq tmq, tmv tmv, tms tms, bciz bciz) {
        sfg.a(new sit(new sjh(activity.getApplicationContext(), tbg, tlj, tet, tln, tlm, tdu, tmp, tmq, tmv, tms), activity.getPackageName(), bciz));
        sfg a = sfg.a();
        sir sir = sga.b;
        sjl sjl = sga.a().c;
        sir.a().a(sjl.a(sir.b()), sga.a.intValue(), "OAUTH_INTEGRATIONS");
        this.b = activity;
        this.f = afpu;
        this.g = acum;
        this.d = executor;
        this.e = a;
        this.c = activity.getApplicationContext();
    }

    public static void a(int i) {
        if (i == 300) {
            a.a();
        }
    }

    public static boolean a(Intent intent) {
        return intent.hasExtra("GDI");
    }

    public static boolean a() {
        return a.c != null;
    }

    public static boolean b() {
        return a.d;
    }

    public final void b(Intent intent) {
        String str = a.c;
        sfq a = sfg.a(intent);
        if (a == null) {
            a.a(1, this.b);
        } else if (a.a()) {
            if (a.c instanceof sfd) {
                a.a(5, this.b);
                a(2, str, 5);
                return;
            }
            a.a(6, this.b);
            c(2, str);
        } else if (a.b()) {
            a.a(1, this.b);
            c(2, str);
        } else {
            a.a(4, this.b);
            b(2, str);
        }
    }

    public final void c() {
        c(2, a.c);
        a.a(6, this.b);
    }

    public static void a(Runnable runnable) {
        a.a = runnable;
    }

    public final sff a(String str) {
        String d = d();
        if (!TextUtils.isEmpty(d)) {
            List a = sfg.a(this.c, d, amul.a((Object) str), zta.e());
            if (!a.isEmpty()) {
                return (sff) a.get(0);
            }
        }
        return null;
    }

    public final String d() {
        return (this.f.a() && (this.f.c() instanceof ust)) ? ((ust) this.f.c()).b() : null;
    }

    public static sfi e() {
        return new sfk().a();
    }

    public final void a(int i, String str) {
        a(i, str, 2);
    }

    public final void b(int i, String str) {
        a(i, str, 3);
    }

    public final void c(int i, String str) {
        a(i, str, 4);
    }

    private final void a(int i, String str, int i2) {
        aroz aroz = (aroz) arow.e.createBuilder();
        aroz.copyOnWrite();
        arow arow = (arow) aroz.instance;
        arow.a |= 2;
        arow.c = i - 1;
        aroz.copyOnWrite();
        arow arow2 = (arow) aroz.instance;
        arow2.a |= 4;
        arow2.d = i2 - 1;
        if (!TextUtils.isEmpty(str)) {
            aroz.copyOnWrite();
            arow2 = (arow) aroz.instance;
            if (str != null) {
                arow2.a |= 1;
                arow2.b = str;
            } else {
                throw new NullPointerException();
            }
        }
        asmz asmz = (asmz) asmw.f.createBuilder();
        asmz.copyOnWrite();
        asmw asmw = (asmw) asmz.instance;
        asmw.c = (anxl) aroz.build();
        asmw.b = 164;
        this.g.a((asmw) ((anxl) asmz.build()));
    }
}
