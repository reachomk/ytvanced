package defpackage;

import android.os.AsyncTask;
import java.io.File;

/* renamed from: gii */
public final class gii extends AsyncTask {
    private final /* synthetic */ File a;
    private final /* synthetic */ String b;

    public gii(File file, String str) {
        this.a = file;
        this.b = str;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        String valueOf;
        String str;
        if (this.a.exists() && this.a.delete()) {
            valueOf = String.valueOf(this.b);
            str = "Successfully deleted text asset: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                str.concat(valueOf);
            }
        } else {
            valueOf = String.valueOf(this.b);
            str = "Failed to delete text asset: ";
            xtl.c(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        }
        return null;
    }
}
