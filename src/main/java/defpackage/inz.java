package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: inz */
public final class inz extends inx {
    private final bcaa a;
    private final bcaa b;

    public inz(bcaa bcaa, bcaa bcaa2) {
        this.a = (bcaa) inz.a(bcaa, 1);
        this.b = (bcaa) inz.a(bcaa2, 2);
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

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new iny((Context) inz.a((Context) this.a.get(), 1), (akvz) inz.a((akvz) this.b.get(), 2), (ViewGroup) inz.a(viewGroup, 3));
    }
}
