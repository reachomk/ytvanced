package defpackage;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: uyh */
public final class uyh implements uys {
    public final boolean a;
    public final bapu b;
    public final bapu c;
    public final Executor d;
    public final acum e;
    public final xci f;
    public final SharedPreferences g;
    public final Set h = new HashSet();
    private final bapu i;
    private final Executor j;
    private final xsc k;

    public uyh(bapu bapu, bapu bapu2, bapu bapu3, Executor executor, Executor executor2, zyw zyw, acum acum, xsc xsc, xci xci, SharedPreferences sharedPreferences) {
        this.b = (bapu) amqw.a((Object) bapu);
        this.c = (bapu) amqw.a((Object) bapu2);
        this.i = (bapu) amqw.a((Object) bapu3);
        this.d = (Executor) amqw.a((Object) executor);
        this.j = (Executor) amqw.a((Object) executor2);
        this.e = (acum) amqw.a((Object) acum);
        this.k = (xsc) amqw.a((Object) xsc);
        this.f = (xci) amqw.a((Object) xci);
        this.a = uyt.a((zyw) amqw.a((Object) zyw));
        this.g = (SharedPreferences) amqw.a((Object) sharedPreferences);
    }

    public final void a(String str) {
        a(str, true, false);
    }

    public final void a(String str, boolean z) {
        a(str, z, false);
    }

    public final void a(String str, boolean z, boolean z2) {
        str = String.valueOf(str);
        String str2 = "Signing out because: ";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str2.concat(str);
        }
        if (this.a && !z2) {
            aoef aoef = (aoef) aoec.e.createBuilder();
            aoef.a(3);
            asmz asmz = (asmz) asmw.f.createBuilder();
            asmz.a((aoec) ((anxl) aoef.build()));
            this.e.a((asmw) ((anxl) asmz.build()), a());
            aoeh aoeh = (aoeh) aoee.d.createBuilder();
            aoeh.a(3);
            asmz asmz2 = (asmz) asmw.f.createBuilder();
            asmz2.a((aoee) ((anxl) aoeh.build()));
            this.e.a((asmw) ((anxl) asmz2.build()), afpt.g);
        }
        a(z);
        this.f.c(new afqh(z2));
        a(uyz.FINISHED, null);
    }

    public final void a(aanv aanv, apxu apxu, afqd afqd) {
        xak.a();
        if (!this.h.isEmpty()) {
            String str = "Only one concurrent post-auth sign-in allowed.";
            a(new IllegalStateException(str));
            xtl.c(str);
        }
        if (afqd != null) {
            this.h.add(afqd);
        }
        a(uyz.STARTED, null);
        a(aanv, apxu);
    }

    public final void a(String str, @Deprecated afqd afqd) {
        Object afqd2;
        if (afqd2 == null) {
            afqd2 = afqd.a;
        }
        this.h.add(afqd2);
        a(uyz.STARTED, null);
        uyv.a((aanz) this.i.get(), str, new uyg(this));
    }

    public final void a(aanv aanv, apxu apxu) {
        ust a;
        if (aanv.j()) {
            a = ust.a(aanv.k(), aanv.i(), aanv.f());
        } else {
            a = ust.a(aanv.e(), aanv.i(), aanv.g(), aanv.h(), aanv.f());
        }
        this.j.execute(new uyj(this, a, aanv, apxu));
    }

    /* Access modifiers changed, original: final */
    public final void a(Exception exception) {
        if (!((utv) this.b.get()).a()) {
            a(false);
        }
        a(uyz.CANCELLED, null);
        this.f.c(new uyx(exception));
        this.d.execute(new uyk(this, exception));
    }

    public final void a(boolean z) {
        ((utv) this.b.get()).a(z);
        ((uud) this.c.get()).e();
    }

    public final void a(uyz uyz, apxu apxu) {
        this.f.d(new uyw(uyz, uyz == uyz.FINISHED, apxu));
    }

    public final long a() {
        return TimeUnit.HOURS.toMillis(TimeUnit.MILLISECONDS.toHours(this.k.a()));
    }
}
