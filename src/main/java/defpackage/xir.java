package defpackage;

import java.io.InputStream;

/* renamed from: xir */
final class xir extends xip {
    protected xir(xjf xjf, boolean z, xiw xiw, xji xji) {
        super(xjf, z, xiw, xji);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object a(bclb bclb, InputStream inputStream) {
        xgx b = xgy.b();
        b.a(bclb.d());
        xgy a = b.a();
        xfq xfq = new xfq();
        xfq.b = Integer.valueOf(bclb.b());
        String c = bclb.c();
        if (c != null) {
            xfq.c = c;
            xgx b2 = xgy.b();
            b2.a(bclb.d());
            xgy a2 = b2.a();
            if (a2 != null) {
                xfq.d = a2;
                String f = bclb.f();
                if (f == null || f.isEmpty()) {
                    f = "HTTP/1.1";
                }
                xfq.a = f;
                if (inputStream != null) {
                    f = a.a("Content-Type");
                    c = a.a("content-encoding");
                    String str = "-1";
                    if ((c == null || "identity".equals(c)) && a.a("transfer-encoding") == null) {
                        str = a.a("content-length");
                    }
                    xhn xhn = new xhn(f, str);
                    xhn.b = inputStream;
                    xfq.e = xhn;
                } else {
                    xfq.e = xhn.a;
                }
                f = "";
                if (xfq.a == null) {
                    f = f.concat(" protocol");
                }
                if (xfq.b == null) {
                    f = String.valueOf(f).concat(" statusCode");
                }
                if (xfq.c == null) {
                    f = String.valueOf(f).concat(" reasonPhrase");
                }
                if (xfq.d == null) {
                    f = String.valueOf(f).concat(" headers");
                }
                if (f.isEmpty()) {
                    return new xfn(xfq.a, xfq.b.intValue(), xfq.c, xfq.d, xfq.e);
                }
                String str2 = "Missing required properties:";
                throw new IllegalStateException(f.length() == 0 ? new String(str2) : str2.concat(f));
            }
            throw new NullPointerException("Null headers");
        }
        throw new NullPointerException("Null reasonPhrase");
    }
}
