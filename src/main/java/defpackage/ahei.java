package defpackage;

import android.content.SharedPreferences;
import java.security.Key;

/* renamed from: ahei */
public final class ahei implements baqa {
    private final bcaa a;
    private final bcaa b;

    private ahei(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static ahei a(bcaa bcaa, bcaa bcaa2) {
        return new ahei(bcaa, bcaa2);
    }

    public static Key a(SharedPreferences sharedPreferences, xsf xsf) {
        return (Key) baqd.a(xsf.a(sharedPreferences), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ahei.a((SharedPreferences) this.a.get(), (xsf) this.b.get());
    }
}
