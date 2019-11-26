package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: absh */
final class absh implements OnClickListener {
    private final /* synthetic */ auvj a;
    private final /* synthetic */ absf b;

    absh(absf absf, auvj auvj) {
        this.b = absf;
        this.a = auvj;
    }

    public final void onClick(View view) {
        abxu abxu = this.b.ab;
        if (abxu != null) {
            abxu.a(this.a);
        }
        this.b.dismiss();
    }
}
