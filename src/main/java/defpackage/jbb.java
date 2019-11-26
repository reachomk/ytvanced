package defpackage;

import android.content.SharedPreferences;
import android.util.SparseArray;

/* renamed from: jbb */
public final class jbb implements alct {
    private final SharedPreferences a;
    private final bqa b;
    private final afpu c;
    private final SparseArray d = new SparseArray();
    private final SparseArray e = new SparseArray();

    public jbb(bqa bqa, SharedPreferences sharedPreferences, afpu afpu) {
        this.b = bqa;
        this.a = sharedPreferences;
        this.c = afpu;
        this.d.put(20, "video_notifications_enabled");
        this.d.put(36, "com.google.android.libraries.youtube.notification.pref.notification_sound_enabled");
        this.e.put(73, "offline_ao_enabled%s");
        this.e.put(77, "main_app_auto_offline_storage_limit_megabytes_%s");
    }

    public final String a(int i) {
        String str = (String) this.d.get(i);
        if (str != null) {
            return str;
        }
        String str2 = (String) this.e.get(i);
        return str2 != null ? xuq.a(str2, this.c.c().a()) : null;
    }

    public final boolean b(int i) {
        if (i == 20) {
            afxw.a(this.a);
        } else if (i == 9) {
            this.b.b();
        }
        return true;
    }
}
