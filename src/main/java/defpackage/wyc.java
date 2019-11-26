package defpackage;

import android.content.SharedPreferences;

/* renamed from: wyc */
public final class wyc implements baqa {
    private final bcaa a;

    private wyc(bcaa bcaa) {
        this.a = bcaa;
    }

    public static wyc a(bcaa bcaa) {
        return new wyc(bcaa);
    }

    public final /* synthetic */ Object get() {
        return new wxz((SharedPreferences) this.a.get());
    }
}
