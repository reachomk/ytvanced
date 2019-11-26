package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import java.io.File;

/* renamed from: zlt */
public final class zlt extends AsyncTask {
    private final xsc a;

    public zlt(xsc xsc) {
        this.a = xsc;
    }

    private static zjj a(Context context, String str, long j, xsc xsc) {
        return new zjj(context, 1, str, j, xsc);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        Context[] contextArr = (Context[]) objArr;
        int i = 0;
        zlt.a(contextArr[0], zjz.b, zjz.f, this.a).a(null);
        zlt.a(contextArr[0], zjz.c, zjz.g, this.a).a(null);
        File file = new File(contextArr[0].getFilesDir(), zjz.d);
        if (file.exists()) {
            try {
                if (file.listFiles() != null) {
                    File[] listFiles = file.listFiles();
                    int length = listFiles.length;
                    while (i < length) {
                        listFiles[i].delete();
                        i++;
                    }
                }
                file.delete();
            } catch (SecurityException e) {
                xtl.a("Error deleting text asset/dir", e);
            }
        }
        return null;
    }
}
