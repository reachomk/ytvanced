package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: kvo */
public final class kvo extends krl {
    public Handler k;
    public final xci l;
    public kvs m;
    private final kvt n;
    private final View o;
    private final OnClickListener p;
    private final kvq q;
    private final Map r;
    private final Map s;
    private final vqu t;
    private final vqx u;
    @Deprecated
    private ajzi v;
    private apfq w;

    public kvo(Context context, aaas aaas, vod vod, vmn vmn, tpu tpu, dwk dwk, xci xci, View view, View view2, View view3, View view4, View view5, OnClickListener onClickListener, kvq kvq, kvt kvt) {
        this(context, aaas, vod, vmn, tpu, dwk, xci, view, view2, view3, view, view4, view5, onClickListener, kvq, kvt);
    }

    public kvo(Context context, aaas aaas, vod vod, vmn vmn, tpu tpu, dwk dwk, xci xci, View view, View view2, View view3, View view4, View view5, View view6, OnClickListener onClickListener, kvq kvq, kvt kvt) {
        View view7 = view5;
        kvt kvt2 = kvt;
        super(context, aaas, vod, vmn, tpu, dwk, view, view2, view3, view4, view6);
        this.k = new Handler(context.getMainLooper());
        this.l = (xci) amqw.a((Object) xci);
        this.o = view7;
        this.p = onClickListener;
        this.q = kvq;
        this.n = kvt2;
        kvt2.a((krl) this);
        this.r = new HashMap();
        this.s = new HashMap();
        this.t = new vqu();
        this.u = new vqx(view);
        this.f.a(view7);
    }

    public final void a(View view, awqg awqg) {
        amqw.a((Object) view);
        this.r.put(view, awqg);
        this.f.a(view);
    }

    public final void a(acvx acvx, Object obj, String str, ajyq ajyq, Object[] objArr, aojc aojc, byte[] bArr) {
        ajyq ajyq2 = ajyq;
        a(acvx, obj, str, ajyq2.i, objArr, ajyq2, ajyq2.l, ajyq2.k, aojc, bArr);
    }

    public final void a(acvx acvx, Object obj, String str, ajyp ajyp, Object[] objArr, aojc aojc, byte[] bArr) {
        ajyp ajyp2 = ajyp;
        a(acvx, obj, str, ajyp2.l, objArr, ajyp2, ajyp2.o, ajyp2.n, aojc, bArr);
    }

    public final void a(acvx acvx, Object obj, String str, ajyx ajyx, Object[] objArr, aojc aojc, byte[] bArr) {
        ajyx ajyx2 = ajyx;
        a(acvx, obj, str, ajyx2.j, objArr, ajyx2, ajyx2.m, ajyx2.l, aojc, bArr);
    }

    public final void a(acvx acvx, Object obj, String str, ajym ajym, Object[] objArr, aojc aojc, byte[] bArr) {
        ajym ajym2 = ajym;
        a(acvx, obj, str, ajym2.i, objArr, ajym2, ajym2.m, ajym2.l, aojc, bArr);
    }

    public final void a(acvx acvx, Object obj, String str, apxu[] apxuArr, Object[] objArr, ajzi ajzi, apfq apfq, long j, aojc aojc, byte[] bArr) {
        this.m = null;
        this.t.b();
        this.u.b();
        this.v = (ajzi) amqw.a((Object) ajzi);
        this.w = apfq;
        this.s.clear();
        this.n.a(this.s, objArr);
        super.a(acvx, obj, str, apxuArr, ajzi, j, aojc, bArr);
    }

    public final boolean f() {
        if (this.a.a()) {
            return c().c;
        }
        ajzi ajzi = this.v;
        return ajzi != null && ajzi.e();
    }

    public final void a(boolean z) {
        if (this.a.a()) {
            c().c = z;
            return;
        }
        ajzi ajzi = this.v;
        if (ajzi != null) {
            ajzi.a(z);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(View view, MotionEvent motionEvent, List list) {
        if (!list.contains(this.o)) {
            return super.a(view, motionEvent, list);
        }
        this.p.onClick(this.o);
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(View view, MotionEvent motionEvent, List list) {
        View view2 = !list.isEmpty() ? (View) list.get(0) : null;
        a(view, motionEvent, false, view2);
        awqg a = a(view2);
        if (a != null) {
            a(c(a), true);
        } else {
            this.n.a();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(View view, MotionEvent motionEvent, List list) {
        a(view, motionEvent, true, !list.isEmpty() ? (View) list.get(0) : null);
        a(c(awqg.PROMOTED_SPARKLES_CLICK_LOCATION_BORDER), false);
    }

    private final void a(Object obj, boolean z) {
        if (!a(obj)) {
            if (z) {
                obj = this.n.d();
            } else {
                obj = this.n.c();
            }
            if (!a(obj)) {
                afpc.a(2, afpf.ad, "Sparkles ad attempted default click behavior, but failed.");
            }
        }
    }

    private final boolean a(Object obj) {
        kvr a = this.n.a(obj);
        kvq kvq = this.q;
        if (kvq != null) {
            kvq.a(a.b);
        }
        return a.a;
    }

    private final void a(View view, MotionEvent motionEvent, boolean z, View view2) {
        Integer a;
        if (z) {
            a = a(awqg.PROMOTED_SPARKLES_CLICK_LOCATION_BORDER);
        } else if (view2 == null || a(view2) == null) {
            afpc.a(2, afpf.ad, "Sparkles ad received click, but did not have a mappable 'lastTouchedView'.");
            a = null;
        } else {
            a = a(a(view2));
        }
        if (a != null) {
            this.t.a = a;
        } else {
            this.t.b();
        }
        if (view != null) {
            float f = view.getResources().getDisplayMetrics().density;
            this.u.a((int) (motionEvent.getX() / f), (int) (motionEvent.getY() / f));
            return;
        }
        this.u.b();
    }

    /* Access modifiers changed, original: protected|final */
    public final aftl[] b() {
        return (aftl[]) xsb.a(super.b(), this.t, this.u);
    }

    /* Access modifiers changed, original: protected|final */
    @Deprecated
    public final ajyn d() {
        return this.v;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean e() {
        apfq apfq = this.w;
        if (apfq == null) {
            return true;
        }
        apft apft = apfq.b;
        if (apft == null) {
            apft = apft.d;
        }
        if (kvo.a(apft)) {
            apft = this.w.c;
            if (apft == null) {
                apft = apft.d;
            }
            if (kvo.a(apft)) {
                apft = this.w.d;
                if (apft == null) {
                    apft = apft.d;
                }
                if (kvo.a(apft)) {
                    apft = this.w.e;
                    if (apft == null) {
                        apft = apft.d;
                    }
                    if (kvo.a(apft)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean a(apft apft) {
        boolean z = true;
        if (apft != null) {
            if (apft.b != 0) {
                z = false;
            } else if (apft.c == 0.0f) {
                return z;
            } else {
                return false;
            }
        }
        return z;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(View view, View view2) {
        int a;
        int a2;
        int a3;
        int i = 0;
        if (this.w != null) {
            float f = this.g.getResources().getDisplayMetrics().density;
            apft apft = this.w.b;
            if (apft == null) {
                apft = apft.d;
            }
            i = kvo.a(apft, view2.getMeasuredWidth(), f);
            apft apft2 = this.w.c;
            if (apft2 == null) {
                apft2 = apft.d;
            }
            a = kvo.a(apft2, view2.getMeasuredWidth(), f);
            apft apft3 = this.w.d;
            if (apft3 == null) {
                apft3 = apft.d;
            }
            a2 = kvo.a(apft3, view2.getMeasuredHeight(), f);
            apft apft4 = this.w.e;
            if (apft4 == null) {
                apft4 = apft.d;
            }
            a3 = kvo.a(apft4, view2.getMeasuredHeight(), f);
        } else {
            a3 = 0;
            a = 0;
            a2 = 0;
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.width = ((view2.getMeasuredWidth() - i) - a) - 1;
        marginLayoutParams.height = ((view2.getMeasuredHeight() - a2) - a3) - 1;
        marginLayoutParams.leftMargin = i;
        marginLayoutParams.rightMargin = a;
        marginLayoutParams.topMargin = a2;
        marginLayoutParams.bottomMargin = a3;
        view.requestLayout();
    }

    private final Integer a(awqg awqg) {
        if (awqg == null || awqg == awqg.PROMOTED_SPARKLES_CLICK_LOCATION_UNKNOWN) {
            return null;
        }
        return this.n.b(b(awqg));
    }

    private final awqg a(View view) {
        return (awqg) this.r.get(view);
    }

    private final Object b(awqg awqg) {
        return this.s.get(awqg);
    }

    private final Object c(awqg awqg) {
        if (awqg == awqg.PROMOTED_SPARKLES_CLICK_LOCATION_UNKNOWN) {
            return this.n.e();
        }
        return this.n.c(b(awqg));
    }

    private static int a(apft apft, int i, float f) {
        if (apft == null) {
            return 0;
        }
        if (i <= 0) {
            i = 1000;
        }
        return (int) ((apft.c * ((float) i)) + (((float) apft.b) * f));
    }
}
