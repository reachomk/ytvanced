package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ffj */
public final class ffj extends AnimatorListenerAdapter {
    private final /* synthetic */ ffg a;

    public ffj(ffg ffg) {
        this.a = ffg;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.c.setVisibility(0);
    }

    public final void onAnimationEnd(Animator animator) {
        ffg ffg = this.a;
        if (!(ffg.c == null || ffg.m == null || ffg.f != null)) {
            fff fff = ffg.e;
            if (!(!(fff instanceof ffe) || fff.e() == null || (((aqkx) this.a.e.e()).a & 64) == 0)) {
                aruh aruh;
                aqkv aqkv = ((aqkx) this.a.e.e()).f;
                if (aqkv == null) {
                    aqkv = aqkv.c;
                }
                if (aqkv.a == 102716411) {
                    aruh = (aruh) aqkv.b;
                } else {
                    aruh = aruh.j;
                }
                ffg ffg2 = this.a;
                ffg2.l.a(aruh, ffg2.c, ffg2.e.e(), this.a.m);
            }
        }
        this.a.c();
    }
}
