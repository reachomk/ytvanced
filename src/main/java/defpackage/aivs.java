package defpackage;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import org.apache.http.entity.AbstractHttpEntity;

/* renamed from: aivs */
final class aivs extends AbstractHttpEntity {
    private final File a;
    private final long b;
    private final long c;
    private final Key d;

    aivs(File file, long j, long j2, Key key) {
        this.a = (File) amqw.a((Object) file);
        amqw.a(j <= j2);
        this.b = j;
        this.c = j2;
        this.d = key;
        setContentType("video/mp4");
    }

    public final boolean isRepeatable() {
        return true;
    }

    public final boolean isStreaming() {
        return false;
    }

    public final void writeTo(OutputStream outputStream) {
        amqw.a((Object) outputStream);
        InputStream content = getContent();
        try {
            anaz.a(content, outputStream);
        } finally {
            content.close();
        }
    }

    public final InputStream getContent() {
        Key key = this.d;
        if (key != null) {
            return new aivm(this.a, this.b, this.c, key);
        }
        return new aivv(this.a, this.b, this.c);
    }

    public final long getContentLength() {
        return (this.c - this.b) + 1;
    }
}
