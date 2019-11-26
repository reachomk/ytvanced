package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: nib */
final /* synthetic */ class nib implements OnClickListener {
    private final nhv a;

    nib(nhv nhv) {
        this.a = nhv;
    }

    public final void onClick(View view) {
        this.a.b(view.getId());
    }
}
