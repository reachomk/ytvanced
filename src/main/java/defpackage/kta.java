package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kta */
public final class kta implements akot {
    public final ksv a;
    public final krj b;
    public final View c;
    private final kpp d;
    private final krg e = new krg();
    private final kvo f;
    private final View g = this.c.findViewById(R.id.ad_view);
    private final View h = this.g.findViewById(R.id.content_layout);
    private final View i = this.g.findViewById(R.id.click_overlay);
    private final View j = this.h.findViewById(R.id.content_background);
    private final View k = this.h.findViewById(R.id.thumbnail_wrapper);
    private final TextView l = ((TextView) this.h.findViewById(R.id.title));
    private final View m = this.h.findViewById(R.id.ad_attribution);
    private final TextView n = ((TextView) this.h.findViewById(R.id.app_store_text));
    private final TextView o = ((TextView) this.h.findViewById(R.id.rating_text));
    private final ImageView p = ((ImageView) this.h.findViewById(R.id.rating_star));
    private final TextView q = ((TextView) this.h.findViewById(R.id.price));
    private final View r = this.h.findViewById(R.id.cta_button_wrapper);
    private final View s = this.r.findViewById(R.id.cta_button_touchable_wrapper);
    private final View t = this.h.findViewById(R.id.close_button);
    private acvx u;

    protected kta(Context context, akkq akkq, aaas aaas, akvp akvp, akvo akvo, vmn vmn, tpu tpu, vod vod, dwk dwk, xci xci, View view, ViewGroup viewGroup) {
        amqw.a((Object) vmn);
        this.c = LayoutInflater.from(context).inflate(R.layout.promoted_sparkles_text_ctd_watch_grid_form, viewGroup, false);
        View view2 = this.c;
        View view3 = this.h;
        View view4 = this.i;
        View view5 = view != null ? view : view2;
        View view6 = this.t;
        ktd ktd = r2;
        ktd ktd2 = new ktd(this);
        ktc ktc = r2;
        ktc ktc2 = new ktc(this);
        this.f = new kvo(context, aaas, vod, vmn, tpu, dwk, xci, view2, view3, view4, view5, view6, null, ktd, ktc, this.e);
        this.a = new ksv(akkq, akvp, akvo, this.c, this.h, false);
        this.d = new kpp(this.f, (ViewStub) this.c.findViewById(R.id.muted_ad_view_stub), new ktf(this));
        this.b = new krj(this.f, this.d, this.g);
        this.f.a(this.l, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        this.f.a(this.m, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        this.f.a(this.k, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        this.f.a(this.s, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        this.f.a(this.j, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        this.f.a(this.o, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        this.f.a(this.p, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        this.f.a(this.q, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_PRICE);
        View view7 = this.n;
        if (view7 != null) {
            this.f.a(view7, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_APP_STORE);
        }
    }

    public final void a(akor akor, Object obj, String str, ajyp ajyp, awqo[] awqoArr, aviq aviq, aojc aojc, byte[] bArr) {
        acwb acwb = akor;
        ajyp ajyp2 = ajyp;
        aviq aviq2 = aviq;
        this.u = acwb.a;
        aphg aphg = (aphg) ajzv.a(ajyp2.m, aphg.class);
        this.e.a(ajyp2.k, ajyp2.p);
        this.f.a(acwb.a, obj, str, ajyp, (Object[]) awqoArr, aojc, bArr);
        this.a.a(this.u, obj, ajyp2, aviq2);
        this.b.a(this.u, aphg, aviq2);
    }

    public final View K_() {
        return this.c;
    }

    public final void a(akpb akpb) {
        this.f.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        Object obj2 = (ajyt) obj;
        amqw.a(obj2);
        a(akor, obj2, obj2.f, obj2.a, obj2.b, (aviq) ajzv.a(obj2.c, aviq.class), obj2.e, obj2.d);
    }
}
