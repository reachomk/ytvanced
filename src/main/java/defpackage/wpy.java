package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: wpy */
final /* synthetic */ class wpy implements OnClickListener {
    private final wpw a;
    private final ayae b;

    wpy(wpw wpw, ayae ayae) {
        this.a = wpw;
        this.b = ayae;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        wpw wpw = this.a;
        ayae ayae = this.b;
        if (i == -1) {
            dialogInterface.dismiss();
            Context context = wpw.a;
            aphj aphj = ayae.e;
            if (aphj == null) {
                aphj = aphj.d;
            }
            akcq.a(context, wpw.a(aphj), wpw.b, wpw.c, wpw.a());
        }
    }
}
