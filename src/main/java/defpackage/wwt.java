package defpackage;

import android.content.Context;
import android.net.wifi.WifiManager;

/* renamed from: wwt */
public final class wwt implements baqa {
    private final bcaa a;

    private wwt(bcaa bcaa) {
        this.a = bcaa;
    }

    public static wwt a(bcaa bcaa) {
        return new wwt(bcaa);
    }

    public static WifiManager a(Context context) {
        return (WifiManager) baqd.a((WifiManager) context.getSystemService("wifi"), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return wwt.a((Context) this.a.get());
    }
}
