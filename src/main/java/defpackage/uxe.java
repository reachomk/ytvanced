package defpackage;

import android.content.Context;
import java.nio.charset.Charset;

/* renamed from: uxe */
public final class uxe {
    public static final Charset a = Charset.forName("UTF-8");
    public final Context b;
    public final utc c;
    public final afpu d;
    public final azzp e = azzo.a(new azyo()).a();

    public uxe(Context context, utc utc, afpu afpu) {
        this.b = (Context) amqw.a((Object) context);
        this.c = (utc) amqw.a((Object) utc);
        this.d = (afpu) amqw.a((Object) afpu);
    }

    public static bqd a(int i, azyn azyn, byte[] bArr) {
        zj zjVar = new zj();
        for (String str : azyn.a()) {
            zjVar.put(str, azyn.b(str));
        }
        return new bqd(i, bArr, zjVar);
    }
}
