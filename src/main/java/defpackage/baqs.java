package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: baqs */
public final class baqs implements barg {
    private final File a;
    private final OutputStream b = new FileOutputStream(this.a);

    public baqs(File file) {
        this.a = File.createTempFile("NanoHTTPD-", "", file);
    }

    public final void a() {
        baqk.a(this.b);
        if (!this.a.delete()) {
            throw new Exception("could not delete temporary file");
        }
    }

    public final String b() {
        return this.a.getAbsolutePath();
    }
}
