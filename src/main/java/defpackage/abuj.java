package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: abuj */
final /* synthetic */ class abuj implements OnClickListener {
    private final abug a;

    abuj(abug abug) {
        this.a = abug;
    }

    public final void onClick(View view) {
        abun abun = this.a.a;
        if (abun != null) {
            abun.f();
        }
    }
}
