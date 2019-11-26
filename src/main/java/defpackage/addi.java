package defpackage;

import android.os.Handler;
import org.json.JSONException;

/* renamed from: addi */
final class addi implements adyu {
    private final addz a;
    private final Handler b;
    private final String c;

    addi(addz addz, Handler handler, String str) {
        this.a = addz;
        this.b = handler;
        this.c = str;
    }

    public final void a_(adym adym) {
        if (this.b.hasMessages(1)) {
            try {
                adio b = adio.h().a(new adjb(adym.b().getString("screenId"))).a(this.c).a(adix.DIAL).b();
                this.b.removeMessages(1);
                this.a.a(b);
            } catch (JSONException unused) {
                String.format("No screen ID on %s: %s", new Object[]{adiv.MDX_SESSION_STATUS.F, adym});
            }
        }
    }
}
