package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/* renamed from: dqc */
final class dqc implements bcud {
    private final /* synthetic */ dqa a;

    dqc(dqa dqa) {
        this.a = dqa;
    }

    public final void bM_() {
    }

    public final void a(Throwable th) {
        xtl.c(String.format("SearchHotConfig observer error %s", new Object[]{th.toString()}));
    }

    public final /* synthetic */ void e_(Object obj) {
        Editor edit;
        axdg axdg = (axdg) obj;
        SharedPreferences sharedPreferences = (SharedPreferences) this.a.a.ab.get();
        boolean z = axdg.c;
        String str = "enable_on_device_suggest";
        if (sharedPreferences.getBoolean(str, false) != z) {
            edit = sharedPreferences.edit();
            edit.putBoolean(str, z);
        } else {
            edit = null;
        }
        boolean z2 = axdg.e;
        String str2 = "enable_on_device_suggest_counterfactual_logging";
        if (sharedPreferences.getBoolean(str2, false) != z2) {
            if (edit == null) {
                edit = sharedPreferences.edit();
            }
            edit.putBoolean(str2, z2);
        }
        if (z || z2) {
            String str3 = axdg.d;
            String str4 = "";
            if (!sharedPreferences.getString("current_on_device_suggest_index_url", str4).equals(str3)) {
                String str5 = "latest_on_device_suggest_index_url";
                if (!sharedPreferences.getString(str5, str4).equals(str3)) {
                    if (edit == null) {
                        edit = sharedPreferences.edit();
                    }
                    edit.putString(str5, str3);
                }
            }
        }
        if (edit != null) {
            edit.apply();
        }
    }
}
