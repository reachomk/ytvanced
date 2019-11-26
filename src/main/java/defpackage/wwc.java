package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: wwc */
public final class wwc implements baqa {
    private final bcaa a;

    private wwc(bcaa bcaa) {
        this.a = bcaa;
    }

    public static wwc a(bcaa bcaa) {
        return new wwc(bcaa);
    }

    public static Handler a(Context context) {
        return (Handler) baqd.a(new Handler(context.getMainLooper()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return wwc.a((Context) this.a.get());
    }
}
