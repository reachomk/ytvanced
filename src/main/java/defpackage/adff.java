package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: adff */
final /* synthetic */ class adff implements OnClickListener {
    private final adfd a;

    adff(adfd adfd) {
        this.a = adfd;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        adfd adfd = this.a;
        adfd.Z.a();
        adfd.dismiss();
    }
}
