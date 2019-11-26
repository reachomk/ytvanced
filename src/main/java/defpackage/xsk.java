package defpackage;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import java.util.Set;

/* renamed from: xsk */
public final class xsk implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private xsk(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static xsk a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new xsk(bcaa, bcaa2, bcaa3);
    }

    public final /* synthetic */ Object get() {
        return new xsh((SharedPreferences) this.a.get(), (PackageManager) this.b.get(), (Set) this.c.get());
    }
}
