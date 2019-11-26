package defpackage;

import com.google.android.apps.youtube.app.settings.SettingsActivity;
import com.google.android.youtube.R;

/* renamed from: jbk */
public final class jbk {
    private final SettingsActivity a;
    private final eki b;

    public jbk(SettingsActivity settingsActivity, eki eki) {
        this.a = settingsActivity;
        this.b = eki;
    }

    public final String a() {
        boolean c = c();
        boolean b = b();
        if (c && b) {
            return this.a.getString(R.string.pref_background_and_offline_category);
        }
        if (c) {
            return this.a.getString(R.string.pref_offline_category);
        }
        return b ? this.a.getString(R.string.pref_background_category) : null;
    }

    public final boolean b() {
        return this.a.c() && euf.a(this.a.d(), abid.class);
    }

    public final boolean c() {
        return d() || this.b.b();
    }

    public final boolean d() {
        return this.a.c() && euf.a(this.a.d(), abij.class);
    }

    public final abij e() {
        if (d()) {
            for (Object next : this.a.d()) {
                if (next instanceof abij) {
                    return (abij) next;
                }
            }
        }
        return null;
    }
}
