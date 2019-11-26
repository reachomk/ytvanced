package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* renamed from: bcnc */
final class bcnc implements bcnw {
    private final /* synthetic */ bcmz a;

    bcnc(bcmz bcmz) {
        this.a = bcmz;
    }

    public final void a() {
        bcmz bcmz = this.a;
        ReadableByteChannel readableByteChannel = bcmz.b.n;
        int read = readableByteChannel != null ? readableByteChannel.read(bcmz.a) : -1;
        bcmz bcmz2 = this.a;
        bcmw bcmw = bcmz2.b;
        ByteBuffer byteBuffer = bcmz2.a;
        bcno bcno;
        if (read != -1) {
            bcno = bcmw.b;
            bcno.a(new bcns(bcno, bcmw.o, byteBuffer));
            return;
        }
        ReadableByteChannel readableByteChannel2 = bcmw.n;
        if (readableByteChannel2 != null) {
            readableByteChannel2.close();
        }
        if (bcmw.g.compareAndSet(Integer.valueOf(5), Integer.valueOf(7))) {
            bcmw.g();
            bcno = bcmw.b;
            bcno.b.execute(new bcnu(bcno, bcmw.o));
        }
    }
}
