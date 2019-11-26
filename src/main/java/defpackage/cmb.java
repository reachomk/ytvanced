package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.facebook.litho.ComponentHost;
import java.util.List;

/* renamed from: cmb */
public final class cmb extends ada {
    private static final Rect i = new Rect(0, 0, 1, 1);
    public cqi f;
    private final View g;
    private final aaj h;

    public cmb(View view, cqi cqi, boolean z, int i) {
        super(view);
        this.g = view;
        this.f = cqi;
        this.h = new cme(this);
        this.g.setFocusable(z);
        abe.b(this.g, i);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean c(int i, int i2) {
        return false;
    }

    public cmb(View view, boolean z, int i) {
        this(view, null, z, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A:{SYNTHETIC, RETURN} */
    public final void a(android.view.View r4, defpackage.aca r5) {
        /*
        r3 = this;
        r0 = r3.g;
        r0 = defpackage.cmb.c(r0);
        r1 = r3.f;
        if (r1 != 0) goto L_0x000b;
    L_0x000a:
        goto L_0x0041;
    L_0x000b:
        r1 = r1.u;
        if (r1 == 0) goto L_0x0041;
    L_0x000f:
        r0 = r3.h;
        r2 = defpackage.cok.l;
        if (r2 != 0) goto L_0x001c;
    L_0x0015:
        r2 = new cqk;
        r2.<init>();
        defpackage.cok.l = r2;
    L_0x001c:
        r2 = defpackage.cok.l;
        r2.a = r4;
        r4 = defpackage.cok.l;
        r4.b = r5;
        r4 = defpackage.cok.l;
        r4.c = r0;
        r4 = r1.a;
        r4 = r4.m();
        r0 = defpackage.cok.l;
        r4.a(r1, r0);
        r4 = defpackage.cok.l;
        r0 = 0;
        r4.a = r0;
        r4 = defpackage.cok.l;
        r4.b = r0;
        r4 = defpackage.cok.l;
        r4.c = r0;
        goto L_0x004f;
    L_0x0041:
        if (r0 != 0) goto L_0x0047;
    L_0x0043:
        super.a(r4, r5);
        goto L_0x004f;
    L_0x0047:
        super.a(r4, r5);
        r0 = r0.c;
        r0.a(r4, r5);
    L_0x004f:
        r4 = r3.f;
        if (r4 != 0) goto L_0x0054;
    L_0x0053:
        goto L_0x005b;
    L_0x0054:
        r4 = r4.p;
        if (r4 == 0) goto L_0x005b;
    L_0x0058:
        r5.a(r4);
    L_0x005b:
        r4 = r3.f;
        if (r4 != 0) goto L_0x0060;
    L_0x005f:
        goto L_0x0080;
    L_0x0060:
        r4 = r4.q;
        if (r4 == 0) goto L_0x0080;
    L_0x0064:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 19;
        if (r0 < r1) goto L_0x0075;
    L_0x006a:
        r0 = r5.a;
        r0 = r0.getExtras();
        r1 = "AccessibilityNodeInfo.roleDescription";
        r0.putCharSequence(r1, r4);
    L_0x0075:
        r4 = r3.f;
        r4 = r4.p;
        if (r4 != 0) goto L_0x0080;
    L_0x007b:
        r4 = "";
        r5.a(r4);
    L_0x0080:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmb.a(android.view.View, aca):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(List list) {
        cqb c = cmb.c(this.g);
        if (c != null) {
            int q = c.c.q();
            for (int i = 0; i < q; i++) {
                list.add(Integer.valueOf(i));
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, aca aca) {
        cqb c = cmb.c(this.g);
        CharSequence charSequence = "";
        String str = "ComponentAccessibility";
        if (c == null) {
            String valueOf = String.valueOf(this.g);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 41);
            stringBuilder.append("No accessible mount item found for view: ");
            stringBuilder.append(valueOf);
            Log.e(str, stringBuilder.toString());
            aca.d(charSequence);
            aca.b(i);
            return;
        }
        Rect bounds = ((Drawable) c.d).getBounds();
        cma cma = c.c;
        aca.a(cma.getClass().getName());
        if (i >= cma.q()) {
            StringBuilder stringBuilder2 = new StringBuilder(50);
            stringBuilder2.append("Received unrecognized virtual view id: ");
            stringBuilder2.append(i);
            Log.e(str, stringBuilder2.toString());
            aca.d(charSequence);
            aca.b(i);
            return;
        }
        cma.a(aca, i, bounds.left, bounds.top);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(float f, float f2) {
        cqb c = cmb.c(this.g);
        if (c != null) {
            cma cma = c.c;
            if (cma.q() != 0) {
                Rect bounds = ((Drawable) c.d).getBounds();
                int a = cma.a(((int) f) - bounds.left, ((int) f2) - bounds.top);
                if (a >= 0) {
                    return a;
                }
            }
        }
        return aocf.UNSET_ENUM_VALUE;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setContentDescription("");
    }

    public final ace a(View view) {
        cqb c = cmb.c(this.g);
        return (c != null && c.c.r()) ? super.a(view) : null;
    }

    private static cqb c(View view) {
        return view instanceof ComponentHost ? ((ComponentHost) view).g() : null;
    }

    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        cqi cqi = this.f;
        if (cqi != null) {
            coj coj = cqi.s;
            if (coj != null) {
                aaj aaj = this.h;
                if (cok.k == null) {
                    cok.k = new cql();
                }
                cok.k.a = view;
                cok.k.b = accessibilityEvent;
                cok.k.c = aaj;
                coj.a.m().a(coj, cok.k);
                cok.k.a = null;
                cok.k.b = null;
                cok.k.c = null;
                return;
            }
        }
        super.a(view, accessibilityEvent);
    }

    public final void a(View view, int i) {
        cqi cqi = this.f;
        if (cqi != null) {
            coj coj = cqi.x;
            if (coj != null) {
                aaj aaj = this.h;
                if (cok.p == null) {
                    cok.p = new crb();
                }
                cok.p.a = view;
                cok.p.b = i;
                cok.p.c = aaj;
                coj.a.m().a(coj, cok.p);
                cok.p.a = null;
                cok.p.b = 0;
                cok.p.c = null;
                return;
            }
        }
        super.a(view, i);
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        cqi cqi = this.f;
        if (cqi != null) {
            coj coj = cqi.y;
            if (coj != null) {
                aaj aaj = this.h;
                if (cok.q == null) {
                    cok.q = new cra();
                }
                cok.q.a = view;
                cok.q.b = accessibilityEvent;
                cok.q.c = aaj;
                coj.a.m().a(coj, cok.q);
                cok.q.a = null;
                cok.q.b = null;
                cok.q.c = null;
                return;
            }
        }
        super.c(view, accessibilityEvent);
    }

    public final boolean d(View view, AccessibilityEvent accessibilityEvent) {
        cqi cqi = this.f;
        if (cqi != null) {
            coj coj = cqi.r;
            if (coj != null) {
                aaj aaj = this.h;
                if (cok.j == null) {
                    cok.j = new cob();
                }
                cok.j.a = view;
                cok.j.b = accessibilityEvent;
                cok.j.c = aaj;
                boolean booleanValue = ((Boolean) coj.a.m().a(coj, cok.j)).booleanValue();
                cok.j.a = null;
                cok.j.b = null;
                cok.j.c = null;
                return booleanValue;
            }
        }
        return super.d(view, accessibilityEvent);
    }

    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        cqi cqi = this.f;
        if (cqi != null) {
            coj coj = cqi.t;
            if (coj != null) {
                aaj aaj = this.h;
                if (cok.m == null) {
                    cok.m = new cqn();
                }
                cok.m.a = view;
                cok.m.b = accessibilityEvent;
                cok.m.c = aaj;
                coj.a.m().a(coj, cok.m);
                cok.m.a = null;
                cok.m.b = null;
                cok.m.c = null;
                return;
            }
        }
        super.b(view, accessibilityEvent);
    }

    public final boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        cqi cqi = this.f;
        if (cqi != null) {
            coj coj = cqi.v;
            if (coj != null) {
                aaj aaj = this.h;
                if (cok.n == null) {
                    cok.n = new cqm();
                }
                cok.n.a = viewGroup;
                cok.n.b = view;
                cok.n.c = accessibilityEvent;
                cok.n.d = aaj;
                boolean booleanValue = ((Boolean) coj.a.m().a(coj, cok.n)).booleanValue();
                cok.n.a = null;
                cok.n.b = null;
                cok.n.c = null;
                cok.n.d = null;
                return booleanValue;
            }
        }
        return super.a(viewGroup, view, accessibilityEvent);
    }

    public final boolean a(View view, int i, Bundle bundle) {
        cqi cqi = this.f;
        if (cqi != null) {
            coj coj = cqi.w;
            if (coj != null) {
                aaj aaj = this.h;
                if (cok.o == null) {
                    cok.o = new cqt();
                }
                cok.o.a = view;
                cok.o.b = i;
                cok.o.c = bundle;
                cok.o.d = aaj;
                boolean booleanValue = ((Boolean) coj.a.m().a(coj, cok.o)).booleanValue();
                cok.o.a = null;
                cok.o.b = 0;
                cok.o.c = null;
                cok.o.d = null;
                return booleanValue;
            }
        }
        return super.a(view, i, bundle);
    }
}
