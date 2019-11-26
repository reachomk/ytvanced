package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: alom */
final /* synthetic */ class alom implements OnClickListener {
    private final alon a;
    private final aaas b;
    private final alop c;

    alom(alon alon, aaas aaas, alop alop) {
        this.a = alon;
        this.b = aaas;
        this.c = alop;
    }

    public final void onClick(View view) {
        alon alon = this.a;
        aaas aaas = this.b;
        alop alop = this.c;
        apxu apxu = alon.a;
        if (apxu != null) {
            aaas.a(apxu, null);
        }
        alop.b();
    }
}
