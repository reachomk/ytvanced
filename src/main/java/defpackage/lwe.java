package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: lwe */
public final class lwe implements ejc {
    public final lwd a = new lwd();
    private final elh b;
    private final lwg c;
    private final boolean d;

    public lwe(Context context, elh elh, ijp ijp, zyw zyw) {
        this.b = elh;
        this.c = new lwg(ijp);
        this.d = foh.q(zyw);
        this.a.a(xss.f(context), xss.g(context));
    }

    public final void a(ejd ejd, ejd ejd2) {
        if (!ejd.equals(ejd2)) {
            Object obj = null;
            Object obj2 = ejd != ejd.WATCH_WHILE_FULLSCREEN ? null : 1;
            if (ejd2 == ejd.WATCH_WHILE_FULLSCREEN) {
                obj = 1;
            }
            if (obj2 != obj) {
                ekl j = ((elf) this.b.get()).j();
                View view = j.i;
                els els = null;
                if (obj != null) {
                    if (this.d) {
                        els = this.c;
                    }
                    j.a(els);
                    view.addOnLayoutChangeListener(this.a);
                    return;
                }
                j.a(null);
                view.removeOnLayoutChangeListener(this.a);
            }
        }
    }
}
