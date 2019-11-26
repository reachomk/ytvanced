package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: fyt */
final /* synthetic */ class fyt implements OnClickListener {
    private final fyr a;

    fyt(fyr fyr) {
        this.a = fyr;
    }

    public final void onClick(View view) {
        fyr fyr = this.a;
        fyr.a.runOnUiThread(new fyw(fyr));
    }
}
