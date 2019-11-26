package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: amj */
final class amj implements Runnable {
    private final /* synthetic */ ArrayList a;
    private final /* synthetic */ amg b;

    amj(amg amg, ArrayList arrayList) {
        this.b = amg;
        this.a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            amq amq = (amq) arrayList.get(i);
            amg amg = this.b;
            aqj aqj = amq.a;
            int i2 = amq.b;
            int i3 = amq.c;
            int i4 = amq.d;
            int i5 = amq.e;
            View view = aqj.a;
            i4 -= i2;
            i5 -= i3;
            if (i4 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i5 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            amg.e.add(aqj);
            animate.setDuration(amg.k).setListener(new amm(amg, aqj, i4, view, i5, animate)).start();
        }
        this.a.clear();
        this.b.b.remove(this.a);
    }
}
