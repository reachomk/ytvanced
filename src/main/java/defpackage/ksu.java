package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ksu */
public final class ksu implements akot {
    private ajyp A;
    private ajyo B;
    private aphg C;
    private aviq D;
    public final ksv a;
    public final krj b;
    public final View c;
    public boolean d;
    private final kpp e;
    private final kqy f;
    private final kvo g;
    private final kqw h;
    private final View i = this.c.findViewById(R.id.ad_view);
    private final View j = this.i.findViewById(R.id.content_layout);
    private final View k = this.i.findViewById(R.id.click_overlay);
    private final View l = this.j.findViewById(R.id.content_background);
    private final View m = this.j.findViewById(R.id.thumbnail_wrapper);
    private final TextView n = ((TextView) this.j.findViewById(R.id.title));
    private final TextView o = ((TextView) this.j.findViewById(R.id.description));
    private final View p = this.j.findViewById(R.id.ad_attribution);
    private final TextView q = ((TextView) this.j.findViewById(R.id.app_store_text));
    private final TextView r = ((TextView) this.j.findViewById(R.id.rating_text));
    private final RatingBar s = ((RatingBar) this.j.findViewById(R.id.rating));
    private final TextView t = ((TextView) this.j.findViewById(R.id.price));
    private final View u = this.j.findViewById(R.id.cta_button_wrapper);
    private final View v = this.u.findViewById(R.id.cta_button_touchable_wrapper);
    private final View w = this.j.findViewById(R.id.close_button);
    private final View x = this.j.findViewById(R.id.contextual_menu_anchor);
    private acvx y;
    private Object z;

    protected ksu(Context context, akkq akkq, aaas aaas, akvp akvp, akvo akvo, vmn vmn, tpu tpu, vod vod, dwk dwk, xci xci, ViewGroup viewGroup) {
        amqw.a((Object) vmn);
        this.c = LayoutInflater.from(context).inflate(R.layout.promoted_sparkles_text_ctd_watch_15_click, viewGroup, false);
        dwk dwk2 = dwk;
        this.f = new kqy(dwk2, new ksx(this));
        View view = this.c;
        View view2 = this.j;
        View view3 = this.k;
        View view4 = this.w;
        View view5 = this.x;
        ksw ksw = new ksw(this);
        ksz ksz = new ksz(this);
        ksz ksz2 = ksz;
        this.g = new kvo(context, aaas, vod, vmn, tpu, dwk2, xci, view, view2, view3, view4, view5, ksw, ksz2, this.f);
        this.a = new ksv(akkq, akvp, akvo, this.c, this.j, true);
        this.h = new kqw(akkq, akvp, this.j);
        this.e = new kpp(this.g, (ViewStub) this.c.findViewById(R.id.muted_ad_view_stub), new ksy(this));
        this.b = new krj(this.g, this.e, this.i);
        this.g.a(this.n, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        this.g.a(this.v, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        this.g.a(this.q, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_APP_STORE);
        this.g.a(this.p, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        this.g.a(this.l, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        this.g.a(this.o, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        this.g.a(this.t, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_PRICE);
        this.g.a(this.r, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        this.g.a(this.s, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        this.g.a(this.m, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
    }

    public final void a(boolean z) {
        this.h.a();
        this.a.a(this.y, this.z, this.A, this.D);
        awqz awqz = null;
        this.h.a = this.A.u ? Integer.valueOf(3) : null;
        kqw kqw = this.h;
        ajyp ajyp = this.A;
        ajyo ajyo = this.B;
        boolean z2 = this.d;
        arwf arwf = ajyp.d;
        arwf arwf2 = ajyo.a;
        Spanned a = ajqy.a(ajyo.b);
        Spanned a2 = ajqy.a(ajyo.c);
        aohe aohe = (aohe) ajzv.a(ajyo.f, aohe.class);
        awqw awqw = ajyo.g;
        if (awqw != null) {
            awqz = (awqz) ((anxo) awqw.toBuilder());
        }
        kqw.a(arwf, arwf2, a, a2, aohe, awqz, ajyo.h, z, z2);
    }

    public final View K_() {
        return this.c;
    }

    public final void a(akpb akpb) {
        this.g.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        Object obj2 = (ajyu) obj;
        amqw.a(obj2);
        this.y = akor.a;
        this.z = obj2;
        this.A = obj2.a;
        this.B = obj2.b;
        this.C = (aphg) ajzv.a(this.A.m, aphg.class);
        this.D = (aviq) ajzv.a(obj2.d, aviq.class);
        kqy kqy = this.f;
        ajyo ajyo = obj2.b;
        String str = obj2.g;
        ajyp ajyp = obj2.a;
        kqy.a(ajyo, str, ajyp.k, ajyp.p, ajyo.d, ajyo.e);
        this.g.a(akor.a, obj2, obj2.g, obj2.a, obj2.c, obj2.f, obj2.e);
        this.d = false;
        a(this.f.b());
        this.b.a(this.y, this.C, this.D);
    }
}
