package defpackage;

import android.content.SharedPreferences;

/* renamed from: aecu */
public final class aecu implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private aecu(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static aecu a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new aecu(bcaa, bcaa2, bcaa3);
    }

    public static afhh a(amqp amqp, xsf xsf, SharedPreferences sharedPreferences) {
        return (afhh) baqd.a((afhh) amqp.a(new aecr(xsf, sharedPreferences)), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return aecu.a((amqp) this.a.get(), (xsf) this.b.get(), (SharedPreferences) this.c.get());
    }
}
