package defpackage;

import java.io.IOException;
import java.nio.channels.ReadableByteChannel;

/* renamed from: bcne */
final class bcne implements Runnable {
    private final /* synthetic */ bcmw a;

    bcne(bcmw bcmw) {
        this.a = bcmw;
    }

    public final void run() {
        ReadableByteChannel readableByteChannel = this.a.n;
        if (readableByteChannel != null) {
            try {
                readableByteChannel.close();
            } catch (IOException e) {
                ankx.a(e);
            }
            this.a.n = null;
        }
    }
}
