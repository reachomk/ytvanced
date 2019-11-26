package defpackage;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* renamed from: uns */
final class uns extends Thread {
    private final unu a;
    private final WritableByteChannel b;

    public uns(unu unu, WritableByteChannel writableByteChannel) {
        setName("Movie to Stream Thread");
        this.a = unu;
        this.b = writableByteChannel;
    }

    public final void run() {
        String str = "Failed to close movie resources";
        try {
            this.a.a().b(this.b);
        } catch (IOException e) {
            ujo.b("Failed to read movie data", e);
        } finally {
            try {
                this.b.close();
            } catch (IOException e2) {
                ujo.b(str, e2);
            }
            this.a.close();
        }
    }
}
