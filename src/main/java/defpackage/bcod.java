package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bcod */
final class bcod implements bcnw {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ bcnx b;

    bcod(bcnx bcnx, boolean z) {
        this.b = bcnx;
        this.a = z;
    }

    public final void a() {
        bcnx bcnx = this.b;
        bcnx.g = bcnx.e.a();
        bcnx = this.b;
        long j = bcnx.g;
        if (j != 0) {
            if (j <= 0 || j >= 8192) {
                bcnx.f = ByteBuffer.allocateDirect(8192);
            } else {
                bcnx.f = ByteBuffer.allocateDirect(((int) j) + 1);
            }
            bcnx = this.b;
            j = bcnx.g;
            if (j > 0 && j <= 2147483647L) {
                bcnx.b.setFixedLengthStreamingMode((int) j);
            } else if (j <= 2147483647L) {
                bcnx.b.setChunkedStreamingMode(8192);
            } else {
                bcnx.b.setFixedLengthStreamingMode(j);
            }
            if (this.a) {
                this.b.b();
                return;
            }
            this.b.a.set(Integer.valueOf(1));
            bcnx = this.b;
            bcnx.e.a(bcnx);
            return;
        }
        bcnx.d();
    }
}
