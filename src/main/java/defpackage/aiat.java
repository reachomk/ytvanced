package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: aiat */
public final class aiat implements baqa {
    private final bcaa a;
    private final bcaa b;

    private aiat(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static aiat a(bcaa bcaa, bcaa bcaa2) {
        return new aiat(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        return new aiar((Context) this.a.get(), (SharedPreferences) this.b.get());
    }
}
