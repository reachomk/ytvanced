package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: fpb */
public final class fpb {
    private final bcaa a;
    private final bcaa b;

    public fpb(bcaa bcaa, bcaa bcaa2) {
        this.a = (bcaa) fpb.a(bcaa, 1);
        this.b = (bcaa) fpb.a(bcaa2, 2);
    }

    public final fpc a(String str, long j, TimeUnit timeUnit) {
        return new fpc((SharedPreferences) fpb.a((SharedPreferences) this.a.get(), 1), (xsc) fpb.a((xsc) this.b.get(), 2), (String) fpb.a(str, 3), j, (TimeUnit) fpb.a(timeUnit, 5));
    }

    private static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}
