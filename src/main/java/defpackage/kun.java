package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* renamed from: kun */
public final class kun implements akot {
    public final Context a;
    public final akkq b;
    public final aaas c;
    public final akvp d;
    public final akvo e;
    public final vmn f;
    public final tpu g;
    public final vod h;
    public final dwk i;
    public final xci j;
    public final ViewGroup k;
    public final FrameLayout l;
    private final Resources m;
    private kup n;
    private kup o;
    private kup p;

    protected kun(Context context, akkq akkq, aaas aaas, akvp akvp, akvo akvo, vmn vmn, tpu tpu, vod vod, dwk dwk, xci xci, ViewGroup viewGroup) {
        this.a = context;
        this.b = akkq;
        this.c = aaas;
        this.d = akvp;
        this.e = akvo;
        this.f = vmn;
        this.g = tpu;
        this.h = vod;
        this.i = dwk;
        this.j = xci;
        this.m = context.getResources();
        this.k = viewGroup;
        this.l = new FrameLayout(context);
    }

    public final View K_() {
        return this.l;
    }

    public final void a(akpb akpb) {
        amqw.a(this.p);
        this.p.b.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        acwb acwb = akor;
        Object obj2 = (ajzb) obj;
        amqw.a((Object) akor);
        amqw.a(obj2);
        this.l.removeAllViews();
        if (this.m.getBoolean(R.bool.sparkles_text_on_search_use_landscape_layout)) {
            if (this.o == null) {
                this.o = new kup(this, R.layout.promoted_sparkles_text_search_landscape);
            }
            this.p = this.o;
        } else {
            if (this.n == null) {
                this.n = new kup(this, R.layout.promoted_sparkles_text_search_potrait);
            }
            this.p = this.n;
        }
        kup kup = this.p;
        ajzc ajzc = obj2.a;
        awqo[] awqoArr = obj2.b;
        aviq aviq = (aviq) ajzv.a(obj2.c, aviq.class);
        aojc aojc = obj2.e;
        kup.f = acwb.a;
        aphg aphg = (aphg) ajzv.a(ajzc.f, aphg.class);
        kup.a.a(ajzc.d, ajzc.i);
        kvo kvo = kup.b;
        acvx acvx = acwb.a;
        aphg aphg2 = aphg;
        kvo kvo2 = kvo;
        acvx acvx2 = acvx;
        Object obj3 = obj2;
        ajzc ajzc2 = ajzc;
        aphg aphg3 = aphg2;
        aviq aviq2 = aviq;
        kvo2.a(acvx2, obj3, obj2.f, ajzc.e, awqoArr, ajzc2, ajzc.h, ajzc.g, aojc, obj2.d);
        kup.c.a(kup.f, obj2, ajzc, aviq2);
        kup.d.a(kup.f, aphg2, aviq2);
        this.l.addView(this.p.e);
    }
}
