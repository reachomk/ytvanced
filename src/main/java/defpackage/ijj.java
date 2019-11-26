package defpackage;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import com.google.android.youtube.R;
import java.util.Set;

/* renamed from: ijj */
public final class ijj implements ajan, ijp, xcp {
    private float A;
    private float B;
    private boolean C;
    private boolean D;
    private Rect E;
    public float a;
    private final elh b;
    private final xci c;
    private final zyw d;
    private final bcaa e;
    private final float f;
    private final float g;
    private final boolean h;
    private final boolean i;
    private final bcaa j;
    private final acvx k;
    private final SharedPreferences l;
    private final ijn m;
    private final Set n = new zl();
    private final ajam o;
    private final bdfu p;
    private ijt q;
    private ijs r;
    private ValueAnimator s;
    private boolean t;
    private float u;
    private float v;
    private int w;
    private int x;
    private boolean y;
    private float z;

    public ijj(elh elh, xci xci, zyw zyw, bcaa bcaa, bcaa bcaa2, acvx acvx, SharedPreferences sharedPreferences, ajam ajam) {
        aulu aulu;
        azew azew;
        aulu aulu2;
        azew azew2;
        this.b = elh;
        this.c = xci;
        this.d = zyw;
        this.e = bcaa;
        this.j = bcaa2;
        this.k = acvx;
        this.l = sharedPreferences;
        this.o = ajam;
        this.p = new bdfu();
        apxn a = zyw.a();
        float f = 2.0f;
        if (a != null) {
            aulu = a.e;
            if (aulu == null) {
                aulu = aulu.bw;
            }
            azew = aulu.M;
            if (azew == null) {
                azew = azew.f;
            }
            if ((azew.a & 2) != 0) {
                aulu2 = a.e;
                if (aulu2 == null) {
                    aulu2 = aulu.bw;
                }
                azew2 = aulu2.M;
                if (azew2 == null) {
                    azew2 = azew.f;
                }
                f = azew2.c;
            }
        }
        this.f = f;
        a = zyw.a();
        f = 1.7f;
        if (a != null) {
            aulu = a.e;
            if (aulu == null) {
                aulu = aulu.bw;
            }
            azew = aulu.M;
            if (azew == null) {
                azew = azew.f;
            }
            if ((azew.a & 2) != 0) {
                aulu2 = a.e;
                if (aulu2 == null) {
                    aulu2 = aulu.bw;
                }
                azew2 = aulu2.M;
                if (azew2 == null) {
                    azew2 = azew.f;
                }
                f = azew2.d;
            }
        }
        this.g = f;
        a = zyw.a();
        boolean z = false;
        if (a != null) {
            aulu2 = a.e;
            if (aulu2 == null) {
                aulu2 = aulu.bw;
            }
            azew2 = aulu2.M;
            if (azew2 == null) {
                azew2 = azew.f;
            }
            if (azew2.e) {
                z = true;
            }
        }
        this.h = z;
        this.i = foh.x(zyw);
        this.m = new ijn(this);
        f();
    }

    public final long e() {
        return 1;
    }

    public final void a(ijt ijt, ijs ijs) {
        this.t = true;
        this.q = ijt;
        this.r = ijs;
        this.r.a(this);
        ((ajjz) this.e.get()).a((ajkk) this);
        d();
    }

    public final void A_() {
        if (this.i) {
            this.p.a();
            this.p.a(a(this.o));
        } else {
            this.c.a((Object) this);
        }
        ekl j = ((elf) this.b.get()).j();
        if (j != null) {
            j.addOnLayoutChangeListener(this.m);
        }
    }

    public final void ar_() {
        if (this.i) {
            this.p.a();
        } else {
            this.c.b(this);
        }
        ekl j = ((elf) this.b.get()).j();
        if (j != null) {
            j.removeOnLayoutChangeListener(this.m);
        }
    }

    private final void c(float f) {
        float f2 = this.u;
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator == null) {
            this.s = ValueAnimator.ofFloat(new float[]{f2, f});
            this.s.addUpdateListener(new ijm(this));
        } else {
            valueAnimator.setFloatValues(new float[]{f2, f});
        }
        this.s.setDuration((long) (((int) (Math.abs(f2 - f) * 500.0f)) + 100));
        this.s.cancel();
        this.s.start();
    }

    public final void b(float f) {
        if (this.u != f) {
            this.u = f;
            g();
        }
    }

    public final void a(int i, int i2) {
        this.z = ((float) i) / ((float) i2);
        c();
        g();
    }

    /* Access modifiers changed, original: final */
    public final void a(ahkn ahkn) {
        airi airi = ahkn.a;
        boolean z = false;
        if (!(airi.a() || !airi.a(airi.READY) || airi == airi.ENDED)) {
            z = true;
        }
        if (this.y != z) {
            this.y = z;
            c();
        }
    }

    public final void a(ejd ejd, ejd ejd2) {
        if (ejd != ejd2) {
            if (ejd2 == ejd.NONE) {
                f();
            }
            boolean z = this.C;
            boolean z2 = ejd2 == ejd.WATCH_WHILE_FULLSCREEN;
            this.C = z2;
            if (z != z2) {
                c();
            }
        }
    }

    public final void a(boolean z) {
        if (this.D != z) {
            this.D = z;
            c();
        }
    }

    public final void c() {
        if (this.t) {
            float f = this.g;
            float f2 = this.z;
            float f3 = this.f;
            float f4 = this.a;
            float f5 = 1.02f * f2;
            if (this.D || !this.y || !this.C || f > f2 || f3 > f4 || f5 > f4) {
                d();
                b(1.0f);
            } else {
                f4 /= f2;
                this.A = f4;
                this.B = ((f4 - 4.0f) * 0.33f) + 1.0f;
                this.r.c = true;
                int i = this.x;
                if (i == 0) {
                    b(false);
                    if (this.h) {
                        SharedPreferences sharedPreferences = this.l;
                        String str = ebn.VIDEO_ZOOM_USER_EDUCATION_SHOWN;
                        if (!sharedPreferences.getBoolean(str, false)) {
                            ijt ijt = this.q;
                            if (ijt.g == null) {
                                ijt.a();
                                ijt.g = new alcg(View.inflate(ijt.a, R.layout.video_zoom_user_education, null), ijt.b, 4, 3);
                            }
                            if (!ijt.g.a()) {
                                Resources resources = ijt.a.getResources();
                                Rect rect = new Rect();
                                rect.offsetTo(resources.getDimensionPixelSize(R.dimen.video_zoom_user_education_left_offset), resources.getDimensionPixelSize(R.dimen.video_zoom_user_education_top_offset));
                                ijt.g.a(rect);
                            }
                            this.l.edit().putBoolean(str, true).apply();
                        }
                    }
                } else if (i != 3) {
                    b(false);
                } else {
                    c(false);
                }
                this.k.b(acwc.VIDEO_ZOOM_SNAPPED_TO_FILL, null);
                this.k.b(acwc.VIDEO_ZOOM_SNAPPED_TO_FIT, null);
            }
        }
    }

    private final void d() {
        this.r.c = false;
        this.q.b();
        ijt ijt = this.q;
        alcg alcg = ijt.g;
        if (alcg != null && alcg.a()) {
            ijt.g.a(0);
        }
    }

    private final void f() {
        this.u = -1.0f;
        a(0);
    }

    private final void a(int i) {
        this.x = i;
        if (i == 0 || i == 3) {
            this.w = i;
        }
    }

    private final void b(boolean z) {
        if (z) {
            c(1.0f);
        } else {
            b(1.0f);
        }
        int i = this.x;
        if (i != 0) {
            if (z) {
                if (i == 2) {
                    this.q.c();
                } else if (this.w != 0) {
                    ijt ijt = this.q;
                    ijt.a();
                    ijt.c.setVisibility(8);
                    ijt.d.setText(R.string.video_zoom_normal_title);
                    ijt.a(ijt.d, R.animator.video_zoom_snap_flash_title, ijt.f);
                    ijt.d.sendAccessibilityEvent(8);
                    this.k.a(3, new acvs(acwc.VIDEO_ZOOM_SNAPPED_TO_FIT), null);
                }
            }
            a(0);
        }
    }

    private final void c(boolean z) {
        if (z) {
            c(this.A);
        } else {
            b(this.A);
        }
        if (this.x != 3) {
            if (z && this.w != 3) {
                ijt ijt = this.q;
                ijt.a();
                ijt.a(ijt.c, R.animator.video_zoom_snap_flash_indicator, ijt.e);
                ijt.d.setText(R.string.video_zoom_snapped_title);
                ijt.a(ijt.d, R.animator.video_zoom_snap_flash_title, ijt.f);
                ijt.d.sendAccessibilityEvent(8);
                this.k.a(3, new acvs(acwc.VIDEO_ZOOM_SNAPPED_TO_FILL), null);
            }
            a(3);
        }
    }

    public final void j() {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.s.cancel();
        }
        ((zwj) this.j.get()).c();
    }

    public final void a(float f) {
        float max = Math.max(Math.min(this.u * f, this.A + 0.02f), 0.98f);
        this.v = f;
        if (max >= this.B) {
            b(max);
            if (this.x != 2) {
                if (this.w != 3) {
                    ijt ijt = this.q;
                    ijt.a();
                    ijt.a(ijt.c, R.animator.video_zoom_snap_threshold_indicator_show, null);
                    ijt.d.setVisibility(8);
                }
                a(2);
                return;
            }
            return;
        }
        b(max);
        int i = this.x;
        if (i != 1) {
            if (i == 2 && this.w != 3) {
                this.q.c();
            }
            a(1);
        }
    }

    public final void e(boolean z) {
        if (!z) {
            int i = this.x;
            if (i != 1) {
                if (i == 2) {
                    c(true);
                }
                return;
            }
            b(true);
        } else if (this.v > 1.0f) {
            c(true);
        } else {
            b(true);
        }
    }

    private final void g() {
        ekl j = ((elf) this.b.get()).j();
        if (j != null) {
            j.i.requestLayout();
        }
        for (lkx a : this.n) {
            a.a();
        }
    }

    public final Rect a(Rect rect) {
        if (this.D || this.z <= 0.0f || this.u == -1.0f) {
            return rect;
        }
        if (this.E == null) {
            this.E = new Rect();
        }
        fpe.b(this.z, rect, this.E);
        Object obj = this.E;
        float f = this.u;
        amqw.a(obj);
        amqw.a(obj);
        amqw.a(f >= 0.0f);
        if (f == 1.0f) {
            obj.set(obj);
        } else {
            int centerX = obj.centerX();
            int centerY = obj.centerY();
            int width = obj.width();
            int height = obj.height();
            width = Math.round(((float) width) * f);
            int round = Math.round(((float) height) * f);
            obj.left = centerX - (width / 2);
            obj.top = centerY - (round / 2);
            obj.right = obj.left + width;
            obj.bottom = obj.top + round;
        }
        return this.E;
    }

    public final void a(lkx lkx) {
        this.n.add(lkx);
    }

    public final void b(lkx lkx) {
        this.n.remove(lkx);
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.f().a(emg.a(this.d, 16384, 1)).a(new ijl(this), ijo.a)};
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkn.class};
        } else if (i == 0) {
            a((ahkn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
