package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: gpc */
final /* synthetic */ class gpc implements OnClickListener {
    private final gpa a;

    gpc(gpa gpa) {
        this.a = gpa;
    }

    public final void onClick(View view) {
        gph gph = this.a.l;
        if (gph != null) {
            gph.aa();
        }
    }
}
