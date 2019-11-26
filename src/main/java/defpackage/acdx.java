package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: acdx */
final /* synthetic */ class acdx implements OnClickListener {
    private final acdv a;
    private final apxu b;
    private final acfj c;

    acdx(acdv acdv, apxu apxu, acfj acfj) {
        this.a = acdv;
        this.b = apxu;
        this.c = acfj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(this.b, this.c);
    }
}
