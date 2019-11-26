package defpackage;

import android.content.Context;

/* renamed from: jso */
public final class jso extends jrr implements vcy {
    public jso(akkq akkq, akvo akvo, aaas aaas, acvx acvx, Context context, zwj zwj, jse jse) {
        super(akkq, akvo, aaas, acvx, context, zwj, jse);
    }

    public final boolean a(aaga aaga, aakj aakj) {
        axkp axkp = null;
        ajxu ajxu = aakj != null ? aakj.a : null;
        if (ajxu != null) {
            ajxp ajxp = ajxu.v;
            if (ajxp != null) {
                axkp = ajxp.c;
            }
            this.e = axkp;
            axkp = this.e;
            if (axkp != null && axkp.f.size() > 0) {
                return true;
            }
        }
        return false;
    }

    public final int a(vow vow, boolean z) {
        vra vra = vow.b;
        axkp axkp = this.e;
        int i = 1;
        if (axkp != null) {
            int a = aqhe.a(axkp.o);
            if (a != 0) {
                i = a;
            }
        }
        return jst.a(vra, z, i);
    }
}
