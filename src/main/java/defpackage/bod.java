package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: bod */
public final class bod {
    public final Context a;
    public final String b;

    bod(Context context, String str) {
        this.a = context.getApplicationContext();
        this.b = str;
    }

    public final File a(InputStream inputStream, boe boe) {
        File file = new File(this.a.getCacheDir(), bod.a(this.b, boe, true));
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
        }
    }

    public static String a(String str, boe boe, boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("lottie_cache_");
        stringBuilder.append(str.replaceAll("\\W+", ""));
        if (z) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(".temp");
            stringBuilder2.append(boe.c);
            str = stringBuilder2.toString();
        } else {
            str = boe.c;
        }
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
