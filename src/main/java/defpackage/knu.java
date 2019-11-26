package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: knu */
public final class knu implements akox {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    public knu(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) knu.a(bcaa, 1);
        this.b = (bcaa) knu.a(bcaa2, 2);
        this.c = (bcaa) knu.a(bcaa3, 3);
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
        return new knv((Context) knu.a((Context) this.a.get(), 1), (akkq) knu.a((akkq) this.b.get(), 2), (akzb) knu.a((akzb) this.c.get(), 3), (ViewGroup) knu.a(viewGroup, 4));
    }
}
