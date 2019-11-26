package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import java.util.ArrayList;

/* renamed from: akf */
public final class akf extends aij {
    public akj i;
    public Drawable j;
    public boolean k;
    public int l;
    public akl m;
    public ake n;
    public akg o;
    public final akk p = new akk(this);
    public int q;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private boolean v;
    private final SparseBooleanArray w = new SparseBooleanArray();
    private akh x;

    public akf(Context context) {
        super(context);
    }

    public final void a(Context context, aiw aiw) {
        this.b = context;
        LayoutInflater.from(this.b);
        this.c = aiw;
        Resources resources = context.getResources();
        ahs a = ahs.a(context);
        if (!this.s) {
            this.r = true;
        }
        this.t = a.a.getResources().getDisplayMetrics().widthPixels / 2;
        this.l = a.a();
        int i = this.t;
        if (this.r) {
            if (this.i == null) {
                this.i = new akj(this, this.a);
                if (this.k) {
                    this.i.setImageDrawable(this.j);
                    this.j = null;
                    this.k = false;
                }
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.u = i;
        float f = resources.getDisplayMetrics().density;
    }

    public final void c() {
        this.r = true;
        this.s = true;
    }

    public final void d() {
        this.v = true;
    }

    public final View a(aja aja, View view, ViewGroup viewGroup) {
        View actionView = aja.getActionView();
        int i = 0;
        if (actionView == null || aja.i()) {
            ajo ajo;
            if (view instanceof ajo) {
                ajo = (ajo) view;
            } else {
                ajo = (ajo) this.d.inflate(this.g, viewGroup, false);
            }
            ajo.a(aja);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) ajo;
            actionMenuItemView.b = (ActionMenuView) this.h;
            if (this.x == null) {
                this.x = new akh(this);
            }
            actionMenuItemView.c = this.x;
            actionView = (View) ajo;
        }
        if (aja.o) {
            i = 8;
        }
        actionView.setVisibility(i);
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof akn)) {
            actionView.setLayoutParams(ActionMenuView.a(layoutParams));
        }
        return actionView;
    }

    public final void a() {
        int size;
        ViewGroup viewGroup = (ViewGroup) this.h;
        ArrayList arrayList = null;
        if (viewGroup != null) {
            int i;
            aiw aiw = this.c;
            if (aiw != null) {
                aiw.k();
                ArrayList j = this.c.j();
                size = j.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    aja aja = (aja) j.get(i2);
                    if (aja.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        aja a = childAt instanceof ajo ? ((ajo) childAt).a() : null;
                        View a2 = a(aja, childAt, viewGroup);
                        if (aja != a) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.h).addView(a2, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) != this.i) {
                    viewGroup.removeViewAt(i);
                } else {
                    i++;
                }
            }
        }
        ((View) this.h).requestLayout();
        aiw aiw2 = this.c;
        if (aiw2 != null) {
            aiw2.k();
            ArrayList arrayList2 = aiw2.d;
            int size2 = arrayList2.size();
            for (size = 0; size < size2; size++) {
                arrayList2.get(size);
            }
        }
        aiw2 = this.c;
        if (aiw2 != null) {
            arrayList = aiw2.l();
        }
        if (this.r && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 != 1 ? size3 <= 0 : (((aja) arrayList.get(0)).o ^ 1) == 0) {
                if (this.i == null) {
                    this.i = new akj(this, this.a);
                }
                viewGroup = (ViewGroup) this.i.getParent();
                if (viewGroup != this.h) {
                    if (viewGroup != null) {
                        viewGroup.removeView(this.i);
                    }
                    ActionMenuView actionMenuView = (ActionMenuView) this.h;
                    akj akj = this.i;
                    akn a3 = ActionMenuView.a();
                    a3.a = true;
                    actionMenuView.addView(akj, a3);
                }
                ((ActionMenuView) this.h).b = this.r;
            }
        }
        akj akj2 = this.i;
        if (akj2 != null) {
            ViewParent parent = akj2.getParent();
            ViewParent viewParent = this.h;
            if (parent == viewParent) {
                ((ViewGroup) viewParent).removeView(this.i);
            }
        }
        ((ActionMenuView) this.h).b = this.r;
    }

    public final boolean a(aju aju) {
        boolean z = false;
        if (aju.hasVisibleItems()) {
            aju aju2 = aju;
            while (true) {
                aiw aiw = aju2.k;
                if (aiw == this.c) {
                    break;
                }
                aju2 = (aju) aiw;
            }
            aja aja = aju2.l;
            ViewGroup viewGroup = (ViewGroup) this.h;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof ajo) && ((ajo) childAt).a() == aja) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                this.q = aju.l.a;
                int size = aju.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MenuItem item = aju.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                }
                this.n = new ake(this, this.b, aju, view);
                this.n.a(z);
                this.n.a();
                super.a(aju);
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        if (this.r && !i()) {
            aiw aiw = this.c;
            if (!(aiw == null || this.h == null || this.o != null || aiw.l().isEmpty())) {
                this.o = new akg(this, new akl(this, this.b, this.c, this.i));
                ((View) this.h).post(this.o);
                super.a(null);
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        akg akg = this.o;
        if (akg != null) {
            ajl ajl = this.h;
            if (ajl != null) {
                ((View) ajl).removeCallbacks(akg);
                this.o = null;
                return true;
            }
        }
        akl akl = this.m;
        if (akl == null) {
            return false;
        }
        akl.d();
        return true;
    }

    public final boolean g() {
        return f() | h();
    }

    public final boolean h() {
        ake ake = this.n;
        if (ake == null) {
            return false;
        }
        ake.d();
        return true;
    }

    public final boolean i() {
        akl akl = this.m;
        return akl != null && akl.f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ff  */
    public final boolean b() {
        /*
        r17 = this;
        r0 = r17;
        r1 = r0.c;
        r2 = 0;
        r3 = 0;
        if (r1 == 0) goto L_0x0011;
    L_0x0008:
        r1 = r1.j();
        r4 = r1.size();
        goto L_0x0013;
    L_0x0011:
        r1 = r2;
        r4 = 0;
    L_0x0013:
        r5 = r0.l;
        r6 = r0.u;
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3);
        r8 = r0.h;
        r8 = (android.view.ViewGroup) r8;
        r12 = r5;
        r5 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
    L_0x0024:
        r13 = 1;
        if (r5 >= r4) goto L_0x004d;
    L_0x0027:
        r14 = r1.get(r5);
        r14 = (defpackage.aja) r14;
        r15 = r14.h();
        if (r15 == 0) goto L_0x0036;
    L_0x0033:
        r10 = r10 + 1;
        goto L_0x0040;
    L_0x0036:
        r15 = r14.g();
        if (r15 == 0) goto L_0x003f;
    L_0x003c:
        r11 = r11 + 1;
        goto L_0x0040;
    L_0x003f:
        r9 = 1;
    L_0x0040:
        r13 = r0.v;
        if (r13 == 0) goto L_0x004a;
    L_0x0044:
        r13 = r14.o;
        if (r13 != 0) goto L_0x0049;
    L_0x0048:
        goto L_0x004a;
    L_0x0049:
        r12 = 0;
    L_0x004a:
        r5 = r5 + 1;
        goto L_0x0024;
    L_0x004d:
        r5 = r0.r;
        if (r5 != 0) goto L_0x0052;
    L_0x0051:
        goto L_0x005b;
    L_0x0052:
        if (r9 == 0) goto L_0x0055;
    L_0x0054:
        goto L_0x0059;
    L_0x0055:
        r11 = r11 + r10;
        if (r11 > r12) goto L_0x0059;
    L_0x0058:
        goto L_0x005b;
    L_0x0059:
        r12 = r12 + -1;
    L_0x005b:
        r12 = r12 - r10;
        r5 = r0.w;
        r5.clear();
        r9 = r6;
        r6 = 0;
        r10 = 0;
    L_0x0064:
        if (r6 >= r4) goto L_0x010c;
    L_0x0066:
        r11 = r1.get(r6);
        r11 = (defpackage.aja) r11;
        r14 = r11.h();
        if (r14 == 0) goto L_0x008d;
    L_0x0072:
        r14 = r0.a(r11, r2, r8);
        r14.measure(r7, r7);
        r14 = r14.getMeasuredWidth();
        r9 = r9 - r14;
        if (r10 == 0) goto L_0x0081;
    L_0x0080:
        goto L_0x0082;
    L_0x0081:
        r10 = r14;
    L_0x0082:
        r14 = r11.b;
        if (r14 == 0) goto L_0x0089;
    L_0x0086:
        r5.put(r14, r13);
    L_0x0089:
        r11.c(r13);
        goto L_0x0096;
    L_0x008d:
        r14 = r11.g();
        if (r14 != 0) goto L_0x0099;
    L_0x0093:
        r11.c(r3);
    L_0x0096:
        r13 = 0;
        goto L_0x0105;
    L_0x0099:
        r14 = r11.b;
        r15 = r5.get(r14);
        if (r12 > 0) goto L_0x00a4;
    L_0x00a1:
        if (r15 != 0) goto L_0x00a4;
    L_0x00a3:
        goto L_0x00a9;
    L_0x00a4:
        if (r9 <= 0) goto L_0x00a9;
    L_0x00a6:
        r16 = 1;
        goto L_0x00ab;
    L_0x00a9:
        r16 = 0;
    L_0x00ab:
        if (r16 == 0) goto L_0x00c6;
    L_0x00ad:
        r3 = r0.a(r11, r2, r8);
        r3.measure(r7, r7);
        r3 = r3.getMeasuredWidth();
        r9 = r9 - r3;
        if (r10 == 0) goto L_0x00bc;
    L_0x00bb:
        goto L_0x00bd;
    L_0x00bc:
        r10 = r3;
    L_0x00bd:
        r3 = r9 + r10;
        if (r3 <= 0) goto L_0x00c4;
    L_0x00c1:
        r16 = 1;
        goto L_0x00c6;
    L_0x00c4:
        r16 = 0;
    L_0x00c6:
        r3 = r16;
        if (r3 == 0) goto L_0x00d0;
    L_0x00ca:
        if (r14 == 0) goto L_0x00d0;
    L_0x00cc:
        r5.put(r14, r13);
        goto L_0x00fb;
    L_0x00d0:
        if (r15 == 0) goto L_0x00fb;
    L_0x00d2:
        r15 = 0;
        r5.put(r14, r15);
        r15 = r12;
        r12 = 0;
    L_0x00d8:
        if (r12 >= r6) goto L_0x00f9;
    L_0x00da:
        r16 = r1.get(r12);
        r2 = r16;
        r2 = (defpackage.aja) r2;
        r13 = r2.b;
        if (r13 != r14) goto L_0x00f3;
    L_0x00e6:
        r13 = r2.f();
        if (r13 == 0) goto L_0x00ee;
    L_0x00ec:
        r15 = r15 + 1;
    L_0x00ee:
        r13 = 0;
        r2.c(r13);
        goto L_0x00f4;
    L_0x00f3:
        r13 = 0;
    L_0x00f4:
        r12 = r12 + 1;
        r2 = 0;
        r13 = 1;
        goto L_0x00d8;
    L_0x00f9:
        r13 = 0;
        goto L_0x00fd;
    L_0x00fb:
        r13 = 0;
        r15 = r12;
    L_0x00fd:
        if (r3 == 0) goto L_0x0101;
    L_0x00ff:
        r15 = r15 + -1;
    L_0x0101:
        r11.c(r3);
        r12 = r15;
    L_0x0105:
        r6 = r6 + 1;
        r2 = 0;
        r3 = 0;
        r13 = 1;
        goto L_0x0064;
    L_0x010c:
        r2 = 1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akf.b():boolean");
    }

    public final void a(aiw aiw, boolean z) {
        g();
        ajm ajm = this.e;
        if (ajm != null) {
            ajm.a(aiw, z);
        }
    }

    public final void a(ActionMenuView actionMenuView) {
        this.h = actionMenuView;
        actionMenuView.a = this.c;
    }
}
