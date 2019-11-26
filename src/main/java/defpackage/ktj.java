package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ktj */
final class ktj {
    public final krg a = new krg();
    public final kvo b;
    public final ksv c;
    public final krj d;
    public final View e;
    public final View f = this.k.findViewById(R.id.content_metadata_grid_layout);
    public final View g = this.k.findViewById(R.id.thumbnail_wrapper);
    public acvx h;
    private final kpp i;
    private final View j = this.e.findViewById(R.id.ad_view);
    private final View k = this.j.findViewById(R.id.content_layout);
    private final View l = this.j.findViewById(R.id.click_overlay);
    private final View m = this.k.findViewById(R.id.content_background);
    private final TextView n = ((TextView) this.k.findViewById(R.id.title));
    private final View o = this.k.findViewById(R.id.ad_attribution);
    private final TextView p = ((TextView) this.k.findViewById(R.id.app_store_text));
    private final TextView q = ((TextView) this.k.findViewById(R.id.rating_text));
    private final RatingBar r = ((RatingBar) this.k.findViewById(R.id.rating));
    private final TextView s = ((TextView) this.k.findViewById(R.id.price));
    private final View t = this.k.findViewById(R.id.cta_button_wrapper);
    private final View u = this.t.findViewById(R.id.cta_button_touchable_wrapper);
    private final View v = this.k.findViewById(R.id.close_button);

    protected ktj(Context context, akkq akkq, aaas aaas, akvp akvp, akvo akvo, vmn vmn, tpu tpu, vod vod, dwk dwk, xci xci, View view) {
        amqw.a((Object) vmn);
        this.e = LayoutInflater.from(context).inflate(R.layout.promoted_sparkles_text_ctd_watch_wide_form, null, false);
        View view2 = this.e;
        View view3 = this.k;
        View view4 = this.l;
        View view5 = view != null ? view : view2;
        View view6 = this.v;
        kti kti = r2;
        kti kti2 = new kti(this);
        ktl ktl = r2;
        ktl ktl2 = new ktl(this);
        this.b = new kvo(context, aaas, vod, vmn, tpu, dwk, xci, view2, view3, view4, view5, view6, null, kti, ktl, this.a);
        this.c = new ksv(akkq, akvp, akvo, this.e, this.k, true);
        this.i = new kpp(this.b, (ViewStub) this.e.findViewById(R.id.muted_ad_view_stub), new ktk(this));
        this.d = new krj(this.b, this.i, this.j);
        this.b.a(this.n, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        this.b.a(this.o, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        this.b.a(this.g, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        this.b.a(this.u, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        this.b.a(this.m, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        this.b.a(this.q, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        this.b.a(this.r, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        this.b.a(this.s, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_PRICE);
        View view7 = this.p;
        if (view7 != null) {
            this.b.a(view7, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_APP_STORE);
        }
    }
}
