package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

/* renamed from: snl */
final class snl extends cma {
    @cue(a = 13)
    public swf a;
    @cue(a = 13)
    public baow b;
    @cue(a = 13)
    public sxd c;
    @cue(a = 13)
    public syl d;

    public snl() {
        super("EditableTextFlat");
    }

    /* Access modifiers changed, original: protected|final */
    public final cma b(cmg cmg) {
        baow baow = this.b;
        syl syl = this.d;
        sxd sxd = this.c;
        swf swf = this.a;
        cys i = cyq.i(cmg);
        if (baow.a() != null) {
            for (int i2 = 0; i2 < baow.a().f(); i2++) {
                bapn h = baow.a().h(i2);
                if (h.a() == 0) {
                    i.u(h.d());
                    break;
                }
            }
            i.c(spz.a(cmg, baow.a(), swf, syl, sxd));
        }
        if (baow.b() != null) {
            i.b(spz.a(cmg, baow.b(), swf, syl, sxd));
        }
        int a = baow.a(16);
        if (!(a == 0 || baow.b.get(a + baow.a) == (byte) 0)) {
            i.a();
        }
        if (!(baow.c() == null && baow.d() == null)) {
            i.b(cmm.a(cmg, -1974694341, new Object[]{cmg}));
        }
        if (!(baow.e() == null && baow.f() == null)) {
            i.f(cmm.a(cmg, 378110312, new Object[]{cmg}));
        }
        return (cyq) i.c();
    }

    public final Object a(coj coj, Object obj) {
        int i = coj.b;
        cor cor;
        snl snl;
        baow baow;
        swf swf;
        if (i == -1974694341) {
            coq coq = (coq) obj;
            cor = coj.a;
            View view = coq.a;
            boolean z = coq.b;
            snl = (snl) cor;
            baow = snl.b;
            swf = snl.a;
            if (z) {
                if (baow.c() != null) {
                    swf.a(syt.a(baow.c()), snn.a(view)).c();
                }
            } else if (baow.d() != null) {
                swf.a(syt.a(baow.d()), snn.a(view)).c();
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
            snl = (snl) cor;
            baow = snl.b;
            swf = snl.a;
            if (baow.e() != null) {
                swf.a(syt.a(baow.e()), snn.a(editText)).c();
            }
            if (TextUtils.isEmpty(str) && baow.f() != null) {
                swf.a(syt.a(baow.f()), snn.a(editText)).c();
            }
            return null;
        }
    }
}
