package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: iqt */
final /* synthetic */ class iqt implements OnClickListener {
    private final fej a;

    iqt(fej fej) {
        this.a = fej;
    }

    public final void onClick(View view) {
        fej fej = this.a;
        fej.b(!fej.isSelected() ? 1 : 2);
    }
}
