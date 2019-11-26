package defpackage;

import java.io.IOException;

/* renamed from: adrn */
final /* synthetic */ class adrn implements Runnable {
    private final adro a;

    adrn(adro adro) {
        this.a = adro;
    }

    public final void run() {
        adro adro = this.a;
        try {
            adzb adzb = adro.u;
            if (adzb != null) {
                adzb.a(adro.s);
            }
        } catch (IOException e) {
            xtl.a(adro.e, "Unable to start web socket server: ", e);
            afpc.a(2, afpf.mdx, "failed to start web socket server for local transport");
        }
    }
}
