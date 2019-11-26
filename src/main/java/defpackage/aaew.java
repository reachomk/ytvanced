package defpackage;

import android.content.SharedPreferences;
import java.util.Map;

/* renamed from: aaew */
public final class aaew implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private aaew(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static aaew a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new aaew(bcaa, bcaa2, bcaa3);
    }

    public final /* synthetic */ Object get() {
        return new aaex((SharedPreferences) this.a.get(), (xuu) this.b.get(), (Map) this.c.get());
    }
}
