package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: abpp */
final /* synthetic */ class abpp implements OnClickListener {
    private final abpm a;
    private final asop b;

    abpp(abpm abpm, asop asop) {
        this.a = abpm;
        this.b = asop;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        abpm abpm = this.a;
        abpm.a(abpm.b, this.b);
    }
}
