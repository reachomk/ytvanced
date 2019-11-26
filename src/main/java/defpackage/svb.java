package defpackage;

import android.content.Context;
import java.util.Map;

/* renamed from: svb */
public final class svb {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    public svb(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) svb.a(bcaa, 1);
        this.b = (bcaa) svb.a(bcaa2, 2);
        this.c = (bcaa) svb.a(bcaa3, 3);
    }

    public final svc a(swk swk) {
        return new svc((Context) svb.a((Context) this.a.get(), 1), (suq) svb.a((suq) this.b.get(), 2), (Map) svb.a((Map) this.c.get(), 3), (swk) svb.a(swk, 4));
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
