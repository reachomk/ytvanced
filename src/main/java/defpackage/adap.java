package defpackage;

import java.io.IOException;

/* renamed from: adap */
final class adap extends adam {
    public String c = "";

    private adap() {
    }

    public final void a(xho xho) {
        super.a(xho);
        if (xho.e() != null) {
            try {
                this.c = xho.e().f();
                return;
            } catch (IOException e) {
                this.b = e;
                return;
            }
        }
        xtl.a(adal.a, "Bind Channel: http response body is null");
    }

    /* synthetic */ adap(byte b) {
    }
}
