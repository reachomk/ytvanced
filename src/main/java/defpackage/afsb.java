package defpackage;

import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: afsb */
public final class afsb extends afri {
    public afsb(afsk afsk) {
        super(afsk);
    }

    /* Access modifiers changed, original: final */
    public final String a() {
        return "file";
    }

    public final void a(Uri uri, wxg wxg) {
        Exception e;
        Throwable th;
        String path = uri.getPath();
        File file = new File(path);
        if (file.exists()) {
            InputStream bufferedInputStream;
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 4096);
                try {
                    int length = (int) file.length();
                    Object obj = new byte[length];
                    int i = 0;
                    int i2 = 0;
                    while (i >= 0 && i2 < length) {
                        i2 += i;
                        i = bufferedInputStream.read(obj, i2, length - i2);
                    }
                    if (i2 == length) {
                        wxg.a((Object) uri, obj);
                    } else {
                        wxg.a((Object) uri, new IOException("Number of bytes read doesn't match file length."));
                    }
                    afsb.a(bufferedInputStream);
                    return;
                } catch (IOException e2) {
                    e = e2;
                    try {
                        wxg.a((Object) uri, e);
                        afsb.a(bufferedInputStream);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        afsb.a(bufferedInputStream);
                        throw th;
                    }
                }
            } catch (IOException e3) {
                bufferedInputStream = null;
                e = e3;
                wxg.a((Object) uri, e);
                afsb.a(bufferedInputStream);
                return;
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream = null;
                afsb.a(bufferedInputStream);
                throw th;
            }
        }
        wxg.a((Object) uri, new FileNotFoundException(path));
    }

    private static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public final /* bridge */ /* synthetic */ void b(Uri uri, wxg wxg) {
        super.a(uri, wxg);
    }
}
