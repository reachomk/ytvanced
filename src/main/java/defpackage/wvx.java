package defpackage;

import android.content.Context;

/* renamed from: wvx */
public final class wvx implements baqa {
    private final bcaa a;
    private final bcaa b;

    private wvx(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static wvx a(bcaa bcaa, bcaa bcaa2) {
        return new wvx(bcaa, bcaa2);
    }

    public static String a(Context context, amqp amqp) {
        return (String) baqd.a((String) amqp.a(new wvt(context)), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return wvx.a((Context) this.a.get(), (amqp) this.b.get());
    }
}
