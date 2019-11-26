package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: aml */
final class aml implements Runnable {
    private final /* synthetic */ ArrayList a;
    private final /* synthetic */ amg b;

    aml(amg amg, ArrayList arrayList) {
        this.b = amg;
        this.a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            aqj aqj = (aqj) arrayList.get(i);
            amg amg = this.b;
            View view = aqj.a;
            ViewPropertyAnimator animate = view.animate();
            amg.d.add(aqj);
            animate.alpha(1.0f).setDuration(amg.i).setListener(new amn(amg, aqj, view, animate)).start();
        }
        this.a.clear();
        this.b.a.remove(this.a);
    }
}
