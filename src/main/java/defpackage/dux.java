package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import com.google.android.apps.youtube.app.application.upgrade.NewVersionAvailableActivity;

/* renamed from: dux */
public final class dux {
    private final Context a;
    private final xwa b;
    private final SharedPreferences c;
    private final eap d;
    private final zzf e;

    public dux(Context context, xwa xwa, SharedPreferences sharedPreferences, eap eap, zzf zzf) {
        this.a = context;
        this.b = xwa;
        this.c = sharedPreferences;
        this.d = eap;
        this.e = zzf;
    }

    private final boolean a() {
        return (this.e.l() || this.e.m() || c()) ? false : true;
    }

    private final int b() {
        if (a()) {
            int c = xul.c(this.a);
            int a = this.d.a.a("min_app_version", 0);
            int a2 = this.d.a.a("target_app_version", 0);
            String str = "";
            SparseBooleanArray a3 = eap.a(this.d.a.a("blacklisted_app_versions", str));
            SparseBooleanArray a4 = eap.a(this.d.a.a("discouraged_app_versions", str));
            if (c < a || a3.get(c)) {
                return 3;
            }
            return (c < a2 || a4.get(c)) ? 1 : 0;
        } else if (this.e.m()) {
            return 3;
        } else {
            if (c()) {
                return 2;
            }
            return !this.e.l() ? 0 : 1;
        }
    }

    private final boolean c() {
        int a = this.d.a.a("timer_nagging_app_version", 0);
        if (a > 0 && xul.c(this.a) < a) {
            return true;
        }
        aumm d = d();
        if (d != null) {
            String str = d.b;
            return (TextUtils.isEmpty(str) || xrn.c(this.a) || this.b.compareTo(new xwa(str)) >= 0) ? false : true;
        }
    }

    private final aumm d() {
        aysl n = this.e.n();
        if ((n.a & 64) == 0) {
            return null;
        }
        aumm aumm = n.e;
        if (aumm == null) {
            aumm = aumm.j;
        }
        return aumm;
    }

    public final Intent a(Intent intent, boolean z) {
        String str = "application_first_start";
        boolean z2 = this.c.getBoolean(str, true);
        int b = b();
        if (z2) {
            this.c.edit().putBoolean(str, false).apply();
            if (b != 3) {
                return null;
            }
        }
        if (b == 0) {
            return null;
        }
        if (!z && b == 1) {
            return null;
        }
        long j = 0;
        long currentTimeMillis = System.currentTimeMillis() - this.c.getLong("upgrade_prompt_shown_millis", 0);
        if (b() != 3) {
            if (a()) {
                xti xti = this.d.a;
                String str2 = "time_between_upgrade_prompts_millis";
                xti.b(str2);
                j = rzt.a(xti.a, xti.a(str2), 604800000);
            } else {
                j = this.e.n().b * 1000;
            }
            j = Math.max(j, 30000);
        }
        if (b == 1 && currentTimeMillis <= j) {
            return null;
        }
        if (b == 2 && currentTimeMillis <= j) {
            aumm d = d();
            if (d == null || d.c < currentTimeMillis) {
                return null;
            }
        }
        Intent intent2 = new Intent(this.a, NewVersionAvailableActivity.class);
        intent2.setFlags(268435456);
        intent2.putExtra("upgrade_enforcement_type", b);
        if (intent != null) {
            intent2.putExtra("forward_intent", intent);
        }
        return intent2;
    }
}
