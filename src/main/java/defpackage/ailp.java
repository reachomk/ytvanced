package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: ailp */
public abstract class ailp {
    private AnimatorSet a;

    public abstract bcpu a();

    public abstract amul b();

    public abstract amul c();

    public final void d() {
        AnimatorSet animatorSet = this.a;
        if (animatorSet == null) {
            this.a = new AnimatorSet();
            ArrayList arrayList = new ArrayList(b().size());
            bcql bcql = bcpu.a;
            amxn amxn = (amxn) b().listIterator();
            while (amxn.hasNext()) {
                View view = (View) amxn.next();
                ArrayList arrayList2 = new ArrayList(c().size());
                amxn amxn2 = (amxn) c().listIterator();
                while (amxn2.hasNext()) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{((ailo) amxn2.next()).a(), ((ailo) amxn2.next()).b()});
                    ofFloat.setDuration(r7.c().b);
                    arrayList2.add(ofFloat);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playSequentially(arrayList2);
                animatorSet2.setStartDelay(bcql.b);
                arrayList.add(animatorSet2);
                bcpu a = a();
                if (a != null) {
                    long j = a.b;
                    if (j != 0) {
                        bcql = new bcpu(bcrr.a(bcql.b, bcrr.a(j, 1)));
                    }
                }
            }
            this.a.playTogether(arrayList);
        } else if (animatorSet.isStarted()) {
            return;
        }
        amxn amxn3 = (amxn) b().listIterator();
        while (amxn3.hasNext()) {
            View view2 = (View) amxn3.next();
            view2.setVisibility(0);
            view2.setAlpha(!c().isEmpty() ? ((ailo) c().get(0)).a() : 0.0f);
        }
        this.a.start();
    }

    public final void e() {
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null) {
            animatorSet.end();
        }
    }

    public static ailq f() {
        ailh ailh = new ailh();
        ailh.a(bcpu.a(200));
        return ailh;
    }
}
