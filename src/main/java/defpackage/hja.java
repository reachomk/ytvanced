package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;
import com.google.android.youtube.R;

/* renamed from: hja */
public final class hja {
    private final acwa A;
    private final long B;
    private int C;
    private final long D;
    private Animator E;
    public final int a;
    public final int b;
    public final int c;
    public ViewGroup d;
    public ViewGroup e;
    public SlimStatusBar f;
    public SlimStatusBar g;
    public final hjl h;
    public final hjo i;
    public int j;
    public AnimatorSet k;
    public Runnable l;
    public Runnable m;
    public Runnable n;
    public Runnable o;
    public Runnable p;
    public Runnable q;
    public Runnable r;
    public Runnable s;
    public Runnable t;
    public Runnable u;
    public Runnable v;
    public Runnable w;
    public LayoutTransition x;
    public LayoutTransition y;
    private final ebk z;

    public hja(Context context, ebk ebk, zyw zyw, acwa acwa) {
        this.z = ebk;
        this.A = acwa;
        Resources resources = context.getResources();
        this.a = resources.getColor(R.color.slim_status_bar_active_background_color);
        this.b = resources.getColor(R.color.slim_status_bar_inactive_background_color);
        this.c = resources.getColor(R.color.slim_status_bar_shimmer_background_color);
        this.B = (long) resources.getInteger(17694722);
        apxn a = zyw.a();
        long j = 3000;
        if (!(a == null || (a.a & 16) == 0)) {
            aulu aulu = a.e;
            if (aulu == null) {
                aulu = aulu.bw;
            }
            j = (long) aulu.K;
        }
        this.D = j;
        this.h = (hjl) amqw.a(new hjk());
        this.i = (hjo) amqw.a(new hjm(this));
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        this.d.setLayoutTransition(this.x);
        this.e.setLayoutTransition(this.y);
        int i = this.j;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    a(z);
                    if (z2) {
                        b(z, z3);
                    } else {
                        a(true, z);
                        return;
                    }
                } else if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            if (!z2) {
                                a(z);
                                a(true, z);
                                return;
                            } else if (z3) {
                                g(z);
                                return;
                            } else {
                                b();
                                e(false).post(this.n);
                                return;
                            }
                        }
                    } else if (!z2) {
                        a(z);
                        a(true, z);
                        return;
                    } else if (z3) {
                        g(z);
                        return;
                    }
                } else if (!z2) {
                    a(z);
                    a(true, z);
                    return;
                } else if (z3) {
                    g(z);
                    return;
                }
            } else if (z2) {
                a(z);
                this.j = 0;
                if (z3) {
                    g(z);
                }
            }
            return;
        }
        a(z);
        if (z2) {
            if (z3) {
                g(z);
            } else if (z) {
                b(true, false);
            }
            this.z.a(false);
        } else if (z) {
            a(true, true);
        } else {
            a(false, this.D);
        }
    }

    public final void a(boolean z) {
        if (z) {
            a();
        } else {
            b();
        }
    }

    public final LayoutTransition b(boolean z) {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setStartDelay(1, 0);
        layoutTransition.setDuration(this.B);
        if (z) {
            layoutTransition.addTransitionListener(new hjj());
        }
        return layoutTransition;
    }

    public final Runnable a(ViewGroup viewGroup, SlimStatusBar slimStatusBar, boolean z, boolean z2) {
        return new hjc(this, viewGroup, slimStatusBar, z, z2);
    }

    public final Runnable a(ViewGroup viewGroup, SlimStatusBar slimStatusBar) {
        return new hjf(this, viewGroup, slimStatusBar);
    }

    public final Runnable c(boolean z) {
        return new hje(this, z);
    }

    public final Runnable d(boolean z) {
        return new hjh(this, z);
    }

    public final ViewGroup e(boolean z) {
        return !z ? this.d : this.e;
    }

    public final SlimStatusBar f(boolean z) {
        return !z ? this.f : this.g;
    }

    public final void a() {
        this.e.removeCallbacks(this.q);
        this.e.removeCallbacks(this.p);
        this.e.removeCallbacks(this.r);
        this.e.removeCallbacks(this.s);
        this.e.removeCallbacks(this.w);
    }

    public final void b() {
        this.d.removeCallbacks(this.m);
        this.d.removeCallbacks(this.l);
        this.d.removeCallbacks(this.n);
        this.d.removeCallbacks(this.o);
        this.d.removeCallbacks(this.t);
        this.d.removeCallbacks(this.v);
    }

    public final void c() {
        Animator animator = this.E;
        if (animator != null) {
            animator.cancel();
            this.E = null;
        }
        AnimatorSet animatorSet = this.k;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.k = null;
        }
    }

    public final void b(ViewGroup viewGroup, SlimStatusBar slimStatusBar) {
        if (viewGroup == this.d) {
            this.x.setAnimator(3, hja.a(slimStatusBar));
        } else {
            this.y.setAnimator(3, hja.a(slimStatusBar));
        }
    }

    private final void b(boolean z, boolean z2) {
        Runnable runnable;
        if (z) {
            a();
        } else {
            b();
        }
        c();
        ViewGroup e = e(z);
        View f = f(z);
        this.j = 3;
        f.a(R.string.offline_bottom_status_bar_connection_regained);
        if (z) {
            f.setBackgroundColor(this.a);
        } else {
            this.E = this.h.a(f, this.b, this.a, 250);
            this.E.addListener(new hji(this, f));
            this.E.start();
        }
        if (z) {
            runnable = this.p;
        } else {
            runnable = this.l;
        }
        e.post(runnable);
        if (!z2 || z) {
            Runnable runnable2;
            if (z) {
                runnable2 = this.r;
            } else {
                runnable2 = this.n;
            }
            e.postDelayed(runnable2, 2000);
        } else {
            e.postDelayed(this.v, 2000);
        }
        this.z.a(false);
    }

    public final void a(boolean z, boolean z2) {
        Runnable runnable;
        if (z2) {
            a();
        } else {
            b();
        }
        c();
        ViewGroup e = e(z2);
        SlimStatusBar f = f(z2);
        f.a(R.string.offline_bottom_status_bar_connection_lost);
        f.setBackgroundColor(this.b);
        if (z2) {
            runnable = this.q;
        } else {
            runnable = this.m;
        }
        e.post(runnable);
        if (z2) {
            this.j = 4;
            e.postDelayed(this.r, 5000);
        }
        if (z) {
            this.z.a(true);
        }
    }

    public final void a(boolean z, long j) {
        Runnable runnable;
        this.j = 1;
        ViewGroup e = e(z);
        if (z) {
            runnable = this.s;
        } else {
            runnable = this.o;
        }
        e.postDelayed(runnable, j);
    }

    public final void g(boolean z) {
        Runnable runnable;
        if (z) {
            a();
        } else {
            b();
        }
        ViewGroup e = e(z);
        SlimStatusBar f = f(z);
        f.a(R.string.bottom_status_bar_incognito_mode);
        f.setBackgroundColor(this.b);
        if (z) {
            runnable = this.u;
        } else {
            runnable = this.t;
        }
        e.post(runnable);
        if (z) {
            this.j = 4;
            e.postDelayed(this.r, 5000);
        }
    }

    public final void a(acwc acwc) {
        this.C++;
        acvx t = this.A.t();
        t.a(t.a(Integer.valueOf(this.C), acwc, this.C));
    }

    private static Animator a(SlimStatusBar slimStatusBar) {
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("top", new int[]{slimStatusBar.getTop(), slimStatusBar.getBottom()});
        return ObjectAnimator.ofPropertyValuesHolder(slimStatusBar, new PropertyValuesHolder[]{ofInt});
    }

    public static boolean c(ViewGroup viewGroup, SlimStatusBar slimStatusBar) {
        return viewGroup.indexOfChild(slimStatusBar) >= 0;
    }
}
