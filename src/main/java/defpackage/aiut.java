package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;

/* renamed from: aiut */
final class aiut implements OnCancelListener, OnClickListener {
    private final aiva a;
    private final awdy b;
    private final /* synthetic */ aiuq c;

    public aiut(aiuq aiuq, aiva aiva, awdy awdy) {
        this.c = aiuq;
        this.a = aiva;
        this.b = awdy;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a.b();
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i != -2) {
            if (i == -1) {
                this.c.b();
                aivb aivb = this.c.a;
                if (aivb != null) {
                    awdy awdy = this.b;
                    if (awdy != null) {
                        aivb.a(awdy, this.a);
                    }
                }
                this.a.a();
                return;
            }
            return;
        }
        this.a.b();
        this.c.b();
    }
}
