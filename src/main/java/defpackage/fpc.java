package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: fpc */
public final class fpc {
    private final SharedPreferences a;
    private final String b;
    private final xsc c;
    private final long d;

    public fpc(SharedPreferences sharedPreferences, xsc xsc, String str, long j, TimeUnit timeUnit) {
        amqw.a((Object) timeUnit);
        this.a = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.b = (String) amqw.a((Object) str);
        this.c = xsc;
        this.d = timeUnit.toMillis(j);
    }

    public final boolean a() {
        return fpc.a(this.a, this.b, this.d, this.c.a());
    }

    public static boolean a(SharedPreferences sharedPreferences, String str, long j, long j2) {
        boolean z = sharedPreferences.getBoolean("bypass_rate_limit", false);
        long j3 = sharedPreferences.getLong(str, 0);
        if (z || j3 + j <= j2) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.a.edit().putLong(this.b, this.c.a()).apply();
    }
}
