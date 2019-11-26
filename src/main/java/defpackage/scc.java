package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: scc */
final class scc implements OnClickListener {
    private final /* synthetic */ sbz a;

    scc(sbz sbz) {
        this.a = sbz;
    }

    public final void onClick(View view) {
        try {
            this.a.j.h();
        } catch (sbt | sbv e) {
            sdf.a(sbz.g, "Failed to move to the previous item in the queue", e);
        }
    }
}
