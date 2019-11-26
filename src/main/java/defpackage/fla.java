package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: fla */
final /* synthetic */ class fla implements OnClickListener {
    private final fkz a;
    private final String b;

    fla(fkz fkz, String str) {
        this.a = fkz;
        this.b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        fkz fkz = this.a;
        String str = this.b;
        abfm abfm = fkz.b;
        aaml abfw = new abfw(abfm.c, abfm.d.c());
        abfw.a = aali.b(str);
        abfw.g();
        abfm = fkz.b;
        abfm.b.a(abfw, new fle(fkz, str));
    }
}
