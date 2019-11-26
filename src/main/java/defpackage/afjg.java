package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: afjg */
public final class afjg implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    private afjg(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
    }

    public static afjg a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        return new afjg(bcaa, bcaa2, bcaa3, bcaa4);
    }

    public final /* synthetic */ Object get() {
        return new afjc((Context) this.a.get(), (SharedPreferences) this.b.get(), ((Boolean) this.c.get()).booleanValue(), (zzl) this.d.get());
    }
}
