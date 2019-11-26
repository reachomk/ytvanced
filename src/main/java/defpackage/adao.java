package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: adao */
final class adao implements aebm {
    public boolean a = true;

    private adao() {
    }

    public final void a(xho xho) {
        if (xho.e() != null) {
            try {
                InputStream a = xho.e().a();
                if (a != null) {
                    try {
                        String a2 = adao.a(a);
                        String a3;
                        String str;
                        if ("11111".equals(a2)) {
                            long currentTimeMillis = System.currentTimeMillis();
                            a3 = adao.a(a);
                            if ("2".equals(a3)) {
                                boolean z = System.currentTimeMillis() - currentTimeMillis < 200;
                                if (z) {
                                    xtl.c(adal.a, "behind buffering proxy: 2nd chunk received too soon");
                                }
                                this.a = z;
                                try {
                                    a.close();
                                } catch (IOException unused) {
                                }
                                return;
                            }
                            a2 = adal.a;
                            str = "behind buffering proxy: unexpected second chunk in test response: ";
                            a3 = String.valueOf(a3);
                            xtl.b(a2, a3.length() == 0 ? new String(str) : str.concat(a3));
                        } else if ("111112".equals(a2)) {
                            xtl.c(adal.a, "behind buffering proxy: received both chunks at once.");
                        } else {
                            str = adal.a;
                            a3 = "behind buffering proxy: unexpected first chunk in test response: ";
                            a2 = String.valueOf(a2);
                            if (a2.length() == 0) {
                                a2 = new String(a3);
                            } else {
                                a2 = a3.concat(a2);
                            }
                            xtl.b(str, a2);
                        }
                        return;
                    } finally {
                        try {
                            a.close();
                        } catch (IOException unused2) {
                        }
                    }
                } else {
                    xtl.a(adal.a, "Input stream of http response is null");
                    return;
                }
            } catch (IOException e) {
                xtl.a(adal.a, "getStream failed", e);
                return;
            }
        }
        xtl.b(adal.a, "Http response's body for buffering proxy test is null");
    }

    public final void a(IOException iOException) {
        xtl.a(adal.a, "Failed testing for buffering proxy", (Throwable) iOException);
    }

    private static String a(InputStream inputStream) {
        String str = "";
        byte[] bArr = new byte[256];
        try {
            int read = inputStream.read(bArr);
            if (read > 0) {
                try {
                    return new String(bArr, 0, read, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    throw new IllegalStateException(e);
                }
            }
            xtl.a(adal.a, "Unexpected test response: no data for chunk.");
            return str;
        } catch (IOException e2) {
            xtl.a(adal.a, "Failed reading test chunk", e2);
            return str;
        }
    }

    /* synthetic */ adao(byte b) {
    }
}
