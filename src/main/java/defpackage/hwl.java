package defpackage;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: hwl */
public final class hwl implements ahlm {
    public final SharedPreferences a;
    private final Set c = Collections.newSetFromMap(new WeakHashMap());

    public hwl(SharedPreferences sharedPreferences) {
        this.a = (SharedPreferences) amqw.a((Object) sharedPreferences);
    }

    public final void a(ahlo ahlo) {
        this.c.add(ahlo);
    }

    public final void b(ahlo ahlo) {
        this.c.remove(ahlo);
    }

    public final boolean a() {
        return this.a.getBoolean(ahhv.AUTONAV, true);
    }

    public final void a(boolean z) {
        if (z != a()) {
            this.a.edit().putBoolean(ahhv.AUTONAV, z).apply();
            z = a();
            for (ahlo a : this.c) {
                a.a(z);
            }
        }
    }
}
