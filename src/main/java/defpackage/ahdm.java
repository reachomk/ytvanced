package defpackage;

import android.content.SharedPreferences;

/* renamed from: ahdm */
public final class ahdm {
    private final SharedPreferences a;
    private final afpu b;

    public ahdm(SharedPreferences sharedPreferences, afpu afpu) {
        this.a = sharedPreferences;
        this.b = afpu;
    }

    public final synchronized int a() {
        afpt c = this.b.c();
        if (c.a().equals(afpt.g.a())) {
            return 2;
        }
        String a = ahdm.a(c);
        if (!this.a.contains(a)) {
            return 0;
        }
        if (this.a.getBoolean(a, false)) {
            return 1;
        }
        return 2;
    }

    public final boolean b() {
        return a() != 2;
    }

    public final synchronized void a(boolean z) {
        afpt c = this.b.c();
        if (!c.a().equals(afpt.g.a())) {
            this.a.edit().putBoolean(ahdm.a(c), z).apply();
        }
    }

    private static String a(afpt afpt) {
        return xuq.a("%s_uses_offline", afpt.a());
    }
}
