package defpackage;

import java.io.IOException;

/* renamed from: aebj */
public final class aebj {
    public static void a(xgq xgq, xhc xhc, aebm aebm) {
        xak.b();
        xho xho = null;
        try {
            xho = xgq.a(xhc);
            aebm.a(xho);
            if (!(xho == null || xho.e() == null)) {
                try {
                    xho.e().b();
                } catch (IOException unused) {
                }
            }
        } catch (IOException e) {
            aebm.a(e);
            if (!(xho == null || xho.e() == null)) {
                try {
                    xho.e().b();
                } catch (IOException unused2) {
                }
            }
        } catch (Throwable th) {
            if (!(xho == null || xho.e() == null)) {
                try {
                    xho.e().b();
                } catch (IOException unused3) {
                }
            }
        }
    }
}
