package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kut */
public final class kut implements akot {
    public final ktz a;
    public final krj b;
    public final View c;
    public boolean d;
    private final kpp e = new kpp(this.g, (ViewStub) this.c.findViewById(R.id.muted_ad_view_stub), new kux(this));
    private final kqy f;
    private final kvo g;
    private final kqw h;
    private acvx i;
    private Object j;
    private ajyq k;
    private ajyo l;
    private aviq m;

    public final void a(boolean z) {
        this.h.a();
        this.a.a(this.i, this.j, this.k, this.m);
        awqz awqz = null;
        this.h.a = this.k.r ? Integer.valueOf(3) : null;
        kqw kqw = this.h;
        ajyq ajyq = this.k;
        ajyo ajyo = this.l;
        boolean z2 = this.d;
        arwf arwf = ajyq.c;
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
        Object obj2 = (ajze) obj;
        amqw.a(obj2);
        this.i = akor.a;
        this.j = obj2;
        this.k = obj2.a;
        this.l = obj2.b;
        aphg aphg = (aphg) ajzv.a(this.k.j, aphg.class);
        this.m = (aviq) ajzv.a(obj2.d, aviq.class);
        kqy kqy = this.f;
        ajyo ajyo = obj2.b;
        String str = obj2.g;
        ajyq ajyq = obj2.a;
        kqy.a(ajyo, str, ajyq.h, ajyq.m, ajyo.d, ajyo.e);
        this.g.a(akor.a, obj2, obj2.g, obj2.a, obj2.c, obj2.f, obj2.e);
        this.d = false;
        a(this.f.b());
        this.b.a(this.i, aphg, this.m);
    }

    /* synthetic */ kut(Context context, akkq akkq, aaas aaas, akvp akvp, akvo akvo, vmn vmn, tpu tpu, vod vod, dwk dwk, xci xci, ViewGroup viewGroup) {
        amqw.a((Object) vmn);
        this.c = LayoutInflater.from(context).inflate(R.layout.promoted_sparkles_text_watch_15_click, viewGroup, false);
        View findViewById = this.c.findViewById(R.id.ad_view);
        View findViewById2 = findViewById.findViewById(R.id.content_layout);
        View findViewById3 = findViewById.findViewById(R.id.click_overlay);
        View findViewById4 = findViewById2.findViewById(R.id.content_background);
        View findViewById5 = findViewById2.findViewById(R.id.thumbnail_wrapper);
        View view = (TextView) findViewById2.findViewById(R.id.title);
        View view2 = (TextView) findViewById2.findViewById(R.id.description);
        View findViewById6 = findViewById2.findViewById(R.id.ad_attribution);
        View view3 = (TextView) findViewById2.findViewById(R.id.website);
        View findViewById7 = findViewById2.findViewById(R.id.cta_button_wrapper).findViewById(R.id.cta_button_touchable_wrapper);
        View view4 = (ImageView) findViewById2.findViewById(R.id.close_button);
        View findViewById8 = findViewById2.findViewById(R.id.contextual_menu_anchor);
        this.f = new kqy(dwk, new kus(this));
        View view5 = this.c;
        kuv kuv = new kuv(this);
        kuu kuu = new kuu(this);
        View view6 = findViewById;
        kqy kqy = this.f;
        kvo kvo = r3;
        View view7 = view3;
        View view8 = findViewById6;
        View view9 = view2;
        view2 = view5;
        View view10 = findViewById7;
        View view11 = view;
        View view12 = findViewById5;
        View view13 = findViewById4;
        kvo kvo2 = new kvo(context, aaas, vod, vmn, tpu, dwk, xci, view2, findViewById2, findViewById3, view4, findViewById8, kuv, kuu, kqy);
        this.g = kvo;
        akkq akkq2 = akkq;
        akvp akvp2 = akvp;
        this.a = new ktz(akkq2, akvp2, akvo, this.c, findViewById2, true);
        this.h = new kqw(akkq2, akvp2, findViewById2);
        this.b = new krj(this.g, this.e, view6);
        this.g.a(view11, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        this.g.a(view10, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        this.g.a(view8, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        this.g.a(view13, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        this.g.a(view9, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        this.g.a(view12, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        this.g.a(view7, awqg.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_AD_WEBSITE);
    }
}
