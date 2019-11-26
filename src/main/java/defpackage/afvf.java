package defpackage;

import android.content.Context;
import android.os.PowerManager;

/* renamed from: afvf */
public final class afvf {
    public final xry a;
    public PowerManager b;
    private final Context c;

    public afvf(Context context, xry xry) {
        this.c = context;
        this.a = xry;
    }

    public final void a() {
        if (this.b == null) {
            this.b = (PowerManager) this.c.getSystemService("power");
        }
    }
}
