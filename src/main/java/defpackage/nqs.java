package defpackage;

import android.os.Handler;
import com.google.android.exoplayer.ext.opus.OpusDecoder;
import com.google.android.exoplayer.ext.opus.OpusOutputBuffer;
import java.util.List;

/* renamed from: nqs */
public final class nqs extends nng implements nma {
    public final nqv a;
    private final nlk b = new nlk();
    private final Handler c;
    private final nno d;
    private final nmz e;
    private nmx f;
    private OpusDecoder g;
    private nxk h;
    private OpusOutputBuffer j;
    private boolean k;
    private boolean l;
    private boolean m;

    public nqs(nne nne, Handler handler, nqv nqv, nno nno) {
        super(nne);
        this.c = handler;
        this.a = nqv;
        this.d = nno;
        this.e = new nmz();
    }

    /* Access modifiers changed, original: protected|final */
    public final nma h() {
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(nmx nmx) {
        return "audio/opus".equalsIgnoreCase(nmx.b);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(long j, long j2, boolean z) {
        Handler handler;
        if (!this.l) {
            nlk nlk;
            this.m = z;
            if (this.f == null) {
                if (a(j, this.e, null) == -4) {
                    this.f = this.e.a;
                    this.d.a(this.f);
                }
            }
            if (this.g == null) {
                List list = this.f.f;
                if (list.size() > 0) {
                    try {
                        this.g = new OpusDecoder(list);
                        this.g.start();
                        nlk = this.b;
                        nlk.a++;
                    } catch (nqw e) {
                        a((nqw) e);
                        throw new nlq(e);
                    }
                }
                throw new nlq("Missing initialization data");
            }
            while (!this.l) {
                try {
                    nxh nxh = this.j;
                    if (nxh == null) {
                        this.j = (OpusOutputBuffer) this.g.e();
                        nxh = this.j;
                        if (nxh == null) {
                            break;
                        }
                    }
                    if (!nxh.getFlag(1)) {
                        if (!this.d.a(this.j.data)) {
                            break;
                        }
                        nlk = this.b;
                        nlk.f++;
                        this.j.release();
                        this.j = null;
                    } else {
                        this.l = true;
                        this.d.c();
                        this.j.release();
                        this.j = null;
                        break;
                    }
                } catch (nnu e2) {
                    handler = this.c;
                    if (!(handler == null || this.a == null)) {
                        handler.post(new nqr(this, e2));
                    }
                    throw new nlq(e2);
                } catch (nnt e22) {
                    handler = this.c;
                    if (!(handler == null || this.a == null)) {
                        handler.post(new nqu(this, e22));
                    }
                    throw new nlq(e22);
                } catch (nqw e222) {
                    a((nqw) e222);
                    throw new nlq(e222);
                }
            }
            while (!this.k) {
                nxk nxk = this.h;
                if (nxk == null) {
                    this.h = this.g.d();
                    nxk = this.h;
                    if (nxk == null) {
                        break;
                    }
                }
                int a = a(j, this.e, nxk.a);
                if (a == -2) {
                    break;
                } else if (a == -4) {
                    this.f = this.e.a;
                } else if (a == -1) {
                    this.h.setFlag(1);
                    this.g.a(this.h);
                    this.h = null;
                    this.k = true;
                    break;
                } else {
                    if (this.h.a.b()) {
                        this.h.setFlag(2);
                    }
                    this.g.a(this.h);
                    this.h = null;
                }
            }
            this.b.a();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean c() {
        return this.l && !this.d.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean d() {
        boolean z = true;
        if (!this.d.a()) {
            if (this.f != null) {
                return (this.m || this.j != null) ? z : false;
            } else {
                z = false;
            }
        }
    }

    public final long k() {
        return this.d.b();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(long j) {
        this.d.a(j);
        this.k = false;
        this.l = false;
        this.m = false;
        if (this.g != null) {
            this.h = null;
            OpusOutputBuffer opusOutputBuffer = this.j;
            if (opusOutputBuffer != null) {
                opusOutputBuffer.release();
                this.j = null;
            }
            this.g.f();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void i() {
        this.d.d();
    }

    /* Access modifiers changed, original: protected|final */
    public final void j() {
        this.d.e();
    }

    /* Access modifiers changed, original: protected|final */
    public final void l() {
        this.h = null;
        this.j = null;
        this.f = null;
        try {
            OpusDecoder opusDecoder = this.g;
            if (opusDecoder != null) {
                opusDecoder.b();
                this.g = null;
                nlk nlk = this.b;
                nlk.b++;
            }
            this.d.f();
        } finally {
            super.l();
        }
    }

    public final void a(int i, Object obj) {
        if (i == 1) {
            this.d.a(((Float) obj).floatValue());
        }
    }

    private final void a(nqw nqw) {
        Handler handler = this.c;
        if (handler != null && this.a != null) {
            handler.post(new nqt(this, nqw));
        }
    }
}
