package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kua */
final class kua {
    public final krg a = new krg();
    public final kvo b;
    public final kuh c;
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
    private final TextView o = ((TextView) this.i.findViewById(R.id.advertiser));
    private final TextView p = ((TextView) this.i.findViewById(R.id.price));
    private final TextView q = ((TextView) this.i.findViewById(R.id.separator));
    private final View r = this.i.findViewById(R.id.cta_button_wrapper);
    private final View s = this.r.findViewById(R.id.cta_button_touchable_wrapper);
    private final View t = this.i.findViewById(R.id.close_button);
    private final View u = this.i.findViewById(R.id.contextual_menu_anchor);
    private final TextView v = ((TextView) this.i.findViewById(R.id.description));
    private final View w = this.i.findViewById(R.id.inner_background);

    public kua(kty kty, int i) {
        kty kty2 = kty;
        this.e = LayoutInflater.from(kty2.a).inflate(i, kty2.k, false);
        Context context = kty2.a;
        aaas aaas = kty2.c;
        vod vod = kty2.h;
        vmn vmn = kty2.f;
        tpu tpu = kty2.g;
        dwk dwk = kty2.i;
        xci xci = kty2.j;
        View view = this.e;
        View view2 = this.i;
        View view3 = this.j;
        View view4 = kty2.l;
        View view5 = view4 != null ? view4 : view;
        View view6 = this.t;
        View view7 = this.u;
        kud kud = r3;
        kud kud2 = new kud(this);
        kuc kuc = r3;
        kuc kuc2 = new kuc(this);
        this.b = new kvo(context, aaas, vod, vmn, tpu, dwk, xci, view, view2, view3, view5, view6, view7, kud, kuc, this.a);
        this.c = new kuh(kty2.b, kty2.d, kty2.e, this.e, this.i);
        this.g = new kpp(this.b, (ViewStub) this.e.findViewById(R.id.muted_ad_view_stub), new kuf(this));
        this.d = new krj(this.b, this.g, this.h);
        this.b.a(this.m, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        this.b.a(this.n, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        this.b.a(this.l, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        this.b.a(this.v, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        this.b.a(this.s, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        this.b.a(this.k, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        this.b.a(this.w, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_INNER_BACKGROUND);
        this.b.a(this.o, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_PRODUCT_ADVERTISER);
        this.b.a(this.p, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_PRODUCT_PRICE);
        this.b.a(this.q, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_PRODUCT_PRICE);
    }
}
