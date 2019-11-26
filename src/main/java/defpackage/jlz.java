package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jlz */
final /* synthetic */ class jlz implements OnClickListener {
    private final jma a;

    jlz(jma jma) {
        this.a = jma;
    }

    public final void onClick(View view) {
        jma jma = this.a;
        jma.c.edit().putBoolean("auto_switch_theme_on_battery_saver_settings_toggle", true).apply();
        Activity activity = jma.a;
        activity.startActivity(ebl.d(activity));
    }
}
