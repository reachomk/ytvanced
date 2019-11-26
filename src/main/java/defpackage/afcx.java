package defpackage;

import android.os.Handler;
import java.util.Vector;

/* renamed from: afcx */
final class afcx implements aewe {
    public final Vector a = new Vector();
    public int b;
    private final Handler c;
    private final Vector d = new Vector();
    private long e;
    private boolean f = true;
    private final /* synthetic */ afbo g;

    afcx(afbo afbo, Handler handler) {
        this.g = afbo;
        this.c = handler;
    }

    public final void a() {
        this.d.clear();
        this.a.clear();
        this.f = true;
        this.b = 0;
    }

    public final void a(byte[] bArr, long j) {
        if (j < this.e) {
            a();
        }
        if (this.f) {
            afbo afbo = this.g;
            if (afbo.p != null) {
                afbo.g.a(afkn.GL_GVR, afne.ANDROID_EXOPLAYER);
                this.g.p.a(afkn.GL_GVR);
                this.f = false;
            }
        }
        this.d.add(bArr);
        this.a.add(Long.valueOf(j));
        this.e = j;
        if (c()) {
            b();
        }
    }

    private final boolean c() {
        return this.b < this.a.size();
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        afbo afbo = this.g;
        if (afbo.p != null) {
            long o = afbo.o() * 1000;
            while (c() && !this.g.w && ((Long) this.a.get(this.b)).longValue() < 1000000 + o) {
                this.g.p.a(false, (byte[]) this.d.get(this.b), ((Long) this.a.get(this.b)).longValue());
                this.b++;
            }
            if (c()) {
                this.c.postDelayed(new afcw(this), 1000);
            }
        }
    }
}
