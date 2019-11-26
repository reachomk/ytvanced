package defpackage;

import java.nio.charset.Charset;

/* renamed from: whm */
public final class whm {
    public static final Charset a = Charset.forName("UTF-8");
    public final utc b;
    public final afpu c;
    public final azzp d;
    public final azzn e;

    public whm(utc utc, afpu afpu, azzp azzp) {
        this.b = (utc) amqw.a((Object) utc);
        this.c = (afpu) amqw.a((Object) afpu);
        this.d = (azzp) amqw.a((Object) azzp);
        azzm a = azzn.a();
        this.e = a.a();
    }

    public static bqd a(int i, azyn azyn, byte[] bArr) {
        zj zjVar = new zj();
        for (String str : azyn.a()) {
            zjVar.put(str, azyn.b(str));
        }
        return new bqd(i, bArr, zjVar);
    }
}
