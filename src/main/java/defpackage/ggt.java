package defpackage;

import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

/* renamed from: ggt */
final /* synthetic */ class ggt implements OnClickListener {
    private final ggq a;

    ggt(ggq ggq) {
        this.a = ggq;
    }

    public final void onClick(View view) {
        ggq ggq = this.a;
        ggq.q.l().a(ggq.s);
        if (ggq.q.b() != null) {
            ggq.q.b().a(3, new acvs(gie.a(ggq.r).d()), null);
            ggq.q.b().b(acwc.UPLOAD_VIDEO_EDITING_STICKER, null);
        }
        if (ggq.q.e() != null) {
            ggq.q.e().a();
        }
        giw i = ggq.q.i();
        axak axak = ggq.s;
        boolean m = ggq.q.m();
        bacy bacy = (bacy) bacz.g.createBuilder();
        Uri a = gjh.a(axak);
        if (a == null) {
            afpc.a(2, afpf.reels, "VideoFX: Static Sticker added without valid uri");
            return;
        }
        bade bade;
        if (i.d.a() && gjh.b(axak).size() > 1) {
            i.g.t().b(new acvs(acwc.EDIT_STICKER_TAP_TO_CHANGE_STYLE_BUTTON));
        }
        badh badh = (badh) bade.d.createBuilder();
        baat baat = (baat) baao.c.createBuilder();
        baat.a(giw.a(a));
        badh.copyOnWrite();
        bade bade2 = (bade) badh.instance;
        bade2.b = (baao) ((anxl) baat.build());
        bade2.a |= 2;
        if (i.d.a()) {
            List b = gjh.b(axak);
            if (!b.isEmpty()) {
                badf badf = (badf) badc.d.createBuilder();
                badf.copyOnWrite();
                badc badc = (badc) badf.instance;
                if (!badc.c.a()) {
                    badc.c = anxl.mutableCopy(badc.c);
                }
                anvf.addAll(b, badc.c);
                badf.a((String) b.get(0));
                badc badc2 = (badc) ((anxl) badf.build());
                badh.copyOnWrite();
                bade bade3 = (bade) badh.instance;
                if (badc2 != null) {
                    bade3.c = badc2;
                    bade3.a |= 4;
                } else {
                    throw new NullPointerException();
                }
            }
        }
        if (i.d.a()) {
            List b2 = gjh.b(axak);
            if (!b2.isEmpty()) {
                i.c.execute(new giy(i, b2));
            }
        }
        bacw bacw = (bacw) bacx.e.createBuilder();
        bacw.a(badh);
        bacw.a(m);
        bacy.a(bacw);
        bacy.a(512);
        bacy.b(512);
        i.b.a(bacy);
        bacx b3 = bacy.b();
        if (b3.b == 2) {
            bade = (bade) b3.c;
        } else {
            bade = bade.d;
        }
        badc badc3 = bade.c;
        if (badc3 == null) {
            badc3 = badc.d;
        }
        if (badc3.c.size() > 1) {
            gim gim = i.f;
            gim.a(Math.round((((float) gim.a) / 2.0f) - gim.f));
        }
    }
}
