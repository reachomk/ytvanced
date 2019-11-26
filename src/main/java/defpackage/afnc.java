package defpackage;

import android.content.Context;
import android.os.Handler;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.text.TextUtils;

/* renamed from: afnc */
public final /* synthetic */ class afnc implements OnPreferenceChangeListener {
    private final Handler a;
    private final Context b;

    public afnc(Handler handler, Context context) {
        this.a = handler;
        this.b = context;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        Handler handler = this.a;
        Context context = this.b;
        CharSequence charSequence = (String) obj;
        if (!TextUtils.isEmpty(charSequence) && (TextUtils.isEmpty(charSequence) || charSequence.startsWith(".") || charSequence.split("\\.").length < 2)) {
            handler.post(new afnf(context));
            return false;
        }
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = "None";
        }
        preference.setSummary(charSequence);
        return true;
    }
}
