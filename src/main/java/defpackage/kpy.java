package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kpy */
final class kpy {
    private View A;
    private View B;
    private View C;
    private final View D;
    public kvi a;
    public kvo b;
    public kpu c;
    public kpx d;
    public krj e;
    public View f;
    public final View g;
    public acvx h;
    public aphg i;
    public aviq j;
    public final boolean k;
    public boolean l;
    public final /* synthetic */ kpw m;
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

    public kpy(kpw kpw, int i, boolean z) {
        int i2 = i;
        boolean z2 = z;
        this.m = kpw;
        this.k = z2;
        View view;
        kpw kpw2;
        if (z2) {
            this.f = LayoutInflater.from(this.m.a).inflate(i2, this.m.k, false);
            ViewStub viewStub = (ViewStub) this.f.findViewById(R.id.promoted_discovery_action_portrait_thumbnail_stub);
            this.g = ((ViewStub) this.f.findViewById(R.id.promoted_discovery_action_portrait_metadata_stub)).inflate();
            this.o = viewStub.inflate();
            this.p = this.g.findViewById(R.id.ad_view);
            this.r = this.p.findViewById(R.id.content_layout);
            this.s = this.p.findViewById(R.id.click_overlay);
            this.t = this.r.findViewById(R.id.content_background);
            view = this.m.l;
            if (view == null) {
                view = this.f;
            }
            this.D = view;
            a();
            b();
            kpw2 = this.m;
            akkq akkq = kpw2.b;
            akvp akvp = kpw2.d;
            akvo akvo = kpw2.e;
            View view2 = this.f;
            View view3 = this.o;
            View view4 = this.r;
            Context context = kpw2.a;
            this.c = new kpu(akkq, akvp, akvo, view2, view3, view4, context, kpw2.c, kpw2.m, kpw2.n, kpw2.o, kpw2.p, kpw2.q, new flu(context));
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
        this.D = view;
        a();
        b();
        kpw2 = this.m;
        this.d = new kpx(kpw2.b, kpw2.d, kpw2.e, this.g, this.r);
        c();
        this.b.a(this.u, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        d();
    }

    private final void a() {
        this.v = this.r.findViewById(R.id.channel_thumbnail);
        this.w = (TextView) this.r.findViewById(R.id.title);
        this.x = (TextView) this.r.findViewById(R.id.description);
        this.y = this.r.findViewById(R.id.ad_attribution);
        this.z = (TextView) this.r.findViewById(R.id.advertiser_name_or_website);
        this.B = this.r.findViewById(R.id.cta_button_wrapper);
        this.C = this.B.findViewById(R.id.cta_button_touchable_wrapper);
        this.q = this.r.findViewById(R.id.close_button);
        this.A = this.r.findViewById(R.id.contextual_menu_anchor);
    }

    private final void b() {
        this.a = new kvi();
        kpw kpw = this.m;
        Context context = kpw.a;
        aaas aaas = kpw.c;
        vod vod = kpw.h;
        vmn vmn = kpw.f;
        tpu tpu = kpw.g;
        dwk dwk = kpw.j;
        xci xci = kpw.i;
        View view = this.g;
        View view2 = this.r;
        View view3 = this.s;
        View view4 = this.D;
        View view5 = this.q;
        View view6 = this.A;
        kvo kvo = r2;
        kqb kqb = r1;
        kqb kqb2 = new kqb(this);
        kqa kqa = r1;
        kqa kqa2 = new kqa(this);
        kvo kvo2 = new kvo(context, aaas, vod, vmn, tpu, dwk, xci, view, view2, view3, view4, view5, view6, kqb, kqa, this.a);
        this.b = kvo;
    }

    private final void c() {
        this.n = new kpp(this.b, (ViewStub) this.g.findViewById(R.id.muted_ad_view_stub), new kqd(this));
        this.e = new krj(this.b, this.n, this.p);
    }

    private final void d() {
        this.b.a(this.w, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        this.b.a(this.x, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        this.b.a(this.y, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        this.b.a(this.z, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_AD_WEBSITE);
        this.b.a(this.t, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        this.b.a(this.C, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        this.b.a(this.v, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_ADVERTISER_AD_ICON);
    }
}
