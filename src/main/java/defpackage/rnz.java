package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.ConditionVariable;
import org.json.JSONException;
import org.json.JSONObject;

@qlp
/* renamed from: rnz */
public final class rnz implements OnSharedPreferenceChangeListener {
    public final Object a = new Object();
    public final ConditionVariable b = new ConditionVariable();
    public volatile boolean c = false;
    public SharedPreferences d = null;
    public Context e;
    private JSONObject f = new JSONObject();

    public final Object a(rnr rnr) {
        if (this.b.block(5000)) {
            if (!this.c || this.d == null) {
                synchronized (this.a) {
                    if (!this.c || this.d == null) {
                        Object obj = rnr.c;
                        return obj;
                    }
                }
            }
            if (rnr.a == 1 && this.f.has(rnr.b)) {
                return rnr.a(this.f);
            }
            return qmi.a(this.e, new rob(this, rnr));
        }
        throw new IllegalStateException("Flags.initialize() was not called!");
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            a();
        }
    }

    public final void a() {
        if (this.d != null) {
            try {
                this.f = new JSONObject((String) qmi.a(this.e, new roc(this)));
            } catch (JSONException unused) {
            }
        }
    }
}
