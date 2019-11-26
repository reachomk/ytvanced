package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: kez */
public final class kez implements akox {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    public kez(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) kez.a(bcaa, 1);
        this.b = (bcaa) kez.a(bcaa2, 2);
        this.c = (bcaa) kez.a(bcaa3, 3);
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
        return new kew((aknn) kez.a((aknn) this.a.get(), 1), (Context) kez.a((Context) this.b.get(), 2), (zzl) kez.a((zzl) this.c.get(), 3));
    }
}
