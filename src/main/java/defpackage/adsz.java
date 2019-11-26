package defpackage;

import java.io.IOException;

/* renamed from: adsz */
final /* synthetic */ class adsz implements Runnable {
    private final adsw a;

    adsz(adsw adsw) {
        this.a = adsw;
    }

    public final void run() {
        adsw adsw = this.a;
        try {
            adsw.l.a(adsw.u);
        } catch (IOException e) {
            xtl.a(adsw.e, "Failed to start Web Socket Server", e);
        }
    }
}
