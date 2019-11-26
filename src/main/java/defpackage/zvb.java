package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: zvb */
final class zvb implements OnClickListener {
    private final /* synthetic */ zwj a;
    private final /* synthetic */ apxu b;

    zvb(zwj zwj, apxu apxu) {
        this.a = zwj;
        this.b = apxu;
    }

    public final void onClick(View view) {
        zwj zwj = this.a;
        if (zwj.g) {
            zwj.l.a(this.b, null);
        }
    }
}
