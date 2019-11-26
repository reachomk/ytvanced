package defpackage;

import android.app.Activity;

/* renamed from: inh */
public final class inh {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    public inh(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) inh.a(bcaa, 1);
        this.b = (bcaa) inh.a(bcaa2, 2);
        this.c = (bcaa) inh.a(bcaa3, 3);
    }

    public final inb a(apr apr, apr apr2, int i) {
        Activity activity = (Activity) inh.a((Activity) this.a.get(), 1);
        akkq akkq = (akkq) inh.a((akkq) this.b.get(), 2);
        inh.a((xop) this.c.get(), 3);
        return new inb(activity, akkq, (apr) inh.a(apr, 4), (apr) inh.a(apr2, 5), i);
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
