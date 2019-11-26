package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import com.google.android.apps.youtube.app.settings.GeneralPrefsFragment;

/* renamed from: jav */
public final /* synthetic */ class jav implements OnPreferenceChangeListener {
    private final GeneralPrefsFragment a;

    public jav(GeneralPrefsFragment generalPrefsFragment) {
        this.a = generalPrefsFragment;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        GeneralPrefsFragment generalPrefsFragment = this.a;
        if (!((Boolean) obj).booleanValue() && fmv.b(generalPrefsFragment.b) && generalPrefsFragment.b.getBoolean("auto_switch_theme_on_battery_saver", false)) {
            acwa acwa = generalPrefsFragment.i;
            atse atse = (atse) atsf.d.createBuilder();
            atse.copyOnWrite();
            atsf atsf = (atsf) atse.instance;
            atsf.a |= 1;
            atsf.b = false;
            atse.copyOnWrite();
            atsf = (atsf) atse.instance;
            atsf.a |= 2;
            atsf.c = false;
            atsf atsf2 = (atsf) ((anxl) atse.build());
            atss atss = (atss) atst.q.createBuilder();
            atss.copyOnWrite();
            atst atst = (atst) atss.instance;
            if (atsf2 != null) {
                atst.p = atsf2;
                atst.b |= 1;
                acwa.t().b(new acvs(acwc.BATTERY_SAVER_AUTO_SWITCH_THEME_ACTION), (atst) ((anxl) atss.build()));
            } else {
                throw new NullPointerException();
            }
        }
        generalPrefsFragment.b.edit().putBoolean("auto_switch_theme_on_battery_saver_settings_toggle", true).apply();
        Handler handler = new Handler(Looper.getMainLooper());
        Activity activity = generalPrefsFragment.getActivity();
        activity.getClass();
        handler.postAtFrontOfQueue(new jaw(activity));
        return true;
    }
}
