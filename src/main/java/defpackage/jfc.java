package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: jfc */
public final class jfc implements akox {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    public jfc(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) jfc.a(bcaa, 1);
        this.b = (bcaa) jfc.a(bcaa2, 2);
        this.c = (bcaa) jfc.a(bcaa3, 3);
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
        return new jet((Context) jfc.a((Context) this.a.get(), 1), (flu) jfc.a((flu) this.b.get(), 2), (mlb) jfc.a((mlb) this.c.get(), 3), viewGroup);
    }
}
