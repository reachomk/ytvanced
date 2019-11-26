package defpackage;

import android.os.AsyncTask;
import java.io.File;

/* renamed from: zky */
public final class zky extends AsyncTask {
    private final zjj a;

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        zjj zjj = this.a;
        xak.b();
        File file = zjj.a;
        if (file != null) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File delete : listFiles) {
                        try {
                            delete.delete();
                        } catch (SecurityException e) {
                            xtl.a("Exception in deleting existing file", e);
                        }
                    }
                }
            } catch (SecurityException e2) {
                xtl.a("Exception in listing directory files", e2);
            }
        }
        return null;
    }

    public /* synthetic */ zky(zjj zjj) {
        this.a = zjj;
    }
}
