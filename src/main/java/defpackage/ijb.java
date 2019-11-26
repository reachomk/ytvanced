package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ijb */
final /* synthetic */ class ijb implements OnClickListener {
    private final acvx a;
    private final iin b;
    private final ails c;

    ijb(acvx acvx, iin iin, ails ails) {
        this.a = acvx;
        this.b = iin;
        this.c = ails;
    }

    public final void onClick(View view) {
        acvx acvx = this.a;
        iin iin = this.b;
        ails ails = this.c;
        acvx.a(3, new acvs(iin.b()), null);
        int a = iin.a();
        if (a != 0) {
            if (a == 1 && ails.d.b()) {
                ails.a(1);
            }
        } else if (ails.d.a() && !ails.d.f()) {
            ails.b(1);
        }
    }
}
