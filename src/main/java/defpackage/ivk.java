package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: ivk */
public final class ivk implements akox {
    private final bcaa a;
    private final bcaa b;

    public ivk(bcaa bcaa, bcaa bcaa2) {
        this.a = (bcaa) ivk.a(bcaa, 1);
        this.b = (bcaa) ivk.a(bcaa2, 2);
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
        return new ivg((Context) ivk.a((Context) this.a.get(), 1), (xci) ivk.a((xci) this.b.get(), 2), (ViewGroup) ivk.a(viewGroup, 3));
    }
}
