package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;

/* renamed from: wz */
class wz extends xe {
    private static boolean q = true;

    wz(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        super(context, str, componentName, pendingIntent);
    }

    public void a(wv wvVar, Handler handler) {
        super.a(wvVar, handler);
        if (wvVar == null) {
            this.d.setPlaybackPositionUpdateListener(null);
            return;
        }
        this.d.setPlaybackPositionUpdateListener(new wy(this));
    }

    /* Access modifiers changed, original: final */
    public final void b(xs xsVar) {
        long j = xsVar.b;
        float f = xsVar.d;
        long j2 = xsVar.h;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = xsVar.a;
        if (i == 3) {
            long j3 = 0;
            if (j > 0) {
                if (j2 > 0) {
                    j3 = elapsedRealtime - j2;
                    if (f > 0.0f && f != 1.0f) {
                        j3 = (long) (((float) j3) * f);
                    }
                }
                j += j3;
            }
        }
        this.d.setPlaybackState(xe.c(i), j, f);
    }

    /* Access modifiers changed, original: 0000 */
    public int a(long j) {
        int a = super.a(j);
        return (j & 256) != 0 ? a | 256 : a;
    }

    /* Access modifiers changed, original: final */
    public final void a(PendingIntent pendingIntent, ComponentName componentName) {
        if (q) {
            try {
                this.c.registerMediaButtonEventReceiver(pendingIntent);
            } catch (NullPointerException unused) {
                Log.w("MediaSessionCompat", "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
                q = false;
            }
        }
        if (!q) {
            super.a(pendingIntent, componentName);
        }
    }

    /* Access modifiers changed, original: final */
    public final void b(PendingIntent pendingIntent, ComponentName componentName) {
        if (q) {
            this.c.unregisterMediaButtonEventReceiver(pendingIntent);
        } else {
            super.b(pendingIntent, componentName);
        }
    }
}
