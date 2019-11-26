package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: wvk */
public final class wvk {
    public static File a(String str, File file) {
        if (file == null || file.isDirectory()) {
            return file;
        }
        String path = file.getPath();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 40) + String.valueOf(path).length());
        stringBuilder.append(str);
        stringBuilder.append(": ");
        stringBuilder.append(path);
        stringBuilder.append(" is not a directory or does not exist.");
        xtl.c(stringBuilder.toString());
        return null;
    }

    public static File a(Context context, String str) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null || str == null) {
            return externalCacheDir;
        }
        File file = new File(externalCacheDir, str);
        file.mkdir();
        return file;
    }
}
