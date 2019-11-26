package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: kkm */
public final class kkm implements kkh {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;

    public kkm(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = (bcaa) kkm.a(bcaa, 1);
        this.b = (bcaa) kkm.a(bcaa2, 2);
        this.c = (bcaa) kkm.a(bcaa3, 3);
        this.d = (bcaa) kkm.a(bcaa4, 4);
        this.e = (bcaa) kkm.a(bcaa5, 5);
    }

    public static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }

    public final /* synthetic */ kkg a(ViewGroup viewGroup) {
        return new kkk((aaas) kkm.a((aaas) this.a.get(), 1), (akvp) kkm.a((akvp) this.b.get(), 2), (Context) kkm.a((Context) this.c.get(), 3), (xci) kkm.a((xci) this.d.get(), 4), (aadw) kkm.a((aadw) this.e.get(), 5), (ViewGroup) kkm.a(viewGroup, 6));
    }
}
