package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kqe */
final class kqe {
    public final krg a = new krg();
    public final kvo b;
    public final kqq c;
    public final krj d;
    public final View e;
    public acvx f;
    private final kpp g;
    private final View h = this.e.findViewById(R.id.ad_view);
    private final View i = this.j.findViewById(R.id.close_button);
    private final View j = this.h.findViewById(R.id.content_layout);
    private final View k = this.h.findViewById(R.id.click_overlay);
    private final View l = this.j.findViewById(R.id.content_background);
    private final View m = this.j.findViewById(R.id.thumbnail_wrapper);
    private final TextView n = ((TextView) this.j.findViewById(R.id.title));
    private final View o = this.j.findViewById(R.id.ad_attribution);
    private final TextView p = ((TextView) this.j.findViewById(R.id.rating_text));
    private final View q = this.j.findViewById(R.id.contextual_menu_anchor);
    private final RatingBar r = ((RatingBar) this.j.findViewById(R.id.rating_bar));
    private final TextView s = ((TextView) this.j.findViewById(R.id.price_text));
    private final View t = this.j.findViewById(R.id.icon_text_badge_layout);

    public kqe(kqc kqc, int i) {
        kqc kqc2 = kqc;
        this.e = LayoutInflater.from(kqc2.a).inflate(i, kqc2.k, false);
        Context context = kqc2.a;
        aaas aaas = kqc2.c;
        vod vod = kqc2.h;
        vmn vmn = kqc2.f;
        tpu tpu = kqc2.g;
        dwk dwk = kqc2.j;
        xci xci = kqc2.i;
        View view = this.e;
        View view2 = this.j;
        View view3 = this.k;
        View view4 = kqc2.l;
        View view5 = view4 != null ? view4 : view;
        View view6 = this.i;
        View view7 = this.q;
        kqh kqh = r3;
        kqh kqh2 = new kqh(this);
        kqg kqg = r3;
        kqg kqg2 = new kqg(this);
        this.b = new kvo(context, aaas, vod, vmn, tpu, dwk, xci, view, view2, view3, view5, view6, view7, kqh, kqg, this.a);
        this.c = new kqq(kqc2.b, kqc2.d, kqc2.e, this.e, this.j);
        this.g = new kpp(this.b, (ViewStub) this.e.findViewById(R.id.muted_ad_view_stub), new kqj(this));
        this.d = new krj(this.b, this.g, this.h);
        this.b.a(this.m, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        this.b.a(this.n, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        this.b.a(this.o, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        this.b.a(this.p, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        this.b.a(this.r, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        this.b.a(this.s, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_PRICE);
        this.b.a(this.t, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_CUSTOM_BADGE);
        this.b.a(this.l, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
    }
}
