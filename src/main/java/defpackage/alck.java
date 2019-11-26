package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* renamed from: alck */
public final class alck implements albv, xpy, xqb {
    private static final int e = ((int) TimeUnit.SECONDS.toMillis(12));
    private static final int f = ((int) TimeUnit.SECONDS.toMillis(6));
    public final alcr a;
    public final Set b;
    public xpw c;
    public albu d;
    private final albw g;
    private final xwc h;
    private final Rect i = new Rect();
    private final int[] j = new int[2];
    private View k;
    private boolean l;
    private alcg m;

    public alck(albw albw, aaas aaas) {
        this.g = albw;
        this.a = new alcr(this, aaas);
        this.b = new CopyOnWriteArraySet();
        this.h = new alcm(this);
    }

    public final void b(View view) {
        if (!this.l) {
            this.l = true;
            this.k = view;
            this.c = new xpw(view);
            xpw xpw = this.c;
            xpw.c = this;
            xpw.b = this;
        }
    }

    public final void a(albu albu) {
        View b = albu != null ? albu.b() : null;
        if (b != null && !xrn.c(b.getContext()) && albu != null && !c()) {
            this.d = albu;
            albw albw = this.g;
            alco u = alcp.u();
            if (u != null) {
                u.a(albu.b()).d(albu.e()).c(albu.f()).g(albu.m()).f(albu.o()).e(albu.p()).d(albu.q()).a(albu.r());
                if (albu.i() != null) {
                    u.c(albu.i());
                } else {
                    u.b(null).b(albu.g()).c(albu.h());
                }
                if (albu.l() != null) {
                    u.d(albu.l());
                } else {
                    u.a(null).a(albu.j()).b(albu.k());
                }
            }
            alcp a = u.a(new alcn(this, albu)).a();
            View b2 = a.b();
            View inflate = View.inflate(b2.getContext(), R.layout.tooltip_content_view, null);
            TextView textView = (TextView) inflate.findViewById(R.id.tooltip_title);
            TextView textView2 = (TextView) inflate.findViewById(R.id.tooltip_description);
            xpr.a(textView, a.e());
            xpr.a(textView2, a.f());
            if (textView.getVisibility() == 8) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) textView2.getLayoutParams();
                marginLayoutParams.topMargin = 0;
                textView2.setLayoutParams(marginLayoutParams);
            }
            alcg alcg = new alcg(inflate, b2, a.p(), a.q(), a.o());
            textView2 = (TextView) inflate.findViewById(R.id.action_button);
            TextView textView3 = (TextView) inflate.findViewById(R.id.dismiss_button);
            albw albw2 = albw;
            alcg alcg2 = alcg;
            albw2.a(textView2, alcg2, a.i(), a.g(), a.h(), 1);
            albw2.a(textView3, alcg2, a.l(), a.j(), a.k(), 2);
            float r = a.r();
            alci alci = alcg.a;
            alci.i = r;
            if (alci.isShown()) {
                alci.requestLayout();
            }
            boolean z = true;
            if (a.m() != 1) {
                z = false;
            }
            alcg.a.e = z;
            alcg.a.d = a.t();
            alcg.a(new alby(a, alcg));
            this.m = alcg;
            this.c.a(b);
        }
    }

    private final boolean c() {
        alcg alcg = this.m;
        return alcg != null && alcg.a();
    }

    public final void b(albu albu) {
        if (albu != null && albu == this.d) {
            b();
        }
    }

    public final void a(alcg alcg, int i) {
        if (c()) {
            alcg.a(i);
            if (alcg == this.m) {
                this.m = null;
                this.d = null;
            }
        }
    }

    public final void b() {
        a(this.m, 0);
    }

    public final void a(xpu xpu) {
        if (this.m != null) {
            if (xpu.b()) {
                albu albu = this.d;
                View b = albu != null ? albu.b() : null;
                if (b != null && b.isShown()) {
                    if (this.m.a()) {
                        alcg alcg = this.m;
                        alcg.a.a(a(xpu.a));
                        alcg.a.requestLayout();
                        return;
                    }
                    albu = this.d;
                    Rect a = a(xpu.a);
                    albc n = albu.n();
                    if (!albu.c()) {
                        this.m.a(a);
                        if (albu.d() != -2) {
                            int d = albu.d();
                            if (d == -1) {
                                d = f;
                            } else if (d != 0) {
                                d = albu.d();
                            } else {
                                d = e;
                            }
                            xwc xwc = this.h;
                            xwc.sendMessageDelayed(xwc.obtainMessage(1, this.m), (long) d);
                        }
                        if (n != null) {
                            n.a(albu);
                        }
                        for (albc n2 : this.b) {
                            n2.a(albu);
                        }
                    } else if (n2 != null) {
                        n2.a(albu);
                        n2.a(albu, 3);
                    }
                    return;
                }
            }
            b();
        }
    }

    public final void a(View view) {
        if (view == null) {
            b();
        }
    }

    private final Rect a(Rect rect) {
        this.i.set(rect);
        this.k.getLocationInWindow(this.j);
        rect = this.i;
        int[] iArr = this.j;
        rect.offset(iArr[0], iArr[1]);
        return this.i;
    }

    public final /* synthetic */ albx a() {
        return alcp.u();
    }
}
