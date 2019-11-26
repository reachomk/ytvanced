package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: inn */
public final class inn extends ino {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    public inn(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = (bcaa) inn.a(bcaa, 1);
        this.b = (bcaa) inn.a(bcaa2, 2);
        this.c = (bcaa) inn.a(bcaa3, 3);
        this.d = (bcaa) inn.a(bcaa4, 4);
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
        return new inm((Context) inn.a((Context) this.a.get(), 1), (aaas) inn.a((aaas) this.b.get(), 2), (inh) inn.a((inh) this.c.get(), 3), (xsc) inn.a((xsc) this.d.get(), 4), viewGroup);
    }
}
