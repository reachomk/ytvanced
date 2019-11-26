package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: ahay */
final /* synthetic */ class ahay implements OnClickListener {
    private final ahaw a;
    private final ahcr b;

    ahay(ahaw ahaw, ahcr ahcr) {
        this.a = ahaw;
        this.b = ahcr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ahaw ahaw = this.a;
        ahcr ahcr = this.b;
        if (ahcr != null) {
            ahcr.b();
        }
        ahaw.a();
    }
}
