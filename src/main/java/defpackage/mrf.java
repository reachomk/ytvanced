package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import java.util.Map;
import java.util.Set;

/* renamed from: mrf */
final class mrf implements SharedPreferences {
    private final SharedPreferences a;
    private final String b;

    public mrf(SharedPreferences sharedPreferences, String str) {
        this.a = sharedPreferences;
        this.b = str;
    }

    public final Map getAll() {
        return this.a.getAll();
    }

    public final String getString(String str, String str2) {
        return this.a.getString(a(str), str2);
    }

    public final Set getStringSet(String str, Set set) {
        return this.a.getStringSet(a(str), set);
    }

    public final int getInt(String str, int i) {
        return this.a.getInt(a(str), i);
    }

    public final long getLong(String str, long j) {
        return this.a.getLong(a(str), j);
    }

    public final float getFloat(String str, float f) {
        return this.a.getFloat(a(str), f);
    }

    public final boolean getBoolean(String str, boolean z) {
        return this.a.getBoolean(a(str), z);
    }

    public final boolean contains(String str) {
        return this.a.contains(a(str));
    }

    public final Editor edit() {
        return new mri(this.a.edit(), this.b);
    }

    public final void registerOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public final void unregisterOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    private final String a(String str) {
        return mrg.b(str, this.b);
    }
}
