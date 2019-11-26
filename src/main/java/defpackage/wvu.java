package defpackage;

import android.app.Application;
import android.content.Context;

/* renamed from: wvu */
public final class wvu implements baqa {
    private final bcaa a;

    private wvu(bcaa bcaa) {
        this.a = bcaa;
    }

    public static wvu a(bcaa bcaa) {
        return new wvu(bcaa);
    }

    public static Application a(Context context) {
        return (Application) baqd.a(xsg.a(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return wvu.a((Context) this.a.get());
    }
}
