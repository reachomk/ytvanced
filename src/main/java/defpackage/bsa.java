package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: bsa */
public final class bsa {
    public static final Charset a = Charset.forName("US-ASCII");

    public static void a(File file) {
        File[] listFiles = file.listFiles();
        StringBuilder stringBuilder;
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    bsa.a(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    String valueOf = String.valueOf(file2);
                    stringBuilder = new StringBuilder(valueOf.length() + 23);
                    stringBuilder.append("failed to delete file: ");
                    stringBuilder.append(valueOf);
                    throw new IOException(stringBuilder.toString());
                }
            }
            return;
        }
        String valueOf2 = String.valueOf(file);
        stringBuilder = new StringBuilder(valueOf2.length() + 26);
        stringBuilder.append("not a readable directory: ");
        stringBuilder.append(valueOf2);
        throw new IOException(stringBuilder.toString());
    }

    static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    static {
        Charset.forName("UTF-8");
    }
}
