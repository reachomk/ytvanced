package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: anbk */
public final class anbk {
    public static anba a(File file) {
        return new anbo(file);
    }

    public static anax a(File file, anbh... anbhArr) {
        return new anbl(file, anbhArr);
    }

    public static byte[] b(File file) {
        return anbk.a(file).b();
    }

    public static void a(byte[] bArr, File file) {
        anbk.a(file, new anbh[0]).a(bArr);
    }

    public static void a(File file, File file2) {
        amqw.a(file.equals(file2) ^ 1, "Source %s and destination %s must be different", (Object) file, (Object) file2);
        anba a = anbk.a(file);
        Object a2 = anbk.a(file2, new anbh[0]);
        amqw.a(a2);
        anbe a3 = anbe.a();
        try {
            anaz.a((InputStream) a3.a(a.a()), (OutputStream) a3.a(a2.a()));
            a3.close();
        } catch (Throwable th) {
            a3.close();
        }
    }

    public static void c(File file) {
        amqw.a((Object) file);
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                String valueOf = String.valueOf(file);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 39);
                stringBuilder.append("Unable to create parent directories of ");
                stringBuilder.append(valueOf);
                throw new IOException(stringBuilder.toString());
            }
        }
    }

    public static void b(File file, File file2) {
        amqw.a((Object) file);
        amqw.a((Object) file2);
        amqw.a(file.equals(file2) ^ 1, "Source %s and destination %s must be different", (Object) file, (Object) file2);
        if (!file.renameTo(file2)) {
            anbk.a(file, file2);
            if (!file.delete()) {
                String str = "Unable to delete ";
                StringBuilder stringBuilder;
                if (file2.delete()) {
                    String valueOf = String.valueOf(file);
                    stringBuilder = new StringBuilder(valueOf.length() + 17);
                    stringBuilder.append(str);
                    stringBuilder.append(valueOf);
                    throw new IOException(stringBuilder.toString());
                }
                String valueOf2 = String.valueOf(file2);
                stringBuilder = new StringBuilder(valueOf2.length() + 17);
                stringBuilder.append(str);
                stringBuilder.append(valueOf2);
                throw new IOException(stringBuilder.toString());
            }
        }
    }

    static {
        anbj anbj = new anbj();
        anbm anbm = new anbm();
    }
}
