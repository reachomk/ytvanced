package defpackage;

import android.preference.Preference;
import android.preference.PreferenceScreen;
import java.util.concurrent.TimeUnit;

/* renamed from: alvf */
public final class alvf {
    public static final long a = TimeUnit.SECONDS.toMillis(20);

    static void a() {
    }

    public static void a(PreferenceScreen preferenceScreen) {
        Preference preference = new Preference(preferenceScreen.getContext());
        preference.setTitle("Trigger ANR");
        preference.setOnPreferenceClickListener(alve.a);
        preferenceScreen.addPreference(preference);
    }
}
