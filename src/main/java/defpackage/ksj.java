package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ksj */
final class ksj {
    public final kvo a;
    public final ksv b;
    public final krj c;
    public final View d;
    private final kpp e;
    private final krg f = new krg();
    private final View g = this.d.findViewById(R.id.ad_view);
    private final View h = this.g.findViewById(R.id.content_layout);
    private final View i = this.g.findViewById(R.id.click_overlay);
    private final View j = this.h.findViewById(R.id.content_background);
    private final View k = this.h.findViewById(R.id.thumbnail_wrapper);
    private final TextView l = ((TextView) this.h.findViewById(R.id.title));
    private final View m = this.h.findViewById(R.id.ad_attribution);
    private final TextView n = ((TextView) this.h.findViewById(R.id.rating_text));
    private final RatingBar o = ((RatingBar) this.h.findViewById(R.id.rating));
    private final TextView p = ((TextView) this.h.findViewById(R.id.price));
    private final View q = this.h.findViewById(R.id.cta_button_wrapper);
    private final View r = this.q.findViewById(R.id.cta_button_touchable_wrapper);
    private final View s = this.h.findViewById(R.id.close_button);
    private final View t = this.h.findViewById(R.id.contextual_menu_anchor);
    private final TextView u = ((TextView) this.h.findViewById(R.id.description));
    private final View v = this.h.findViewById(R.id.inner_background);
    private acvx w;

    public ksj(ksh ksh, int i) {
        ksh ksh2 = ksh;
        this.d = LayoutInflater.from(ksh2.a).inflate(i, ksh2.k, false);
        Context context = ksh2.a;
        aaas aaas = ksh2.c;
        vod vod = ksh2.h;
        vmn vmn = ksh2.f;
        tpu tpu = ksh2.g;
        dwk dwk = ksh2.i;
        xci xci = ksh2.j;
        View view = this.d;
        View view2 = this.h;
        View view3 = this.i;
        View view4 = ksh2.l;
        View view5 = view4 != null ? view4 : view;
        View view6 = this.s;
        View view7 = this.t;
        ksi ksi = r3;
        ksi ksi2 = new ksi(this);
        ksl ksl = r3;
        ksl ksl2 = new ksl(this);
        this.a = new kvo(context, aaas, vod, vmn, tpu, dwk, xci, view, view2, view3, view5, view6, view7, ksi, ksl, this.f);
        this.b = new ksv(ksh2.b, ksh2.d, ksh2.e, this.d, this.h, false);
        this.e = new kpp(this.a, (ViewStub) this.d.findViewById(R.id.muted_ad_view_stub), new ksk(this));
        this.c = new krj(this.a, this.e, this.g);
        this.a.a(this.l, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        this.a.a(this.m, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        this.a.a(this.k, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        this.a.a(this.u, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        this.a.a(this.r, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        this.a.a(this.j, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        this.a.a(this.v, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_INNER_BACKGROUND);
        this.a.a(this.n, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        this.a.a(this.o, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        this.a.a(this.p, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_PRICE);
    }

    public final void a(akor akor, Object obj, String str, ajyp ajyp, awqo[] awqoArr, aviq aviq, aojc aojc, byte[] bArr) {
        acwb acwb = akor;
        ajyp ajyp2 = ajyp;
        this.w = acwb.a;
        aphg aphg = (aphg) ajzv.a(ajyp2.m, aphg.class);
        this.f.a(ajyp2.k, ajyp2.p);
        this.a.a(acwb.a, obj, str, ajyp, (Object[]) awqoArr, aojc, bArr);
        this.b.a(this.w, obj, ajyp, aviq, Integer.valueOf(xwe.a(this.h.getContext(), R.attr.ytBorderedButtonChipBackground, 0)));
        this.c.a(this.w, aphg, aviq);
    }
}
