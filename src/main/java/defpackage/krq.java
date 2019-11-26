package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* renamed from: krq */
public final class krq implements akot {
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
    private krs n;
    private krs o;
    private krs p;

    protected krq(Context context, akkq akkq, aaas aaas, akvp akvp, akvo akvo, vmn vmn, tpu tpu, vod vod, dwk dwk, xci xci, ViewGroup viewGroup) {
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
        obj = (ajys) obj;
        amqw.a((Object) akor);
        amqw.a(obj);
        this.k.removeAllViews();
        if (this.m.getBoolean(R.bool.sparkles_text_on_home_use_landscape_layout)) {
            if (this.o == null) {
                this.o = new krs(this, R.layout.promoted_sparkles_text_ctd_home_compact_form_landscape);
            }
            this.p = this.o;
        } else {
            if (this.n == null) {
                this.n = new krs(this, R.layout.promoted_sparkles_text_ctd_home_compact_form);
            }
            this.p = this.n;
        }
        krs krs = this.p;
        ajyp ajyp = obj.a;
        Object[] objArr = obj.b;
        aviq aviq = (aviq) ajzv.a(obj.c, aviq.class);
        aojc aojc = obj.d;
        krs.f = akor.a;
        aphg aphg = (aphg) ajzv.a(ajyp.m, aphg.class);
        krs.a.a(ajyp.k, ajyp.p);
        krs.b.a(akor.a, obj, obj.f, ajyp, objArr, aojc, obj.e);
        krs.c.a(krs.f, obj, ajyp, aviq);
        krs.d.a(krs.f, aphg, aviq);
        this.k.addView(this.p.e);
    }
}
