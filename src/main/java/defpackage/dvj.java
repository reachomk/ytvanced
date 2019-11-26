package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: dvj */
final class dvj implements OnCancelListener {
    private final /* synthetic */ dvg a;

    dvj(dvg dvg) {
        this.a = dvg;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a.finish();
    }
}
