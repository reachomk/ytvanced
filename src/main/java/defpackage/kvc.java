package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.youtube.R;

/* renamed from: kvc */
public final class kvc implements akot {
    private final Context a;
    private final akkq b;
    private final aaas c;
    private final akvp d;
    private final akvo e;
    private final vmn f;
    private final tpu g;
    private final vod h;
    private final dwk i;
    private final xci j;
    private final FrameLayout k;
    private kve l;
    private kuz m;
    private boolean n;

    protected kvc(Context context, akkq akkq, aaas aaas, akvp akvp, akvo akvo, vmn vmn, tpu tpu, vod vod, dwk dwk, xci xci) {
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
        this.k = new FrameLayout(context);
    }

    public final View K_() {
        return this.k;
    }

    public final void a(akpb akpb) {
        if (this.n) {
            this.l.b.a();
        } else {
            this.m.a(akpb);
        }
    }

    private static int a(akor akor) {
        Object a = akor.a("horizontalShelfColumnCountSupplier");
        return a instanceof akvj ? ((akvj) a).b() : 1;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        acwb acwb = akor;
        Object obj2 = (ajzg) obj;
        int a = kvc.a(akor);
        this.k.removeAllViews();
        boolean z = a > 1 || !obj2.e;
        this.n = z;
        if (z) {
            if (this.l == null) {
                Context context = this.a;
                akkq akkq = this.b;
                aaas aaas = this.c;
                akvp akvp = this.d;
                akvo akvo = this.e;
                vmn vmn = this.f;
                tpu tpu = this.g;
                vod vod = this.h;
                this.l = new kve(context, akkq, aaas, akvp, akvo, vmn, tpu, vod, this.i, this.j, this.k);
            }
            kve kve = this.l;
            amqw.a(obj2);
            kve.h = acwb.a;
            aphg aphg = (aphg) ajzv.a(obj2.a.j, aphg.class);
            aviq aviq = (aviq) ajzv.a(obj2.c, aviq.class);
            krg krg = kve.a;
            ajyq ajyq = obj2.a;
            krg.a(ajyq.h, ajyq.m);
            kve.b.a(acwb.a, obj2, obj2.g, obj2.a, obj2.b, obj2.f, obj2.d);
            kve.c.a(acwb.a, obj2, obj2.a, aviq);
            int a2 = kvc.a(akor);
            kve.e.postInvalidate();
            LayoutParams layoutParams = (LayoutParams) kve.g.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) kve.f.getLayoutParams();
            Resources resources = kve.e.getResources();
            if (a2 > 1) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
                layoutParams2.width = 0;
                layoutParams2.weight = (float) (a2 - 1);
            } else {
                layoutParams.width = (int) resources.getDimension(R.dimen.list_item_thumbnail_width);
                layoutParams.weight = 0.0f;
                layoutParams2.width = -2;
                layoutParams2.weight = 1.0f;
            }
            kve.d.a(kve.h, aphg, aviq);
            this.k.addView(this.l.e);
            return;
        }
        if (this.m == null) {
            this.m = new kuz(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, null);
        }
        kuz kuz = this.m;
        amqw.a(obj2);
        kuz.a(akor, obj2, obj2.g, obj2.a, obj2.b, (aviq) ajzv.a(obj2.c, aviq.class), obj2.f, obj2.d);
        this.k.addView(this.m.c);
    }
}
