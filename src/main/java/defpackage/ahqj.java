package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ahqj */
final class ahqj extends HandlerThread {
    public Handler a;
    public final List b = new ArrayList();
    public long c = -1;
    public long d = 0;
    public ahrh e = null;
    public long f = 0;
    public boolean g = false;
    public final Runnable h;
    public volatile boolean i = false;
    public long j = 0;
    public long k = System.currentTimeMillis();
    public long l = -1;
    public final Handler m;
    public final ajex n;

    public ahqj(Handler handler, ajex ajex) {
        super(ahqj.class.getSimpleName());
        this.m = (Handler) amqw.a((Object) handler);
        this.n = (ajex) amqw.a((Object) ajex);
        this.h = new ahqi(this);
    }

    public final synchronized void start() {
        super.start();
        this.a = new Handler(getLooper());
        a(30000);
    }

    public final void a(long j) {
        Handler handler = this.a;
        if (handler != null) {
            handler.postDelayed(this.h, j);
        }
    }

    public final void a(byte[] bArr, long j) {
        long j2 = this.c;
        if (j2 == -1) {
            this.c = j;
            j2 = j;
        }
        this.d = j - j2;
        this.b.add(bArr);
    }

    public static byte a(byte[] bArr, byte b) {
        int i = 0;
        byte b2 = b;
        while (true) {
            byte b3 = bArr[i];
            if (b3 != b && i < 256) {
                bArr[i] = b2;
                i++;
                b2 = b3;
            }
        }
        bArr[i] = b2;
        return (byte) i;
    }
}
