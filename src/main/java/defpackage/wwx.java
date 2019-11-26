package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;

/* renamed from: wwx */
public final class wwx implements baqa {
    private final bcaa a;

    private wwx(bcaa bcaa) {
        this.a = bcaa;
    }

    public static wwx a(bcaa bcaa) {
        return new wwx(bcaa);
    }

    public static TelephonyManager a(Context context) {
        return (TelephonyManager) baqd.a((TelephonyManager) context.getSystemService("phone"), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return wwx.a((Context) this.a.get());
    }
}
