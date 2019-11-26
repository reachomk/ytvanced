package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;

/* renamed from: abum */
public final class abum {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    public abum(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) abum.a(bcaa, 1);
        this.b = (bcaa) abum.a(bcaa2, 2);
        this.c = (bcaa) abum.a(bcaa3, 3);
    }

    public final abug a(ViewGroup viewGroup) {
        return new abug((Context) abum.a((Context) this.a.get(), 1), (acvx) abum.a((acvx) this.b.get(), 2), (Handler) abum.a((Handler) this.c.get(), 3), (ViewGroup) abum.a(viewGroup, 4));
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
