package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;

/* renamed from: vao */
final /* synthetic */ class vao implements OnKeyListener {
    private final vap a;

    vao(vap vap) {
        this.a = vap;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        vap vap = this.a;
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        vap.W();
        return true;
    }
}
