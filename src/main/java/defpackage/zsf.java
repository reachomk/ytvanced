package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.CheckBox;

/* renamed from: zsf */
final class zsf implements OnClickListener {
    private final /* synthetic */ CheckBox a;
    private final /* synthetic */ zsg b;
    private final /* synthetic */ zsc c;

    zsf(zsc zsc, CheckBox checkBox, zsg zsg) {
        this.c = zsc;
        this.a = checkBox;
        this.b = zsg;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i != -2) {
            if (i == -1) {
                zsc zsc = this.c;
                zsc.a(zsc.c);
            }
        } else if (this.a.isChecked()) {
            this.c.b.edit().putBoolean("cellular_upload_dialog_do_not_show_again", true).apply();
        }
        zsg zsg = this.b;
        if (zsg != null) {
            zsg.a();
        }
    }
}
