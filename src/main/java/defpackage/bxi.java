package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: bxi */
final class bxi implements bxd {
    private final /* synthetic */ Context a;
    private final /* synthetic */ String b;

    bxi(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public final File a() {
        File cacheDir = this.a.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = this.b;
        return str != null ? new File(cacheDir, str) : cacheDir;
    }
}
