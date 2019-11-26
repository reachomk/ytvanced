package defpackage;

import android.view.View;

/* renamed from: akyz */
public final class akyz {
    private final bcaa a;
    private final bcaa b;

    public akyz(bcaa bcaa, bcaa bcaa2) {
        this.a = (bcaa) akyz.a(bcaa, 1);
        this.b = (bcaa) akyz.a(bcaa2, 2);
    }

    public final akyu a(View view) {
        return new akyu((aaas) akyz.a((aaas) this.a.get(), 1), (akpi) this.b.get(), (View) akyz.a(view, 3));
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
