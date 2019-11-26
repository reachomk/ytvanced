package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: adar */
final class adar extends adam {
    private final adaj c;

    adar(adaj adaj) {
        this.c = adaj;
    }

    public final void a(xho xho) {
        super.a(xho);
        if (xho.e() != null) {
            try {
                InputStream a = xho.e().a();
                if (a != null) {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        try {
                            int read = a.read(bArr);
                            if (read > 0) {
                                try {
                                    this.c.a(new String(bArr, 0, read, "UTF-8").toCharArray());
                                } catch (UnsupportedEncodingException unused) {
                                    throw new IllegalStateException("This application needs UTF-8 support in order to run");
                                }
                            }
                            return;
                        } catch (IOException e) {
                            this.b = e;
                            return;
                        }
                    }
                }
                xtl.a(adal.a, "input stream is null");
                return;
            } catch (IOException e2) {
                this.b = e2;
                return;
            }
        }
        xtl.a(adal.a, "Hanging get's response body is null");
    }
}
