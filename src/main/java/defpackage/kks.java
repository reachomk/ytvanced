package defpackage;

import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.youtube.R;

/* renamed from: kks */
final /* synthetic */ class kks implements OnClickListener {
    private final kkt a;

    kks(kkt kkt) {
        this.a = kkt;
    }

    public final void onClick(View view) {
        acwc acwc;
        acwc acwc2;
        kkt kkt = this.a;
        boolean b = kkt.b();
        kkt.i.setExtension(akax.a, Boolean.valueOf(b ^ 1));
        if (!b) {
            lui lui = kkt.b.a;
            if (lui != null) {
                lui.j();
            }
        }
        ValueAnimator valueAnimator = kkt.h;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            kkt.h.cancel();
        }
        kkt.c.a();
        bhj bhj = new bhj();
        long j = bhj.c;
        bgx eyx = new eyx();
        eyx.a((int) R.id.expand_button);
        bgx bhj2 = new bhj();
        bhj2.a(new bfl());
        bhj2.a(new bga());
        bhj2.a(new bfv());
        bhj bhj3 = (bhj) bhj2.a((int) R.id.title);
        bhj3 = (bhj) bhj2.a((int) R.id.subtitle);
        bhj3 = (bhj) bhj2.a((int) R.id.subtitleLong);
        bhj3 = (bhj) bhj2.a((int) R.id.view_container);
        bhj3 = (bhj) bhj2.a((int) R.id.bottom_separator);
        bhj3 = (bhj) bhj2.a((int) R.id.description);
        bhj3 = (bhj) bhj2.a((int) R.id.metadata_rows);
        kkt.a(kkt.d, bhj2);
        bhj3 = (bhj) bhj2.a((int) R.id.buttons_container);
        kkt.a(kkt.f, bhj2);
        bhj3 = (bhj) bhj2.a((int) R.id.top_standalone_collection_badge);
        bhj3 = (bhj) bhj2.a((int) R.id.under_badges);
        kkw kkw = kkt.e;
        for (int i = 0; i < kkw.l.getChildCount(); i++) {
            bhj2.c(kkw.l.getChildAt(i));
        }
        klh klh = kkt.g;
        if (klh != null) {
            bhj bhj4 = (bhj) bhj2.c(klh.a);
            bhj4 = (bhj) bhj2.c(klh.b);
            bhj4 = (bhj) bhj2.c(klh.c);
            bhj4 = (bhj) bhj2.c(klh.d);
            bhj4 = (bhj) bhj2.c(klh.e);
            bhj4 = (bhj) bhj2.c(klh.f);
            bhj4 = (bhj) bhj2.c(klh.g);
            bhj4 = (bhj) bhj2.c(klh.h);
            bhj4 = (bhj) bhj2.c(klh.j);
            View view2 = klh.k;
            if (view2 != null) {
                bhj3 = (bhj) bhj2.c(view2);
            }
        }
        bhj.a(eyx);
        bhj.a(bhj2);
        bhf.a(kkt.c, bhj);
        kkt.h = ValueAnimator.ofObject(new FloatEvaluator(), new Object[]{Integer.valueOf(0), Float.valueOf(1.0f)});
        if (j >= 0) {
            kkt.h.setDuration(j);
        }
        kkz kkz = new kkz(kkt);
        kkt.h.addUpdateListener(kkz);
        kkt.h.addListener(kkz);
        kkt.h.start();
        kkt.c();
        if (b) {
            acwc = acwc.SLIM_VIDEO_METADATA_RENDERER_COLLAPSE_BUTTON;
            acwc2 = acwc.SLIM_VIDEO_METADATA_RENDERER_EXPAND_BUTTON;
        } else {
            acwc = acwc.SLIM_VIDEO_METADATA_RENDERER_EXPAND_BUTTON;
            acwc2 = acwc.SLIM_VIDEO_METADATA_RENDERER_COLLAPSE_BUTTON;
        }
        kkt.j.a(3, new acvs(acwc), null);
        kkt.a(acwc);
        kkt.b(acwc2);
    }
}
