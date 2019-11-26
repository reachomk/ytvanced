package defpackage;

import android.app.Dialog;
import android.os.Bundle;

/* renamed from: afg */
public class afg extends nd {
    public Dialog a(Bundle bundle) {
        return new afe(M_(), this.a);
    }

    public final void a(Dialog dialog, int i) {
        if (dialog instanceof afe) {
            afe afe = (afe) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            afe.a();
            return;
        }
        super.a(dialog, i);
    }
}
