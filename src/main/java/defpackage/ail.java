package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ail */
final class ail extends aji implements ajj, OnKeyListener, OnDismissListener {
    private OnDismissListener A;
    public final Handler a;
    public final List b = new ArrayList();
    public final OnGlobalLayoutListener c = new aio(this);
    public View d;
    public ViewTreeObserver e;
    public boolean f;
    private final Context h;
    private final int i;
    private final int j;
    private final int k;
    private final boolean l;
    private final List m = new ArrayList();
    private final OnAttachStateChangeListener n = new ain(this);
    private final aoi o = new aiq(this);
    private int p = 0;
    private int q = 0;
    private View r;
    private int s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private ajm z;

    public ail(Context context, View view, int i, int i2, boolean z) {
        this.h = context;
        this.r = view;
        this.j = i;
        this.k = i2;
        this.l = z;
        this.x = false;
        this.s = h();
        Resources resources = context.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.a = new Handler();
    }

    public final boolean b() {
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean g() {
        return false;
    }

    public final void a(boolean z) {
        this.x = z;
    }

    public final void f_() {
        if (!e()) {
            for (aiw c : this.m) {
                c(c);
            }
            this.m.clear();
            this.d = this.r;
            View view = this.d;
            if (view != null) {
                ViewTreeObserver viewTreeObserver = this.e;
                this.e = view.getViewTreeObserver();
                if (viewTreeObserver == null) {
                    this.e.addOnGlobalLayoutListener(this.c);
                }
                this.d.addOnAttachStateChangeListener(this.n);
            }
        }
    }

    public final void d() {
        int size = this.b.size();
        if (size > 0) {
            air[] airArr = (air[]) this.b.toArray(new air[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    air air = airArr[size];
                    if (air.a.e()) {
                        air.a.d();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        d();
        return true;
    }

    private final int h() {
        return abe.g(this.r) == 1 ? 0 : 1;
    }

    public final void a(aiw aiw) {
        aiw.a((ajj) this, this.h);
        if (e()) {
            c(aiw);
        } else {
            this.m.add(aiw);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e5  */
    private final void c(defpackage.aiw r18) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        r2 = r0.h;
        r2 = android.view.LayoutInflater.from(r2);
        r3 = new ait;
        r4 = r0.l;
        r5 = 2131034123; // 0x7f05000b float:1.7678755E38 double:1.0528707503E-314;
        r3.<init>(r1, r2, r4, r5);
        r4 = r17.e();
        r5 = 1;
        if (r4 != 0) goto L_0x0023;
    L_0x001b:
        r4 = r0.x;
        if (r4 != 0) goto L_0x0020;
    L_0x001f:
        goto L_0x0023;
    L_0x0020:
        r3.b = r5;
        goto L_0x002f;
    L_0x0023:
        r4 = r17.e();
        if (r4 == 0) goto L_0x002f;
    L_0x0029:
        r4 = defpackage.aji.b(r18);
        r3.b = r4;
    L_0x002f:
        r4 = r0.h;
        r6 = r0.i;
        r4 = defpackage.aji.a(r3, r4, r6);
        r6 = new aoh;
        r7 = r0.h;
        r8 = r0.j;
        r9 = r0.k;
        r6.<init>(r7, r8, r9);
        r7 = r0.o;
        r6.b = r7;
        r6.n = r0;
        r6.a(r0);
        r7 = r0.r;
        r6.m = r7;
        r7 = r0.q;
        r6.j = r7;
        r6.h();
        r6.i();
        r6.a(r3);
        r6.d(r4);
        r3 = r0.q;
        r6.j = r3;
        r3 = r0.b;
        r3 = r3.size();
        r7 = -1;
        r9 = 0;
        if (r3 <= 0) goto L_0x00e1;
    L_0x006d:
        r3 = r0.b;
        r10 = r3.size();
        r10 = r10 + r7;
        r3 = r3.get(r10);
        r3 = (defpackage.air) r3;
        r10 = r3.b;
        r11 = r10.size();
        r12 = 0;
    L_0x0081:
        if (r12 >= r11) goto L_0x0098;
    L_0x0083:
        r13 = r10.getItem(r12);
        r14 = r13.hasSubMenu();
        if (r14 != 0) goto L_0x008e;
    L_0x008d:
        goto L_0x0095;
    L_0x008e:
        r14 = r13.getSubMenu();
        if (r1 != r14) goto L_0x0095;
    L_0x0094:
        goto L_0x0099;
    L_0x0095:
        r12 = r12 + 1;
        goto L_0x0081;
    L_0x0098:
        r13 = 0;
    L_0x0099:
        if (r13 == 0) goto L_0x00e2;
    L_0x009b:
        r10 = r3.a();
        r11 = r10.getAdapter();
        r12 = r11 instanceof android.widget.HeaderViewListAdapter;
        if (r12 == 0) goto L_0x00b4;
    L_0x00a7:
        r11 = (android.widget.HeaderViewListAdapter) r11;
        r12 = r11.getHeadersCount();
        r11 = r11.getWrappedAdapter();
        r11 = (defpackage.ait) r11;
        goto L_0x00b7;
    L_0x00b4:
        r11 = (defpackage.ait) r11;
        r12 = 0;
    L_0x00b7:
        r14 = r11.getCount();
        r15 = 0;
    L_0x00bc:
        if (r15 >= r14) goto L_0x00cb;
    L_0x00be:
        r16 = r11.getItem(r15);
        r8 = r16;
        r8 = (defpackage.aja) r8;
        if (r13 == r8) goto L_0x00cc;
    L_0x00c8:
        r15 = r15 + 1;
        goto L_0x00bc;
    L_0x00cb:
        r15 = -1;
    L_0x00cc:
        if (r15 == r7) goto L_0x00e2;
    L_0x00ce:
        r15 = r15 + r12;
        r8 = r10.getFirstVisiblePosition();
        r15 = r15 - r8;
        if (r15 < 0) goto L_0x00e2;
    L_0x00d6:
        r8 = r10.getChildCount();
        if (r15 >= r8) goto L_0x00e2;
    L_0x00dc:
        r8 = r10.getChildAt(r15);
        goto L_0x00e3;
    L_0x00e1:
        r3 = 0;
    L_0x00e2:
        r8 = 0;
    L_0x00e3:
        if (r8 != 0) goto L_0x00fd;
    L_0x00e5:
        r4 = r0.t;
        if (r4 == 0) goto L_0x00ed;
    L_0x00e9:
        r4 = r0.v;
        r6.g = r4;
    L_0x00ed:
        r4 = r0.u;
        if (r4 == 0) goto L_0x00f6;
    L_0x00f1:
        r4 = r0.w;
        r6.a(r4);
    L_0x00f6:
        r4 = r0.g;
        r6.a(r4);
        goto L_0x01b4;
    L_0x00fd:
        r10 = defpackage.aoh.a;
        if (r10 == 0) goto L_0x0112;
    L_0x0101:
        r10 = defpackage.aoh.a;	 Catch:{ Exception -> 0x0111 }
        r11 = r6.r;	 Catch:{ Exception -> 0x0111 }
        r12 = new java.lang.Object[r5];	 Catch:{ Exception -> 0x0111 }
        r13 = java.lang.Boolean.valueOf(r9);	 Catch:{ Exception -> 0x0111 }
        r12[r9] = r13;	 Catch:{ Exception -> 0x0111 }
        r10.invoke(r11, r12);	 Catch:{ Exception -> 0x0111 }
        goto L_0x0112;
    L_0x0112:
        r10 = android.os.Build.VERSION.SDK_INT;
        r11 = 23;
        if (r10 < r11) goto L_0x011e;
    L_0x0118:
        r10 = r6.r;
        r11 = 0;
        r10.setEnterTransition(r11);
    L_0x011e:
        r10 = r0.b;
        r11 = r10.size();
        r11 = r11 + r7;
        r7 = r10.get(r11);
        r7 = (defpackage.air) r7;
        r7 = r7.a();
        r10 = 2;
        r11 = new int[r10];
        r7.getLocationOnScreen(r11);
        r12 = new android.graphics.Rect;
        r12.<init>();
        r13 = r0.d;
        r13.getWindowVisibleDisplayFrame(r12);
        r13 = r0.s;
        if (r13 != r5) goto L_0x0150;
    L_0x0143:
        r11 = r11[r9];
        r7 = r7.getWidth();
        r11 = r11 + r7;
        r11 = r11 + r4;
        r7 = r12.right;
        if (r11 <= r7) goto L_0x0155;
    L_0x014f:
        goto L_0x0157;
    L_0x0150:
        r7 = r11[r9];
        r7 = r7 - r4;
        if (r7 >= 0) goto L_0x0157;
    L_0x0155:
        r7 = 1;
        goto L_0x0158;
    L_0x0157:
        r7 = 0;
    L_0x0158:
        r0.s = r7;
        r11 = android.os.Build.VERSION.SDK_INT;
        r12 = 26;
        r13 = 5;
        if (r11 >= r12) goto L_0x0192;
    L_0x0161:
        r11 = new int[r10];
        r12 = r0.r;
        r12.getLocationOnScreen(r11);
        r10 = new int[r10];
        r8.getLocationOnScreen(r10);
        r12 = r0.q;
        r12 = r12 & 7;
        if (r12 != r13) goto L_0x0187;
    L_0x0173:
        r12 = r11[r9];
        r14 = r0.r;
        r14 = r14.getWidth();
        r12 = r12 + r14;
        r11[r9] = r12;
        r12 = r10[r9];
        r14 = r8.getWidth();
        r12 = r12 + r14;
        r10[r9] = r12;
    L_0x0187:
        r12 = r10[r9];
        r14 = r11[r9];
        r12 = r12 - r14;
        r10 = r10[r5];
        r11 = r11[r5];
        r10 = r10 - r11;
        goto L_0x0196;
    L_0x0192:
        r6.m = r8;
        r10 = 0;
        r12 = 0;
    L_0x0196:
        r11 = r0.q;
        r11 = r11 & r13;
        if (r11 != r13) goto L_0x01a2;
    L_0x019b:
        if (r7 != 0) goto L_0x01a8;
    L_0x019d:
        r4 = r8.getWidth();
        goto L_0x01aa;
    L_0x01a2:
        if (r7 == 0) goto L_0x01aa;
    L_0x01a4:
        r4 = r8.getWidth();
    L_0x01a8:
        r12 = r12 + r4;
        goto L_0x01ab;
    L_0x01aa:
        r12 = r12 - r4;
    L_0x01ab:
        r6.g = r12;
        r6.i = r5;
        r6.h = r5;
        r6.a(r10);
    L_0x01b4:
        r4 = new air;
        r5 = r0.s;
        r4.<init>(r6, r1, r5);
        r5 = r0.b;
        r5.add(r4);
        r6.f_();
        r4 = r6.e;
        r4.setOnKeyListener(r0);
        if (r3 != 0) goto L_0x01f4;
    L_0x01ca:
        r3 = r0.y;
        if (r3 != 0) goto L_0x01cf;
    L_0x01ce:
        goto L_0x01f4;
    L_0x01cf:
        r3 = r1.e;
        if (r3 == 0) goto L_0x01f4;
    L_0x01d3:
        r3 = 2131034130; // 0x7f050012 float:1.7678769E38 double:1.0528707537E-314;
        r2 = r2.inflate(r3, r4, r9);
        r2 = (android.widget.FrameLayout) r2;
        r3 = 16908310; // 0x1020016 float:2.387729E-38 double:8.353815E-317;
        r3 = r2.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r2.setEnabled(r9);
        r1 = r1.e;
        r3.setText(r1);
        r1 = 0;
        r4.addHeaderView(r2, r1, r9);
        r6.f_();
    L_0x01f4:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ail.c(aiw):void");
    }

    public final boolean e() {
        return this.b.size() > 0 && ((air) this.b.get(0)).a.e();
    }

    public final void onDismiss() {
        air air;
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            air = (air) this.b.get(i);
            if (!air.a.e()) {
                break;
            }
        }
        air = null;
        if (air != null) {
            air.b.a(false);
        }
    }

    public final void a() {
        for (air a : this.b) {
            aji.a(a.a().getAdapter()).notifyDataSetChanged();
        }
    }

    public final void a(ajm ajm) {
        this.z = ajm;
    }

    public final boolean a(aju aju) {
        for (air air : this.b) {
            if (aju == air.b) {
                air.a().requestFocus();
                return true;
            }
        }
        if (!aju.hasVisibleItems()) {
            return false;
        }
        a((aiw) aju);
        ajm ajm = this.z;
        if (ajm != null) {
            ajm.a(aju);
        }
        return true;
    }

    public final void a(aiw aiw, boolean z) {
        int size = this.b.size();
        int i = 0;
        while (i < size) {
            if (aiw == ((air) this.b.get(i)).b) {
                break;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            size = i + 1;
            if (size < this.b.size()) {
                ((air) this.b.get(size)).b.a(false);
            }
            air air = (air) this.b.remove(i);
            air.b.b((ajj) this);
            if (this.f) {
                aoh aoh = air.a;
                if (VERSION.SDK_INT >= 23) {
                    aoh.r.setExitTransition(null);
                }
                air.a.r.setAnimationStyle(0);
            }
            air.a.d();
            size = this.b.size();
            if (size > 0) {
                this.s = ((air) this.b.get(size - 1)).c;
            } else {
                this.s = h();
            }
            if (size == 0) {
                d();
                ajm ajm = this.z;
                if (ajm != null) {
                    ajm.a(aiw, true);
                }
                ViewTreeObserver viewTreeObserver = this.e;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.e.removeGlobalOnLayoutListener(this.c);
                    }
                    this.e = null;
                }
                this.d.removeOnAttachStateChangeListener(this.n);
                this.A.onDismiss();
            } else if (z) {
                ((air) this.b.get(0)).b.a(false);
            }
        }
    }

    public final void a(int i) {
        if (this.p != i) {
            this.p = i;
            this.q = Gravity.getAbsoluteGravity(i, abe.g(this.r));
        }
    }

    public final void a(View view) {
        if (this.r != view) {
            this.r = view;
            this.q = Gravity.getAbsoluteGravity(this.p, abe.g(this.r));
        }
    }

    public final void a(OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    public final ListView g_() {
        if (this.b.isEmpty()) {
            return null;
        }
        List list = this.b;
        return ((air) list.get(list.size() - 1)).a();
    }

    public final void b(int i) {
        this.t = true;
        this.v = i;
    }

    public final void c(int i) {
        this.u = true;
        this.w = i;
    }

    public final void b(boolean z) {
        this.y = z;
    }
}
