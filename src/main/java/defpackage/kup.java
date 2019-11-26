package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kup */
final class kup {
    public final krg a = new krg();
    public final kvo b;
    public final krr c;
    public final krj d;
    public final View e;
    public acvx f;
    private final kpp g;
    private final View h = this.e.findViewById(R.id.ad_view);
    private final View i = this.h.findViewById(R.id.content_layout);
    private final View j = this.h.findViewById(R.id.click_overlay);
    private final View k = this.i.findViewById(R.id.content_background);
    private final TextView l = ((TextView) this.i.findViewById(R.id.title));
    private final View m = this.i.findViewById(R.id.ad_attribution);
    private final TextView n = ((TextView) this.i.findViewById(R.id.website));
    private final View o = this.i.findViewById(R.id.close_button);
    private final View p = this.i.findViewById(R.id.contextual_menu_anchor);
    private final TextView q = ((TextView) this.i.findViewById(R.id.description));
    private final View r = this.i.findViewById(R.id.cta_button_wrapper);
    private final View s = this.r.findViewById(R.id.cta_button_touchable_wrapper);

    public kup(kun kun, int i) {
        kun kun2 = kun;
        this.e = LayoutInflater.from(kun2.a).inflate(i, kun2.k, false);
        Context context = kun2.a;
        aaas aaas = kun2.c;
        vod vod = kun2.h;
        vmn vmn = kun2.f;
        tpu tpu = kun2.g;
        dwk dwk = kun2.i;
        xci xci = kun2.j;
        View view = this.e;
        View view2 = this.i;
        View view3 = this.j;
        View view4 = kun2.l;
        View view5 = view4 != null ? view4 : view;
        View view6 = this.o;
        View view7 = this.p;
        kuo kuo = r3;
        kuo kuo2 = new kuo(this);
        kur kur = r3;
        kur kur2 = new kur(this);
        this.b = new kvo(context, aaas, vod, vmn, tpu, dwk, xci, view, view2, view3, view5, view6, view7, kuo, kur, this.a);
        this.c = new krr(kun2.b, kun2.d, kun2.e, this.e, this.i);
        this.g = new kpp(this.b, (ViewStub) this.e.findViewById(R.id.muted_ad_view_stub), new kuq(this));
        this.d = new krj(this.b, this.g, this.h);
        this.b.a(this.l, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        this.b.a(this.m, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        this.b.a(this.q, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        this.b.a(this.s, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        this.b.a(this.k, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        this.b.a(this.n, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_AD_WEBSITE);
    }
}
