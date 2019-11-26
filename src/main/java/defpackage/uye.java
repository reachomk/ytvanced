package defpackage;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: uye */
public final class uye implements uyp {
    private static final long a = TimeUnit.MINUTES.toSeconds(90);
    private final boolean b;
    private final bapu c;
    private final bapu d;
    private final xci e;
    private final Set f = new HashSet();
    private final SharedPreferences g;
    private final xsc h;
    private final acum i;

    public uye(bapu bapu, bapu bapu2, xci xci, SharedPreferences sharedPreferences, xsc xsc, acum acum, zyw zyw) {
        this.c = (bapu) amqw.a((Object) bapu);
        this.d = (bapu) amqw.a((Object) bapu2);
        this.e = (xci) amqw.a((Object) xci);
        this.g = sharedPreferences;
        this.h = xsc;
        this.i = acum;
        this.b = uyt.a((zyw) amqw.a((Object) zyw));
    }

    public final synchronized void a() {
        a(null, null, false);
    }

    public final void a(uym uym, apxu apxu) {
        a(uym, apxu, false);
    }

    private final synchronized void a(uym uym, apxu apxu, boolean z) {
        if (this.b) {
            aoeh aoeh = (aoeh) aoee.d.createBuilder();
            aoeh.a(8);
            if (z) {
                aoeh.copyOnWrite();
                aoee aoee = (aoee) aoeh.instance;
                aoee.a |= 2;
                aoee.c = 8;
            }
            asmz asmz = (asmz) asmw.f.createBuilder();
            asmz.copyOnWrite();
            asmw asmw = (asmw) asmz.instance;
            asmw.c = (anxl) aoeh.build();
            asmw.b = 24;
            this.i.a((asmw) ((anxl) asmz.build()));
        }
        this.e.d(new uyw(uyz.STARTED, false));
        ((utv) this.c.get()).f();
        this.g.edit().putLong("incognito_LACT", 0).apply();
        this.e.d(new uyw(uyz.FINISHED, true, apxu));
        this.e.c(new afqf(((utv) this.c.get()).c()));
        if (uym != null) {
            uym.a();
        }
        for (uyo h : this.f) {
            h.h();
        }
        if (this.b) {
            aoef aoef = (aoef) aoec.e.createBuilder();
            aoef.a(8);
            if (z) {
                aoef.copyOnWrite();
                aoec aoec = (aoec) aoef.instance;
                aoec.a |= 2;
                aoec.c = 8;
            }
            aoxs a = abhm.a(this.g);
            if (a != null) {
                aoef.a(a);
            }
            asmz asmz2 = (asmz) asmw.f.createBuilder();
            asmz2.a(aoef);
            this.i.a((asmw) ((anxl) asmz2.build()), e());
        }
    }

    public final synchronized void a(String str) {
        if (this.b) {
            aoef aoef = (aoef) aoec.e.createBuilder();
            aoef.a(7);
            asmz asmz = (asmz) asmw.f.createBuilder();
            asmz.a((aoec) ((anxl) aoef.build()));
            this.i.a((asmw) ((anxl) asmz.build()), e());
        }
        ((utv) this.c.get()).b(str);
        ((utv) this.c.get()).a(true);
        ((uud) this.d.get()).e();
        this.e.c(new afqh());
        this.e.d(new uyw(uyz.FINISHED, true));
        for (uyo i : this.f) {
            i.i();
        }
        if (this.b) {
            aoeh aoeh = (aoeh) aoee.d.createBuilder();
            aoeh.a(7);
            asmz asmz2 = (asmz) asmw.f.createBuilder();
            asmz2.a((aoee) ((anxl) aoeh.build()));
            this.i.a((asmw) ((anxl) asmz2.build()));
        }
    }

    public final synchronized void b() {
        this.g.edit().putLong("incognito_LACT", this.h.b()).apply();
    }

    public final synchronized void c() {
        long j = this.g.getLong("incognito_LACT", 0);
        if (j != 0 && TimeUnit.MILLISECONDS.toSeconds(this.h.b() - j) <= a) {
            if (this.h.b() - j >= 0) {
                b();
                return;
            }
        }
        a(null, null, true);
        for (uyo g : this.f) {
            g.g();
        }
    }

    public final void a(uyo uyo) {
        this.f.add(uyo);
    }

    public final void b(uyo uyo) {
        this.f.remove(uyo);
    }

    public final boolean d() {
        String string = this.g.getString("pre_incognito_signed_in_user_id", null);
        if (string != null) {
            String str = "incognito_promotion_already_shown";
            if (string.length() == 0) {
                string = new String(str);
            } else {
                string = str.concat(string);
            }
            if (!this.g.getBoolean(string, false)) {
                this.g.edit().putBoolean(string, true).apply();
                return true;
            }
        }
        return false;
    }

    private final long e() {
        return TimeUnit.HOURS.toMillis(TimeUnit.MILLISECONDS.toHours(this.h.a()));
    }
}
