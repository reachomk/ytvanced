package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetUrlRequest;

/* renamed from: bcmj */
public final class bcmj implements Runnable {
    public ByteBuffer a;
    private final /* synthetic */ CronetUrlRequest b;

    public final void run() {
        this.b.f();
        ByteBuffer byteBuffer = this.a;
        this.a = null;
        try {
            synchronized (this.b.c) {
                if (this.b.e()) {
                    return;
                }
                this.b.k = true;
                bckx bckx = this.b;
                bckx.d.a(bckx, bckx.g, byteBuffer);
            }
        } catch (Exception e) {
            this.b.a(e);
        }
    }

    public /* synthetic */ bcmj(CronetUrlRequest cronetUrlRequest) {
        this.b = cronetUrlRequest;
    }
}
