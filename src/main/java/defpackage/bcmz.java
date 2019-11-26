package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bcmz */
final class bcmz implements Runnable {
    public final /* synthetic */ ByteBuffer a;
    public final /* synthetic */ bcmw b;

    bcmz(bcmw bcmw, ByteBuffer byteBuffer) {
        this.b = bcmw;
        this.a = byteBuffer;
    }

    public final void run() {
        bcmw bcmw = this.b;
        bcmw.c.execute(bcmw.a(new bcnc(this)));
    }
}
