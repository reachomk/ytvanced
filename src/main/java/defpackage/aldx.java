package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: aldx */
public final class aldx implements akox {
    private final bcaa a;

    public aldx(bcaa bcaa) {
        this.a = (bcaa) aldx.a(bcaa, 1);
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
        Context context = (Context) aldx.a((Context) this.a.get(), 1);
        aldx.a(viewGroup, 2);
        return new alds(context);
    }
}
