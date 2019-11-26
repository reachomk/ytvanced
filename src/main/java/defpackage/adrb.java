package defpackage;

import android.content.Context;
import java.util.Locale;

/* renamed from: adrb */
public final class adrb extends adsu {
    public static final String e = xtl.b("MDX.Cast");
    public final adtm f;
    public final tgk g;
    public final adil h;
    public final String i;
    public final acxt j;
    public int k = 3;
    private final xci l;
    private final tbu p;
    private final boolean q;
    private final adre r;

    adrb(adil adil, adtm adtm, Context context, adtw adtw, xoi xoi, String str, tgk tgk, tbu tbu, boolean z, xci xci, acxt acxt, int i) {
        super(context, adtw, xoi, i);
        this.h = (adil) amqw.a((Object) adil);
        this.f = adtm;
        this.g = (tgk) amqw.a((Object) tgk);
        this.p = (tbu) amqw.a((Object) tbu);
        this.i = xvd.a(str);
        boolean z2 = false;
        if (!z && i == 0) {
            z2 = true;
        }
        this.q = z2;
        this.l = (xci) amqw.a((Object) xci);
        this.j = (acxt) amqw.a((Object) acxt);
        this.r = new adre(this);
    }

    /* Access modifiers changed, original: final */
    public final boolean M() {
        return false;
    }

    public final int P() {
        return 2;
    }

    public final void L() {
        xtl.c(e, "launchApp start");
        this.k = 1;
        this.j.a("cc_c");
        int f = this.g.f();
        boolean z = f == 2;
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(f);
        Boolean valueOf = Boolean.valueOf(z);
        objArr[1] = valueOf;
        String.format(locale, "reconnectionStatus=%d reconnecting=%s", objArr);
        if (this.a == null) {
            this.a = valueOf;
        }
        this.g.a(this.r);
        if (this.g.a()) {
            xtl.c(e, "cast client already connected, invoking launchCastApp() ourselves");
            N();
        }
        xtl.c(e, "launchApp end");
    }

    public final void a(boolean z, boolean z2) {
        this.g.a(z, z2);
        O();
    }

    public final adis h() {
        return this.h;
    }

    public final boolean f() {
        return this.h.bt_();
    }

    public final void j() {
        String.valueOf(adrd.a(this.k)).length();
        try {
            this.g.d();
            this.l.d(new adcd());
        } catch (sbq | sbt | sbv e) {
            xtl.b(e, "Cast play() failed; sending command through cloud", e);
            super.j();
        }
    }

    public final void k() {
        String.valueOf(adrd.a(this.k)).length();
        try {
            this.g.e();
            this.l.d(new adce());
        } catch (sbq | sbt | sbv e) {
            xtl.b(e, "Cast pause() failed; sending command through cloud", e);
            super.k();
        }
    }

    public final void a(int i, int i2) {
        a(i);
    }

    public final void a(int i) {
        String.valueOf(adrd.a(this.k)).length();
        try {
            this.g.a((double) (((float) i) / 100.0f));
        } catch (sbq | sbt | sbv e) {
            xtl.b(e, "Cast setVolume() failed; sending command through cloud", e);
            super.a(i);
        }
    }

    public final void N() {
        try {
            tbs a = this.p.a().a(this.q).a();
            this.j.a("cc_csala");
            this.g.a(this.i, a);
        } catch (sbt | sbv e) {
            String str = e;
            String str2 = this.i;
            String valueOf = String.valueOf(this.h);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 36) + valueOf.length());
            stringBuilder.append("Launching app id ");
            stringBuilder.append(str2);
            stringBuilder.append(" on screen ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" failed.");
            xtl.a(str, stringBuilder.toString(), e);
            O();
            this.j.a("cc_laf");
            a(adpr.UNKNOWN, 5);
        }
    }

    public final void O() {
        this.k = 3;
        this.g.b(this.r);
    }
}
