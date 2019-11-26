package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: ivo */
public final class ivo implements akox {
    private final bcaa a;
    private final bcaa b;

    public ivo(bcaa bcaa, bcaa bcaa2) {
        this.a = (bcaa) ivo.a(bcaa, 1);
        this.b = (bcaa) ivo.a(bcaa2, 2);
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
        return new ivn((Context) ivo.a((Context) this.a.get(), 1), (aaas) ivo.a((aaas) this.b.get(), 2), (ViewGroup) ivo.a(viewGroup, 3));
    }
}
