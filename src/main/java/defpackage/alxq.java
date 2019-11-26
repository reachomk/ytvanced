package defpackage;

import android.content.SharedPreferences;
import java.security.SecureRandom;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: alxq */
public final class alxq implements alxv {
    private final SharedPreferences a;
    private final bapu b;
    private final Map c = new ConcurrentHashMap();

    public alxq(SharedPreferences sharedPreferences, bapu bapu) {
        this.a = sharedPreferences;
        this.b = bapu;
    }

    public final boolean a(float f, String str) {
        Boolean bool = (Boolean) this.c.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        float f2 = this.a.getFloat(str, -1.0f);
        if (f2 < 0.0f) {
            f2 = ((SecureRandom) this.b.get()).nextFloat();
        }
        f2 += f;
        boolean z = f2 >= 1.0f;
        this.a.edit().putFloat(str, f2 - ((float) ((int) f2))).apply();
        this.c.put(str, Boolean.valueOf(z));
        return z;
    }
}
