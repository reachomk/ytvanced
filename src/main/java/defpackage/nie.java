package defpackage;

import android.view.View;

/* renamed from: nie */
public final /* synthetic */ class nie implements nhz {
    private final nic a;
    private final View b;

    public nie(nic nic, View view) {
        this.a = nic;
        this.b = view;
    }

    public final void a(boolean z) {
        nic nic = this.a;
        View view = this.b;
        boolean z2 = false;
        if (z && !nic.d) {
            z2 = true;
        }
        xpr.a(view, z2);
    }
}
