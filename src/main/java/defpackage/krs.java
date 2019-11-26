package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: krs */
final class krs {
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

    public krs(krq krq, int i) {
        krq krq2 = krq;
        this.e = LayoutInflater.from(krq2.a).inflate(i, krq2.j, false);
        Context context = krq2.a;
        aaas aaas = krq2.c;
        vod vod = krq2.h;
        vmn vmn = krq2.f;
        tpu tpu = krq2.g;
        dwk dwk = krq2.l;
        xci xci = krq2.i;
        View view = this.e;
        View view2 = this.i;
        View view3 = this.j;
        View view4 = krq2.k;
        View view5 = view4 != null ? view4 : view;
        View view6 = this.t;
        View view7 = this.u;
        krv krv = r3;
        krv krv2 = new krv(this);
        kru kru = r3;
        kru kru2 = new kru(this);
        this.b = new kvo(context, aaas, vod, vmn, tpu, dwk, xci, view, view2, view3, view5, view6, view7, krv, kru, this.a);
        this.c = new ksv(krq2.b, krq2.d, krq2.e, this.e, this.i, false);
        this.g = new kpp(this.b, (ViewStub) this.e.findViewById(R.id.muted_ad_view_stub), new krx(this));
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
