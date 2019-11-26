package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: fha */
public final class fha implements OnClickListener {
    private final /* synthetic */ fgx a;

    public fha(fgx fgx) {
        this.a = fgx;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.a.d.isChecked()) {
            this.a.c.a(2);
            this.a.h.a(3, new acvs(acwc.INLINE_DIALOG_SETTINGS_ON), null);
        } else if (this.a.e.isChecked()) {
            this.a.c.a(1);
            this.a.h.a(3, new acvs(acwc.INLINE_DIALOG_SETTINGS_ONLY_WIFI), null);
        } else if (this.a.f.isChecked()) {
            this.a.c.a(0);
            this.a.h.a(3, new acvs(acwc.INLINE_DIALOG_SETTINGS_OFF), null);
        }
    }
}
