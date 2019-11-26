package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kuz */
public final class kuz implements akot {
    public final ktz a;
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
    private final TextView n = ((TextView) this.h.findViewById(R.id.website));
    private final View o = this.h.findViewById(R.id.cta_button_wrapper);
    private final View p = this.o.findViewById(R.id.cta_button_touchable_wrapper);
    private final View q = this.h.findViewById(R.id.close_button);
    private acvx r;

    protected kuz(Context context, akkq akkq, aaas aaas, akvp akvp, akvo akvo, vmn vmn, tpu tpu, vod vod, dwk dwk, xci xci, View view, ViewGroup viewGroup) {
        amqw.a((Object) vmn);
        this.c = LayoutInflater.from(context).inflate(R.layout.promoted_sparkles_text_watch_grid_form, viewGroup, false);
        View view2 = this.c;
        View view3 = this.h;
        View view4 = this.i;
        View view5 = view != null ? view : view2;
        View view6 = this.q;
        kuy kuy = r2;
        kuy kuy2 = new kuy(this);
        kvb kvb = r2;
        kvb kvb2 = new kvb(this);
        this.f = new kvo(context, aaas, vod, vmn, tpu, dwk, xci, view2, view3, view4, view5, view6, null, kuy, kvb, this.e);
        this.a = new ktz(akkq, akvp, akvo, this.c, this.h, false);
        this.d = new kpp(this.f, (ViewStub) this.c.findViewById(R.id.muted_ad_view_stub), new kva(this));
        this.b = new krj(this.f, this.d, this.g);
        this.f.a(this.l, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        this.f.a(this.m, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        this.f.a(this.k, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        this.f.a(this.p, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        this.f.a(this.j, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        this.f.a(this.n, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_AD_WEBSITE);
    }

    public final void a(akor akor, Object obj, String str, ajyq ajyq, awqo[] awqoArr, aviq aviq, aojc aojc, byte[] bArr) {
        acwb acwb = akor;
        ajyq ajyq2 = ajyq;
        aviq aviq2 = aviq;
        this.r = acwb.a;
        aphg aphg = (aphg) ajzv.a(ajyq2.j, aphg.class);
        this.e.a(ajyq2.h, ajyq2.m);
        this.f.a(acwb.a, obj, str, ajyq, (Object[]) awqoArr, aojc, bArr);
        this.a.a(this.r, obj, ajyq2, aviq2);
        this.b.a(this.r, aphg, aviq2);
    }

    public final View K_() {
        return this.c;
    }

    public final void a(akpb akpb) {
        this.f.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        Object obj2 = (ajzd) obj;
        amqw.a(obj2);
        a(akor, obj2, obj2.f, obj2.a, obj2.b, (aviq) ajzv.a(obj2.c, aviq.class), obj2.e, obj2.d);
    }
}
