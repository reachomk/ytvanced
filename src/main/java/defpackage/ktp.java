package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ktp */
final class ktp {
    public final krg a = new krg();
    public final kvo b;
    public final ktz c;
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
    private final TextView o = ((TextView) this.i.findViewById(R.id.website));
    private final View p = this.i.findViewById(R.id.cta_button_wrapper);
    private final View q = this.p.findViewById(R.id.cta_button_touchable_wrapper);
    private final View r = this.i.findViewById(R.id.close_button);
    private final View s = this.i.findViewById(R.id.contextual_menu_anchor);
    private final TextView t = ((TextView) this.i.findViewById(R.id.description));
    private final View u = this.i.findViewById(R.id.inner_background);

    public ktp(ktn ktn, int i) {
        ktn ktn2 = ktn;
        this.e = LayoutInflater.from(ktn2.a).inflate(i, ktn2.k, false);
        Context context = ktn2.a;
        aaas aaas = ktn2.c;
        vod vod = ktn2.h;
        vmn vmn = ktn2.f;
        tpu tpu = ktn2.g;
        dwk dwk = ktn2.i;
        xci xci = ktn2.j;
        View view = this.e;
        View view2 = this.i;
        View view3 = this.j;
        View view4 = ktn2.l;
        View view5 = view4 != null ? view4 : view;
        View view6 = this.r;
        View view7 = this.s;
        kto kto = r3;
        kto kto2 = new kto(this);
        ktr ktr = r3;
        ktr ktr2 = new ktr(this);
        this.b = new kvo(context, aaas, vod, vmn, tpu, dwk, xci, view, view2, view3, view5, view6, view7, kto, ktr, this.a);
        this.c = new ktz(ktn2.b, ktn2.d, ktn2.e, this.e, this.i, false);
        this.g = new kpp(this.b, (ViewStub) this.e.findViewById(R.id.muted_ad_view_stub), new ktq(this));
        this.d = new krj(this.b, this.g, this.h);
        this.b.a(this.m, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        this.b.a(this.n, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        this.b.a(this.l, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        this.b.a(this.t, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        this.b.a(this.q, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        this.b.a(this.k, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        this.b.a(this.u, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_INNER_BACKGROUND);
        this.b.a(this.o, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_AD_WEBSITE);
    }
}
