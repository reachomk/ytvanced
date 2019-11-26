package defpackage;

import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: xyk */
final class xyk implements OnClickListener {
    private final /* synthetic */ xyf a;

    xyk(xyf xyf) {
        this.a = xyf;
    }

    public final void onClick(View view) {
        akmw e = this.a.e();
        if (e != null) {
            akmx akmx = this.a.b;
            Uri uri = xyf.a;
            if (!e.e) {
                e = new ycw(e.a, e.b, e.c, e.d, true, e.f, e.h, e.i, e.g);
            }
            akmx.a(uri, e);
        }
    }
}
