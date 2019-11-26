package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collections;

/* renamed from: jvs */
final class jvs extends Handler {
    private final jvo a;

    public final void handleMessage(Message message) {
        int i = message.what;
        jvx jvx = null;
        jvo jvo;
        jvs jvs;
        jvo jvo2;
        if (i == 0) {
            jvo = this.a;
            if (jvo.r != null && jvo.q == null && jvo.s && !jvo.v && jvo.f()) {
                if (jvo.n == null) {
                    jvo.v = true;
                    jvo.a(5, new Exception("null exoCacheStorage"), jvo.j.f, 0, 0);
                } else {
                    ayxq ayxq;
                    ayxo ayxo = jvo.j;
                    int b = xss.b(jvo.p, jvo.m.getWidth());
                    int b2 = xss.b(jvo.p, jvo.m.getHeight());
                    amqw.a(b >= 0);
                    amqw.a(b2 >= 0);
                    if (ayxo == null || ayxo.e.size() <= 0) {
                        ayxq = null;
                    } else {
                        ayxq = null;
                        int i2 = 0;
                        for (ayxq ayxq2 : ayxo.e) {
                            int i3 = b - ayxq2.c;
                            int i4 = b2 - ayxq2.d;
                            i3 = (i3 * i3) + (i4 * i4);
                            if (ayxq == null || i3 < i2) {
                                ayxq = ayxq2;
                                i2 = i3;
                            }
                        }
                    }
                    if (ayxq != null) {
                        String str = jvo.j.f;
                        oww oww = jvo.n;
                        if (oww != null) {
                            for (String str2 : oww.c()) {
                                epe epe = new epe(str2);
                                if (str.equals(epe.a())) {
                                    if (ayxq.c > epe.b() && ayxq.d > epe.c()) {
                                        oxi.a(jvo.n, str2);
                                        jvx = new jvx(str, ayxq.c, ayxq.d, ayxq.b);
                                    } else {
                                        jvx = new jvx(epe);
                                    }
                                }
                            }
                        }
                        if (jvx == null) {
                            jvx = new jvx(str, ayxq.c, ayxq.d, ayxq.b);
                        }
                        jvo.t = jvx;
                        ool ooe = new ooe(new ooa(xvt.d(jvo.t.d), jvo.f, jvo.g, jvo.t.e));
                        jvo.q = jvo.c.a(jvo.a, jvo.h);
                        oas oas = jvo.q;
                        jvv jvv = jvo.i;
                        oas.h.retainAll(Collections.singleton(oas.k));
                        if (jvv != null) {
                            oas.h.add(jvv);
                        }
                        jvo.q.a(jvo.r);
                        jvo.q.a(jvo.i);
                        jvo.q.a(ooe);
                        jvo.q.a(true);
                        if (jvo.j.g > 0) {
                            jvs = jvo.o;
                            jvs.sendMessageDelayed(jvs.obtainMessage(4), (long) jvo.j.g);
                        }
                    }
                }
            }
        } else if (i == 1) {
            jvo = this.a;
            if (!(jvo.r == null || jvo.q == null || !jvo.f())) {
                jvo.q.a(true);
                jvo.q.a(jvo.r);
                if (jvo.j.g > 0) {
                    jvs = jvo.o;
                    jvs.sendMessageDelayed(jvs.obtainMessage(4), (long) jvo.j.g);
                }
            }
        } else if (i == 2) {
            jvo2 = this.a;
            SurfaceTexture surfaceTexture = message.obj instanceof SurfaceTexture ? (SurfaceTexture) message.obj : null;
            oas oas2 = jvo2.q;
            if (oas2 != null) {
                oas2.a(false);
                jvo2.q.a(null);
            }
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        } else if (i == 3) {
            this.a.a(3, null);
        } else if (i == 4) {
            jvo = this.a;
            jvo.v = true;
            jvo.a(8, null);
        } else if (i == 5) {
            Throwable th;
            jvo2 = this.a;
            if (message.obj instanceof Throwable) {
                th = (Throwable) message.obj;
            }
            jvo2.a(6, th);
        }
    }

    /* synthetic */ jvs(jvo jvo) {
        super(Looper.getMainLooper());
        this.a = jvo;
    }
}
