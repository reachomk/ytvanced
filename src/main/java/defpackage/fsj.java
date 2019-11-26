package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerLayout;

/* renamed from: fsj */
public final class fsj extends xxp implements xcp {
    private final aizy N;
    private final fsu O;
    public final jvf a;
    public final fso b;

    public fsj(Context context, xsc xsc, xzm xzm, afxb afxb, xci xci, akkq akkq, eid eid, elv elv, ffw ffw, gal gal, hdd hdd, xpw xpw, xoi xoi, akpe akpe, yfg yfg, aaas aaas, ycu ycu, jvf jvf, fgc fgc, fsc fsc, akmx akmx, jtw jtw, aizy aizy, xwr xwr, zbe zbe, eif eif, lwc lwc, InlinePlayerLayout inlinePlayerLayout, allb allb, xzn xzn, Handler handler, afve afve, zaz zaz, fsu fsu, acvx acvx, apxu apxu, yfh yfh, xyb xyb, zcq zcq, xyv xyv) {
        xci xci2 = xci;
        akkq akkq2 = akkq;
        eid eid2 = eid;
        elv elv2 = elv;
        ffw ffw2 = ffw;
        gal gal2 = gal;
        hdd hdd2 = hdd;
        xpw xpw2 = xpw;
        aaas aaas2 = aaas;
        fgc fgc2 = fgc;
        fsc fsc2 = fsc;
        zbe zbe2 = zbe;
        eif eif2 = eif;
        lwc lwc2 = lwc;
        InlinePlayerLayout inlinePlayerLayout2 = inlinePlayerLayout;
        super(context, xsc, xzm, afxb, xci, xoi, akpe, yfg, aaas, ycu, xwr, akmx, allb, xzn, handler, afve, zaz, acvx, apxu, yfh, xyb, zcq, xyv);
        this.a = (jvf) amqw.a((Object) jvf);
        amqw.a((Object) jtw);
        RecyclerView recyclerView = (RecyclerView) this.m.z();
        this.b = new fso((Activity) context, xci2, akkq2, eid2, aaas2, elv2, ffw2, gal2, hdd2, xpw2, fgc2, fsc2, recyclerView, (akpd) recyclerView.m, this.g, this, zbe2, eif2, lwc2, inlinePlayerLayout2);
        this.N = (aizy) amqw.a((Object) aizy);
        this.O = (fsu) amqw.a((Object) fsu);
        ((akpd) recyclerView.m).a(new fsi(this.b));
    }

    public final void a() {
        super.a();
        this.a.b(this.b);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b() {
        return this.N.c();
    }

    /* Access modifiers changed, original: protected|final */
    public final void d() {
        this.b.b(0);
    }

    public final void a(ajtu ajtu) {
        if (this.O.a()) {
            fsu fsu = this.O;
            if (ajtu != null) {
                aryi aryi;
                apxu apxu;
                aqnp aqnp = ajtu.e;
                airl airl = null;
                if (aqnp == null || (aqnp.a & 2) == 0) {
                    aryi = null;
                } else {
                    aryi = aqnp.c;
                    if (aryi == null) {
                        aryi = aryi.o;
                    }
                }
                if (aryi == null || (aryi.a & 64) == 0) {
                    apxu = null;
                } else {
                    apxu = aryi.h;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                }
                if (apxu != null) {
                    aiqs a = aiqq.a();
                    a.a = apxu;
                    airl = new airl(a.b());
                }
                if (airl != null && fsu.a()) {
                    gxt.a(airl, fsu.a);
                }
            }
            return;
        }
        super.a(ajtu);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (cls != fsj.class) {
            return xwu.a(this, obj, i);
        }
        Class[] clsArr;
        if (i == -1) {
            clsArr = new Class[]{zyg.class};
        } else if (i == 0) {
            a((zyg) obj);
            clsArr = null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
