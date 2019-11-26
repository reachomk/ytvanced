package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: mst */
final class mst implements OnClickListener {
    private final aajq[] a;
    private final /* synthetic */ mss b;

    mst(mss mss, aajq[] aajqArr) {
        this.b = mss;
        this.a = (aajq[]) amqw.a((Object) aajqArr);
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.h.a(this.a[i].a);
        dialogInterface.dismiss();
        mss mss = this.b;
        mss.startAnimation(mss.e);
    }
}
