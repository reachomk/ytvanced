package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: alvg */
public final class alvg {
    public final File a;
    public boolean b = false;

    public alvg(Context context) {
        this.a = new File(context.getCacheDir(), "anr_detection.journal");
    }
}
