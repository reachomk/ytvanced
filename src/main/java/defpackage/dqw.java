package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: dqw */
final /* synthetic */ class dqw implements OnClickListener {
    private final dqu a;
    private final afqe b;
    private final Activity c;

    dqw(dqu dqu, afqe afqe, Activity activity) {
        this.a = dqu;
        this.b = afqe;
        this.c = activity;
    }

    public final void onClick(View view) {
        dqu dqu = this.a;
        afqe afqe = this.b;
        Activity activity = this.c;
        if (dqu.c.c()) {
            afqe.a(activity, null, null);
        } else {
            dqu.d.a();
        }
    }
}
