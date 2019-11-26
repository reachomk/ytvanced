package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: adup */
final /* synthetic */ class adup implements OnClickListener {
    private final aduq a;

    adup(aduq aduq) {
        this.a = aduq;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        aduq aduq = this.a;
        ((adus) aduq.U_()).a(aduq.j.getString("deviceId"));
    }
}
