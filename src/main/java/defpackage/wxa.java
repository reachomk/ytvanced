package defpackage;

import android.content.Context;

/* renamed from: wxa */
public final class wxa implements baqa {
    private final bcaa a;

    public wxa(bcaa bcaa) {
        this.a = bcaa;
    }

    public final /* synthetic */ Object get() {
        Context context = (Context) this.a.get();
        return (xwa) baqd.a(xul.a(context, context.getPackageManager()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
