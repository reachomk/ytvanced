package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kso */
final class kso {
    public final krg a = new krg();
    public final kvo b;
    public final ksv c;
    public final krj d;
    public final View e;
    public final View f = this.i.findViewById(R.id.content_layout);
    public acvx g;
    private final kpp h;
    private final View i = this.e.findViewById(R.id.ad_view);
    private final View j = this.i.findViewById(R.id.click_overlay);
    private final View k = this.f.findViewById(R.id.content_background);
    private final View l = this.f.findViewById(R.id.thumbnail_wrapper);
    private final TextView m = ((TextView) this.f.findViewById(R.id.title));
    private final View n = this.f.findViewById(R.id.ad_attribution);
    private final TextView o = ((TextView) this.f.findViewById(R.id.rating_text));
    private final RatingBar p = ((RatingBar) this.f.findViewById(R.id.rating));
    private final TextView q = ((TextView) this.f.findViewById(R.id.price));
    private final View r = this.f.findViewById(R.id.cta_button_wrapper);
    private final View s = this.r.findViewById(R.id.cta_button_touchable_wrapper);
    private final View t = this.f.findViewById(R.id.close_button);
    private final View u = this.f.findViewById(R.id.contextual_menu_anchor);
    private final TextView v = ((TextView) this.f.findViewById(R.id.description));
    private final View w = this.f.findViewById(R.id.inner_background);

    public kso(ksm ksm, int i) {
        ksm ksm2 = ksm;
        this.e = LayoutInflater.from(ksm2.a).inflate(i, ksm2.k, false);
        Context context = ksm2.a;
        aaas aaas = ksm2.c;
        vod vod = ksm2.h;
        vmn vmn = ksm2.f;
        tpu tpu = ksm2.g;
        dwk dwk = ksm2.i;
        xci xci = ksm2.j;
        View view = this.e;
        View view2 = this.f;
        View view3 = this.j;
        View view4 = ksm2.l;
        View view5 = view4 != null ? view4 : view;
        View view6 = this.t;
        View view7 = this.u;
        ksr ksr = r3;
        ksr ksr2 = new ksr(this);
        ksq ksq = r3;
        ksq ksq2 = new ksq(this);
        this.b = new kvo(context, aaas, vod, vmn, tpu, dwk, xci, view, view2, view3, view5, view6, view7, ksr, ksq, this.a);
        this.c = new ksv(ksm2.b, ksm2.d, ksm2.e, this.e, this.f, false);
        this.h = new kpp(this.b, (ViewStub) this.e.findViewById(R.id.muted_ad_view_stub), new kst(this));
        this.d = new krj(this.b, this.h, this.i);
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
