package defpackage;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.libraries.youtube.media.player.drm.WidevineHelper.DrmProvisionException;
import java.util.HashMap;

/* renamed from: aesp */
public class aesp implements aerz {
    public final nqk a;
    public final afjj b;
    public final aesw c;
    public final aetm d;
    public final aesy e;
    public aesu f;
    public int g;
    public int h;
    public byte[] i;
    private final HashMap j;
    private final Handler k;
    private final amro l;
    private HandlerThread m;
    private Handler n;
    private boolean o;
    private nqh p;
    private Exception q;
    private npx r;
    private int s = -1;

    public aesp(Looper looper, aetm aetm, HashMap hashMap, Handler handler, aesu aesu, amro amro, nqk nqk, afjj afjj) {
        this.d = aetm;
        this.j = hashMap;
        this.k = handler;
        this.f = aesu;
        this.l = (amro) amqw.a((Object) amro);
        this.a = nqk;
        this.a.a(new aest(this));
        this.b = afjj;
        this.c = new aesw(this, looper);
        this.e = new aesy(this, looper);
        this.h = 1;
    }

    public final void a() {
    }

    public final int f() {
        int i = this.s;
        if (i != -1) {
            return i;
        }
        i = aesp.a(this.a);
        this.s = i;
        return i;
    }

    private static int a(defpackage.nqk r4) {
        /*
        r0 = -1;
        r1 = "securityLevel";
        r4 = r4.a(r1);	 Catch:{ all -> 0x003c }
        r1 = r4.hashCode();	 Catch:{ all -> 0x003c }
        r2 = 2;
        r3 = 1;
        switch(r1) {
            case 2405: goto L_0x0028;
            case 2406: goto L_0x001d;
            case 2407: goto L_0x0012;
            default: goto L_0x0010;
        };	 Catch:{ all -> 0x003c }
    L_0x0010:
        r4 = -1;
        goto L_0x0032;
    L_0x0012:
        r1 = "L3";
        r4 = r4.equals(r1);	 Catch:{ all -> 0x003c }
        if (r4 != 0) goto L_0x001b;
    L_0x001a:
        goto L_0x0010;
    L_0x001b:
        r4 = 2;
        goto L_0x0032;
    L_0x001d:
        r1 = "L2";
        r4 = r4.equals(r1);	 Catch:{ all -> 0x003c }
        if (r4 != 0) goto L_0x0026;
    L_0x0025:
        goto L_0x0010;
    L_0x0026:
        r4 = 1;
        goto L_0x0032;
    L_0x0028:
        r1 = "L1";
        r4 = r4.equals(r1);	 Catch:{ all -> 0x003c }
        if (r4 != 0) goto L_0x0031;
    L_0x0030:
        goto L_0x0010;
    L_0x0031:
        r4 = 0;
    L_0x0032:
        if (r4 == 0) goto L_0x003b;
    L_0x0034:
        if (r4 == r3) goto L_0x003b;
    L_0x0036:
        if (r4 == r2) goto L_0x0039;
    L_0x0038:
        return r0;
    L_0x0039:
        r4 = 3;
        return r4;
    L_0x003b:
        return r3;
    L_0x003c:
        r4 = move-exception;
        r4 = r4.getLocalizedMessage();
        r4 = java.lang.String.valueOf(r4);
        r1 = "Cannot determine Widevine Security Level. Falling back to non-L1: ";
        r2 = r4.length();
        if (r2 != 0) goto L_0x0053;
    L_0x004d:
        r4 = new java.lang.String;
        r4.<init>(r1);
        goto L_0x0057;
    L_0x0053:
        r4 = r1.concat(r4);
    L_0x0057:
        defpackage.xtl.d(r4);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aesp.a(nqk):int");
    }

    public static int h() {
        try {
            return aesp.a(new nqk(aers.a));
        } catch (UnsupportedSchemeException unused) {
            return -1;
        }
    }

    public final int b() {
        return this.h;
    }

    /* renamed from: i */
    public final nqh c() {
        int i = this.h;
        if (i == 3 || i == 4) {
            return this.p;
        }
        throw new IllegalStateException();
    }

    public final boolean a(String str) {
        int i = this.h;
        if (i != 3 && i != 4) {
            throw new IllegalStateException();
        } else if (f() == 1 && this.p.a(str)) {
            return true;
        } else {
            return false;
        }
    }

    public final Exception d() {
        return this.h == 0 ? this.q : null;
    }

    public final void a(npv npv) {
        int i = this.g + 1;
        this.g = i;
        if (i == 1) {
            if (this.n == null) {
                this.m = new HandlerThread("DrmRequestHandler");
                this.m.start();
                this.n = new aesv(this, this.m.getLooper());
            }
            if (this.r == null) {
                this.r = npv.a(aers.a);
                if (this.r == null) {
                    b(new IllegalStateException("Media does not support Widevine"));
                    return;
                } else if (nxf.a < 21) {
                    byte[] a = nsv.a(this.r.b, aers.a);
                    if (a != null) {
                        this.r = new npx(this.r.a, a);
                    }
                }
            }
            this.h = 2;
            a(true);
        }
    }

    public final void e() {
        int i = this.g - 1;
        this.g = i;
        if (i == 0) {
            this.h = 1;
            this.o = false;
            aesw aesw = this.c;
            if (aesw != null) {
                aesw.removeCallbacksAndMessages(null);
            }
            if (this.n != null) {
                this.e.removeCallbacksAndMessages(null);
                this.n.removeCallbacksAndMessages(null);
                this.n = null;
            }
            HandlerThread handlerThread = this.m;
            if (handlerThread != null) {
                handlerThread.quit();
                this.m = null;
            }
            this.r = null;
            this.p = null;
            this.q = null;
            if (this.i != null) {
                this.k.postDelayed(new aess(this), 100);
            }
        }
    }

    private final void a(boolean z) {
        try {
            this.i = this.a.a();
            this.p = new nqh(new MediaCrypto(aers.a, this.i));
            this.h = 3;
            g();
        } catch (NotProvisionedException e) {
            if (z) {
                j();
            } else {
                b(e);
            }
        } catch (Exception e2) {
            b(e2);
        }
    }

    public final void j() {
        if (!this.o) {
            this.o = true;
            this.n.obtainMessage(0, this.a.b()).sendToTarget();
        }
    }

    public final void a(Object obj) {
        this.o = false;
        int i = this.h;
        if (i != 2 && i != 3 && i != 4) {
            return;
        }
        if (obj instanceof Exception) {
            b((Exception) obj);
            return;
        }
        try {
            this.a.b((byte[]) obj);
            if (this.h != 2) {
                g();
            } else {
                a(false);
            }
        } catch (DeniedByServerException | IllegalStateException e) {
            b(new DrmProvisionException(e));
        }
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0025 */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:2|3|4|5|6|7|8|9|(1:11)(2:12|13)) */
    public void g() {
        /*
        r6 = this;
        r0 = r6.l;
        r0 = r0.get();
        r0 = (defpackage.aesd) r0;
        if (r0 == 0) goto L_0x004c;
    L_0x000a:
        r1 = r6.a;	 Catch:{ Exception -> 0x0046 }
        r2 = r6.i;	 Catch:{ Exception -> 0x0046 }
        r3 = r0.a;	 Catch:{ Exception -> 0x0046 }
        r1.b(r2, r3);	 Catch:{ Exception -> 0x0046 }
        r1 = 0;
        r3 = new aesz;	 Catch:{ Exception -> 0x0025 }
        r4 = r6.a;	 Catch:{ Exception -> 0x0025 }
        r5 = r6.i;	 Catch:{ Exception -> 0x0025 }
        r4 = r4.c(r5);	 Catch:{ Exception -> 0x0025 }
        r3.<init>(r4);	 Catch:{ Exception -> 0x0025 }
        r3 = r3.a;	 Catch:{ Exception -> 0x0025 }
        goto L_0x002b;
    L_0x0025:
        r3 = "Unable to query key status for Offline License. Falling back to streaming mode.";
        defpackage.xtl.d(r3);	 Catch:{ Exception -> 0x0046 }
        r3 = r1;
    L_0x002b:
        r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1));
        if (r5 > 0) goto L_0x0035;
    L_0x002f:
        r0 = "Offline license expired. Trying with Streaming License";
        defpackage.xtl.d(r0);	 Catch:{ Exception -> 0x0046 }
        goto L_0x004c;
    L_0x0035:
        r1 = 4;
        r6.h = r1;	 Catch:{ Exception -> 0x0046 }
        r1 = r6.d;	 Catch:{ Exception -> 0x0046 }
        r0 = r0.f;	 Catch:{ Exception -> 0x0046 }
        r2 = 0;
        r1.a(r0, r2);	 Catch:{ Exception -> 0x0046 }
        r0 = "Using Offline Widevine license for the playback";
        defpackage.xtl.e(r0);	 Catch:{ Exception -> 0x0046 }
        return;
    L_0x0046:
        r0 = move-exception;
        r1 = "Error trying to restore Widevine keys. Falling back to streaming mode.";
        defpackage.xtl.a(r1, r0);
    L_0x004c:
        r6.k();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aesp.g():void");
    }

    private final void k() {
        try {
            this.b.k();
            nqk nqk = this.a;
            byte[] bArr = this.i;
            npx npx = this.r;
            nqd a = nqk.a(bArr, npx.b, npx.a, 1, this.j);
            this.b.l();
            this.b.a.a(new aegp());
            this.n.obtainMessage(1, a).sendToTarget();
        } catch (NotProvisionedException e) {
            a(e);
        }
    }

    public final void a(Exception exception) {
        if (exception instanceof NotProvisionedException) {
            j();
        } else {
            b(exception);
        }
    }

    public final void b(Exception exception) {
        this.q = exception;
        Handler handler = this.k;
        if (handler != null) {
            aesu aesu = this.f;
            if (aesu != null) {
                handler.post(new aesr(aesu, exception));
            }
        }
        if (this.h != 4) {
            this.h = 0;
        }
    }

    public static void a(nqk nqk, byte[] bArr) {
        if (nqk != null && bArr != null) {
            try {
                new Object[1][0] = nqk.c(bArr);
            } catch (Exception e) {
                Object[] objArr = new Object[]{bArr, e.toString()};
            }
        }
    }
}
