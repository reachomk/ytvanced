package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: dvl */
final class dvl implements OnDismissListener {
    private final /* synthetic */ dvg a;

    dvl(dvg dvg) {
        this.a = dvg;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.finish();
    }
}
