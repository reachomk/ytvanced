package defpackage;

import android.app.Activity;

/* renamed from: hih */
public final class hih {
    private final bcaa a;

    public hih(bcaa bcaa) {
        this.a = (bcaa) hih.a(bcaa, 1);
    }

    public final hia a(hic hic) {
        return new hia((Activity) hih.a((Activity) this.a.get(), 1), (hic) hih.a(hic, 2));
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
