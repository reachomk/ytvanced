package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: wpx */
final /* synthetic */ class wpx implements OnClickListener {
    private final wpu a;
    private final aphg b;

    wpx(wpu wpu, aphg aphg) {
        this.a = wpu;
        this.b = aphg;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a.c.a(3, new acvs(this.b.r), null);
    }
}
