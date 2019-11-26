package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: aldt */
public final class aldt implements akox {
    private final bcaa a;
    private final bcaa b;

    public aldt(bcaa bcaa, bcaa bcaa2) {
        this.a = (bcaa) aldt.a(bcaa, 1);
        this.b = (bcaa) aldt.a(bcaa2, 2);
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
        Context context = (Context) aldt.a((Context) this.a.get(), 1);
        akvp akvp = (akvp) aldt.a((akvp) this.b.get(), 2);
        aldt.a(viewGroup, 3);
        return new aldo(context, akvp);
    }
}
