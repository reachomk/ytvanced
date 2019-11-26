package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import java.util.concurrent.Executor;

/* renamed from: aaly */
public final class aaly implements aams, xcp, zzi {
    public final bdfg a = bdfg.h();
    public final bdfg b = bdfg.h();
    public final SharedPreferences c;
    public long d;
    public long e;
    public boolean f;
    private final xsc g;

    public aaly(SharedPreferences sharedPreferences, xsc xsc, xci xci) {
        this.c = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.g = (xsc) amqw.a((Object) xsc);
        xci.a((Object) this);
    }

    public final String a() {
        return this.c.getString("com.google.android.libraries.youtube.innertube.hot_hash_data", "");
    }

    public final String c() {
        return this.c.getString("com.google.android.libraries.youtube.innertube.cold_hash_data", "");
    }

    public final long b() {
        if (this.f) {
            return this.e;
        }
        return this.c.getLong("com.google.android.libraries.youtube.innertube.hot_stored_timestamp", -1);
    }

    public final long d() {
        if (this.f) {
            return this.d;
        }
        return this.c.getLong("com.google.android.libraries.youtube.innertube.cold_active_fetch_timestamp", -1);
    }

    public final void a(Executor executor, zyt zyt) {
        executor.execute(new aamb(this, zyt));
    }

    public final void a(asic asic) {
        if ((asic.a & 4096) != 0) {
            Editor edit = this.c.edit();
            arrm arrm = asic.i;
            if (arrm == null) {
                arrm = arrm.f;
            }
            String str = arrm.d;
            if (!TextUtils.isEmpty(str)) {
                edit.putString("com.google.android.libraries.youtube.innertube.hot_hash_data", str);
            }
            String str2 = arrm.e;
            if (!TextUtils.isEmpty(str2)) {
                edit.putString("com.google.android.libraries.youtube.innertube.cold_hash_data", str2);
            }
            arrm = asic.i;
            if (arrm == null) {
                arrm = arrm.f;
            }
            str2 = arrm.c;
            if (!TextUtils.isEmpty(str2)) {
                str2 = abmi.a(str2);
                arvt arvt = (arvt) abmi.a(str2, arvt.y.getParserForType());
                if (arvt != null) {
                    this.a.e_(arvt);
                    this.e = this.g.a();
                    edit.putString("com.google.android.libraries.youtube.innertube.hot_config_group", str2).putLong("com.google.android.libraries.youtube.innertube.hot_stored_timestamp", this.e);
                }
            }
            arrm arrm2 = asic.i;
            if (arrm2 == null) {
                arrm2 = arrm.f;
            }
            String str3 = arrm2.b;
            if (!TextUtils.isEmpty(str3)) {
                str3 = abmi.a(str3);
                if (((apxn) abmi.a(str3, apxn.w.getParserForType())) != null) {
                    edit.putString("com.google.android.libraries.youtube.innertube.cold_config_group", str3).putLong("com.google.android.libraries.youtube.innertube.cold_stored_timestamp", this.g.a());
                }
            }
            edit.apply();
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i != -1) {
            String str = "com.google.android.libraries.youtube.innertube.hot_hash_data";
            if (i == 0) {
                this.c.edit().remove(str).apply();
                return null;
            } else if (i == 1) {
                this.c.edit().remove(str).apply();
                return null;
            } else {
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        return new Class[]{afqf.class, afqh.class};
    }
}
