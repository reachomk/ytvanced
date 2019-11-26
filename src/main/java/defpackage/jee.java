package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: jee */
public final class jee implements akox {
    private final bcaa a;
    private final bcaa b;

    public jee(bcaa bcaa, bcaa bcaa2) {
        this.a = (bcaa) jee.a(bcaa, 1);
        this.b = (bcaa) jee.a(bcaa2, 2);
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
        return new jeb((Context) jee.a((Context) this.a.get(), 1), (akpb) jee.a((akpb) this.b.get(), 2), viewGroup);
    }
}
