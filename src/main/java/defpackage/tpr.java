package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;

/* renamed from: tpr */
public final class tpr {
    public final trl a = new trl();

    public tpr(Context context) {
        trl trl = this.a;
        if (context != null && trl.b == null) {
            trl.b = (DisplayManager) context.getApplicationContext().getSystemService("display");
            trl.b.registerDisplayListener(trl, null);
        }
    }
}
