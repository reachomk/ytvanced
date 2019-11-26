package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;

/* renamed from: suw */
final class suw extends OrientationEventListener {
    private final /* synthetic */ sut a;

    suw(sut sut, Context context) {
        this.a = sut;
        super(context, 2);
    }

    public final void onOrientationChanged(int i) {
        int i2 = i - 360;
        int i3 = 1;
        if ((i2 >= -20 && i2 < 0) || (i >= 0 && i <= 20)) {
            i3 = 4;
        } else {
            int i4 = i - 90;
            if (i4 >= -20 && i4 <= 20) {
                i3 = 3;
            } else {
                i4 = i - 180;
                if (i4 >= -20 && i4 <= 20) {
                    i3 = 5;
                } else {
                    i -= 270;
                    if (i >= -20 && i <= 20) {
                        i3 = 2;
                    }
                }
            }
        }
        sut sut = this.a;
        if (i3 != sut.a) {
            sut.a = i3;
            sut.a(i3);
        }
    }
}
