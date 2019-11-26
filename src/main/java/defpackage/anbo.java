package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: anbo */
final class anbo extends anba {
    private final File a;

    private final FileInputStream c() {
        return new FileInputStream(this.a);
    }

    public final byte[] b() {
        anbe a = anbe.a();
        try {
            InputStream inputStream = (FileInputStream) a.a(c());
            byte[] a2 = anaz.a(inputStream, inputStream.getChannel().size());
            a.close();
            return a2;
        } catch (Throwable th) {
            a.close();
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 20);
        stringBuilder.append("Files.asByteSource(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final /* synthetic */ InputStream a() {
        return c();
    }

    /* synthetic */ anbo(File file) {
        this.a = (File) amqw.a((Object) file);
    }
}
