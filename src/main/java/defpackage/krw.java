package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* renamed from: krw */
public final class krw implements akot {
    public final Context a;
    public final akkq b;
    public final aaas c;
    public final akvp d;
    public final akvo e;
    public final vmn f;
    public final tpu g;
    public final vod h;
    public final xci i;
    public final ViewGroup j;
    public final FrameLayout k;
    public final dwk l;
    private final Resources m;
    private kry n;
    private kry o;
    private kry p;

    protected krw(Context context, akkq akkq, aaas aaas, akvp akvp, akvo akvo, vmn vmn, tpu tpu, vod vod, dwk dwk, xci xci, ViewGroup viewGroup) {
        this.a = context;
        this.b = akkq;
        this.c = aaas;
        this.d = akvp;
        this.e = akvo;
        this.f = vmn;
        this.g = tpu;
        this.h = vod;
        this.l = dwk;
        this.i = xci;
        this.m = context.getResources();
        this.j = viewGroup;
        this.k = new FrameLayout(context);
    }

    public final View K_() {
        return this.k;
    }

    public final void a(akpb akpb) {
        amqw.a(this.p);
        this.p.b.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        obj = (ajyr) obj;
        amqw.a((Object) akor);
        amqw.a(obj);
        this.k.removeAllViews();
        if (this.m.getBoolean(R.bool.sparkles_text_on_home_use_landscape_layout)) {
            if (this.o == null) {
                this.o = new kry(this, R.layout.promoted_sparkles_text_ctd_home_landscape);
            }
            this.p = this.o;
        } else {
            if (this.n == null) {
                this.n = new kry(this, R.layout.promoted_sparkles_text_ctd_home);
            }
            this.p = this.n;
        }
        kry kry = this.p;
        ajyp ajyp = obj.a;
        Object[] objArr = obj.b;
        aviq aviq = (aviq) ajzv.a(obj.c, aviq.class);
        aojc aojc = obj.d;
        kry.f = akor.a;
        aphg aphg = (aphg) ajzv.a(ajyp.m, aphg.class);
        kry.a.a(ajyp.k, ajyp.p);
        kry.b.a(akor.a, obj, obj.f, ajyp, objArr, aojc, obj.e);
        kry.c.a(kry.f, obj, ajyp, aviq);
        kry.d.a(kry.f, aphg, aviq);
        this.k.addView(this.p.e);
    }
}
