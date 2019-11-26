package defpackage;

import android.content.Context;

/* renamed from: kxt */
public final class kxt {
    private final bcaa a;
    private final bcaa b;

    public kxt(bcaa bcaa, bcaa bcaa2) {
        this.a = (bcaa) kxt.a((Object) bcaa, 1);
        this.b = (bcaa) kxt.a((Object) bcaa2, 2);
    }

    /* Access modifiers changed, original: final */
    public final kxq a(Context context, int i) {
        return new kxq((kxn) kxt.a((kxn) this.a.get(), 1), (kxg) kxt.a((kxg) this.b.get(), 2), (Context) kxt.a((Object) context, 3), i);
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
