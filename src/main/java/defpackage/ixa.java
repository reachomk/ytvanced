package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: ixa */
public final class ixa implements abnd {
    private static final long c = TimeUnit.MINUTES.toSeconds(60);
    private static final long d = TimeUnit.MINUTES.toSeconds(300);
    private final SharedPreferences a;
    private final zyw b;

    public ixa(SharedPreferences sharedPreferences, zyw zyw) {
        this.a = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.b = (zyw) amqw.a((Object) zyw);
    }

    public final boolean a() {
        return this.a.getBoolean("enable_on_device_suggest", false);
    }

    public final boolean b() {
        return this.a.getBoolean("enable_on_device_suggest_counterfactual_logging", false);
    }

    public final amqp c() {
        return amqp.c(this.a.getString("current_on_device_suggest_index_url", null));
    }

    public final void a(String str) {
        this.a.edit().putString("current_on_device_suggest_index_url", str).apply();
    }

    public final amqp d() {
        return amqp.c(this.a.getString("latest_on_device_suggest_index_url", null));
    }

    public final amqp e() {
        return amqp.c(this.a.getString("on_device_suggest_index_file", null));
    }

    public final void b(String str) {
        this.a.edit().putString("on_device_suggest_index_file", str).apply();
    }

    public final amqp f() {
        return amqp.c(this.a.getString("on_device_suggest_index_language", null));
    }

    public final void c(String str) {
        this.a.edit().putString("on_device_suggest_index_language", str).apply();
    }

    public final int g() {
        apxn a = this.b.a();
        int i = -1;
        if (!(a == null || (a.a & 16) == 0)) {
            aulu aulu = a.e;
            if (aulu == null) {
                aulu = aulu.bw;
            }
            i = aulu.aA;
        }
        return i <= 0 ? 300 : i;
    }

    public final int h() {
        apxn a = this.b.a();
        int i = -1;
        if (!(a == null || (a.a & 16) == 0)) {
            aulu aulu = a.e;
            if (aulu == null) {
                aulu = aulu.bw;
            }
            i = aulu.aB;
        }
        return i <= 0 ? 10 : i;
    }

    public final int i() {
        apxn a = this.b.a();
        int i = -1;
        if (!(a == null || (a.a & 16) == 0)) {
            aulu aulu = a.e;
            if (aulu == null) {
                aulu = aulu.bw;
            }
            i = aulu.aC;
        }
        return i <= 0 ? 2 : i;
    }

    public final long j() {
        long parseLong = Long.parseLong(this.a.getString("on_device_suggest_download_earliest_secs", "-1"));
        return parseLong == -1 ? c : parseLong;
    }

    public final long k() {
        long parseLong = Long.parseLong(this.a.getString("on_device_suggest_download_latest_secs", "-1"));
        return parseLong == -1 ? d : parseLong;
    }
}
