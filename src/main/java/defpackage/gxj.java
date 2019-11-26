package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: gxj */
final class gxj implements OnClickListener {
    public final /* synthetic */ gxf a;

    gxj(gxf gxf) {
        this.a = gxf;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.b(new gxi(this));
        dialogInterface.dismiss();
    }
}
