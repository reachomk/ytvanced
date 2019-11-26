package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* renamed from: aciq */
public final class aciq implements acjl {
    public static final String a = String.valueOf(c).concat(".KEY_LAST_TIMESTAMP");
    private static final String c = aciq.class.getName();
    private static final long d = TimeUnit.SECONDS.toMillis(15);
    private static final long e = TimeUnit.SECONDS.toMillis(1);
    public final SharedPreferences b;
    private final Handler f;
    private long g;
    private long h;
    private long i;
    private boolean j;
    private boolean k;

    public static aciq a(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("youtube", 0);
        HandlerThread handlerThread = new HandlerThread("RtmpContinuityManager");
        handlerThread.start();
        return new aciq(sharedPreferences, new Handler(handlerThread.getLooper()));
    }

    private aciq(SharedPreferences sharedPreferences, Handler handler) {
        this.b = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.f = (Handler) amqw.a((Object) handler);
    }

    public final void a(long j) {
        amqw.a(j > 0);
        this.g = j;
        j = this.b.getLong(a, d);
        if (j >= 0) {
            long j2 = d;
            if (j < j2) {
                this.h = j + (j2 + j2);
                this.j = true;
                this.k = true;
            }
        }
        this.h = 0;
        this.j = true;
        this.k = true;
    }

    public final long a() {
        return this.g;
    }

    public final int b(long j) {
        boolean z = true;
        amqw.a(j > 0);
        amqw.b(this.g > 0);
        j -= this.g;
        if (j < 0) {
            return -1;
        }
        j += this.h;
        if (j > 2147483647L) {
            StringBuilder stringBuilder = new StringBuilder(40);
            stringBuilder.append("Timestamp overflow: ");
            stringBuilder.append(j);
            xtl.d(stringBuilder.toString());
        }
        if (this.j && (this.k || j - this.i >= e)) {
            this.f.post(new acit(this, j));
            this.i = j;
            if (j >= d) {
                z = false;
            }
            this.j = z;
            this.k = false;
        }
        return (int) j;
    }

    /* Access modifiers changed, original: protected|final */
    public final void finalize() {
        Looper looper = this.f.getLooper();
        if (looper != null) {
            Thread thread = looper.getThread();
            if (thread instanceof HandlerThread) {
                if (TextUtils.equals("RtmpContinuityManager", thread.getName())) {
                    ((HandlerThread) thread).quitSafely();
                }
            }
        }
        super.finalize();
    }
}
