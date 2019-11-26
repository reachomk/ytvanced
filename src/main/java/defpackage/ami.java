package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: ami */
final class ami implements Runnable {
    private final /* synthetic */ ArrayList a;
    private final /* synthetic */ amg b;

    ami(amg amg, ArrayList arrayList) {
        this.b = amg;
        this.a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            amr amr = (amr) arrayList.get(i);
            amg amg = this.b;
            aqj aqj = amr.a;
            View view = null;
            View view2 = aqj != null ? aqj.a : null;
            aqj aqj2 = amr.b;
            if (aqj2 != null) {
                view = aqj2.a;
            }
            if (view2 != null) {
                ViewPropertyAnimator duration = view2.animate().setDuration(amg.l);
                amg.g.add(amr.a);
                duration.translationX((float) (amr.e - amr.c));
                duration.translationY((float) (amr.f - amr.d));
                duration.alpha(0.0f).setListener(new amp(amg, amr, duration, view2)).start();
            }
            if (view != null) {
                ViewPropertyAnimator animate = view.animate();
                amg.g.add(amr.b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(amg.l).alpha(1.0f).setListener(new amo(amg, amr, animate, view)).start();
            }
        }
        this.a.clear();
        this.b.c.remove(this.a);
    }
}
