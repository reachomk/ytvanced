package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;

/* renamed from: bagm */
final class bagm extends OrientationEventListener {
    private final /* synthetic */ bagh a;

    bagm(bagh bagh, Context context) {
        this.a = bagh;
        super(context);
    }

    public final void onOrientationChanged(int i) {
        bagh bagh = this.a;
        bagh.a = i;
        if (!bagh.b) {
            bagh.a();
        } else if (bagh.a(i)) {
            this.a.a(false);
        } else {
            Math.abs(i - 90);
        }
    }
}
