package defpackage;

import android.content.Context;

/* renamed from: wid */
public final class wid extends wib implements wmc {
    private final wlx g;

    public wid(Context context, akkq akkq, akvz akvz, akoe akoe, wda wda, wlx wlx) {
        super(context, akkq, akvz, akoe, wda);
        this.g = (wlx) amqw.a((Object) wlx);
    }

    public final void a(akpb akpb) {
        super.b();
        this.g.a((wmc) this);
    }

    /* JADX WARNING: Missing block: B:5:0x000b, code skipped:
            if (r2 != 3) goto L_0x0012;
     */
    private final void a(defpackage.apzc r2) {
        /*
        r1 = this;
        r2 = r2.ordinal();
        r0 = 1;
        if (r2 == r0) goto L_0x0013;
    L_0x0007:
        r0 = 2;
        if (r2 == r0) goto L_0x000e;
    L_0x000a:
        r0 = 3;
        if (r2 == r0) goto L_0x0013;
    L_0x000d:
        goto L_0x0012;
    L_0x000e:
        r2 = 0;
        r1.a(r2);
    L_0x0012:
        return;
    L_0x0013:
        r2 = 8;
        r1.a(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wid.a(apzc):void");
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        ajsl ajsl = (ajsl) obj;
        this.g.b = akor;
        a(ajqy.a(ajsl.b), ajqy.a(ajsl.c));
        aqbg aqbg = ajsl.d;
        if (aqbg != null) {
            axqn axqn;
            if (aqbg.a == 76818770) {
                axqn = (axqn) aqbg.b;
            } else {
                axqn = axqn.f;
            }
            a(akor, axqn);
        }
        ajsm ajsm = ajsl.a;
        if (ajsm != null) {
            ajsr ajsr = ajsm.a;
            if (ajsr != null) {
                wei wei = (wei) akor.a("commentThreadMutator");
                ajsn ajsn = null;
                if (!(wei == null || wei.b().a == null)) {
                    ajsn = wei.b().a.a;
                }
                if (ajsn != null) {
                    ajrn ajrn = ajsn.k;
                    if (!(ajrn == null || ajrn.d == null)) {
                        a(ajsr.b, ajsr.g, ajqy.a(ajsr.c), new wif(this, ajsr, wei, ajsn));
                        a(this.g.a(ajsn, true));
                        this.g.a(wlx.b(ajsn.g), (wmc) this);
                        return;
                    }
                }
                a(ajsr.b, ajsr.g, ajqy.a(ajsr.c), new wic(this, ajsr, wei));
            }
        }
    }
}
