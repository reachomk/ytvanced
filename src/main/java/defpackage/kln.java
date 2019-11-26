package defpackage;

import android.content.Context;
import android.view.ViewStub;

/* renamed from: kln */
public final class kln {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    public kln(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) kln.a(bcaa, 1);
        this.b = (bcaa) kln.a(bcaa2, 2);
        this.c = (bcaa) kln.a(bcaa3, 3);
    }

    public final klk a(ViewStub viewStub) {
        return new klk((ViewStub) kln.a(viewStub, 1), (Context) kln.a((Context) this.a.get(), 2), (aaas) kln.a((aaas) this.b.get(), 3), (akvp) kln.a((akvp) this.c.get(), 4));
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
