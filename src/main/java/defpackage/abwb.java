package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewParent;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.youtube.R;

/* renamed from: abwb */
public abstract class abwb implements abro {
    public final akvz a;
    public abrr b;
    public aknh c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;
    private final Context h;
    private final akpe i;
    private final acvx j;
    private final OnLayoutChangeListener k;
    private final abwh l;
    private aknh m;
    private abwm n;
    private boolean o;
    private boolean p;
    private int q = 0;
    private CharSequence r;
    private abxi s;
    private Runnable t;
    private final Runnable u = new abwa(this);
    private final akng v = new abwe(this);

    public abwb(Context context, akvz akvz, akpe akpe, acvx acvx) {
        this.h = (Context) amqw.a((Object) context);
        this.a = (akvz) amqw.a((Object) akvz);
        this.a.a(ajxa.class);
        this.i = akpe;
        this.j = (acvx) amqw.a((Object) acvx);
        this.k = new abwd(this);
        this.l = new abwh(this);
    }

    public abstract RecyclerView a();

    public abstract RecyclerView b();

    public abstract View c();

    public abwm s() {
        return null;
    }

    public final void k() {
        if (!this.o) {
            View c = c();
            if (c != null) {
                c.setOnClickListener(new abwc(this));
            }
            RecyclerView a = a();
            RecyclerView b = b();
            a.addOnLayoutChangeListener(this.k);
            a.a(this.l);
            if (b != null) {
                b.a(this.l);
            }
            this.o = true;
        }
    }

    public final void l() {
        RecyclerView a = a();
        a.a(null);
        a.a(null);
        a.removeOnLayoutChangeListener(this.k);
        a.b(this.l);
        this.o = false;
        this.c = null;
        this.m = null;
        this.e = 0;
        RecyclerView b = b();
        if (b != null) {
            w();
            b.a(null);
            b.a(null);
            b.b(this.l);
        }
        this.g = 0;
    }

    public final void a(abrr abrr) {
        this.b = abrr;
    }

    public final void a(aknh aknh, akoq akoq) {
        if (this.c != aknh) {
            apa a;
            this.c = aknh;
            akpe akpe = this.i;
            if (akpe != null) {
                a = akpe.a((akpb) this.a.get());
            } else {
                a = new akpd((akpb) this.a.get());
            }
            a.a(aknh);
            a.a(new akod(this.j));
            if (akoq != null) {
                a.a(akoq);
            }
            RecyclerView a2 = a();
            a2.a(a);
            a2.a(new ans());
            a2.a(null);
            apk apk = this.n;
            if (apk != null) {
                a2.b(apk);
            }
            this.n = s();
            apk = this.n;
            if (apk != null) {
                a2.a(apk);
                abxi abxi = this.s;
                if (abxi != null) {
                    this.n.a = abxi;
                }
            }
        }
    }

    public final void e() {
        int d = this.c.d();
        if (d > 0) {
            RecyclerView a = a();
            int i = d - 10;
            if (((ans) a.n).r() < i) {
                a.c(i);
            }
            this.d = true;
            a.e(d - 1);
        }
    }

    public final boolean f() {
        return this.d || t();
    }

    public final boolean g() {
        return this.e == 1;
    }

    public final void a(boolean z) {
        RecyclerView a = a();
        if (z) {
            if (a.D == null) {
                a.a(new amg());
            }
        } else if (a.D != null) {
            a.a(null);
        }
    }

    public final boolean t() {
        int r = ((ans) a().n).r();
        return r == -1 || r == this.c.d() - 1;
    }

    public final void b(aknh aknh, akoq akoq) {
        aknh aknh2 = this.m;
        if (aknh2 != aknh) {
            if (aknh2 != null) {
                aknh2.a(this.v);
            }
            this.m = aknh;
            aknh2 = this.m;
            if (aknh2 != null) {
                aknh2.b(this.v);
            }
            RecyclerView b = b();
            if (b != null) {
                apn ans = new ans();
                ans.b(0);
                b.a(ans);
                if (b.getTag(R.id.live_chat_ticker_view_decorator_added_tag) == null) {
                    b.a(new abxl(this.h.getResources().getDimensionPixelOffset(R.dimen.live_chat_ticker_header_width)));
                    b.setTag(R.id.live_chat_ticker_view_decorator_added_tag, Boolean.valueOf(true));
                }
                apa a = this.i.a((akpb) this.a.get());
                a.a(aknh);
                a.a(new akod(this.j));
                if (akoq != null) {
                    a.a(akoq);
                }
                b.a(a);
            }
        }
    }

    public final void a(abxi abxi) {
        this.s = abxi;
        abwm abwm = this.n;
        if (abwm != null) {
            abwm.a = abxi;
        }
    }

    public final void h() {
        RecyclerView b = b();
        if (b != null) {
            aknh aknh = this.m;
            if (aknh != null && aknh.d() > 0) {
                b.removeCallbacks(this.u);
                if (((ans) b.n).p() > 10) {
                    b.c(10);
                }
                this.f = true;
                b.e(0);
            }
        }
    }

    public final boolean i() {
        return this.f || u();
    }

    public final boolean j() {
        return this.g == 1;
    }

    public final boolean u() {
        RecyclerView b = b();
        if (b == null || ((ans) b.n).p() != 0) {
            return false;
        }
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(boolean z) {
        if (z != this.p) {
            this.p = z;
            View c = c();
            if (c != null) {
                if (z) {
                    c.setImportantForAccessibility(1);
                    c.animate().translationY(0.0f).setDuration(200);
                    return;
                }
                c.animate().translationY((float) this.h.getResources().getDimensionPixelOffset(R.dimen.live_chat_more_comments_button_horizontal_offset)).setDuration(200);
                c.setImportantForAccessibility(2);
            }
        }
    }

    public final void ah_() {
        h();
        abwb.a(b(), 0);
    }

    public final void ai_() {
        h();
        abwb.a(b(), 1);
    }

    public final void aj_() {
        w();
        abwb.a(b(), 2);
    }

    public final void ak_() {
        w();
        abwb.a(b(), 3);
    }

    public final void v() {
        RecyclerView b = b();
        if (b != null) {
            b.postDelayed(this.u, 10000);
        }
    }

    public final void w() {
        RecyclerView b = b();
        if (b != null) {
            b.removeCallbacks(this.u);
        }
    }

    private static void a(RecyclerView recyclerView, int i) {
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != null) {
                    akot a = akoz.a(childAt);
                    if (a instanceof abxw) {
                        abxw abxw = (abxw) a;
                        if (i == 0) {
                            abxw.ah_();
                        } else if (i == 1) {
                            abxw.ai_();
                        } else if (i != 2) {
                            abxw.ak_();
                        } else {
                            abxw.aj_();
                        }
                    }
                }
            }
        }
    }

    public final void m() {
        ViewParent parent = a().getParent();
        if (parent instanceof LoadingFrameLayout) {
            b(false);
            ((LoadingFrameLayout) parent).a();
        }
        this.q = 1;
        o();
    }

    public final void n() {
        ViewParent parent = a().getParent();
        if (parent instanceof LoadingFrameLayout) {
            ((LoadingFrameLayout) parent).b();
        }
        this.q = 2;
    }

    public final void a(CharSequence charSequence, Runnable runnable) {
        ViewParent parent = a().getParent();
        this.q = 3;
        this.r = charSequence;
        this.t = runnable;
        if (parent instanceof LoadingFrameLayout) {
            LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) parent;
            boolean z = runnable != null;
            if (z) {
                loadingFrameLayout.a(new abwf(loadingFrameLayout, runnable));
            }
            loadingFrameLayout.a(charSequence, z);
        }
        o();
    }

    public final CharSequence p() {
        return this.r;
    }

    public final Runnable q() {
        return this.t;
    }

    public final void b(CharSequence charSequence, Runnable runnable) {
        this.r = charSequence;
        this.t = runnable;
    }

    public final int r() {
        return this.q;
    }

    public final void a(int i) {
        if (i == 0 || i == 1) {
            m();
        } else if (i == 2) {
            n();
        } else if (i != 3) {
            this.q = i;
        } else {
            a(this.r, this.t);
        }
    }

    public final void o() {
        abwm abwm = this.n;
        if (abwm != null) {
            abwm.c = -1;
            abwm.a();
        }
    }
}
