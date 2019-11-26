package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: oyc */
public final class oyc {
    private final File a;
    private final File b;

    public oyc(File file) {
        this.a = file;
        this.b = new File(String.valueOf(file.getPath()).concat(".bak"));
    }

    public final boolean a() {
        return this.a.exists() || this.b.exists();
    }

    public final void b() {
        this.a.delete();
        this.b.delete();
    }

    public final OutputStream c() {
        StringBuilder stringBuilder;
        if (this.a.exists()) {
            if (this.b.exists()) {
                this.a.delete();
            } else if (!this.a.renameTo(this.b)) {
                String valueOf = String.valueOf(this.a);
                String valueOf2 = String.valueOf(this.b);
                stringBuilder = new StringBuilder((valueOf.length() + 37) + valueOf2.length());
                stringBuilder.append("Couldn't rename file ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" to backup file ");
                stringBuilder.append(valueOf2);
                oyp.a("AtomicFile", stringBuilder.toString());
            }
        }
        try {
            return new oyb(this.a);
        } catch (FileNotFoundException e) {
            File parentFile = this.a.getParentFile();
            String valueOf3;
            if (parentFile == null || !parentFile.mkdirs()) {
                valueOf3 = String.valueOf(this.a);
                stringBuilder = new StringBuilder(valueOf3.length() + 26);
                stringBuilder.append("Couldn't create directory ");
                stringBuilder.append(valueOf3);
                throw new IOException(stringBuilder.toString(), e);
            }
            try {
                return new oyb(this.a);
            } catch (FileNotFoundException e2) {
                valueOf3 = String.valueOf(this.a);
                stringBuilder = new StringBuilder(valueOf3.length() + 16);
                stringBuilder.append("Couldn't create ");
                stringBuilder.append(valueOf3);
                throw new IOException(stringBuilder.toString(), e2);
            }
        }
    }

    public final void a(OutputStream outputStream) {
        outputStream.close();
        this.b.delete();
    }

    public final InputStream d() {
        if (this.b.exists()) {
            this.a.delete();
            this.b.renameTo(this.a);
        }
        return new FileInputStream(this.a);
    }
}
