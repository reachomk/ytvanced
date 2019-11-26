package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: wws */
public final class wws extends wxo {
    public bapu a;
    public bapu b;
    public bapu c;
    public bapu d;
    public bapu e;
    public bapu f;
    public xci g;
    public Executor h;

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        this.b.get();
        xml xml = (xml) this.c.get();
        xml.c.schedule(new xmo(xml), 10000, TimeUnit.MILLISECONDS);
        this.g.a(this.d.get());
        xax xax = (xax) this.f.get();
        aosl e = xax.e();
        if (e != null) {
            aosp aosp = e.b;
            if (aosp == null) {
                aosp = aosp.c;
            }
            if ((aosp.a & 1) != 0) {
                aosp aosp2 = xax.e().b;
                if (aosp2 == null) {
                    aosp2 = aosp.c;
                }
                aoth aoth = aosp2.b;
                if (aoth == null) {
                    aoth = aoth.k;
                }
                if (aoth.e) {
                    HttpsURLConnection.setDefaultSSLSocketFactory(new xhz(HttpsURLConnection.getDefaultSSLSocketFactory()));
                }
            }
        }
        if (((Boolean) this.a.get()).booleanValue()) {
            this.h.execute(new wwv(this));
        }
    }
}
