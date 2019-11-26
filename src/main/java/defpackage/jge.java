package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: jge */
final class jge implements OnClickListener {
    private final /* synthetic */ jgc a;

    jge(jgc jgc) {
        this.a = jgc;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        jgc jgc = this.a;
        apqu apqu = jgc.e;
        if ((apqu.a & 64) != 0) {
            aaas aaas = jgc.c;
            apxu apxu = apqu.h;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        }
    }
}
