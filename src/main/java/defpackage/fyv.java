package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.ViewGroup;

/* renamed from: fyv */
public final class fyv implements akox {
    private final bcaa a;
    private final bcaa b;

    public fyv(bcaa bcaa, bcaa bcaa2) {
        this.a = (bcaa) fyv.a(bcaa, 1);
        this.b = (bcaa) fyv.a(bcaa2, 2);
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
        return new fyr((Context) fyv.a((Context) this.a.get(), 1), (SharedPreferences) fyv.a((SharedPreferences) this.b.get(), 2), (ViewGroup) fyv.a(viewGroup, 3));
    }
}
