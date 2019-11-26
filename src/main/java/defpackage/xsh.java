package defpackage;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import java.util.Set;

/* renamed from: xsh */
public final class xsh implements xtw {
    private final SharedPreferences a;
    private final PackageManager b;
    private final Set c;

    public xsh(SharedPreferences sharedPreferences, PackageManager packageManager, Set set) {
        this.a = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.b = (PackageManager) amqw.a((Object) packageManager);
        this.c = set;
    }

    public final boolean a(boolean z) {
        String str = "startup_permission_check_succeeded";
        if (!z && this.a.contains(str)) {
            return this.a.getBoolean(str, false);
        }
        int i = 1;
        for (xtv xtv : this.c) {
            if (xtv != null) {
                int i2;
                try {
                    if (this.b.getPermissionInfo(xtv.a(), 0).protectionLevel != xtv.b()) {
                        i2 = 0;
                        i &= i2;
                    }
                } catch (NameNotFoundException unused) {
                }
                i2 = 1;
                i &= i2;
            }
        }
        this.a.edit().putBoolean(str, i).apply();
        return i;
    }
}
