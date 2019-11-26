package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: ahba */
final /* synthetic */ class ahba implements OnCancelListener {
    private final ahax a;

    ahba(ahax ahax) {
        this.a = ahax;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        ahax ahax = this.a;
        ahax.a(ahax.p);
    }
}
