package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: knw */
final class knw implements OnClickListener {
    private final /* synthetic */ kny a;
    private final /* synthetic */ knx b;

    knw(knx knx, kny kny) {
        this.b = knx;
        this.a = kny;
    }

    public final void onClick(View view) {
        azna azna = this.b.a;
        if (azna != null) {
            this.a.a(azna);
        }
    }
}
