package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: epx */
public final class epx implements akot {
    public final fej a;
    public OnClickListener b;
    public akok c;
    public acvx d = acvx.g;
    public aptk e;
    private final akkq f;
    private final akoj g;
    private bcuo h;
    private zyw i;

    public epx(Context context, aaas aaas, akkq akkq, zyw zyw) {
        this.i = zyw;
        amqw.a((Object) aaas);
        this.f = (akkq) amqw.a((Object) akkq);
        this.a = new fej(context);
        this.g = new akoj(aaas, this.a, new epw(this));
        this.i = zyw;
    }

    public final void b() {
        aptk aptk = this.e;
        if (aptk != null) {
            this.d.a(3, new acvs(aptk.a()), epx.a((aptl) ((anxl) this.e.build())));
        }
    }

    public final View K_() {
        return this.a;
    }

    public static void a(akor akor, akok akok) {
        amqw.a((Object) akok);
        akor.a("CHIP_CLOUD_CHIP_ON_CLICK_INTERCEPT", (Object) akok);
    }

    public static atst a(aptl aptl) {
        atss atss = (atss) atst.q.createBuilder();
        atsg atsg = (atsg) atsh.c.createBuilder();
        atsg.a(!aptl.g ? 3 : 2);
        atss.a((atsh) ((anxl) atsg.build()));
        return (atst) ((anxl) atss.build());
    }

    public final void a(akpb akpb) {
        this.d = acvx.g;
        this.b = null;
        this.g.a();
        bcuo bcuo = this.h;
        if (bcuo != null) {
            bcuo.b();
            this.h = null;
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        aptl aptl = (aptl) obj;
        this.e = (aptk) ((anxo) aptl.toBuilder());
        this.d = akor.a;
        akoj akoj = this.g;
        acvx acvx = akor.a;
        apxu apxu = ((aptl) this.e.instance).f;
        if (apxu == null) {
            apxu = apxu.d;
        }
        akoj.a(acvx, apxu, akor.b(), new epz(this));
        aptn aptn = aptl.d;
        if (aptn == null) {
            aptn = aptn.c;
        }
        int a = aptp.a(aptn.b);
        if (a != 0 && a == 7 && foh.K(this.i)) {
            this.a.l = true;
        } else {
            this.a.l = false;
        }
        this.a.a((aptl) ((anxl) this.e.build()));
        this.b = (OnClickListener) akor.a("CHIP_CLOUD_CHIP_ON_CLICK_LISTENER");
        this.c = (akok) akor.a("CHIP_CLOUD_CHIP_ON_CLICK_INTERCEPT");
        bctz bctz = (bctz) akor.a("CHIP_CLOUD_CHIP_SELECTION_CHANGED_OBSERVABLE_KEY");
        bcuo bcuo = this.h;
        if (bcuo != null) {
            bcuo.b();
        }
        if (bctz != null) {
            this.h = bctz.a(new epy(this), eqb.a);
        }
        aptl aptl2 = (aptl) this.e.instance;
        if (aptl2.b == 6) {
            this.f.a(this.a.i, (aygk) aptl2.c);
        }
        this.d.a(this.e.a().d(), epx.a((aptl) ((anxl) this.e.build())));
    }
}
