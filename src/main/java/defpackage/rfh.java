package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* renamed from: rfh */
public final class rfh {
    public final qui a;
    public final String b;
    public final String c;
    public volatile Method d = null;
    public final Class[] e;
    public final CountDownLatch f = new CountDownLatch(1);

    public rfh(qui qui, String str, String str2, Class... clsArr) {
        this.a = qui;
        this.b = str;
        this.c = str2;
        this.e = clsArr;
        this.a.b.submit(new rgi(this));
    }

    public final String a(byte[] bArr, String str) {
        qtk qtk = this.a.d;
        return new String(qtk.a(bArr, str), "UTF-8");
    }

    static {
        rfh.class.getSimpleName();
    }
}
