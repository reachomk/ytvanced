package defpackage;

import java.nio.ByteBuffer;

/* renamed from: par */
public final class par extends nys {
    private final nzy e = new nzy();
    private final odj f = new odj(1);
    private final oza g = new oza();
    private pas h;
    private long i;

    public par() {
        super(5);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(nzw[] nzwArr, long j) {
    }

    public final boolean u() {
        return true;
    }

    public final int a(nzw nzw) {
        return "application/x-camera-motion".equals(nzw.i) ? 4 : 0;
    }

    public final void a(int i, Object obj) {
        if (i == 7) {
            this.h = (pas) obj;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(long j, boolean z) {
        w();
    }

    /* Access modifiers changed, original: protected|final */
    public final void r() {
        w();
    }

    public final void a(long j, long j2) {
        while (!g() && this.i < 100000 + j) {
            this.f.clear();
            int i = 0;
            if (a(this.e, this.f, false) == -4 && !this.f.isEndOfStream()) {
                this.f.d();
                odj odj = this.f;
                this.i = odj.c;
                if (this.h != null) {
                    float[] fArr;
                    ByteBuffer byteBuffer = odj.b;
                    if (byteBuffer.remaining() == 16) {
                        this.g.a(byteBuffer.array(), byteBuffer.limit());
                        this.g.c(byteBuffer.arrayOffset() + 4);
                        fArr = new float[3];
                        while (i < 3) {
                            fArr[i] = Float.intBitsToFloat(this.g.l());
                            i++;
                        }
                    } else {
                        fArr = null;
                    }
                    if (fArr != null) {
                        ((pas) ozp.a(this.h)).a();
                    }
                }
            } else {
                return;
            }
        }
    }

    public final boolean v() {
        return g();
    }

    private final void w() {
        this.i = 0;
        pas pas = this.h;
        if (pas != null) {
            pas.b();
        }
    }
}
