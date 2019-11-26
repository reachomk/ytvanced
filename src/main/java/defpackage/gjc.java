package defpackage;

import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: gjc */
final /* synthetic */ class gjc implements Runnable {
    private final gjd a;
    private final Uri b;
    private final int c;
    private final wxi d;
    private final wxg e;

    gjc(gjd gjd, Uri uri, int i, wxi wxi, wxg wxg) {
        this.a = gjd;
        this.b = uri;
        this.c = i;
        this.d = wxi;
        this.e = wxg;
    }

    public final void run() {
        gjd gjd = this.a;
        Object obj = this.b;
        int i = this.c;
        wxi wxi = this.d;
        wxg wxg = this.e;
        gjm gjm = gjd.e;
        String lastPathSegment = obj.getLastPathSegment();
        xak.b();
        zjj zjj = gjm.a;
        byte[] bArr = null;
        if (zjj != null) {
            xak.b();
            File file = zjj.a;
            if (file != null) {
                try {
                    File file2 = new File(file, lastPathSegment);
                    if (file2.exists()) {
                        FileInputStream fileInputStream = new FileInputStream(file2);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr2 = new byte[1024];
                        while (true) {
                            int read = fileInputStream.read(bArr2);
                            if (read <= 0) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr2, 0, read);
                        }
                        bArr = byteArrayOutputStream.toByteArray();
                    }
                } catch (IOException | SecurityException e) {
                    xtl.a("Error getting file", e);
                }
            }
        }
        if (bArr == null) {
            gjd.b.c(obj, new gjf(gjd, wxi, obj, gjd.f));
            return;
        }
        if (gjd.a(obj)) {
            bArr = gjd.a(bArr, i);
        }
        gjd.a((Uri) obj, bArr);
        try {
            wxi.a(obj, gjd.c.a(bArr));
        } catch (xwd e2) {
            wxg.a(obj, e2);
        }
    }
}
