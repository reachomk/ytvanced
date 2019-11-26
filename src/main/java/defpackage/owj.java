package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;

/* renamed from: owj */
final class owj extends Handler implements Runnable {
    public final int a;
    public IOException b;
    public int c;
    private final owm d;
    private final long e;
    private owh f;
    private volatile Thread g;
    private volatile boolean h;
    private volatile boolean i;
    private final /* synthetic */ owi j;

    public owj(owi owi, Looper looper, owm owm, owh owh, int i, long j) {
        this.j = owi;
        super(looper);
        this.d = owm;
        this.f = owh;
        this.a = i;
        this.e = j;
    }

    public final void a(long j) {
        oxz.b(this.j.e == null);
        this.j.e = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            a();
        }
    }

    public final void a(boolean z) {
        this.i = z;
        this.b = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        }
        this.h = true;
        this.d.a();
        if (this.g != null) {
            this.g.interrupt();
        }
        if (!z) {
            return;
        }
        b();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f.a(this.d, elapsedRealtime, elapsedRealtime - this.e, true);
        this.f = null;
    }

    public final void run() {
        String str = "LoadTask";
        try {
            this.g = Thread.currentThread();
            if (!this.h) {
                String str2 = "load:";
                String simpleName = this.d.getClass().getSimpleName();
                if (simpleName.length() == 0) {
                    simpleName = new String(str2);
                } else {
                    str2.concat(simpleName);
                }
                this.d.b();
                ozn.a();
            }
            if (!this.i) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.i) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (InterruptedException unused) {
            oxz.b(this.h);
            if (!this.i) {
                sendEmptyMessage(2);
            }
        } catch (Exception e2) {
            oyp.b(str, "Unexpected exception loading stream", e2);
            if (!this.i) {
                obtainMessage(3, new own(e2)).sendToTarget();
            }
        } catch (OutOfMemoryError e3) {
            oyp.b(str, "OutOfMemory error loading stream", e3);
            if (!this.i) {
                obtainMessage(3, new own(e3)).sendToTarget();
            }
        } catch (Error e4) {
            oyp.b(str, "Unexpected error loading stream", e4);
            if (!this.i) {
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        } catch (Throwable th) {
            ozn.a();
        }
    }

    public final void handleMessage(Message message) {
        if (!this.i) {
            if (message.what == 0) {
                a();
            } else if (message.what != 4) {
                b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.e;
                if (this.h) {
                    this.f.a(this.d, elapsedRealtime, j, false);
                    return;
                }
                int i = message.what;
                if (i == 1) {
                    this.f.a(this.d, elapsedRealtime, j, false);
                } else if (i == 2) {
                    try {
                        this.f.a(this.d, elapsedRealtime, j);
                    } catch (RuntimeException e) {
                        oyp.b("LoadTask", "Unexpected exception handling load completed", e);
                        this.j.f = new own(e);
                    }
                } else if (i == 3) {
                    this.b = (IOException) message.obj;
                    int i2 = this.c + 1;
                    this.c = i2;
                    owk a = this.f.a(this.d, elapsedRealtime, j, this.b, i2);
                    i = a.a;
                    if (i == 3) {
                        this.j.f = this.b;
                    } else if (i != 2) {
                        if (i == 1) {
                            this.c = 1;
                        }
                        long j2 = a.b;
                        if (j2 == -9223372036854775807L) {
                            j2 = (long) Math.min((this.c - 1) * 1000, 5000);
                        }
                        a(j2);
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    private final void a() {
        this.b = null;
        owi owi = this.j;
        owi.d.execute(owi.e);
    }

    private final void b() {
        this.j.e = null;
    }
}
