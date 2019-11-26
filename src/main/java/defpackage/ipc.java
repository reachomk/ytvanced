package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.DurationBadgeView;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;
import java.util.Map;

/* renamed from: ipc */
public final class ipc implements akon, akot {
    private final akou a;
    private final akkq b;
    private final akoj c;
    private final OfflineArrowView d;
    private final hjs e;
    private final agwc f;
    private final TextView g;
    private final TextView h;
    private final DurationBadgeView i;
    private final TextView j;
    private final ImageView k;
    private final TextView l;
    private final ImageView m;
    private final View n;
    private final View o;
    private final Resources p;
    private final fnk q;
    private hjr r;
    private ioy s;
    private xom t;
    private aygk u;

    public ipc(Context context, akkq akkq, aaas aaas, hjs hjs, agwc agwc, akpn akpn, zyw zyw) {
        if (!wvl.a(zyw)) {
            context = xuv.a(context, null, R.style.f516Theme.YouTube.Dark);
        }
        this.a = akpn;
        this.b = akkq;
        this.c = new akoj(aaas, (akou) akpn);
        this.f = agwc;
        this.e = hjs;
        this.p = context.getResources();
        View inflate = LayoutInflater.from(context).inflate(R.layout.red_carpet_playlist_video_item, null);
        akpn.a(inflate);
        this.g = (TextView) inflate.findViewById(R.id.title);
        View findViewById = inflate.findViewById(R.id.description_wrapper);
        this.h = (TextView) findViewById.findViewById(R.id.description);
        this.l = (TextView) findViewById.findViewById(R.id.red_carpet_badge);
        this.i = (DurationBadgeView) inflate.findViewById(R.id.duration);
        this.j = (TextView) inflate.findViewById(R.id.details);
        this.d = (OfflineArrowView) inflate.findViewById(R.id.offline_button);
        this.n = inflate.findViewById(R.id.gradient_scrim_overlay);
        this.m = (ImageView) inflate.findViewById(R.id.centered_image_badge_overlay);
        this.o = inflate.findViewById(R.id.video_container);
        this.k = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.q = new fnk((ViewStub) inflate.findViewById(R.id.resume_playback_overlay));
    }

    public final View K_() {
        return this.a.a();
    }

    public final void a(akpb akpb) {
        hjr hjr = this.r;
        if (hjr != null) {
            hjr.b();
        }
    }

    public final void a(Map map) {
        ImageView imageView = this.k;
        if (imageView != null) {
            map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY", imageView);
            map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", this.u);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x022a  */
    public final /* synthetic */ void a_(defpackage.akor r8, java.lang.Object r9) {
        /*
        r7 = this;
        r9 = (defpackage.ajzl) r9;
        r0 = r7.o;
        r0 = r0.getLayoutParams();
        r0 = (defpackage.cs) r0;
        r1 = r9.j;
        r2 = r1 + -1;
        r3 = 0;
        if (r1 == 0) goto L_0x0237;
    L_0x0011:
        r1 = 1;
        r4 = 0;
        if (r2 == 0) goto L_0x0036;
    L_0x0015:
        if (r2 == r1) goto L_0x0018;
    L_0x0017:
        goto L_0x004b;
    L_0x0018:
        r2 = r7.p;
        r5 = 2131624882; // 0x7f0e03b2 float:1.8876956E38 double:1.053162624E-314;
        r2 = r2.getDimensionPixelSize(r5);
        r5 = r7.K_();
        r5.setPadding(r2, r4, r2, r4);
        r0.width = r4;
        r2 = r7.p;
        r5 = 2131624884; // 0x7f0e03b4 float:1.887696E38 double:1.053162625E-314;
        r2 = r2.getDimensionPixelSize(r5);
        r0.F = r2;
        goto L_0x004b;
    L_0x0036:
        r2 = r7.p;
        r5 = 2131626842; // 0x7f0e0b5a float:1.8880932E38 double:1.0531635924E-314;
        r2 = r2.getDimensionPixelSize(r5);
        r5 = r7.K_();
        r5.setPadding(r2, r4, r2, r4);
        r2 = -1;
        r0.width = r2;
        r0.F = r4;
    L_0x004b:
        r0 = r7.c;
        r2 = r8.a;
        r5 = r9.f;
        r6 = r8.b();
        r0.a(r2, r5, r6, r7);
        r0 = r7.g;
        r2 = r9.c;
        r2 = defpackage.ajqy.a(r2);
        defpackage.xpr.a(r0, r2);
        r0 = r9.i;
        r2 = defpackage.awvi.class;
        r0 = defpackage.ajzv.a(r0, r2);
        r0 = (defpackage.awvi) r0;
        if (r0 == 0) goto L_0x00b7;
    L_0x006f:
        r2 = r7.s;
        if (r2 != 0) goto L_0x007c;
    L_0x0073:
        r2 = new ioy;
        r5 = r7.l;
        r2.<init>(r5);
        r7.s = r2;
    L_0x007c:
        r2 = r7.s;
        r5 = r2.a();
        r6 = r0.b;
        if (r6 != 0) goto L_0x0088;
    L_0x0086:
        r6 = defpackage.arml.f;
    L_0x0088:
        r6 = defpackage.ajqy.a(r6);
        defpackage.xpr.a(r5, r6);
        r5 = r2.a();
        r6 = r0.a;
        r6 = r6 & r1;
        if (r6 == 0) goto L_0x009f;
    L_0x0098:
        r6 = r0.b;
        if (r6 != 0) goto L_0x00a0;
    L_0x009c:
        r6 = defpackage.arml.f;
        goto L_0x00a0;
    L_0x009f:
        r6 = r3;
    L_0x00a0:
        r6 = defpackage.ajqy.b(r6);
        r5.setContentDescription(r6);
        r0 = r0.c;
        r0 = r2.f;
        r2 = 2130839539; // 0x7f0207f3 float:1.7284091E38 double:1.052774613E-314;
        r0.setBackgroundResource(r2);
        r0 = r7.h;
        defpackage.xpr.a(r0, r4);
        goto L_0x00c7;
    L_0x00b7:
        r0 = r7.h;
        r2 = r9.d;
        r2 = defpackage.ajqy.a(r2);
        defpackage.xpr.a(r0, r2);
        r0 = r7.l;
        defpackage.xpr.a(r0, r4);
    L_0x00c7:
        r0 = r7.j;
        r2 = r9.e;
        r2 = defpackage.ajqy.a(r2);
        defpackage.xpr.a(r0, r2);
        r0 = r9.b;
        r7.u = r0;
        r0 = r7.b;
        r2 = r7.k;
        r5 = r7.u;
        r0.a(r2, r5);
        r0 = r7.q;
        r2 = r9.g;
        r5 = defpackage.ipt.a;
        r2 = defpackage.ipo.a(r2, r5);
        r2 = (defpackage.ayfq) r2;
        r0.a(r2);
        r0 = r9.g;
        r2 = defpackage.ipq.a;
        r0 = defpackage.ipo.a(r0, r2);
        r0 = (defpackage.ayfy) r0;
        if (r0 != 0) goto L_0x0100;
    L_0x00fa:
        r0 = r7.i;
        defpackage.xpr.a(r0, r4);
        goto L_0x012a;
    L_0x0100:
        r2 = r7.i;
        r5 = r0.b;
        if (r5 != 0) goto L_0x0108;
    L_0x0106:
        r5 = defpackage.arml.f;
    L_0x0108:
        r5 = defpackage.ajqy.a(r5);
        defpackage.xpr.a(r2, r5);
        r2 = r7.i;
        r5 = r0.a;
        r5 = r5 & r1;
        if (r5 == 0) goto L_0x011d;
    L_0x0116:
        r0 = r0.b;
        if (r0 != 0) goto L_0x011e;
    L_0x011a:
        r0 = defpackage.arml.f;
        goto L_0x011e;
    L_0x011d:
        r0 = r3;
    L_0x011e:
        r0 = defpackage.ajqy.b(r0);
        r2.setContentDescription(r0);
        r0 = r7.i;
        r0.b();
    L_0x012a:
        r0 = r9.h;
        r2 = defpackage.avsj.class;
        r0 = defpackage.ajzv.a(r0, r2);
        r0 = (defpackage.avsj) r0;
        r2 = r9.a;
        r5 = r7.f;
        r2 = defpackage.hjr.a(r2, r5);
        r2 = defpackage.hjr.b(r2, r0);
        if (r2 == 0) goto L_0x0158;
    L_0x0142:
        r2 = r7.r;
        if (r2 != 0) goto L_0x0150;
    L_0x0146:
        r2 = r7.e;
        r5 = r7.d;
        r2 = r2.a(r5);
        r7.r = r2;
    L_0x0150:
        r2 = r7.r;
        r5 = r9.a;
        r2.a(r5, r0);
        goto L_0x015f;
    L_0x0158:
        r0 = r7.d;
        r2 = 8;
        r0.setVisibility(r2);
    L_0x015f:
        r0 = r9.g;
        r2 = defpackage.ipw.a;
        r0 = defpackage.ipo.a(r0, r2);
        r0 = (defpackage.awwf) r0;
        if (r0 == 0) goto L_0x0183;
    L_0x016b:
        r2 = r7.t;
        if (r2 != 0) goto L_0x0177;
    L_0x016f:
        r2 = r7.n;
        r2 = defpackage.xop.a(r2);
        r7.t = r2;
    L_0x0177:
        r2 = r7.t;
        r0 = r0.a;
        r0 = defpackage.anhe.a(r0);
        r2.a(r0);
        goto L_0x0188;
    L_0x0183:
        r0 = r7.n;
        defpackage.xpr.a(r0, r4);
    L_0x0188:
        r9 = r9.g;
        r0 = defpackage.ipz.a;
        r9 = defpackage.ipo.a(r9, r0);
        r9 = (defpackage.awwd) r9;
        if (r9 != 0) goto L_0x0196;
    L_0x0194:
        r9 = r3;
        goto L_0x01d4;
    L_0x0196:
        r0 = r9.b;
        if (r0 == 0) goto L_0x019b;
    L_0x019a:
        goto L_0x019d;
    L_0x019b:
        r0 = defpackage.axak.a;
    L_0x019d:
        r2 = com.google.protos.youtube.api.innertube.RedCarpetVideoRendererOuterClass.overlayBadgeRenderer;
        r2 = defpackage.anxl.checkIsLite(r2);
        r0.a(r2);
        r0 = r0.h;
        r2 = r2.d;
        r0 = r0.a(r2);
        if (r0 != 0) goto L_0x01b1;
    L_0x01b0:
        goto L_0x0194;
    L_0x01b1:
        r9 = r9.b;
        if (r9 == 0) goto L_0x01b6;
    L_0x01b5:
        goto L_0x01b8;
    L_0x01b6:
        r9 = defpackage.axak.a;
    L_0x01b8:
        r0 = com.google.protos.youtube.api.innertube.RedCarpetVideoRendererOuterClass.overlayBadgeRenderer;
        r0 = defpackage.anxl.checkIsLite(r0);
        r9.a(r0);
        r9 = r9.h;
        r2 = r0.d;
        r9 = r9.b(r2);
        if (r9 != 0) goto L_0x01ce;
    L_0x01cb:
        r9 = r0.b;
        goto L_0x01d2;
    L_0x01ce:
        r9 = r0.a(r9);
    L_0x01d2:
        r9 = (defpackage.awvt) r9;
    L_0x01d4:
        if (r9 != 0) goto L_0x01d8;
    L_0x01d6:
        r9 = r3;
        goto L_0x0216;
    L_0x01d8:
        r0 = r9.b;
        if (r0 == 0) goto L_0x01dd;
    L_0x01dc:
        goto L_0x01df;
    L_0x01dd:
        r0 = defpackage.axak.a;
    L_0x01df:
        r2 = com.google.protos.youtube.api.innertube.RedCarpetVideoRendererOuterClass.thumbnailBadgeIconRenderer;
        r2 = defpackage.anxl.checkIsLite(r2);
        r0.a(r2);
        r0 = r0.h;
        r2 = r2.d;
        r0 = r0.a(r2);
        if (r0 != 0) goto L_0x01f3;
    L_0x01f2:
        goto L_0x01d6;
    L_0x01f3:
        r9 = r9.b;
        if (r9 == 0) goto L_0x01f8;
    L_0x01f7:
        goto L_0x01fa;
    L_0x01f8:
        r9 = defpackage.axak.a;
    L_0x01fa:
        r0 = com.google.protos.youtube.api.innertube.RedCarpetVideoRendererOuterClass.thumbnailBadgeIconRenderer;
        r0 = defpackage.anxl.checkIsLite(r0);
        r9.a(r0);
        r9 = r9.h;
        r2 = r0.d;
        r9 = r9.b(r2);
        if (r9 != 0) goto L_0x0210;
    L_0x020d:
        r9 = r0.b;
        goto L_0x0214;
    L_0x0210:
        r9 = r0.a(r9);
    L_0x0214:
        r9 = (defpackage.awwb) r9;
    L_0x0216:
        if (r9 != 0) goto L_0x0219;
    L_0x0218:
        goto L_0x021f;
    L_0x0219:
        r3 = r9.b;
        if (r3 != 0) goto L_0x021f;
    L_0x021d:
        r3 = defpackage.aygk.f;
    L_0x021f:
        r9 = r7.m;
        if (r3 == 0) goto L_0x0224;
    L_0x0223:
        goto L_0x0225;
    L_0x0224:
        r1 = 0;
    L_0x0225:
        defpackage.xpr.a(r9, r1);
        if (r3 == 0) goto L_0x0231;
    L_0x022a:
        r9 = r7.b;
        r0 = r7.m;
        r9.a(r0, r3);
    L_0x0231:
        r9 = r7.a;
        r9.a(r8);
        return;
    L_0x0237:
        goto L_0x0239;
    L_0x0238:
        throw r3;
    L_0x0239:
        goto L_0x0238;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipc.a_(akor, java.lang.Object):void");
    }
}
