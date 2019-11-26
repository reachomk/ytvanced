package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: yby */
final class yby implements OnClickListener {
    private final /* synthetic */ ybv a;

    yby(ybv ybv) {
        this.a = ybv;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.dismiss();
    }
}
