package defpackage;

import android.content.SharedPreferences.Editor;
import java.util.Set;

/* renamed from: mri */
final class mri implements Editor {
    private final Editor a;
    private final String b;

    public mri(Editor editor, String str) {
        this.a = editor;
        this.b = str;
    }

    public final Editor putString(String str, String str2) {
        this.a.putString(a(str), str2);
        return this;
    }

    public final Editor putStringSet(String str, Set set) {
        this.a.putStringSet(a(str), set);
        return this;
    }

    public final Editor putInt(String str, int i) {
        this.a.putInt(a(str), i);
        return this;
    }

    public final Editor putLong(String str, long j) {
        this.a.putLong(a(str), j);
        return this;
    }

    public final Editor putFloat(String str, float f) {
        this.a.putFloat(a(str), f);
        return this;
    }

    public final Editor putBoolean(String str, boolean z) {
        this.a.putBoolean(a(str), z);
        return this;
    }

    public final Editor remove(String str) {
        this.a.remove(a(str));
        return this;
    }

    public final Editor clear() {
        this.a.clear();
        return this;
    }

    public final boolean commit() {
        return this.a.commit();
    }

    public final void apply() {
        this.a.apply();
    }

    private final String a(String str) {
        return mrg.b(str, this.b);
    }
}
