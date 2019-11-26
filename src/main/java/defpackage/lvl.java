package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: lvl */
public final class lvl implements ejc {
    private final SharedPreferences a;
    private final lud b;
    private final eif c;
    private final bcaa d;
    private final ViewGroup e;
    private final lvn f;
    private int g;
    private lui h;

    public lvl(luf luf, lud lud, SharedPreferences sharedPreferences, eif eif, bcaa bcaa, View view, ViewGroup viewGroup, ezm ezm, aux aux, lij lij, lkd lkd) {
        eif eif2 = eif;
        this.a = sharedPreferences;
        this.b = lud;
        this.c = eif2;
        this.d = bcaa;
        ViewGroup viewGroup2 = viewGroup;
        this.e = viewGroup2;
        this.f = new lvn(luf, view, viewGroup2, ezm, aux, lij, lkd);
        if (lvl.a(eif.c())) {
            b();
        } else {
            eif.a(this);
        }
    }

    public final void a(ejd ejd, ejd ejd2) {
        if (lvl.a(ejd2)) {
            b();
            this.c.b(this);
        }
    }

    private final void b() {
        a();
        ((lum) this.d.get()).f().a(new lvo(this));
    }

    public final void a() {
        View f;
        int a = lva.a(((lum) this.d.get()).f().b(), this.a);
        lui lui = this.h;
        if (lui == null || a != this.g) {
            lvn lvn = this.f;
            lui a2 = lvn.a.a(a);
            a2.a(lvn.b, lvn.c, lvn.d, lvn.e, lvn.f, null, lvn.g);
            this.g = a;
            lui = a2;
        }
        lui lui2 = this.h;
        if (!(lui2 == null || lui2 == lui)) {
            f = lui2.f();
            if (f.getParent() != null) {
                this.e.removeView(f);
                this.h.a(null);
            }
        }
        if (this.h != lui) {
            this.b.a(lui);
        }
        f = lui.f();
        if (f.getParent() == null) {
            this.e.addView(f);
        }
        this.h = lui;
        lui.a(((lum) this.d.get()).f().b());
    }

    private static boolean a(ejd ejd) {
        return ejd == ejd.WATCH_WHILE_MAXIMIZED || ejd == ejd.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED || ejd == ejd.WATCH_WHILE_MINIMIZED;
    }
}
