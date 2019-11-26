package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;

/* renamed from: kwg */
public final class kwg implements akot {
    private aoky a;
    private final vod b;
    private final epj c;
    private final View d;
    private final View e = this.d.findViewById(R.id.start_button);
    private final View f = this.d.findViewById(R.id.end_button);
    private final epk g;
    private eph h;
    private eph i;

    public kwg(Context context, vod vod, epj epj, aaas aaas) {
        this.b = vod;
        this.c = (epj) amqw.a((Object) epj);
        this.g = new kwj(vod, aaas);
        this.d = LayoutInflater.from(context).inflate(R.layout.ad_two_button_tray_section, null, false);
    }

    public final View K_() {
        return this.d;
    }

    public final void a(akpb akpb) {
        this.b.b(this.a);
        this.a = null;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        eph eph;
        aoky aoky = (aoky) obj;
        xpr.a(this.d, true);
        anxp anxp = aoky.b;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            if (this.h == null) {
                this.h = this.c.a(this.g, this.e);
            }
            eph = this.h;
            anxp anxp2 = aoky.b;
            if (anxp2 == null) {
                anxp2 = axak.a;
            }
            anxr access$0002 = anxl.checkIsLite(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
            anxp2.a(access$0002);
            Object b = anxp2.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            eph.a((aohe) b);
            xpr.a(this.e, true);
        } else {
            xpr.a(this.e, false);
        }
        anxp = aoky.c;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$0003 = anxl.checkIsLite(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
        anxp.a(access$0003);
        if (anxp.h.a(access$0003.d)) {
            if (this.i == null) {
                this.i = this.c.a(this.g, this.f);
            }
            eph = this.i;
            anxp anxp3 = aoky.c;
            if (anxp3 == null) {
                anxp3 = axak.a;
            }
            access$0003 = anxl.checkIsLite(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
            anxp3.a(access$0003);
            Object b2 = anxp3.h.b(access$0003.d);
            if (b2 == null) {
                b2 = access$0003.b;
            } else {
                b2 = access$0003.a(b2);
            }
            eph.a((aohe) b2);
            xpr.a(this.f, true);
        } else {
            xpr.a(this.f, false);
        }
        this.a = aoky;
    }
}
