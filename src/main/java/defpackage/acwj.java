package defpackage;

import android.view.View;

/* renamed from: acwj */
public class acwj extends aaaw {
    private final aaas b;
    private final apxx c;
    private final String d;

    public acwj(aaas aaas, apxu apxu, String str) {
        apxx apxx = null;
        super(aaas, null, apxu, false);
        this.b = aaas;
        if (apxu != null) {
            apxx = (apxx) ((anxo) apxu.toBuilder());
        }
        this.c = apxx;
        this.d = str;
    }

    public final void onClick(View view) {
        if (this.c != null) {
            if (this.d != null) {
                avjh avjh = (avjh) avjf.h.createBuilder();
                avjh.a(this.d);
                this.c.a(avjd.b, (avjf) ((anxl) avjh.build()));
            }
            this.b.a((apxu) ((anxl) this.c.build()), null);
        }
    }
}
