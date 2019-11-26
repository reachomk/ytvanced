package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.EngagementPanelTitleHeaderRendererOuterClass;
import com.google.protos.youtube.api.innertube.ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand;
import com.google.protos.youtube.api.innertube.YpcOffersEndpoint$YPCOffersEndpoint;

/* renamed from: lfo */
public final class lfo extends ldg implements wqt {
    public final Context b;
    public final xoi c;
    public final akpe d;
    public final aana e;
    public final xci f;
    public final eod g;
    public final bcaa h;
    public final wqq i;
    public lff j;
    public final akor k = new akor();
    public lei l;
    private final bcaa m;
    private final ablj n;
    private final nn o;
    private LoadingFrameLayout p;

    public lfo(Context context, bcaa bcaa, acwa acwa, xoi xoi, ablj ablj, akpe akpe, haq haq, xci xci, eod eod, bcaa bcaa2, wqq wqq, nn nnVar) {
        super(acwa.t());
        this.b = context;
        this.m = bcaa;
        this.c = xoi;
        this.n = ablj;
        this.d = akpe;
        this.e = haq;
        this.f = xci;
        this.g = eod;
        this.h = bcaa2;
        this.i = wqq;
        this.o = nnVar;
        this.k.a(this.a);
    }

    public final void a(akoq akoq) {
    }

    public final void a(lel lel) {
    }

    public final void ac_() {
    }

    public final Object e() {
        return null;
    }

    public final void g() {
    }

    public final void j() {
    }

    public final View f() {
        return b();
    }

    public final leg n() {
        return l();
    }

    public final void a(apxu apxu) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.showSponsorshipsEngagementPanelCommand);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                Object b;
                access$000 = anxl.checkIsLite(ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.showSponsorshipsEngagementPanelCommand);
                apxu.a(access$000);
                Object b2 = apxu.h.b(access$000.d);
                if (b2 == null) {
                    b2 = access$000.b;
                } else {
                    b2 = access$000.a(b2);
                }
                ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand = (ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand) b2;
                if ((showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.a & 2) != 0) {
                    lff l = l();
                    anxp anxp = showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.c;
                    if (anxp == null) {
                        anxp = axak.a;
                    }
                    anxr access$0002 = anxl.checkIsLite(EngagementPanelTitleHeaderRendererOuterClass.engagementPanelTitleRenderer);
                    anxp.a(access$0002);
                    b = anxp.h.b(access$0002.d);
                    if (b == null) {
                        b = access$0002.b;
                    } else {
                        b = access$0002.a(b);
                    }
                    l.a((arfg) b);
                    l().a();
                }
                if ((showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.a & 4) != 0) {
                    anxp anxp2 = showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.d;
                    if (anxp2 == null) {
                        anxp2 = apxu.d;
                    }
                    anxr access$0003 = anxl.checkIsLite(YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint);
                    anxp2.a(access$0003);
                    if (anxp2.h.a(access$0003.d)) {
                        anxp anxp3 = showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.d;
                        if (anxp3 == null) {
                            anxp3 = apxu.d;
                        }
                        abmf c = this.n.c();
                        access$0003 = anxl.checkIsLite(YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint);
                        anxp3.a(access$0003);
                        Object b3 = anxp3.h.b(access$0003.d);
                        if (b3 == null) {
                            b = access$0003.b;
                        } else {
                            b = access$0003.a(b3);
                        }
                        c.a((YpcOffersEndpoint$YPCOffersEndpoint) b);
                        c.a(foe.a(anxp3));
                        b().a();
                        this.n.a(c, new lfq(this));
                    }
                }
            }
        }
    }

    public final void h() {
        this.i.a((wqt) this);
    }

    public final void i() {
        this.p.post(new lfr(this));
    }

    public final void a(akcf akcf) {
        if (akcf != null) {
            wtt.a(akcf).a(this.o.f(), "sponsorships_dialog");
        }
        k();
    }

    public final LoadingFrameLayout b() {
        if (this.p == null) {
            this.p = (LoadingFrameLayout) LayoutInflater.from(this.b).inflate(R.layout.sponsorships_engagement_panel, null, false).findViewById(R.id.loading_layout);
            this.p.a();
        }
        return this.p;
    }

    private final lff l() {
        lff lff = this.j;
        if (lff != null) {
            return lff;
        }
        this.j = (lff) this.m.get();
        lff = this.j;
        lff.g = this.a;
        return lff;
    }

    public final void k() {
        lei lei = this.l;
        if (lei != null) {
            lei.a();
        }
    }
}
