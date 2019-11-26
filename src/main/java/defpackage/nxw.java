package defpackage;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

/* renamed from: nxw */
public final class nxw implements odu {
    public final oea a;
    public final byte[] b;
    public final int c = 0;
    public final Handler d;
    public final nyf e;
    public final int f;
    public final nxu g;
    public final oej h;
    public final nyc i;
    public int j;
    public byte[] k;
    public byte[] l = null;
    private final String m;
    private final HashMap n;
    private final nxw o;
    private final nyb p;
    private final UUID q;
    private int r;
    private HandlerThread s;
    private nxz t;
    private ExoMediaCrypto u;
    private odx v;

    public nxw(UUID uuid, oea oea, byte[] bArr, String str, HashMap hashMap, oej oej, Looper looper, Handler handler, nyf nyf, int i, nxu nxu, nxw nxw, nyb nyb) {
        this.q = uuid;
        this.a = oea;
        this.n = hashMap;
        this.h = oej;
        this.f = i;
        this.g = nxu;
        this.o = nxw;
        this.p = nyb;
        this.d = handler;
        this.e = nyf;
        this.j = 2;
        this.i = new nyc(this, looper);
        this.s = new HandlerThread("DrmRequestHandler");
        this.s.start();
        this.t = new nxz(this, this.s.getLooper());
        this.b = bArr;
        this.m = str;
    }

    public final void a() {
        int i = this.r + 1;
        this.r = i;
        if (i != 1 || this.j == 1 || !a(true)) {
            return;
        }
        if (this.o == null) {
            b(true);
            return;
        }
        this.t.postDelayed(new nxv(this), (long) new Random().nextInt(this.g.c * 500));
    }

    public final void b() {
        if (c()) {
            this.p.a(this);
        }
    }

    public final boolean c() {
        int i = this.r - 1;
        this.r = i;
        if (i != 0) {
            return false;
        }
        this.j = 0;
        this.i.removeCallbacksAndMessages(null);
        this.t.removeCallbacksAndMessages(null);
        this.t = null;
        this.s.quit();
        this.s = null;
        this.u = null;
        this.v = null;
        byte[] bArr = this.k;
        if (bArr != null) {
            this.a.a(bArr);
            this.k = null;
        }
        return true;
    }

    public final nxw d() {
        nxw nxw = this.o;
        return nxw != null ? nxw : this;
    }

    public final void e() {
        this.t.a(0, this.a.b(), true).sendToTarget();
    }

    public final int f() {
        return this.j;
    }

    public final odx g() {
        return this.j == 1 ? this.v : null;
    }

    public final ExoMediaCrypto h() {
        return this.u;
    }

    public final boolean a(boolean z) {
        if (i()) {
            return true;
        }
        try {
            this.k = this.a.a();
            this.u = this.a.d(this.k);
            this.j = 3;
            return true;
        } catch (NotProvisionedException e) {
            if (z) {
                e();
            } else {
                b(e);
            }
            return false;
        } catch (Exception e2) {
            b(e2);
            return false;
        }
    }

    public final void b(boolean z) {
        if (this.l == null) {
            a(1, z);
        } else if (this.j == 4 || j()) {
            long min;
            if (nyr.d.equals(this.q)) {
                byte[] bArr = this.k;
                Pair pair = null;
                Map c = bArr != null ? this.a.c(bArr) : null;
                if (c != null) {
                    pair = new Pair(Long.valueOf(oel.a(c, "LicenseDurationRemaining")), Long.valueOf(oel.a(c, "PlaybackDurationRemaining")));
                }
                min = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
            } else {
                min = Long.MAX_VALUE;
            }
            if (min <= 60) {
                a(2, z);
            } else if (min <= 0) {
                b(new oek());
            } else {
                this.j = 4;
                Handler handler = this.d;
                if (!(handler == null || this.e == null)) {
                    handler.post(new nxy(this));
                }
            }
        }
    }

    private final boolean j() {
        try {
            this.a.b(this.k, this.l);
            return true;
        } catch (Exception e) {
            Log.e("YTDrmSession", "Error trying to restore Widevine keys.", e);
            b(e);
            return false;
        }
    }

    private final void a(int i, boolean z) {
        byte[] bArr = this.k;
        try {
            this.e.a();
            odz a = this.a.a(bArr, Collections.singletonList(new ods(nyr.d, this.m, this.b)), i, this.n);
            this.e.b();
            this.e.c();
            this.t.a(1, a, z).sendToTarget();
        } catch (Exception e) {
            a(e);
        }
    }

    public final void a(Exception exception) {
        if (exception instanceof NotProvisionedException) {
            e();
        } else {
            b(exception);
        }
    }

    public final void b(Exception exception) {
        this.v = new odx(exception);
        Handler handler = this.d;
        if (!(handler == null || this.e == null)) {
            handler.post(new nya(this, exception));
        }
        if (this.j != 4) {
            this.j = 1;
        }
    }

    public final boolean i() {
        int i = this.j;
        return i == 3 || i == 4;
    }
}
