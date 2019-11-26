package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import java.io.File;

/* renamed from: tap */
public final class tap {
    private final Context a;
    private final Object b = new Object();
    private File c;

    public tap(Context context) {
        this.a = context.getApplicationContext();
    }

    public final File a() {
        File file;
        synchronized (this.b) {
            if (this.c == null) {
                if (VERSION.SDK_INT >= 24) {
                    this.c = this.a.getDataDir();
                } else {
                    this.c = this.a.getDatabasePath("dps-dummy").getParentFile().getParentFile();
                }
            }
            file = this.c;
        }
        return file;
    }
}
