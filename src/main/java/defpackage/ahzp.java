package defpackage;

import android.content.Context;

/* renamed from: ahzp */
final class ahzp extends ahzo implements ahzf {
    public ahzp(Context context, ahys ahys, ajuh ajuh) {
        super(context, ahys, ajuh);
    }

    public final void a(ahzy ahzy) {
        super.a(ahzy);
        ahzi ahzi = this.c.s;
        if (ahzi != null) {
            aret aret = this.b.s;
            if (aret != null && aret.a == 55419609) {
                ahzy.j.setVisibility(8);
                ahzy.l.setVisibility(0);
                ahzi.a(this.b, this, ahzy.l);
                return;
            }
        }
        ahzy.j.setVisibility(0);
        ahzy.l.setVisibility(8);
    }

    public final void bA_() {
        this.d.h();
    }
}
