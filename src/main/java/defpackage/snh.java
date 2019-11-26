package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

/* renamed from: snh */
final class snh extends cma {
    @cue(a = 13)
    public swf a;
    @cue(a = 13)
    public bdha b;
    @cue(a = 13)
    public sxd c;
    @cue(a = 13)
    public syl d;

    public snh() {
        super("EditableText");
    }

    /* Access modifiers changed, original: protected|final */
    public final cma b(cmg cmg) {
        bdha bdha = this.b;
        syl syl = this.d;
        sxd sxd = this.c;
        swf swf = this.a;
        cys i = cyq.i(cmg);
        bdgf bdgf = bdha.b;
        if (bdgf != null) {
            for (bdgh bdgh : bdgf.f) {
                if (bdgh.b == 0) {
                    i.u(bdgh.e);
                    break;
                }
            }
            i.c(sqd.a(cmg, bdha.b, swf, syl, sxd));
        }
        bdgf = bdha.c;
        if (bdgf != null) {
            i.b(sqd.a(cmg, bdgf, swf, syl, sxd));
        }
        if (bdha.h) {
            i.a();
        }
        if (!(bdha.d == null && bdha.e == null)) {
            i.b(cmm.a(cmg, -1974694341, new Object[]{cmg}));
        }
        if (!(bdha.f == null && bdha.g == null)) {
            i.f(cmm.a(cmg, 378110312, new Object[]{cmg}));
        }
        return (cyq) i.c();
    }

    public final Object a(coj coj, Object obj) {
        int i = coj.b;
        cor cor;
        snh snh;
        bdha bdha;
        swf swf;
        azsr azsr;
        if (i == -1974694341) {
            coq coq = (coq) obj;
            cor = coj.a;
            View view = coq.a;
            boolean z = coq.b;
            snh = (snh) cor;
            bdha = snh.b;
            swf = snh.a;
            if (z) {
                azsr = bdha.d;
                if (azsr != null) {
                    swf.a(azsr.toByteArray(), snq.a(view)).c();
                }
            } else {
                azsr = bdha.e;
                if (azsr != null) {
                    swf.a(azsr.toByteArray(), snq.a(view)).c();
                }
            }
            return null;
        } else if (i == -1048037474) {
            cmm.a((cmg) coj.c[0], (coi) obj);
            return null;
        } else if (i != 378110312) {
            return null;
        } else {
            dcq dcq = (dcq) obj;
            cor = coj.a;
            EditText editText = dcq.a;
            String str = dcq.b;
            snh = (snh) cor;
            bdha = snh.b;
            swf = snh.a;
            azsr azsr2 = bdha.f;
            if (azsr2 != null) {
                swf.a(azsr2.toByteArray(), snq.a(editText)).c();
            }
            if (TextUtils.isEmpty(str)) {
                azsr = bdha.g;
                if (azsr != null) {
                    swf.a(azsr.toByteArray(), snq.a(editText)).c();
                }
            }
            return null;
        }
    }
}
