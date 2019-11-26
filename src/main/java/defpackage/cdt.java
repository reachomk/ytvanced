package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: cdt */
public final class cdt implements bss {
    public final int a(bsq bsq) {
        return 1;
    }

    public final /* synthetic */ boolean a(Object obj, File file, bsq bsq) {
        boolean z = false;
        try {
            chh.a(((cdr) ((bvw) obj).b()).b(), file);
            z = true;
        } catch (IOException e) {
            String str = "GifEncoder";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Failed to encode GIF drawable data", e);
                return false;
            }
        }
        return z;
    }
}
