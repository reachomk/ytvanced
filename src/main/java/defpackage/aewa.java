package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: aewa */
public final class aewa extends nmu implements FrameCallback {
    private final Deque j;
    private final Deque k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final aewc o;
    private final aewi p;
    private final long q;
    private long r;
    private long s;
    private long t;
    private long u;
    private float v;
    private long w;
    private long x;

    public aewa(Context context, nne nne, nmg nmg, npz npz, Handler handler, aewc aewc, aewi aewi, int i, boolean z, boolean z2, boolean z3, long j) {
        super(context, nne, nmg, 5000, npz, true, handler, aewc, i);
        this.m = z2;
        this.l = z3;
        boolean z4 = false;
        if (z && nxf.a < 21) {
            z4 = true;
        }
        this.n = z4;
        this.j = new ArrayDeque(32);
        this.k = new ArrayDeque(32);
        this.v = 1.0f;
        this.w = -1;
        this.o = aewc;
        this.p = aewi;
        this.q = 1000 * j;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(long j) {
        super.b(j);
        this.s = j;
        this.u = j * 1000;
        this.t = -1;
        this.k.addAll(this.j);
        this.j.clear();
        this.w = -1;
        this.x = 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final void i() {
        super.i();
        this.t = -1;
        this.u = this.s * 1000;
        if (this.n) {
            Choreographer.getInstance().postFrameCallback(this);
        }
        this.p.b();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean d() {
        if (!super.d()) {
            return false;
        }
        this.p.a();
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final long g() {
        long g = super.g();
        this.p.a(g);
        return g;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(long j, long j2, boolean z) {
        super.a(j, j2, z);
        this.s = j;
    }

    /* Access modifiers changed, original: protected|final */
    public final void j() {
        super.j();
        Choreographer.getInstance().removeFrameCallback(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void l() {
        super.l();
        this.k.addAll(this.j);
        this.j.clear();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(nmz nmz) {
        super.a(nmz);
        this.o.a(nmz.a);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(MediaCodec mediaCodec, boolean z, nmx nmx, nmx nmx2) {
        return !this.m && super.a(mediaCodec, z, nmx, nmx2);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, BufferInfo bufferInfo, int i, boolean z) {
        if (!this.n) {
            return super.a(j, j2, mediaCodec, byteBuffer, bufferInfo, i, z);
        }
        if (z) {
            a(mediaCodec, i);
            return true;
        } else if (!this.h) {
            c(mediaCodec, i);
            return true;
        } else if (this.i != 3) {
            return false;
        } else {
            aewd aewd;
            j = bufferInfo.presentationTimeUs * 1000;
            j2 = this.w;
            if (j2 == -1) {
                this.w = j;
                this.r = j;
            } else {
                this.w = j;
                j = ((long) (((float) (j - j2)) / this.v)) + this.r;
                this.r = j;
            }
            Deque deque = this.j;
            if (this.k.isEmpty()) {
                aewd = new aewd();
            } else {
                aewd = (aewd) this.k.pop();
            }
            aewd.a = mediaCodec;
            aewd.b = i;
            aewd.c = j;
            return deque.add(aewd);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b(long j, long j2) {
        long j3 = this.q;
        if ((j3 <= 0 || j2 - this.x <= j3) && super.b(j, j2)) {
            return true;
        }
        this.x = j2;
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void q() {
        super.q();
        this.k.addAll(this.j);
        this.j.clear();
    }

    /* Access modifiers changed, original: protected|final */
    public final long r() {
        return (this.l && this.j.isEmpty()) ? 16666 : 0;
    }

    public final void doFrame(long j) {
        Choreographer.getInstance().postFrameCallback(this);
        long j2 = this.t;
        if (j2 == -1) {
            this.t = j;
            j2 = j;
        }
        j = (j - j2) + this.u;
        j2 = -30000000 + j;
        j += 11000000;
        aewd aewd = (aewd) this.j.poll();
        while (aewd != null && aewd.c < j2) {
            b(aewd.a, aewd.b);
            this.k.add(aewd);
            aewd = (aewd) this.j.poll();
        }
        if (aewd == null) {
            return;
        }
        if (aewd.c <= j) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException unused) {
            }
            c(aewd.a, aewd.b);
            this.k.add(aewd);
            return;
        }
        this.j.addFirst(aewd);
    }

    public final void a(int i, Object obj) {
        if (i == 100) {
            this.v = ((Float) obj).floatValue();
        } else {
            super.a(i, obj);
        }
    }
}
