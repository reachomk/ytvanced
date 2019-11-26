package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: isj */
final class isj implements OnClickListener {
    private final /* synthetic */ isk a;
    private final /* synthetic */ isg b;

    isj(isg isg, isk isk) {
        this.b = isg;
        this.a = isk;
    }

    public final void onClick(View view) {
        isl isl = this.b.c;
        if (isl != null) {
            isl.a(this.a.d);
        }
    }
}
