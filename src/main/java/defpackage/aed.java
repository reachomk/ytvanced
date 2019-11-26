package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: aed */
public final class aed extends Handler {
    private final WeakReference a;

    public aed(DialogInterface dialogInterface) {
        this.a = new WeakReference(dialogInterface);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == -3 || i == -2 || i == -1) {
            ((OnClickListener) message.obj).onClick((DialogInterface) this.a.get(), message.what);
        } else if (i == 1) {
            ((DialogInterface) message.obj).dismiss();
        }
    }
}
