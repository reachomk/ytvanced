package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;

/* renamed from: gcm */
final /* synthetic */ class gcm implements OnKeyListener {
    public static final OnKeyListener a = new gcm();

    private gcm() {
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 4;
    }
}
