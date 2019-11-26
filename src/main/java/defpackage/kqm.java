package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kqm */
final class kqm {
    private View A;
    private RatingBar B;
    private TextView C;
    private View D;
    private View E;
    private final View F;
    public kvl a;
    public kvo b;
    public kqi c;
    public kql d;
    public krj e;
    public View f;
    public final View g;
    public acvx h;
    public aphg i;
    public aviq j;
    public final boolean k;
    public boolean l;
    public final /* synthetic */ kqk m;
    private kpp n;
    private View o;
    private final View p;
    private View q;
    private final View r;
    private final View s;
    private final View t;
    private View u;
    private View v;
    private TextView w;
    private TextView x;
    private View y;
    private TextView z;

    public kqm(kqk kqk, int i, boolean z) {
        int i2 = i;
        boolean z2 = z;
        this.m = kqk;
        this.k = z2;
        View view;
        kqk kqk2;
        if (z2) {
            this.f = LayoutInflater.from(this.m.a).inflate(i2, this.m.k, false);
            ViewStub viewStub = (ViewStub) this.f.findViewById(R.id.promoted_discovery_app_promo_portrait_thumbnail_stub);
            this.g = ((ViewStub) this.f.findViewById(R.id.promoted_discovery_app_promo_portrait_metadata_stub)).inflate();
            this.o = viewStub.inflate();
            this.p = this.g.findViewById(R.id.ad_view);
            this.r = this.p.findViewById(R.id.content_layout);
            this.s = this.p.findViewById(R.id.click_overlay);
            this.t = this.r.findViewById(R.id.content_background);
            view = this.m.l;
            if (view == null) {
                view = this.f;
            }
            this.F = view;
            a();
            b();
            kqk2 = this.m;
            akkq akkq = kqk2.b;
            akvp akvp = kqk2.d;
            akvo akvo = kqk2.e;
            View view2 = this.f;
            View view3 = this.o;
            View view4 = this.r;
            Context context = kqk2.a;
            this.c = new kqi(akkq, akvp, akvo, view2, view3, view4, context, kqk2.c, kqk2.m, kqk2.n, kqk2.o, kqk2.p, kqk2.q, new flu(context));
            c();
            d();
            return;
        }
        this.g = LayoutInflater.from(this.m.a).inflate(i2, this.m.k, false);
        this.p = this.g.findViewById(R.id.ad_view);
        this.r = this.p.findViewById(R.id.content_layout);
        this.s = this.p.findViewById(R.id.click_overlay);
        this.t = this.r.findViewById(R.id.content_background);
        this.u = this.r.findViewById(R.id.thumbnail_wrapper);
        view = this.m.l;
        if (view == null) {
            view = this.p;
        }
        this.F = view;
        a();
        b();
        kqk2 = this.m;
        this.d = new kql(kqk2.b, kqk2.d, kqk2.e, this.g, this.r);
        c();
        this.b.a(this.u, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        d();
    }

    private final void a() {
        this.v = this.r.findViewById(R.id.channel_thumbnail);
        this.w = (TextView) this.r.findViewById(R.id.title);
        this.x = (TextView) this.r.findViewById(R.id.description);
        this.y = this.r.findViewById(R.id.ad_attribution);
        this.z = (TextView) this.r.findViewById(R.id.rating_text);
        this.B = (RatingBar) this.r.findViewById(R.id.rating_bar);
        this.C = (TextView) this.r.findViewById(R.id.price_text);
        this.D = this.r.findViewById(R.id.cta_button_wrapper);
        this.E = this.D.findViewById(R.id.cta_button_touchable_wrapper);
        this.q = this.r.findViewById(R.id.close_button);
        this.A = this.r.findViewById(R.id.contextual_menu_anchor);
    }

    private final void b() {
        this.a = new kvl();
        kqk kqk = this.m;
        Context context = kqk.a;
        aaas aaas = kqk.c;
        vod vod = kqk.h;
        vmn vmn = kqk.f;
        tpu tpu = kqk.g;
        dwk dwk = kqk.j;
        xci xci = kqk.i;
        View view = this.g;
        View view2 = this.r;
        View view3 = this.s;
        View view4 = this.F;
        View view5 = this.q;
        View view6 = this.A;
        kvo kvo = r2;
        kqp kqp = r1;
        kqp kqp2 = new kqp(this);
        kqo kqo = r1;
        kqo kqo2 = new kqo(this);
        kvo kvo2 = new kvo(context, aaas, vod, vmn, tpu, dwk, xci, view, view2, view3, view4, view5, view6, kqp, kqo, this.a);
        this.b = kvo;
    }

    private final void c() {
        this.n = new kpp(this.b, (ViewStub) this.g.findViewById(R.id.muted_ad_view_stub), new kqr(this));
        this.e = new krj(this.b, this.n, this.p);
    }

    private final void d() {
        this.b.a(this.w, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        this.b.a(this.x, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        this.b.a(this.y, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        this.b.a(this.z, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        this.b.a(this.B, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        this.b.a(this.C, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_PRICE);
        this.b.a(this.t, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        this.b.a(this.E, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        this.b.a(this.v, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_ADVERTISER_AD_ICON);
    }
}
