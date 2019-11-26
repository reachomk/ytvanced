package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/* renamed from: pfq */
public final class pfq extends pgb {
    public SharedPreferences a;
    public long b;
    public final pfp c = new pfp(this, "monitoring", ((Long) pel.A.a).longValue());
    private long d = -1;

    protected pfq(pgd pgd) {
        super(pgd);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        this.a = i().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final long b() {
        pgv.a();
        f();
        long j = this.d;
        if (j != -1) {
            return j;
        }
        j = this.a.getLong("last_dispatch", 0);
        this.d = j;
        return j;
    }

    public final void c() {
        pgv.a();
        f();
        long a = h().a();
        Editor edit = this.a.edit();
        edit.putLong("last_dispatch", a);
        edit.apply();
        this.d = a;
    }
}
