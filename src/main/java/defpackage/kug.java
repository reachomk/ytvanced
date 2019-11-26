package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kug */
public final class kug implements akot {
    public final kue a;
    public final krj b;
    private final kpp c;
    private final krg d = new krg();
    private final kvo e;
    private final View f;
    private final View g = this.f.findViewById(R.id.ad_view);
    private final View h = this.g.findViewById(R.id.content_layout);
    private final View i = this.g.findViewById(R.id.click_overlay);
    private final View j = this.h.findViewById(R.id.content_background);
    private final View k = this.h.findViewById(R.id.thumbnail_wrapper);
    private final TextView l = ((TextView) this.h.findViewById(R.id.title));
    private final View m = this.h.findViewById(R.id.ad_attribution);
    private final TextView n = ((TextView) this.h.findViewById(R.id.advertiser));
    private final TextView o = ((TextView) this.h.findViewById(R.id.price));
    private final View p = this.h.findViewById(R.id.cta_button_wrapper);
    private final View q = this.p.findViewById(R.id.cta_button_touchable_wrapper);
    private final View r = this.h.findViewById(R.id.close_button);
    private final TextView s = ((TextView) this.h.findViewById(R.id.description));
    private final View t = this.h.findViewById(R.id.contextual_menu_anchor);
    private acvx u;

    protected kug(Context context, akkq akkq, aaas aaas, akvp akvp, akvo akvo, vmn vmn, tpu tpu, vod vod, dwk dwk, xci xci, ViewGroup viewGroup) {
        amqw.a((Object) vmn);
        this.f = LayoutInflater.from(context).inflate(R.layout.promoted_sparkles_text_product_watch, viewGroup, false);
        View view = this.f;
        View view2 = this.h;
        View view3 = this.i;
        View view4 = this.r;
        View view5 = this.t;
        kuj kuj = new kuj(this);
        kui kui = new kui(this);
        kui kui2 = kui;
        this.e = new kvo(context, aaas, vod, vmn, tpu, dwk, xci, view, view2, view3, view4, view5, kuj, kui2, this.d);
        this.a = new kue(akkq, akvp, akvo, this.f, this.h);
        this.c = new kpp(this.e, (ViewStub) this.f.findViewById(R.id.muted_ad_view_stub), new kul(this));
        this.b = new krj(this.e, this.c, this.g);
        this.e.a(this.l, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        this.e.a(this.m, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        this.e.a(this.k, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        this.e.a(this.s, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        this.e.a(this.q, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        this.e.a(this.j, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        this.e.a(this.n, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_PRODUCT_ADVERTISER);
        this.e.a(this.o, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_PRODUCT_PRICE);
    }

    public final View K_() {
        return this.f;
    }

    public final void a(akpb akpb) {
        this.e.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        obj = (ajyz) obj;
        amqw.a(obj);
        ajyx ajyx = obj.a;
        Object[] objArr = obj.b;
        aviq aviq = (aviq) ajzv.a(obj.c, aviq.class);
        aojc aojc = obj.e;
        this.u = akor.a;
        aphg aphg = (aphg) ajzv.a(ajyx.k, aphg.class);
        this.d.a(ajyx.i, ajyx.n);
        this.e.a(akor.a, obj, obj.f, ajyx, objArr, aojc, obj.d);
        this.a.a(this.u, obj, ajyx, aviq);
        this.b.a(this.u, aphg, aviq);
    }
}
