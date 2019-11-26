package defpackage;

import android.content.Context;

/* renamed from: aflf */
public final class aflf implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private aflf(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static aflf a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new aflf(bcaa, bcaa2, bcaa3);
    }

    public static afoj a(Context context, amur amur, afmv afmv) {
        return (afoj) baqd.a(new afoj(context.getSharedPreferences("DelayedEventMetricsStore.prefs", 0), amur, afmv.c.c()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return aflf.a((Context) this.a.get(), (amur) this.b.get(), (afmv) this.c.get());
    }
}
