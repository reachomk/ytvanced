package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: jen */
public final class jen implements akox {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;

    public jen(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = (bcaa) jen.a(bcaa, 1);
        this.b = (bcaa) jen.a(bcaa2, 2);
        this.c = (bcaa) jen.a(bcaa3, 3);
        this.d = (bcaa) jen.a(bcaa4, 4);
        this.e = (bcaa) jen.a(bcaa5, 5);
    }

    /* renamed from: b */
    public final jed a(ViewGroup viewGroup) {
        return new jed((Context) jen.a((Context) this.a.get(), 1), (flu) jen.a((flu) this.b.get(), 2), (aaas) jen.a((aaas) this.c.get(), 3), (jdq) jen.a((jdq) this.d.get(), 4), (aldg) jen.a((aldg) this.e.get(), 5), viewGroup);
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
