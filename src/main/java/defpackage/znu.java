package defpackage;

import android.os.AsyncTask;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: znu */
final class znu extends AsyncTask {
    private final /* synthetic */ byte[] a;
    private final /* synthetic */ znr b;

    znu(znr znr, byte[] bArr) {
        this.b = znr;
        this.a = bArr;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        synchronized (this.b.k.d) {
            znr znr = this.b;
            znp znp = znr.k;
            String str = znr.a;
            String str2 = znr.b;
            byte[] bArr = this.a;
            xak.b();
            znp.c();
            File file = new File(znp.a, str);
            String valueOf;
            try {
                if (file.exists()) {
                    file.delete();
                }
                file.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                znp.f.a(str2, str);
                str2 = "Asset saved to file: ";
                valueOf = String.valueOf(str);
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    str2.concat(valueOf);
                }
            } catch (IOException | SecurityException e) {
                valueOf = "Error writing asset to file: ";
                str = String.valueOf(str);
                xtl.a(str.length() == 0 ? new String(valueOf) : valueOf.concat(str), e);
            }
            znr = this.b;
            znr.k.e.add(znr.a);
        }
        return null;
    }
}
