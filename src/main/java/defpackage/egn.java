package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;

/* renamed from: egn */
final class egn implements OnKeyListener {
    private final /* synthetic */ egl a;

    egn(egl egl) {
        this.a = egl;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1) {
            egp egp = this.a.ab;
            if (egp != null) {
                egs egs = egp.a;
                if (egs != null) {
                    egs.a();
                }
                return true;
            }
        }
        return false;
    }
}
