package defpackage;

import android.content.Context;
import android.widget.TextView;

/* renamed from: jnz */
public final class jnz {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    public jnz(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) jnz.a(bcaa, 1);
        this.b = (bcaa) jnz.a(bcaa2, 2);
        this.c = (bcaa) jnz.a(bcaa3, 3);
    }

    public final jnx a(TextView textView) {
        return new jnx((Context) jnz.a((Context) this.a.get(), 1), (fmx) jnz.a((fmx) this.b.get(), 2), (akyz) jnz.a((akyz) this.c.get(), 3), (TextView) jnz.a(textView, 4));
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
