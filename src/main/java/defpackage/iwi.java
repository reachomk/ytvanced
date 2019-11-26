package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: iwi */
final class iwi implements OnClickListener {
    private final /* synthetic */ iwg a;

    iwi(iwg iwg) {
        this.a = iwg;
    }

    public final void onClick(View view) {
        iwg iwg = this.a;
        iwg.b ^= 1;
        iwg.b();
    }
}
