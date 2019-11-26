package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: feh */
final /* synthetic */ class feh implements OnCancelListener {
    private final fei a;
    private final aybc b;

    feh(fei fei, aybc aybc) {
        this.a = fei;
        this.b = aybc;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        fei fei = this.a;
        fei.a.a(this.b, true);
    }
}
