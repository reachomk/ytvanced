package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* renamed from: ktn */
public final class ktn implements akot {
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
    private ktp n;
    private ktp o;
    private ktp p;

    protected ktn(Context context, akkq akkq, aaas aaas, akvp akvp, akvo akvo, vmn vmn, tpu tpu, vod vod, dwk dwk, xci xci, ViewGroup viewGroup) {
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
        obj = (ajyv) obj;
        amqw.a((Object) akor);
        amqw.a(obj);
        this.l.removeAllViews();
        if (this.m.getBoolean(R.bool.sparkles_text_on_home_use_landscape_layout)) {
            if (this.o == null) {
                this.o = new ktp(this, R.layout.promoted_sparkles_text_home_landscape);
            }
            this.p = this.o;
        } else {
            if (this.n == null) {
                this.n = new ktp(this, R.layout.promoted_sparkles_text_home);
            }
            this.p = this.n;
        }
        ktp ktp = this.p;
        ajyq ajyq = obj.a;
        Object[] objArr = obj.b;
        aviq aviq = (aviq) ajzv.a(obj.c, aviq.class);
        aojc aojc = obj.e;
        ktp.f = akor.a;
        aphg aphg = (aphg) ajzv.a(ajyq.j, aphg.class);
        ktp.a.a(ajyq.h, ajyq.m);
        ktp.b.a(akor.a, obj, obj.f, ajyq, objArr, aojc, obj.d);
        ktp.c.a(ktp.f, obj, ajyq, aviq);
        ktp.d.a(ktp.f, aphg, aviq);
        this.l.addView(this.p.e);
    }
}
