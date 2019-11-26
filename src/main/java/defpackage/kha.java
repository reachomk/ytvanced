package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: kha */
final class kha extends ilg {
    private final akoj h;

    public kha(Context context, akkq akkq, int i, flu flu, aaas aaas, akvo akvo, akvp akvp) {
        super(context, akkq, akvo, i, akvp);
        this.h = new akoj(aaas, (akou) flu);
    }

    public final View K_() {
        return this.c;
    }

    /* renamed from: a */
    public final void a_(akor akor, awjp awjp) {
        apxu apxu;
        arml arml;
        akoj akoj = this.h;
        acvx acvx = akor.a;
        arml arml2 = null;
        if ((awjp.a & 32) != 0) {
            apxu = awjp.i;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        akoj.a(acvx, apxu, akor.b());
        if ((awjp.a & 2) != 0) {
            arml = awjp.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        a(ajqy.a(arml));
        if ((awjp.a & 128) != 0) {
            arml = awjp.k;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        b(ajqy.a(arml));
        awkv awkv = awjp.d;
        if (awkv == null) {
            awkv = awkv.d;
        }
        awkx awkx = awkv.b;
        if (awkx == null) {
            awkx = awkx.c;
        }
        if ((awkx.a & 1) != 0) {
            awkv = awjp.d;
            if (awkv == null) {
                awkv = awkv.d;
            }
            awkx = awkv.b;
            if (awkx == null) {
                awkx = awkx.c;
            }
            aygk aygk = awkx.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
            a(aygk);
        } else if (awjp.e.size() > 0) {
            a((aygk) awjp.e.get(0));
        }
        if (awjp.f.size() > 0) {
            b(awjp.f);
            return;
        }
        if ((awjp.a & 16) != 0) {
            arml2 = awjp.h;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        CharSequence a = ajqy.a(arml2);
        a(a, a);
    }

    public final void a(akpb akpb) {
        super.a(akpb);
        this.h.a();
    }
}
