package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PowerManager;
import com.google.android.youtube.R;

/* renamed from: jma */
public final class jma extends BroadcastReceiver {
    public final Activity a;
    public final fda b;
    public final SharedPreferences c;
    public final zyw d;
    public boolean e;
    public PowerManager f;
    public fde g;
    private final exu h;

    public jma(Activity activity, Bundle bundle, zyw zyw, SharedPreferences sharedPreferences, fda fda, exu exu) {
        this.a = activity;
        this.c = sharedPreferences;
        this.d = zyw;
        this.b = fda;
        this.h = exu;
        fde fde = null;
        if (bundle != null && bundle.getBoolean("auto_dark_theme_snackbar_msg", false)) {
            fde = (fde) ((fdd) ((fdd) fde.h().b(this.a.getString(R.string.auto_switched_to_dark_theme))).a(this.a.getString(R.string.settings_button), new jmb(this))).d();
        }
        this.g = fde;
        if (bundle == null || !bundle.getBoolean("auto_dark_theme_user_toggle", false)) {
            String str = "auto_switch_theme_on_battery_saver_settings_toggle";
            if (this.c.contains(str)) {
                this.c.edit().remove(str).apply();
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.e) {
            if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction()) && this.h.a) {
                if (fmv.a(this.c) != (!a() ? 1 : 2) && a()) {
                    this.b.a((albf) (fde) ((fdd) ((fdd) fde.h().b(this.a.getString(R.string.switch_to_dark_theme))).a(this.a.getString(R.string.settings_button), new jlz(this))).d());
                }
            }
        }
    }

    public final boolean a() {
        PowerManager powerManager = this.f;
        return powerManager != null && powerManager.isPowerSaveMode();
    }
}
