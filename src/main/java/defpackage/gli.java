package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: gli */
final /* synthetic */ class gli implements OnClickListener {
    private final glg a;
    private final apxu b;

    gli(glg glg, apxu apxu) {
        this.a = glg;
        this.b = apxu;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(this.b);
    }
}
