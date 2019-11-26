package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kry */
final class kry {
    public final krg a = new krg();
    public final kvo b;
    public final ksv c;
    public final krj d;
    public final View e;
    public acvx f;
    private final kpp g;
    private final View h = this.e.findViewById(R.id.ad_view);
    private final View i = this.h.findViewById(R.id.content_layout);
    private final View j = this.h.findViewById(R.id.click_overlay);
    private final View k = this.i.findViewById(R.id.content_background);
    private final View l = this.i.findViewById(R.id.thumbnail_wrapper);
    private final TextView m = ((TextView) this.i.findViewById(R.id.title));
    private final View n = this.i.findViewById(R.id.ad_attribution);
    private final TextView o = ((TextView) this.i.findViewById(R.id.rating_text));
    private final RatingBar p = ((RatingBar) this.i.findViewById(R.id.rating));
    private final TextView q = ((TextView) this.i.findViewById(R.id.price));
    private final View r = this.i.findViewById(R.id.cta_button_wrapper);
    private final View s = this.r.findViewById(R.id.cta_button_touchable_wrapper);
    private final View t = this.i.findViewById(R.id.close_button);
    private final View u = this.i.findViewById(R.id.contextual_menu_anchor);
    private final TextView v = ((TextView) this.i.findViewById(R.id.description));
    private final View w = this.i.findViewById(R.id.inner_background);

    public kry(krw krw, int i) {
        krw krw2 = krw;
        this.e = LayoutInflater.from(krw2.a).inflate(i, krw2.j, false);
        Context context = krw2.a;
        aaas aaas = krw2.c;
        vod vod = krw2.h;
        vmn vmn = krw2.f;
        tpu tpu = krw2.g;
        dwk dwk = krw2.l;
        xci xci = krw2.i;
        View view = this.e;
        View view2 = this.i;
        View view3 = this.j;
        View view4 = krw2.k;
        View view5 = view4 != null ? view4 : view;
        View view6 = this.t;
        View view7 = this.u;
        ksb ksb = r3;
        ksb ksb2 = new ksb(this);
        ksa ksa = r3;
        ksa ksa2 = new ksa(this);
        this.b = new kvo(context, aaas, vod, vmn, tpu, dwk, xci, view, view2, view3, view5, view6, view7, ksb, ksa, this.a);
        this.c = new ksv(krw2.b, krw2.d, krw2.e, this.e, this.i, false);
        this.g = new kpp(this.b, (ViewStub) this.e.findViewById(R.id.muted_ad_view_stub), new ksd(this));
        this.d = new krj(this.b, this.g, this.h);
        this.b.a(this.m, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        this.b.a(this.n, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        this.b.a(this.l, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        this.b.a(this.v, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        this.b.a(this.s, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        this.b.a(this.k, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        this.b.a(this.w, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_INNER_BACKGROUND);
        this.b.a(this.o, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        this.b.a(this.p, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        this.b.a(this.q, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_PRICE);
    }
}
