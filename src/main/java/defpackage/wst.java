package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;

/* renamed from: wst */
final /* synthetic */ class wst implements OnKeyListener {
    private final wsq a;

    wst(wsq wsq) {
        this.a = wsq;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        wsq wsq = this.a;
        if (i == 4 && keyEvent.getAction() == 1) {
            wsq.W();
        }
        return false;
    }
}
