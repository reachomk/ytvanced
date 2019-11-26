package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: almc */
final class almc implements OnClickListener {
    private final /* synthetic */ alme a;
    private final /* synthetic */ almd b;

    almc(almd almd, alme alme) {
        this.b = almd;
        this.a = alme;
    }

    public final void onClick(View view) {
        if (!this.b.a.c()) {
            aatd aatd = this.b.b;
            if (aatd != null) {
                this.a.a(aatd);
            }
        }
    }
}
