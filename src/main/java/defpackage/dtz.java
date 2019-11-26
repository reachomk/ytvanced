package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: dtz */
public final class dtz implements baqa {
    private final bcaa a;
    private final bcaa b;

    public dtz(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public final /* synthetic */ Object get() {
        Object a;
        Context context = (Context) this.a.get();
        String str = (String) this.b.get();
        if (TextUtils.isEmpty(str)) {
            a = xul.a(context, context.getPackageManager());
        } else {
            a = new xwa(str);
        }
        return (xwa) baqd.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
