package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: afrr */
public class afrr extends afri {
    private final ContentResolver a;

    public afrr(ContentResolver contentResolver, afsk afsk) {
        super(afsk);
        this.a = contentResolver;
    }

    /* Access modifiers changed, original: 0000 */
    public String a() {
        return "content";
    }

    public final void a(Uri uri, wxg wxg) {
        InputStream inputStream = null;
        try {
            inputStream = this.a.openInputStream(uri);
            byte[] bArr = new byte[4096];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = inputStream.read(bArr, 0, 4096);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            wxg.a((Object) uri, byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            wxg.a((Object) uri, e);
        } finally {
            afrr.a(inputStream);
        }
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
