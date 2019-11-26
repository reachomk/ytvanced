package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;

/* renamed from: hau */
public final class hau implements ejc, wre {
    public final Context a;
    public final lud b;
    public final eif c;
    public final acvx d;
    public final abrs e;
    public final abvi f;
    public final abuy g;
    public final abrq h;
    public final aaas i;
    public abxm j;
    public absq k;

    public hau(Context context, lud lud, eif eif, acwa acwa, abrs abrs, abvl abvl, abuy abuy, abrq abrq, aaas aaas) {
        this.a = context;
        this.b = lud;
        this.c = eif;
        this.d = acwa.t();
        this.e = abrs;
        this.f = new abvi((Context) abvl.a((Context) abvl.a.get(), 1), (akzb) abvl.a((akzb) abvl.b.get(), 2), (acwa) abvl.a((acwa) abvl.c.get(), 3), (akvz) abvl.a((akvz) abvl.d.get(), 4), (wre) abvl.a(this, 5));
        this.g = abuy;
        this.h = abrq;
        this.i = aaas;
    }

    public final void b() {
    }

    public final CharSequence a(atqm atqm) {
        arml arml = null;
        if (atqm == null || atqm.a != 136403337) {
            return null;
        }
        aucy aucy = (aucy) atqm.b;
        if ((aucy.a & 1) != 0) {
            arml = aucy.b;
            if (arml == null) {
                arml = arml.f;
            }
        }
        return ajqy.a(arml);
    }

    private final void c() {
        absq absq = this.k;
        if (absq != null) {
            absq.dismiss();
        }
        abxm abxm = this.j;
        if (abxm != null) {
            abxm.dismiss();
        }
        apxx apxx = (apxx) apxu.d.createBuilder();
        artm artm = (artm) HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c.createBuilder();
        String str = "super-sticker-purchase-section";
        artm.a(str);
        apxx.a(HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint, (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) ((anxl) artm.build()));
        this.i.a((apxu) ((anxl) apxx.build()), amur.a("engagement_panel_id_key", str));
        this.c.b(this);
    }

    public final void a() {
        c();
    }

    public final void a(CharSequence charSequence) {
        abvi abvi = this.f;
        if (abvi != null) {
            abvi.a(charSequence);
        }
    }

    public final void a(ejd ejd, ejd ejd2) {
        if (ejd2 == ejd.WATCH_WHILE_FULLSCREEN) {
            c();
        }
    }
}
