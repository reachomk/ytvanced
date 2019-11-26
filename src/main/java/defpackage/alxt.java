package defpackage;

import android.content.SharedPreferences;

/* renamed from: alxt */
public final class alxt implements baqa {
    private final bcaa a;
    private final bcaa b;

    private alxt(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static alxt a(bcaa bcaa, bcaa bcaa2) {
        return new alxt(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        return new alxq((SharedPreferences) this.a.get(), bapx.b(this.b));
    }
}
