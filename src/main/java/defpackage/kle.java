package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: kle */
public final class kle implements kkh {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    public kle(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) kle.a(bcaa, 1);
        this.b = (bcaa) kle.a(bcaa2, 2);
        this.c = (bcaa) kle.a(bcaa3, 3);
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

    public final /* synthetic */ kkg a(ViewGroup viewGroup) {
        return new klf((aaas) kle.a((aaas) this.a.get(), 1), (akvp) kle.a((akvp) this.b.get(), 2), (Context) kle.a((Context) this.c.get(), 3), (ViewGroup) kle.a(viewGroup, 4));
    }
}
