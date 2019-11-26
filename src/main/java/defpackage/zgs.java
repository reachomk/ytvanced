package defpackage;

import android.content.SharedPreferences;

/* renamed from: zgs */
public final class zgs {
    public final SharedPreferences a;

    public zgs(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final void a(int i) {
        this.a.edit().putInt("camera_facing", i).commit();
    }
}
