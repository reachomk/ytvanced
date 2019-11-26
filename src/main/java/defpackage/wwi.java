package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* renamed from: wwi */
public final class wwi implements baqa {
    private final bcaa a;

    private wwi(bcaa bcaa) {
        this.a = bcaa;
    }

    public static wwi a(bcaa bcaa) {
        return new wwi(bcaa);
    }

    public final /* synthetic */ Object get() {
        return (ConnectivityManager) baqd.a((ConnectivityManager) ((Context) this.a.get()).getSystemService("connectivity"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
