package defpackage;

import java.io.IOException;
import java.net.MulticastSocket;
import java.util.Locale;

/* renamed from: addy */
final class addy implements Runnable {
    private final /* synthetic */ addv a;

    addy(addv addv) {
        this.a = addv;
    }

    public final void run() {
        xhr b = this.a.b.b();
        if (b == null) {
            afpc.a(2, afpf.mdx, "failed to obtain a wifi network interface, not sending wol packet to device");
            return;
        }
        MulticastSocket a = this.a.c.a(b);
        if (a == null) {
            afpc.a(2, afpf.mdx, "failed to create a multicast socket, not sending wol packet to device");
            return;
        }
        try {
            a.send(this.a.f);
        } catch (IOException e) {
            xtl.a(addv.a, "Error sending Magic packet", e);
        } catch (NumberFormatException e2) {
            xtl.a(addv.a, String.format(Locale.US, "Error parsing mac address [%s]", new Object[]{this.a.d}), e2);
        }
        if (this.a.g) {
            this.a.e.postDelayed(this, 50);
        }
    }
}
