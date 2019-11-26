package defpackage;

import java.io.UnsupportedEncodingException;

/* renamed from: rgi */
final class rgi implements Runnable {
    private final /* synthetic */ rfh a;

    rgi(rfh rfh) {
        this.a = rfh;
    }

    public final void run() {
        rfh rfh = this.a;
        try {
            qui qui = rfh.a;
            Class loadClass = qui.c.loadClass(rfh.a(qui.e, rfh.b));
            if (loadClass != null) {
                rfh.d = loadClass.getMethod(rfh.a(rfh.a.e, rfh.c), rfh.e);
                if (rfh.d == null) {
                    rfh.f.countDown();
                } else {
                    rfh.f.countDown();
                }
            }
        } catch (qtj unused) {
        } catch (UnsupportedEncodingException unused2) {
        } catch (ClassNotFoundException unused3) {
        } catch (NoSuchMethodException unused4) {
        } catch (NullPointerException unused5) {
        } finally {
            rfh.f.countDown();
        }
    }
}
