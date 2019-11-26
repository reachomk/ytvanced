package defpackage;

import android.text.TextUtils;
import java.util.concurrent.ExecutionException;

/* renamed from: aamb */
final class aamb implements Runnable {
    private final /* synthetic */ zyt a;
    private final /* synthetic */ aaly b;

    aamb(aaly aaly, zyt zyt) {
        this.b = aaly;
        this.a = zyt;
    }

    public final void run() {
        Object obj;
        boolean z;
        String str = "com.google.android.libraries.youtube.innertube.hot_config_group";
        aaly aaly = this.b;
        String str2 = "com.google.android.libraries.youtube.innertube.cold_config_group";
        Object obj2 = null;
        String string = aaly.c.getString(str2, null);
        aaly.d = aaly.c.getLong("com.google.android.libraries.youtube.innertube.cold_stored_timestamp", -1);
        if (TextUtils.isEmpty(string)) {
            obj = null;
        } else {
            obj = (apxn) abmi.a(string, apxn.w.getParserForType());
        }
        if (obj != null) {
            auya auya = obj.i;
            if (auya == null) {
                auya = auya.J;
            }
            aosh aosh = auya.r;
            if (aosh == null) {
                aosh = aosh.n;
            }
            z = aosh.k;
        } else {
            z = false;
        }
        aaly.f = z;
        if (!(z || TextUtils.isEmpty(string))) {
            aaly.c.edit().putLong("com.google.android.libraries.youtube.innertube.cold_active_fetch_timestamp", aaly.d).apply();
        }
        if (obj == null) {
            obj = apxn.w;
            aaly.d = 0;
        }
        try {
            if (((Boolean) this.a.c().get()).booleanValue()) {
                this.b.c.edit().putString(str2, null).putString(str, null).putString("com.google.android.libraries.youtube.innertube.hot_hash_data", null).putString("com.google.android.libraries.youtube.innertube.cold_hash_data", null).apply();
                this.b.b.e_(apxn.w);
                this.b.a.e_(arvt.y);
                return;
            }
        } catch (InterruptedException | ExecutionException e) {
            afpc.a(2, afpf.initialization, "Failed to get the fail safe status", e);
        }
        this.b.b.e_(obj);
        aaly = this.b;
        bdfg bdfg = aaly.a;
        str = aaly.c.getString(str, null);
        aaly.e = aaly.c.getLong("com.google.android.libraries.youtube.innertube.hot_stored_timestamp", -1);
        if (!TextUtils.isEmpty(str)) {
            obj2 = (arvt) abmi.a(str, arvt.y.getParserForType());
        }
        if (obj2 == null) {
            obj2 = arvt.y;
            aaly.e = 0;
        }
        bdfg.e_(obj2);
    }
}
