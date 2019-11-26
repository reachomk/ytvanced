package defpackage;

import android.content.Context;
import android.view.ViewStub;

/* renamed from: fas */
public final class fas {
    private final bcaa a;

    public fas(bcaa bcaa) {
        this.a = (bcaa) fas.a((Object) bcaa, 1);
    }

    public final fap a(Context context, ViewStub viewStub) {
        return new fap((akvp) fas.a((akvp) this.a.get(), 1), (Context) fas.a((Object) context, 2), (ViewStub) fas.a((Object) viewStub, 3));
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
