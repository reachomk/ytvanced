package defpackage;

import android.content.res.Resources;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

/* renamed from: eui */
final /* synthetic */ class eui implements OnPreferenceChangeListener {
    private final Resources a;
    private final int b;

    eui(Resources resources, int i) {
        this.a = resources;
        this.b = i;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        preference.setSummary(this.a.getString(this.b, new Object[]{obj.toString()}));
        return true;
    }
}
