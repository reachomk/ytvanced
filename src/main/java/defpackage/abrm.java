package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: abrm */
final class abrm implements OnClickListener {
    public String a;
    private final abrf b;

    public abrm(abrf abrf) {
        this.b = abrf;
    }

    public final void onClick(View view) {
        abrf abrf = this.b;
        if (abrf != null) {
            abrf.a(this.a);
        }
    }
}
