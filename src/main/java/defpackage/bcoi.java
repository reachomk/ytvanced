package defpackage;

import android.content.Context;
import org.chromium.net.impl.CronetUrlRequestContext;

/* renamed from: bcoi */
public class bcoi extends bclq {
    public bcoi(Context context) {
        super(context);
    }

    public final bcjh a() {
        if (this.e == null) {
            this.e = b();
        }
        CronetUrlRequestContext cronetUrlRequestContext = new CronetUrlRequestContext(this);
        this.n = 0;
        return cronetUrlRequestContext;
    }
}
