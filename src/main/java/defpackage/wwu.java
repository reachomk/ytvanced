package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: wwu */
public final class wwu implements baqa {
    private final bcaa a;

    private wwu(bcaa bcaa) {
        this.a = bcaa;
    }

    public static wwu a(bcaa bcaa) {
        return new wwu(bcaa);
    }

    public static PackageManager a(Context context) {
        return (PackageManager) baqd.a(context.getPackageManager(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return wwu.a((Context) this.a.get());
    }
}
