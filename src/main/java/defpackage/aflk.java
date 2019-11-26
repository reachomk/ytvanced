package defpackage;

import android.content.Context;

/* renamed from: aflk */
public final class aflk implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private aflk(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static aflk a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new aflk(bcaa, bcaa2, bcaa3);
    }

    public static xbk a(Context context, String str, amqp amqp) {
        String str2 = "ScheduledTaskProto";
        return (xbk) baqd.a(new xbk(context, str, amul.a(new xbq(str2), new xbq("OfflineHttpRequestProto"), new xbn(str2)), ((Integer) amqp.a(Integer.valueOf(0))).intValue()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return aflk.a((Context) this.a.get(), (String) this.b.get(), (amqp) this.c.get());
    }
}
