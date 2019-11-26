package defpackage;

import android.content.SharedPreferences;

/* renamed from: aede */
final class aede {
    private aecx a;

    private aede() {
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized aecx a(zzf zzf, bcaa bcaa, xta xta, bapu bapu, SharedPreferences sharedPreferences) {
        if (this.a == null) {
            this.a = new aecx(zzf, bcaa, xta, bapu, sharedPreferences);
        }
        return this.a;
    }

    /* synthetic */ aede(byte b) {
    }
}
