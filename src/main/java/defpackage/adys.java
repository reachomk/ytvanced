package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: adys */
public final class adys implements adxy {
    public adxy a = null;
    public final BlockingQueue b = new LinkedBlockingQueue();

    public final void a(adym adym) {
        adxy adxy = this.a;
        if (adxy == null) {
            try {
                this.b.put(adym);
                return;
            } catch (InterruptedException unused) {
                xtl.a("MDX.transport", "Could not queue local transport message.");
                return;
            }
        }
        adxy.a(adym);
    }
}
