package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.YpcOffersEndpoint$YPCOffersEndpoint;

/* renamed from: wuk */
public final class wuk extends nd implements OnClickListener, wqt {
    public axtd Z;
    public LoadingFrameLayout aa;
    public acwa ab;
    public ablj ac;
    public xoi ad;
    public akpe ae;
    public xci af;
    public bcaa ag;
    public bcaa ah;
    public wqq ai;
    public nn aj;
    private Context ak;
    private apxu al;
    private Toolbar am;
    private akvo an;

    public final void ac_() {
    }

    public final void a(Context context) {
        super.a(context);
        this.ak = context;
    }

    public final void b(Bundle bundle) {
        String str = "SponsorshipsOffer";
        super.b(bundle);
        try {
            this.al = (apxu) anxl.parseFrom(apxu.d, this.j.getByteArray("get_offers_command"), anxa.c());
        } catch (anyg e) {
            Log.e(str, "Failed to deserialize offers command.", e);
        }
        String str2 = "get_offers_response";
        if (this.j.containsKey(str2)) {
            try {
                this.Z = (axtd) aobp.a(this.j, str2, axtd.f, anxa.c());
            } catch (anyg e2) {
                Log.e(str, "Failed to deserialize offer list renderer.", e2);
            }
        }
        ((wum) xse.b(this.ak)).a(this);
        a(0, (int) R.style.f349Sponsorships.FullScreen);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aa = (LoadingFrameLayout) layoutInflater.inflate(R.layout.sponsorships_offer_dialog_layout, viewGroup, false);
        this.am = (Toolbar) this.aa.findViewById(R.id.toolbar);
        this.am.a((OnClickListener) this);
        xoe xoe = new xoe(this.ak);
        Toolbar toolbar = this.am;
        toolbar.b(xoe.a(toolbar.e(), xwe.a(this.ak, R.attr.ytIconActiveOther, 0)));
        if (this.Z != null) {
            W();
        } else if (!(this.aa == null || this.al == null)) {
            abmf c = this.ac.c();
            apxu apxu = this.al;
            anxr access$000 = anxl.checkIsLite(YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            c.a((YpcOffersEndpoint$YPCOffersEndpoint) b);
            apxu = this.al;
            if ((apxu.a & 1) != 0) {
                c.a(apxu.b.d());
            } else {
                c.a(zzp.b);
            }
            this.aa.a();
            this.ac.a(c, new wun(this));
        }
        return this.aa;
    }

    public final void B() {
        super.B();
        this.ai.a((wqt) this);
    }

    public final void ad_() {
        this.ai.b(this);
        super.ad_();
    }

    public final void onClick(View view) {
        dismiss();
    }

    public final void a(akcf akcf) {
        if (!(akcf == null || wqc.b(akcf) == null)) {
            wtt.a(akcf).a(this.aj.f(), "sponsorships_dialog");
        }
        dismiss();
    }

    public final void W() {
        axtd axtd = this.Z;
        if (axtd != null && this.aa != null) {
            axak axak;
            axak axak2 = null;
            if ((axtd.a & 8) != 0) {
                axak = axtd.d;
                if (axak == null) {
                    axak = axak.a;
                }
            } else {
                axak = null;
            }
            axsj axsj = (axsj) ajzv.a(ajzv.a(axak), axsj.class);
            boolean z = false;
            xpr.a(this.am, axsj != null);
            if (axsj != null) {
                arml arml;
                Toolbar toolbar = this.am;
                if ((axsj.a & 1) != 0) {
                    arml = axsj.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                } else {
                    arml = null;
                }
                toolbar.a(ajqy.a(arml));
                if ((axsj.a & 2) != 0) {
                    axak2 = axsj.c;
                    if (axak2 == null) {
                        axak2 = axak.a;
                    }
                }
                auvn auvn = (auvn) ajzv.a(ajzv.a(axak2), auvn.class);
                View findViewById = this.aa.findViewById(R.id.contextual_menu_anchor);
                if (auvn != null) {
                    z = true;
                }
                xpr.a(findViewById, z);
                if (auvn != null) {
                    if ((auvn.a & 256) != 0) {
                        aodx aodx = auvn.h;
                        if (aodx == null) {
                            aodx = aodx.c;
                        }
                        aodv aodv = aodx.b;
                        if (aodv == null) {
                            aodv = aodv.c;
                        }
                        findViewById.setContentDescription(aodv.b);
                    }
                    this.an = (akvo) this.ah.get();
                    this.an.a(findViewById, auvn, auvn, this.ab.t());
                }
            }
            wup wup = new wup();
            wuo wuo = new wuo(this.ak, this.ab.t(), this.ae, wup, this.af, new akyh(wup, this.af, (akvz) this.ag.get(), this.ad, this.ab.t()), this.ad, this.ag);
            ((FrameLayout) this.aa.findViewById(R.id.offer_view)).addView(wuo.a);
            akor akor = new akor();
            akor.a(this.ab.t());
            wuo.a_(akor, this.Z);
        }
    }
}
