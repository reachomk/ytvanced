package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: vbo */
final class vbo implements OnClickListener {
    private final /* synthetic */ vbp a;

    vbo(vbp vbp) {
        this.a = vbp;
    }

    public final void onClick(View view) {
        vbp vbp = this.a;
        amqw.a(vbp.b(vbp.a));
        amqw.a(vbp.ae);
        amqw.a(vbp.ad);
        vbp.b.b();
        uzt uzt = new uzt(vbp, vbp.ae);
        atfx atfx = vbp.aa;
        String str = vbp.ab;
        String str2 = vbp.ac;
        avwp avwp = vbp.a.e;
        if (avwp == null) {
            avwp = avwp.c;
        }
        aphg aphg = avwp.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        apxu apxu = aphg.l;
        if (apxu == null) {
            apxu = apxu.d;
        }
        uzt.a(atfx, str, str2, apxu);
        vbp.c.setEnabled(false);
        vbp.Z.setEnabled(false);
    }
}
