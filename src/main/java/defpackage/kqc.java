package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* renamed from: kqc */
public final class kqc implements akot {
    public final Context a;
    public final akkq b;
    public final aaas c;
    public final akvp d;
    public final akvo e;
    public final vmn f;
    public final tpu g;
    public final vod h;
    public final xci i;
    public final dwk j;
    public final ViewGroup k;
    public final FrameLayout l;
    private final Resources m;
    private kqe n;
    private kqe o;
    private kqe p;

    protected kqc(Context context, akkq akkq, aaas aaas, akvp akvp, akvo akvo, vmn vmn, tpu tpu, vod vod, xci xci, ViewGroup viewGroup, dwk dwk) {
        this.a = context;
        this.b = akkq;
        this.c = aaas;
        this.d = akvp;
        this.e = akvo;
        this.f = vmn;
        this.g = tpu;
        this.h = vod;
        this.i = xci;
        this.j = dwk;
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
        obj = (ajyj) obj;
        amqw.a((Object) akor);
        amqw.a(obj);
        this.l.removeAllViews();
        if (this.m.getBoolean(R.bool.discovery_app_promo_compact_form_use_landscape_layout)) {
            if (this.o == null) {
                this.o = new kqe(this, R.layout.promoted_discovery_app_promo_compact_form_landscape);
            }
            this.p = this.o;
        } else {
            if (this.n == null) {
                this.n = new kqe(this, R.layout.promoted_discovery_app_promo_compact_form_portrait);
            }
            this.p = this.n;
        }
        kqe kqe = this.p;
        ajym ajym = obj.a;
        Object[] objArr = obj.b;
        aojc aojc = obj.c;
        kqe.f = akor.a;
        aphg aphg = (aphg) ajzv.a(ajym.k, aphg.class);
        kqe.a.a(ajym.h, new apxu[]{ajym.j});
        kqe.b.a(akor.a, obj, obj.e, ajym, objArr, aojc, obj.d);
        kqe.c.a(kqe.f, obj, ajym);
        kqe.d.a(kqe.f, aphg, null);
        this.l.addView(this.p.e);
    }
}
