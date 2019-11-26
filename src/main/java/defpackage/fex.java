package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: fex */
public final /* synthetic */ class fex implements OnClickListener {
    private final aqlh a;
    private final acvx b;

    public fex(aqlh aqlh, acvx acvx) {
        this.a = aqlh;
        this.b = acvx;
    }

    public final void onClick(View view) {
        aqlh aqlh = this.a;
        acvx acvx = this.b;
        if (acvx != null) {
            acvx.a(3, new acvs(aqlh.e), null);
        }
    }
}
