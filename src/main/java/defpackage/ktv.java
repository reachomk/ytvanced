package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ktv */
final class ktv {
    public final krg a = new krg();
    public final kvo b;
    public final ktz c;
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
    private final TextView o = ((TextView) this.f.findViewById(R.id.website));
    private final View p = this.f.findViewById(R.id.cta_button_wrapper);
    private final View q = this.p.findViewById(R.id.cta_button_touchable_wrapper);
    private final View r = this.f.findViewById(R.id.close_button);
    private final View s = this.f.findViewById(R.id.contextual_menu_anchor);
    private final TextView t = ((TextView) this.f.findViewById(R.id.description));

    public ktv(ktt ktt, int i) {
        ktt ktt2 = ktt;
        this.e = LayoutInflater.from(ktt2.a).inflate(i, ktt2.k, false);
        Context context = ktt2.a;
        aaas aaas = ktt2.c;
        vod vod = ktt2.h;
        vmn vmn = ktt2.f;
        tpu tpu = ktt2.g;
        dwk dwk = ktt2.i;
        xci xci = ktt2.j;
        View view = this.e;
        View view2 = this.f;
        View view3 = this.j;
        View view4 = ktt2.l;
        View view5 = view4 != null ? view4 : view;
        View view6 = this.r;
        View view7 = this.s;
        ktu ktu = r3;
        ktu ktu2 = new ktu(this);
        ktx ktx = r3;
        ktx ktx2 = new ktx(this);
        this.b = new kvo(context, aaas, vod, vmn, tpu, dwk, xci, view, view2, view3, view5, view6, view7, ktu, ktx, this.a);
        this.c = new ktz(ktt2.b, ktt2.d, ktt2.e, this.e, this.f, false);
        this.h = new kpp(this.b, (ViewStub) this.e.findViewById(R.id.muted_ad_view_stub), new ktw(this));
        this.d = new krj(this.b, this.h, this.i);
        this.b.a(this.m, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        this.b.a(this.n, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        this.b.a(this.l, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        this.b.a(this.t, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        this.b.a(this.q, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        this.b.a(this.k, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        this.b.a(this.o, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_AD_WEBSITE);
    }
}
