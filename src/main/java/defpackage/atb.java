package defpackage;

import android.animation.Animator;
import android.view.View;

/* renamed from: atb */
final class atb extends atk {
    private final /* synthetic */ int n;
    private final /* synthetic */ aqj o;
    private final /* synthetic */ ata p;

    atb(ata ata, aqj aqj, int i, float f, float f2, float f3, float f4, int i2, aqj aqj2) {
        this.p = ata;
        this.n = i2;
        this.o = aqj2;
        super(aqj, i, f, f2, f3, f4);
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (!this.k) {
            ata ata;
            if (this.n <= 0) {
                atg.b(this.o);
            } else {
                this.p.a.add(this.o.a);
                this.h = true;
                if (this.n > 0) {
                    ata = this.p;
                    ata.p.post(new ate(ata, this));
                }
            }
            ata = this.p;
            View view = ata.s;
            View view2 = this.o.a;
            if (view == view2) {
                ata.b(view2);
            }
        }
    }
}
