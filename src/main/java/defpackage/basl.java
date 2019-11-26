package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: basl */
public final class basl implements basm {
    public final String a() {
        return "gzip";
    }

    public final OutputStream a(OutputStream outputStream) {
        return new GZIPOutputStream(outputStream);
    }

    public final InputStream a(InputStream inputStream) {
        return new GZIPInputStream(inputStream);
    }
}
