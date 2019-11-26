package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: qss */
public abstract class qss implements qsp {
    public static volatile qui b;
    private double a;
    public MotionEvent c;
    public final LinkedList d = new LinkedList();
    public long e = 0;
    public long f = 0;
    public long g = 0;
    public long h = 0;
    public long i = 0;
    public long j = 0;
    public long k = 0;
    public double l;
    public float m;
    public float n;
    public float o;
    public float p;
    public boolean q = false;
    public DisplayMetrics r;
    private double s;
    private boolean t = false;

    protected qss(Context context) {
        try {
            if (((Boolean) rlj.d().a(roe.l)).booleanValue()) {
                qrk.a();
            } else {
                qvj.a(b);
            }
            this.r = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    public abstract long a(StackTraceElement[] stackTraceElementArr);

    public abstract qpa a(Context context, qoh qoh);

    public abstract qpa b(Context context);

    public abstract qwq b(MotionEvent motionEvent);

    public final String a(Context context) {
        if (qyb.a()) {
            if (((Boolean) rlj.d().a(roe.n)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return a(context, null, false, null);
    }

    public final String a(Context context, byte[] bArr) {
        if (qyb.a()) {
            if (((Boolean) rlj.d().a(roe.n)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return a(context, null, false, bArr);
    }

    public final String a(Context context, String str) {
        return a(context, str, true, null);
    }

    public final void a(MotionEvent motionEvent) {
        if (this.t) {
            this.h = 0;
            this.g = 0;
            this.f = 0;
            this.e = 0;
            this.i = 0;
            this.k = 0;
            this.j = 0;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.d.clear();
            this.c = null;
            this.t = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.l = 0.0d;
            this.a = (double) motionEvent.getRawX();
            this.s = (double) motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = (double) motionEvent.getRawX();
            double rawY = (double) motionEvent.getRawY();
            double d = this.a;
            Double.isNaN(rawX);
            d = rawX - d;
            double d2 = this.s;
            Double.isNaN(rawY);
            d2 = rawY - d2;
            this.l += Math.sqrt((d * d) + (d2 * d2));
            this.a = rawX;
            this.s = rawY;
        }
        action = motionEvent.getAction();
        if (action == 0) {
            this.m = motionEvent.getX();
            this.n = motionEvent.getY();
            this.o = motionEvent.getRawX();
            this.p = motionEvent.getRawY();
            this.e++;
        } else if (action == 1) {
            this.c = MotionEvent.obtain(motionEvent);
            this.d.add(this.c);
            if (this.d.size() > 6) {
                ((MotionEvent) this.d.remove()).recycle();
            }
            this.g++;
            this.i = a(new Throwable().getStackTrace());
        } else if (action == 2) {
            this.f += (long) (motionEvent.getHistorySize() + 1);
            try {
                Long l;
                qwq b = b(motionEvent);
                if (b != null) {
                    l = b.d;
                    if (!(l == null || b.g == null)) {
                        this.j += l.longValue() + b.g.longValue();
                    }
                }
                if (!(this.r == null || b == null)) {
                    l = b.e;
                    if (!(l == null || b.h == null)) {
                        this.k += l.longValue() + b.h.longValue();
                    }
                }
            } catch (qtl unused) {
            }
        } else if (action == 3) {
            this.h++;
        }
        this.q = true;
    }

    private final String a(Context context, String str, boolean z, byte[] bArr) {
        qpa b;
        qoh qoh = null;
        if (bArr != null && bArr.length > 0) {
            try {
                qoh = (qoh) riu.a(new qoh(), bArr);
            } catch (rir unused) {
            }
        }
        if (z) {
            try {
                b = b(context);
                this.t = true;
            } catch (UnsupportedEncodingException | GeneralSecurityException unused2) {
                return Integer.toString(7);
            } catch (Throwable unused3) {
                return Integer.toString(3);
            }
        }
        b = a(context, qoh);
        if (b != null) {
            if (b.d() != 0) {
                return qrk.a(b, str);
            }
        }
        return Integer.toString(5);
    }
}
