package defpackage;

import android.os.Build.VERSION;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: afnp */
public class afnp implements afnw {
    public Object a(xho xho) {
        afnp.b(xho);
        return a(xho.e());
    }

    /* Access modifiers changed, original: protected */
    public Object a(xhn xhn) {
        if (xhn != null) {
            return a(xhn.a());
        }
        throw new IOException("Empty response body");
    }

    /* Access modifiers changed, original: protected */
    public Object a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        return null;
    }

    protected static void b(xho xho) {
        if (xho.b() >= 300) {
            Throwable xhp = new xhp(xho.b(), xho.c());
            try {
                if (xho.e() != null) {
                    xho.e().b();
                }
            } catch (IOException e) {
                if (VERSION.SDK_INT >= 19) {
                    ankx.a(xhp, e);
                }
            }
            throw xhp;
        }
    }
}
