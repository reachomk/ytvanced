package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.AbstractHttpEntity;

/* renamed from: aivr */
public final class aivr extends AbstractHttpEntity {
    private final ovi a;
    private final ovm b;
    private ovj c;

    public aivr(ovi ovi, ovm ovm) {
        this.a = (ovi) amqw.a((Object) ovi);
        this.b = (ovm) amqw.a((Object) ovm);
        setContentType("video/mp4");
    }

    public final boolean isRepeatable() {
        return false;
    }

    public final boolean isStreaming() {
        return true;
    }

    public final synchronized InputStream getContent() {
        if (this.c == null) {
            this.c = new ovj(this.a, this.b);
        }
        return this.c;
    }

    public final long getContentLength() {
        return this.b.f;
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
}
