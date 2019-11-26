package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.accessibility.AccessibilityManager;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoViewTestHelper;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: cpq */
public final class cpq extends ComponentHost {
    private static final int[] J = new int[2];
    public cpr A;
    public ComponentTree B;
    public int C;
    public String D;
    private boolean E;
    private boolean F;
    private boolean G;
    private final AccessibilityManager H;
    private final cpp I;
    private boolean K;
    private Map L;
    private String M;
    public ComponentTree t;
    public final cqa u;
    public final cmg v;
    public final Rect w;
    public boolean x;
    public int y;
    public int z;

    public cpq(Context context) {
        this(new cmg(context));
    }

    public cpq(cmg cmg) {
        super(cmg);
        this.w = new Rect();
        this.F = false;
        this.G = false;
        this.y = -1;
        this.z = -1;
        this.A = null;
        this.I = new cpp(this);
        this.v = cmg;
        this.u = new cqa(this);
        this.H = (AccessibilityManager) cmg.b.getSystemService("accessibility");
    }

    private static void a(ComponentHost componentHost) {
        int childCount = componentHost.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = componentHost.getChildAt(i);
            if (childAt.isLayoutRequested()) {
                childAt.measure(MeasureSpec.makeMeasureSpec(childAt.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(childAt.getHeight(), 1073741824));
                childAt.layout(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            }
            if (childAt instanceof ComponentHost) {
                cpq.a((ComponentHost) childAt);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t();
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        t();
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        s();
    }

    private final void s() {
        if (!this.E) {
            this.E = true;
            ComponentTree componentTree = this.t;
            if (componentTree != null) {
                componentTree.c();
            }
            b(clj.a(getContext()));
            AccessibilityManager accessibilityManager = this.H;
            cpp cpp = this.I;
            if (cpp != null) {
                accessibilityManager.addAccessibilityStateChangeListener(new acb(cpp));
            }
            if (!n() && !q() && !r()) {
                v();
            }
        }
    }

    private final void t() {
        if (this.E) {
            ComponentTree componentTree;
            this.E = false;
            if (!n()) {
                componentTree = this.t;
                if (!(componentTree == null || componentTree.k)) {
                    cpg cpg = componentTree.w;
                    if (cpg != null) {
                        a(cpg, new Rect());
                    }
                }
            }
            this.u.b();
            componentTree = this.t;
            if (componentTree != null) {
                componentTree.f();
            }
            AccessibilityManager accessibilityManager = this.H;
            cpp cpp = this.I;
            if (cpp != null) {
                accessibilityManager.removeAccessibilityStateChangeListener(new acb(cpp));
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047 A:{Catch:{ all -> 0x019d }} */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f A:{Catch:{ all -> 0x019d }} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006c A:{Catch:{ all -> 0x019d }} */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0098 A:{Catch:{ all -> 0x019d }} */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0097 A:{Catch:{ all -> 0x019d }} */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b3 A:{Catch:{ all -> 0x019d }} */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c8 A:{Catch:{ all -> 0x019d }} */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0151 A:{Catch:{ all -> 0x019d }} */
    /* JADX WARNING: Removed duplicated region for block: B:114:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0199  */
    public final void onMeasure(int r12, int r13) {
        /*
        r11 = this;
        r0 = defpackage.cno.d();
        if (r0 == 0) goto L_0x0009;
    L_0x0006:
        defpackage.cno.a();	 Catch:{ all -> 0x019d }
    L_0x0009:
        r1 = r11.getResources();	 Catch:{ all -> 0x019d }
        r2 = android.view.View.MeasureSpec.getMode(r12);	 Catch:{ all -> 0x019d }
        if (r2 != 0) goto L_0x0014;
    L_0x0013:
        goto L_0x0036;
    L_0x0014:
        r3 = r1.getConfiguration();	 Catch:{ all -> 0x019d }
        r1 = r1.getDisplayMetrics();	 Catch:{ all -> 0x019d }
        r4 = r1.widthPixels;	 Catch:{ all -> 0x019d }
        r1 = r1.density;	 Catch:{ all -> 0x019d }
        r3 = r3.screenWidthDp;	 Catch:{ all -> 0x019d }
        r3 = (float) r3;	 Catch:{ all -> 0x019d }
        r1 = r1 * r3;
        r3 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r1 = r1 + r3;
        r1 = (int) r1;	 Catch:{ all -> 0x019d }
        if (r4 != r1) goto L_0x002c;
    L_0x002b:
        goto L_0x0036;
    L_0x002c:
        r3 = android.view.View.MeasureSpec.getSize(r12);	 Catch:{ all -> 0x019d }
        if (r1 != r3) goto L_0x0036;
    L_0x0032:
        r12 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2);	 Catch:{ all -> 0x019d }
    L_0x0036:
        r1 = r11.y;	 Catch:{ all -> 0x019d }
        r2 = 1;
        r3 = 0;
        r4 = -1;
        if (r1 != r4) goto L_0x0044;
    L_0x003d:
        r5 = r11.z;	 Catch:{ all -> 0x019d }
        if (r5 == r4) goto L_0x0042;
    L_0x0041:
        goto L_0x0044;
    L_0x0042:
        r5 = 0;
        goto L_0x0045;
    L_0x0044:
        r5 = 1;
    L_0x0045:
        if (r1 != r4) goto L_0x004b;
    L_0x0047:
        r1 = r11.getWidth();	 Catch:{ all -> 0x019d }
    L_0x004b:
        r6 = r11.z;	 Catch:{ all -> 0x019d }
        if (r6 != r4) goto L_0x0053;
    L_0x004f:
        r6 = r11.getHeight();	 Catch:{ all -> 0x019d }
    L_0x0053:
        r11.y = r4;	 Catch:{ all -> 0x019d }
        r11.z = r4;	 Catch:{ all -> 0x019d }
        if (r5 == 0) goto L_0x0064;
    L_0x0059:
        r5 = r11.q();	 Catch:{ all -> 0x019d }
        if (r5 != 0) goto L_0x0064;
    L_0x005f:
        r11.setMeasuredDimension(r1, r6);	 Catch:{ all -> 0x019d }
        goto L_0x0197;
    L_0x0064:
        r5 = r11.getLayoutParams();	 Catch:{ all -> 0x019d }
        r7 = r5 instanceof defpackage.cps;	 Catch:{ all -> 0x019d }
        if (r7 == 0) goto L_0x007d;
    L_0x006c:
        r5 = (defpackage.cps) r5;	 Catch:{ all -> 0x019d }
        r7 = r5.a();	 Catch:{ all -> 0x019d }
        if (r7 == r4) goto L_0x0075;
    L_0x0074:
        r12 = r7;
    L_0x0075:
        r5 = r5.b();	 Catch:{ all -> 0x019d }
        if (r5 != r4) goto L_0x007c;
    L_0x007b:
        goto L_0x007d;
    L_0x007c:
        r13 = r5;
    L_0x007d:
        r5 = android.view.View.MeasureSpec.getSize(r12);	 Catch:{ all -> 0x019d }
        r7 = android.view.View.MeasureSpec.getSize(r13);	 Catch:{ all -> 0x019d }
        r8 = r11.B;	 Catch:{ all -> 0x019d }
        r9 = 0;
        if (r8 == 0) goto L_0x0093;
    L_0x008a:
        r10 = r11.t;	 Catch:{ all -> 0x019d }
        if (r10 != 0) goto L_0x0093;
    L_0x008e:
        r11.a(r8);	 Catch:{ all -> 0x019d }
        r11.B = r9;	 Catch:{ all -> 0x019d }
    L_0x0093:
        r8 = r11.x;	 Catch:{ all -> 0x019d }
        if (r8 == 0) goto L_0x0098;
    L_0x0097:
        goto L_0x00ad;
    L_0x0098:
        r8 = android.view.View.MeasureSpec.getMode(r12);	 Catch:{ all -> 0x019d }
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r8 != r10) goto L_0x00ad;
    L_0x00a0:
        r8 = android.view.View.MeasureSpec.getMode(r13);	 Catch:{ all -> 0x019d }
        if (r8 != r10) goto L_0x00ad;
    L_0x00a6:
        r11.K = r2;	 Catch:{ all -> 0x019d }
        r11.setMeasuredDimension(r5, r7);	 Catch:{ all -> 0x019d }
        goto L_0x0197;
    L_0x00ad:
        r11.F = r2;	 Catch:{ all -> 0x019d }
        r8 = r11.t;	 Catch:{ all -> 0x019d }
        if (r8 == 0) goto L_0x00c6;
    L_0x00b3:
        r5 = r11.x;	 Catch:{ all -> 0x019d }
        r11.x = r3;	 Catch:{ all -> 0x019d }
        r7 = J;	 Catch:{ all -> 0x019d }
        r8.a(r12, r13, r7, r5);	 Catch:{ all -> 0x019d }
        r12 = J;	 Catch:{ all -> 0x019d }
        r5 = r12[r3];	 Catch:{ all -> 0x019d }
        r12 = J;	 Catch:{ all -> 0x019d }
        r7 = r12[r2];	 Catch:{ all -> 0x019d }
        r11.K = r3;	 Catch:{ all -> 0x019d }
    L_0x00c6:
        if (r7 != 0) goto L_0x014d;
    L_0x00c8:
        r12 = "-LithoView:0-height, current=";
        r13 = r11.v;	 Catch:{ all -> 0x019d }
        r13 = r13.d;	 Catch:{ all -> 0x019d }
        if (r13 != 0) goto L_0x00d2;
    L_0x00d0:
        goto L_0x014d;
    L_0x00d2:
        r2 = r11.t;	 Catch:{ all -> 0x019d }
        if (r2 != 0) goto L_0x00d7;
    L_0x00d6:
        goto L_0x00e0;
    L_0x00d7:
        r2 = r2.w;	 Catch:{ all -> 0x019d }
        if (r2 == 0) goto L_0x00e0;
    L_0x00db:
        r2 = r2.g;	 Catch:{ all -> 0x019d }
        if (r2 != 0) goto L_0x00e0;
    L_0x00df:
        goto L_0x014d;
    L_0x00e0:
        r2 = r11.L;	 Catch:{ all -> 0x019d }
        if (r2 == 0) goto L_0x00ed;
    L_0x00e4:
        r8 = "LithoView:0-height";
        r2 = r2.get(r8);	 Catch:{ all -> 0x019d }
        r9 = r2;
        r9 = (defpackage.cms) r9;	 Catch:{ all -> 0x019d }
    L_0x00ed:
        if (r9 == 0) goto L_0x014d;
    L_0x00ef:
        r2 = r11.getLayoutParams();	 Catch:{ all -> 0x019d }
        r8 = r2 instanceof defpackage.cps;	 Catch:{ all -> 0x019d }
        if (r8 == 0) goto L_0x00ff;
    L_0x00f7:
        r2 = (defpackage.cps) r2;	 Catch:{ all -> 0x019d }
        r2 = r2.k_();	 Catch:{ all -> 0x019d }
        if (r2 != 0) goto L_0x014d;
    L_0x00ff:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x019d }
        r2.<init>();	 Catch:{ all -> 0x019d }
        r8 = r9.a;	 Catch:{ all -> 0x019d }
        r2.append(r8);	 Catch:{ all -> 0x019d }
        r2.append(r12);	 Catch:{ all -> 0x019d }
        r12 = r11.t;	 Catch:{ all -> 0x019d }
        if (r12 != 0) goto L_0x0129;
    L_0x0110:
        r12 = "null_";
        r8 = r11.D;	 Catch:{ all -> 0x019d }
        r8 = java.lang.String.valueOf(r8);	 Catch:{ all -> 0x019d }
        r9 = r8.length();	 Catch:{ all -> 0x019d }
        if (r9 != 0) goto L_0x0124;
    L_0x011e:
        r8 = new java.lang.String;	 Catch:{ all -> 0x019d }
        r8.<init>(r12);	 Catch:{ all -> 0x019d }
        goto L_0x012d;
    L_0x0124:
        r8 = r12.concat(r8);	 Catch:{ all -> 0x019d }
        goto L_0x012d;
    L_0x0129:
        r8 = r12.j();	 Catch:{ all -> 0x019d }
    L_0x012d:
        r2.append(r8);	 Catch:{ all -> 0x019d }
        r12 = ", previous=";
        r2.append(r12);	 Catch:{ all -> 0x019d }
        r12 = r11.M;	 Catch:{ all -> 0x019d }
        r2.append(r12);	 Catch:{ all -> 0x019d }
        r12 = ", view=";
        r2.append(r12);	 Catch:{ all -> 0x019d }
        r12 = com.facebook.litho.LithoViewTestHelper.a(r11);	 Catch:{ all -> 0x019d }
        r2.append(r12);	 Catch:{ all -> 0x019d }
        r12 = r2.toString();	 Catch:{ all -> 0x019d }
        defpackage.cpq.a(r13, r12);	 Catch:{ all -> 0x019d }
    L_0x014d:
        r12 = r11.t;	 Catch:{ all -> 0x019d }
        if (r12 == 0) goto L_0x0190;
    L_0x0151:
        r13 = r11.G;	 Catch:{ all -> 0x019d }
        if (r13 != 0) goto L_0x0156;
    L_0x0155:
        goto L_0x015b;
    L_0x0156:
        r12 = r12.s;	 Catch:{ all -> 0x019d }
        if (r12 == 0) goto L_0x015b;
    L_0x015a:
        goto L_0x0190;
    L_0x015b:
        r12 = r11.t;	 Catch:{ all -> 0x019d }
        r13 = r12.w;	 Catch:{ all -> 0x019d }
        if (r13 != 0) goto L_0x0162;
    L_0x0161:
        goto L_0x0171;
    L_0x0162:
        r2 = r13.h;	 Catch:{ all -> 0x019d }
        if (r2 == 0) goto L_0x0171;
    L_0x0166:
        r2 = r12.n;	 Catch:{ all -> 0x019d }
        r2 = r2.u;	 Catch:{ all -> 0x019d }
        r8 = r2.g;	 Catch:{ all -> 0x019d }
        if (r8 == 0) goto L_0x0171;
    L_0x016e:
        r2.a(r13, r12);	 Catch:{ all -> 0x019d }
    L_0x0171:
        r12 = r11.t;	 Catch:{ all -> 0x019d }
        r13 = r11.G;	 Catch:{ all -> 0x019d }
        r2 = r12.t;	 Catch:{ all -> 0x019d }
        r8 = defpackage.cte.c;	 Catch:{ all -> 0x019d }
        r12 = r12.a(r1, r13, r2, r8);	 Catch:{ all -> 0x019d }
        if (r12 == r4) goto L_0x0180;
    L_0x017f:
        r5 = r12;
    L_0x0180:
        r12 = r11.t;	 Catch:{ all -> 0x019d }
        r13 = r11.G;	 Catch:{ all -> 0x019d }
        r1 = r12.u;	 Catch:{ all -> 0x019d }
        r2 = defpackage.cte.d;	 Catch:{ all -> 0x019d }
        r12 = r12.a(r6, r13, r1, r2);	 Catch:{ all -> 0x019d }
        if (r12 != r4) goto L_0x018f;
    L_0x018e:
        goto L_0x0190;
    L_0x018f:
        r7 = r12;
    L_0x0190:
        r11.setMeasuredDimension(r5, r7);	 Catch:{ all -> 0x019d }
        r11.G = r3;	 Catch:{ all -> 0x019d }
        r11.F = r3;	 Catch:{ all -> 0x019d }
    L_0x0197:
        if (r0 == 0) goto L_0x019c;
    L_0x0199:
        defpackage.cno.c();
    L_0x019c:
        return;
    L_0x019d:
        r12 = move-exception;
        if (r0 != 0) goto L_0x01a1;
    L_0x01a0:
        goto L_0x01a4;
    L_0x01a1:
        defpackage.cno.c();
    L_0x01a4:
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpq.onMeasure(int, int):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, int i2, int i3, int i4) {
        boolean d = cno.d();
        if (d) {
            try {
                cno.a();
            } catch (Throwable th) {
                if (d) {
                    cno.c();
                }
            }
        }
        ComponentTree componentTree = this.t;
        if (componentTree != null) {
            if (componentTree.k()) {
                throw new IllegalStateException("Trying to layout a LithoView holding onto a released ComponentTree");
            }
            if (this.K || this.t.w == null) {
                this.t.a(MeasureSpec.makeMeasureSpec(i3 - i, 1073741824), MeasureSpec.makeMeasureSpec(i4 - i2, 1073741824), J, false);
                this.G = false;
                this.K = false;
            }
            boolean d2 = this.t.d();
            if (d2) {
                if (!n()) {
                    v();
                }
            }
            if (!d2 && n()) {
                m();
            }
            if (!d2) {
                cpq.a((ComponentHost) this);
            }
        }
        if (d) {
            cno.c();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean i() {
        ComponentTree componentTree = this.t;
        if (componentTree != null && componentTree.j) {
            return false;
        }
        return super.i();
    }

    public final void a(ComponentTree componentTree) {
        if (this.F) {
            throw new RuntimeException("Cannot update ComponentTree while in the middle of measure");
        }
        String str = null;
        this.B = null;
        ComponentTree componentTree2 = this.t;
        if (componentTree2 == componentTree) {
            if (this.E) {
                l();
            }
            return;
        }
        StringBuilder stringBuilder;
        boolean z = true;
        if (!(componentTree2 == null || componentTree == null || componentTree2.A != componentTree.A)) {
            z = false;
        }
        this.G = z;
        p();
        componentTree2 = this.t;
        if (componentTree2 != null) {
            if (this.L != null) {
                this.M = componentTree2.j();
            }
            if (!(componentTree == null || componentTree.getLithoView() == null)) {
                Map map = this.L;
                if (map != null) {
                    String str2 = "LithoView:SetAlreadyAttachedComponentTree";
                    if (map.containsKey(str2)) {
                        componentTree2 = this.t;
                        cms cms = (cms) this.L.get(str2);
                        cnh cnh = this.v.d;
                        if (cnh != null) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(cms.a);
                            stringBuilder.append("-LithoView:SetAlreadyAttachedComponentTree, currentView=");
                            stringBuilder.append(LithoViewTestHelper.a(componentTree2.getLithoView()));
                            stringBuilder.append(", newComponent.LV=");
                            stringBuilder.append(LithoViewTestHelper.a(componentTree.getLithoView()));
                            stringBuilder.append(", currentComponent=");
                            stringBuilder.append(componentTree2.j());
                            stringBuilder.append(", newComponent=");
                            stringBuilder.append(componentTree.j());
                            cpq.a(cnh, stringBuilder.toString());
                        }
                    }
                }
            }
            if (this.E) {
                this.t.f();
            }
            componentTree2 = this.t;
            if (componentTree2.l) {
                throw new IllegalStateException("Clearing the LithoView while the ComponentTree is attached");
            }
            componentTree2.n = null;
        }
        this.t = componentTree;
        componentTree = this.t;
        if (componentTree != null) {
            String str3;
            if (componentTree.k()) {
                str = String.valueOf(this.t.l());
                str3 = "Setting a released ComponentTree to a LithoView, released component was: ";
                throw new IllegalStateException(str.length() == 0 ? new String(str3) : str3.concat(str));
            }
            componentTree = this.t;
            cpq cpq;
            if (componentTree.l) {
                cpq = componentTree.n;
                if (cpq != null) {
                    cpq.a(null);
                } else {
                    componentTree.f();
                }
            } else {
                cpq = componentTree.n;
                if (cpq != null) {
                    if (cpq.E) {
                        throw new IllegalStateException("Trying to clear the ComponentTree while attached.");
                    }
                    cpq.t = null;
                    cpq.D = "clear_CT";
                }
            }
            if (cns.a(getContext()) == cns.a(componentTree.h.b)) {
                componentTree.n = this;
                if (this.E) {
                    this.t.c();
                } else {
                    requestLayout();
                }
            } else {
                str3 = String.valueOf(getContext());
                String valueOf = String.valueOf(componentTree.h);
                stringBuilder = new StringBuilder((str3.length() + 72) + valueOf.length());
                stringBuilder.append("Base view context differs, view context is: ");
                stringBuilder.append(str3);
                stringBuilder.append(", ComponentTree context is: ");
                stringBuilder.append(valueOf);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        if (this.t == null) {
            str = "set_CT";
        }
        this.D = str;
    }

    public final void a(cma cma) {
        ComponentTree componentTree = this.t;
        if (componentTree == null) {
            a(ComponentTree.a(this.v, cma).a());
        } else if (cma != null) {
            componentTree.a(cma, -1, -1, false, null, null);
        } else {
            throw new IllegalArgumentException("Root component can't be null");
        }
    }

    public final void l() {
        cqa cqa = this.u;
        long[] jArr = cqa.e;
        if (jArr != null) {
            int length = jArr.length;
            for (int i = 0; i < length; i++) {
                cqb a = cqa.a(i);
                if (!(a == null || a.f)) {
                    cma cma = a.c;
                    Object obj = a.d;
                    cma.b(cqa.a(cma), obj);
                    a.f = true;
                    if ((obj instanceof View) && !(obj instanceof ComponentHost)) {
                        View view = (View) obj;
                        if (view.isLayoutRequested()) {
                            cqa.a(view, view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), true);
                        }
                    }
                }
            }
        }
    }

    public final void setHasTransientState(boolean z) {
        ComponentTree componentTree;
        if (z) {
            if (this.C == 0) {
                componentTree = this.t;
                if (componentTree != null && componentTree.k) {
                    a(new Rect(0, 0, getWidth(), getHeight()), false);
                }
            }
            this.C++;
        } else {
            int i = this.C - 1;
            this.C = i;
            if (i == 0) {
                componentTree = this.t;
                if (componentTree != null && componentTree.k) {
                    m();
                }
            }
            if (this.C < 0) {
                this.C = 0;
            }
        }
        super.setHasTransientState(z);
    }

    public final void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        u();
    }

    public final void offsetLeftAndRight(int i) {
        super.offsetLeftAndRight(i);
        u();
    }

    public final void setTranslationX(float f) {
        if (f != getTranslationX()) {
            super.setTranslationX(f);
            u();
        }
    }

    public final void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            u();
        }
    }

    public final void draw(Canvas canvas) {
        cnh cnh;
        boolean d = cno.d();
        if (d) {
            try {
                cno.a();
            } catch (Throwable th) {
                if (d) {
                    cno.c();
                }
            }
        }
        ComponentTree componentTree = this.t;
        cqq cqq = null;
        if (componentTree == null) {
            cnh = null;
        } else {
            cnh = componentTree.h.d;
        }
        if (cnh != null) {
            cqq = cpt.a(this.v, cnh, cnh.d());
        }
        if (cqq != null) {
            this.k = cqq;
            cmh cmh = this.j;
            if (!cmh.d) {
                cmh.a = new ArrayList(4);
                cmh.b = new ArrayList(4);
            }
            cmh.c = true;
            cmh.d = true;
        }
        super.draw(canvas);
        if (this.A != null) {
            if (cqq != null) {
                cqq.f();
            }
            this.A.a();
            if (cqq != null) {
                cqq.f();
            }
        }
        if (cqq != null) {
            this.t.g().b();
            cqq.a();
            cnh.e();
        }
        if (d) {
            cno.c();
        }
    }

    private final void u() {
        ComponentTree componentTree = this.t;
        if (componentTree != null && componentTree.k && (getParent() instanceof View)) {
            int width = ((View) getParent()).getWidth();
            int height = ((View) getParent()).getHeight();
            int translationX = (int) getTranslationX();
            int translationY = (int) getTranslationY();
            int top = getTop() + translationY;
            int bottom = getBottom() + translationY;
            int right = getRight() + translationX;
            if (getLeft() + translationX < 0 || top < 0 || right > width || bottom > height || this.w.width() != getWidth() || this.w.height() != getHeight()) {
                Rect rect = new Rect();
                if (getLocalVisibleRect(rect)) {
                    a(rect, true);
                }
            }
        }
    }

    public final void a(Rect rect, boolean z) {
        ComponentTree componentTree = this.t;
        if (componentTree != null) {
            if (componentTree.w == null) {
                if (!isLayoutRequested()) {
                    throw new RuntimeException("Trying to incrementally mount a component with a null main thread LayoutState on a LithoView that hasn't requested layout!");
                }
            } else if (componentTree.k) {
                componentTree.a(rect, z);
            } else {
                throw new IllegalStateException("To perform incremental mounting, you need first to enable it when creating the ComponentTree.");
            }
        }
    }

    public final void m() {
        ComponentTree componentTree = this.t;
        if (componentTree != null && componentTree.w != null) {
            if (componentTree.k) {
                componentTree.e();
                return;
            }
            throw new IllegalStateException("To perform incremental mounting, you need first to enable it when creating the ComponentTree.");
        }
    }

    public final boolean n() {
        ComponentTree componentTree = this.t;
        return componentTree != null && componentTree.k;
    }

    private final void v() {
        ComponentTree componentTree = this.t;
        if (componentTree != null && !componentTree.k) {
            cpg cpg = componentTree.w;
            if (cpg != null) {
                Rect rect = new Rect();
                rect.set(0, 0, getWidth(), getHeight());
                a(cpg, rect);
            }
        }
    }

    private final void a(cpg cpg, Rect rect) {
        this.u.a(cpg, rect, null);
    }

    public final void o() {
        cqa cqa = this.u;
        long[] jArr = cqa.e;
        if (jArr != null) {
            int length = jArr.length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                cqa.a(length, cqa.i);
            }
            cqa.l.setEmpty();
            cqa.h = true;
        }
        this.w.setEmpty();
    }

    public final void p() {
        cqa cqa = this.u;
        cqa.g = true;
        cqa.l.setEmpty();
        this.w.setEmpty();
    }

    public final boolean q() {
        return this.u.g;
    }

    public final boolean r() {
        return this.u.h;
    }

    public final void a(List list) {
        if (list != null) {
            this.L = new HashMap();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                cms cms = (cms) list.get(i);
                this.L.put(cms.b, cms);
            }
            return;
        }
        this.L = null;
    }

    private static void a(cnh cnh, String str) {
        cnh.a(str);
    }

    public final Deque findTestItems(String str) {
        Map map = this.u.d;
        if (map != null) {
            Deque deque = (Deque) map.get(str);
            return deque == null ? new LinkedList() : deque;
        } else {
            throw new UnsupportedOperationException("Trying to access TestItems while ComponentsConfiguration.isEndToEndTestRun is false.");
        }
    }

    public final String toString() {
        return LithoViewTestHelper.viewToString(this, true);
    }
}
