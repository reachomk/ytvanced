package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.Button;

/* renamed from: guz */
public final class guz {
    public final Context a;
    public final SharedPreferences b;
    public final zyw c;
    public final acwa d;
    public aeh e;

    public guz(Context context, SharedPreferences sharedPreferences, zyw zyw, acwa acwa) {
        this.a = context;
        this.b = sharedPreferences;
        this.c = zyw;
        this.d = acwa;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        Editor edit = this.b.edit();
        edit.putBoolean("has_responded_location_permission_dialog", true);
        edit.commit();
    }

    public static void a(Button button) {
        button.setTextSize(14.0f);
        button.setAllCaps(true);
        button.setTypeface(null, 1);
    }
}
