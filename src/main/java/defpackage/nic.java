package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: nic */
public final class nic {
    public final nhv a;
    public final Map b = new HashMap();
    public final OnClickListener c;
    public boolean d;

    public nic(nhv nhv) {
        this.a = nhv;
        this.c = new nib(nhv);
    }

    public final void a(boolean z) {
        if (z != this.d) {
            this.d = z;
            for (View view : this.b.keySet()) {
                boolean z2 = false;
                if (this.a.a(view.getId()) && !z) {
                    z2 = true;
                }
                xpr.a(view, z2);
            }
        }
    }

    public final void a(bcvk bcvk) {
        bctz.a(this.b.keySet()).a(bcvk);
    }
}
