package defpackage;

import android.content.Context;

/* renamed from: wwd */
public final class wwd implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    private wwd(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
    }

    public static wwd a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        return new wwd(bcaa, bcaa2, bcaa3, bcaa4);
    }

    public static xml a(Context context, bcaa bcaa, bcaa bcaa2, amqp amqp) {
        return (xml) baqd.a((xml) amqp.a(new wvv(context, bcaa, bcaa2)), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return wwd.a((Context) this.a.get(), this.b, this.c, (amqp) this.d.get());
    }
}
