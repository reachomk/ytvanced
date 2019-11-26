package defpackage;

import android.content.Context;

/* renamed from: wwb */
public final class wwb implements baqa {
    private final bcaa a;
    private final bcaa b;

    private wwb(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static wwb a(bcaa bcaa, bcaa bcaa2) {
        return new wwb(bcaa, bcaa2);
    }

    public static String a(Context context, amqp amqp) {
        return (String) baqd.a((String) amqp.a(new wvs(context)), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return wwb.a((Context) this.a.get(), (amqp) this.b.get());
    }
}
