package defpackage;

import android.os.Build.VERSION;

/* renamed from: tj */
public final class tj {
    public final tl a;

    public tj() {
        if (VERSION.SDK_INT >= 26) {
            this.a = new tp();
        } else if (VERSION.SDK_INT >= 21) {
            this.a = new tn();
        } else {
            this.a = new tr();
        }
    }
}
