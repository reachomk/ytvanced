package defpackage;

import android.content.Context;

/* renamed from: uqi */
public final class uqi implements baqa {
    private final bcaa a;
    private final bcaa b;

    public uqi(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static afsa a(Context context, afmh afmh) {
        return (afsa) baqd.a(new afsi(context, afmh), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return uqi.a((Context) this.a.get(), (afmh) this.b.get());
    }
}
