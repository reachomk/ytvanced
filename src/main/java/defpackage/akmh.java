package defpackage;

import android.content.Context;
import android.os.Handler;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

/* renamed from: akmh */
public final /* synthetic */ class akmh implements OnPreferenceChangeListener {
    private final Handler a;
    private final Context b;
    private final String c;
    private final EditTextPreference d;
    private final float e;

    public akmh(Handler handler, Context context, String str, EditTextPreference editTextPreference, float f) {
        this.a = handler;
        this.b = context;
        this.c = str;
        this.d = editTextPreference;
        this.e = f;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        Handler handler = this.a;
        Context context = this.b;
        String str = this.c;
        EditTextPreference editTextPreference = this.d;
        float f = this.e;
        String str2 = (String) obj;
        boolean z = false;
        try {
            str2 = Float.parseFloat(str2);
            if (str2 >= 0.0f && str2 <= 1024.0f) {
                String valueOf = String.valueOf(str2);
                preference.getEditor().putString("ImageCacheSizeInMB", valueOf).commit();
                preference.setSummary(akme.a(str2, str));
                handler.post(new akmj(editTextPreference, valueOf));
                if (f == str2) {
                    z = true;
                    return z;
                }
                akme.a(handler, context, "Restart app to load new image cache size");
                return true;
            }
            akme.a(handler, context, "Cache size has to be between 0 and 1024 MB");
            return z;
        } catch (NumberFormatException unused) {
            akme.a(handler, context, String.format("Cannot parse \"%s\" to float", new Object[]{str2}));
        }
    }
}
