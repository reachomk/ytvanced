package defpackage;

import android.content.Context;
import java.util.Map;

/* renamed from: epv */
public final class epv {
    private final bcaa a;
    private final bcaa b;

    public epv(bcaa bcaa, bcaa bcaa2) {
        this.a = (bcaa) epv.a((Object) bcaa, 1);
        this.b = (bcaa) epv.a((Object) bcaa2, 2);
    }

    public final eps a(akyw akyw, Map map) {
        return new eps((Context) epv.a((Context) this.a.get(), 1), (fna) epv.a((fna) this.b.get(), 2), akyw, map);
    }

    public final eps a(int i) {
        return new eps((Context) epv.a((Context) this.a.get(), 1), (fna) epv.a((fna) this.b.get(), 2), null, null, i);
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
