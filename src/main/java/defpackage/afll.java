package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: afll */
public final class afll implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private afll(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static afll a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new afll(bcaa, bcaa2, bcaa3);
    }

    public static xbp a(Context context, String str, amqp amqp) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new xbq("DelayedEventProto"));
        return (xbp) baqd.a(new xbk(context, str, arrayList, ((Integer) amqp.a(Integer.valueOf(0))).intValue()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return afll.a((Context) this.a.get(), (String) this.b.get(), (amqp) this.c.get());
    }
}
