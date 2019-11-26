package defpackage;

import android.content.SharedPreferences;

/* renamed from: mkl */
public final class mkl implements lux {
    private final lum a;
    private final SharedPreferences b;

    public mkl(lum lum, SharedPreferences sharedPreferences) {
        this.a = lum;
        this.b = sharedPreferences;
    }

    public final int a() {
        return lva.a(this.a.f().b(), this.b);
    }
}
