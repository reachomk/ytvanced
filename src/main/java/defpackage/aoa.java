package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import com.google.android.youtube.R;
import java.lang.reflect.Method;

/* renamed from: aoa */
public class aoa implements ajq {
    private static Method a;
    private static Method b;
    private static Method c;
    private final aob A;
    private final Rect B;
    private Rect C;
    private Context d;
    public amt e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public View m;
    public OnItemClickListener n;
    public final aof o;
    public final Handler p;
    public boolean q;
    public PopupWindow r;
    private ListAdapter s;
    private int t;
    private int u;
    private int v;
    private boolean w;
    private DataSetObserver x;
    private final aog y;
    private final aod z;

    public aoa(Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }

    public aoa(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public aoa(Context context, AttributeSet attributeSet, int i, int i2) {
        this.t = -2;
        this.f = -2;
        this.v = 1002;
        this.j = 0;
        this.k = Integer.MAX_VALUE;
        this.l = 0;
        this.o = new aof(this);
        this.y = new aog(this);
        this.z = new aod(this);
        this.A = new aob(this);
        this.B = new Rect();
        this.d = context;
        this.p = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, afy.aT, i, i2);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(afy.aU, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(afy.aV, 0);
        this.u = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.w = true;
        }
        obtainStyledAttributes.recycle();
        this.r = new ale(context, attributeSet, i, i2);
        this.r.setInputMethodMode(1);
    }

    public void a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.x;
        if (dataSetObserver == null) {
            this.x = new aoe(this);
        } else {
            ListAdapter listAdapter2 = this.s;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.s = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.x);
        }
        amt amt = this.e;
        if (amt != null) {
            amt.setAdapter(this.s);
        }
    }

    public final void h() {
        this.q = true;
        this.r.setFocusable(true);
    }

    public final Drawable b() {
        return this.r.getBackground();
    }

    public final void a(Drawable drawable) {
        this.r.setBackgroundDrawable(drawable);
    }

    public final int f() {
        return this.g;
    }

    public final void b(int i) {
        this.g = i;
    }

    public final int c() {
        return this.w ? this.u : 0;
    }

    public final void a(int i) {
        this.u = i;
        this.w = true;
    }

    public final void a(Rect rect) {
        this.C = rect != null ? new Rect(rect) : null;
    }

    public final void d(int i) {
        Drawable background = this.r.getBackground();
        if (background != null) {
            background.getPadding(this.B);
            this.f = (this.B.left + this.B.right) + i;
            return;
        }
        this.f = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0122  */
    public final void f_() {
        /*
        r13 = this;
        r0 = r13.e;
        r1 = 1;
        if (r0 != 0) goto L_0x0046;
    L_0x0005:
        r0 = r13.d;
        r2 = new anz;
        r2.<init>(r13);
        r2 = r13.q;
        r2 = r2 ^ r1;
        r0 = r13.a(r0, r2);
        r13.e = r0;
        r0 = r13.e;
        r2 = r13.s;
        r0.setAdapter(r2);
        r0 = r13.e;
        r2 = r13.n;
        r0.setOnItemClickListener(r2);
        r0 = r13.e;
        r0.setFocusable(r1);
        r0 = r13.e;
        r0.setFocusableInTouchMode(r1);
        r0 = r13.e;
        r2 = new aoc;
        r2.<init>(r13);
        r0.setOnItemSelectedListener(r2);
        r0 = r13.e;
        r2 = r13.z;
        r0.setOnScrollListener(r2);
        r0 = r13.e;
        r2 = r13.r;
        r2.setContentView(r0);
        goto L_0x004b;
    L_0x0046:
        r0 = r13.r;
        r0.getContentView();
    L_0x004b:
        r0 = r13.r;
        r0 = r0.getBackground();
        r2 = 0;
        if (r0 == 0) goto L_0x006e;
    L_0x0054:
        r3 = r13.B;
        r0.getPadding(r3);
        r0 = r13.B;
        r0 = r0.top;
        r3 = r13.B;
        r3 = r3.bottom;
        r0 = r0 + r3;
        r3 = r13.w;
        if (r3 != 0) goto L_0x0074;
    L_0x0066:
        r3 = r13.B;
        r3 = r3.top;
        r3 = -r3;
        r13.u = r3;
        goto L_0x0074;
    L_0x006e:
        r0 = r13.B;
        r0.setEmpty();
        r0 = 0;
    L_0x0074:
        r3 = r13.r;
        r3 = r3.getInputMethodMode();
        r4 = 2;
        if (r3 != r4) goto L_0x007f;
    L_0x007d:
        r3 = 1;
        goto L_0x0080;
    L_0x007f:
        r3 = 0;
    L_0x0080:
        r5 = r13.m;
        r6 = r13.u;
        r7 = b;
        if (r7 == 0) goto L_0x00a6;
    L_0x0088:
        r8 = r13.r;	 Catch:{ Exception -> 0x00a6 }
        r9 = 3;
        r9 = new java.lang.Object[r9];	 Catch:{ Exception -> 0x00a6 }
        r9[r2] = r5;	 Catch:{ Exception -> 0x00a6 }
        r10 = java.lang.Integer.valueOf(r6);	 Catch:{ Exception -> 0x00a6 }
        r9[r1] = r10;	 Catch:{ Exception -> 0x00a6 }
        r3 = java.lang.Boolean.valueOf(r3);	 Catch:{ Exception -> 0x00a6 }
        r9[r4] = r3;	 Catch:{ Exception -> 0x00a6 }
        r3 = r7.invoke(r8, r9);	 Catch:{ Exception -> 0x00a6 }
        r3 = (java.lang.Integer) r3;	 Catch:{ Exception -> 0x00a6 }
        r3 = r3.intValue();	 Catch:{ Exception -> 0x00a6 }
        goto L_0x00ac;
    L_0x00a6:
        r3 = r13.r;
        r3 = r3.getMaxAvailableHeight(r5, r6);
    L_0x00ac:
        r4 = r13.t;
        r5 = -2;
        r6 = -1;
        if (r4 == r6) goto L_0x010e;
    L_0x00b2:
        r4 = r13.f;
        if (r4 == r5) goto L_0x00da;
    L_0x00b6:
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r4 == r6) goto L_0x00bf;
    L_0x00ba:
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r7);
        goto L_0x00f6;
    L_0x00bf:
        r4 = r13.d;
        r4 = r4.getResources();
        r4 = r4.getDisplayMetrics();
        r4 = r4.widthPixels;
        r8 = r13.B;
        r8 = r8.left;
        r9 = r13.B;
        r9 = r9.right;
        r8 = r8 + r9;
        r4 = r4 - r8;
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r7);
        goto L_0x00f6;
    L_0x00da:
        r4 = r13.d;
        r4 = r4.getResources();
        r4 = r4.getDisplayMetrics();
        r4 = r4.widthPixels;
        r7 = r13.B;
        r7 = r7.left;
        r8 = r13.B;
        r8 = r8.right;
        r7 = r7 + r8;
        r4 = r4 - r7;
        r7 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r7);
    L_0x00f6:
        r7 = r13.e;
        r3 = r7.a(r4, r3);
        if (r3 <= 0) goto L_0x010d;
    L_0x00fe:
        r4 = r13.e;
        r4 = r4.getPaddingTop();
        r7 = r13.e;
        r7 = r7.getPaddingBottom();
        r4 = r4 + r7;
        r0 = r0 + r4;
        goto L_0x010e;
    L_0x010d:
        r0 = 0;
    L_0x010e:
        r3 = r3 + r0;
        r0 = r13.k();
        r4 = r13.r;
        r7 = r13.v;
        defpackage.adi.a(r4, r7);
        r4 = r13.r;
        r4 = r4.isShowing();
        if (r4 != 0) goto L_0x01b3;
    L_0x0122:
        r0 = r13.f;
        if (r0 != r6) goto L_0x0128;
    L_0x0126:
        r0 = -1;
        goto L_0x0131;
    L_0x0128:
        if (r0 == r5) goto L_0x012b;
    L_0x012a:
        goto L_0x0131;
    L_0x012b:
        r0 = r13.m;
        r0 = r0.getWidth();
    L_0x0131:
        r4 = r13.t;
        if (r4 != r6) goto L_0x0137;
    L_0x0135:
        r3 = -1;
        goto L_0x013a;
    L_0x0137:
        if (r4 == r5) goto L_0x013a;
    L_0x0139:
        r3 = r4;
    L_0x013a:
        r4 = r13.r;
        r4.setWidth(r0);
        r0 = r13.r;
        r0.setHeight(r3);
        r0 = a;
        if (r0 == 0) goto L_0x0157;
    L_0x0148:
        r3 = r13.r;	 Catch:{ Exception -> 0x0156 }
        r4 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x0156 }
        r5 = java.lang.Boolean.valueOf(r1);	 Catch:{ Exception -> 0x0156 }
        r4[r2] = r5;	 Catch:{ Exception -> 0x0156 }
        r0.invoke(r3, r4);	 Catch:{ Exception -> 0x0156 }
        goto L_0x0157;
    L_0x0157:
        r0 = r13.r;
        r0.setOutsideTouchable(r1);
        r0 = r13.r;
        r3 = r13.y;
        r0.setTouchInterceptor(r3);
        r0 = r13.i;
        if (r0 == 0) goto L_0x016e;
    L_0x0167:
        r0 = r13.r;
        r3 = r13.h;
        defpackage.adi.a(r0, r3);
    L_0x016e:
        r0 = c;
        if (r0 == 0) goto L_0x0186;
    L_0x0172:
        r3 = r13.r;	 Catch:{ Exception -> 0x017e }
        r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x017e }
        r4 = r13.C;	 Catch:{ Exception -> 0x017e }
        r1[r2] = r4;	 Catch:{ Exception -> 0x017e }
        r0.invoke(r3, r1);	 Catch:{ Exception -> 0x017e }
        goto L_0x0186;
    L_0x017e:
        r0 = move-exception;
        r1 = "ListPopupWindow";
        r2 = "Could not invoke setEpicenterBounds on PopupWindow";
        android.util.Log.e(r1, r2, r0);
    L_0x0186:
        r0 = r13.r;
        r1 = r13.m;
        r2 = r13.g;
        r3 = r13.u;
        r4 = r13.j;
        r0.showAsDropDown(r1, r2, r3, r4);
        r0 = r13.e;
        r0.setSelection(r6);
        r0 = r13.q;
        if (r0 == 0) goto L_0x01a4;
    L_0x019c:
        r0 = r13.e;
        r0 = r0.isInTouchMode();
        if (r0 == 0) goto L_0x01a7;
    L_0x01a4:
        r13.j();
    L_0x01a7:
        r0 = r13.q;
        if (r0 != 0) goto L_0x01b2;
    L_0x01ab:
        r0 = r13.p;
        r1 = r13.A;
        r0.post(r1);
    L_0x01b2:
        return;
    L_0x01b3:
        r4 = r13.m;
        r4 = defpackage.abe.H(r4);
        if (r4 == 0) goto L_0x0212;
    L_0x01bb:
        r4 = r13.f;
        if (r4 != r6) goto L_0x01c1;
    L_0x01bf:
        r4 = -1;
        goto L_0x01ca;
    L_0x01c1:
        if (r4 == r5) goto L_0x01c4;
    L_0x01c3:
        goto L_0x01ca;
    L_0x01c4:
        r4 = r13.m;
        r4 = r4.getWidth();
    L_0x01ca:
        r7 = r13.t;
        if (r7 != r6) goto L_0x01f5;
    L_0x01ce:
        if (r0 != 0) goto L_0x01d1;
    L_0x01d0:
        r3 = -1;
    L_0x01d1:
        if (r0 == 0) goto L_0x01e5;
    L_0x01d3:
        r0 = r13.r;
        r5 = r13.f;
        if (r5 != r6) goto L_0x01db;
    L_0x01d9:
        r5 = -1;
        goto L_0x01dc;
    L_0x01db:
        r5 = 0;
    L_0x01dc:
        r0.setWidth(r5);
        r0 = r13.r;
        r0.setHeight(r2);
        goto L_0x01f8;
    L_0x01e5:
        r0 = r13.r;
        r5 = r13.f;
        if (r5 != r6) goto L_0x01ec;
    L_0x01eb:
        r2 = -1;
    L_0x01ec:
        r0.setWidth(r2);
        r0 = r13.r;
        r0.setHeight(r6);
        goto L_0x01f8;
    L_0x01f5:
        if (r7 == r5) goto L_0x01f8;
    L_0x01f7:
        r3 = r7;
    L_0x01f8:
        r0 = r13.r;
        r0.setOutsideTouchable(r1);
        r7 = r13.r;
        r8 = r13.m;
        r9 = r13.g;
        r10 = r13.u;
        if (r4 >= 0) goto L_0x0209;
    L_0x0207:
        r11 = -1;
        goto L_0x020a;
    L_0x0209:
        r11 = r4;
    L_0x020a:
        if (r3 >= 0) goto L_0x020e;
    L_0x020c:
        r12 = -1;
        goto L_0x020f;
    L_0x020e:
        r12 = r3;
    L_0x020f:
        r7.update(r8, r9, r10, r11, r12);
    L_0x0212:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoa.f_():void");
    }

    public final void d() {
        this.r.dismiss();
        this.r.setContentView(null);
        this.e = null;
        this.p.removeCallbacks(this.o);
    }

    public final void a(OnDismissListener onDismissListener) {
        this.r.setOnDismissListener(onDismissListener);
    }

    public final void i() {
        this.r.setInputMethodMode(2);
    }

    public final void e(int i) {
        amt amt = this.e;
        if (e() && amt != null) {
            amt.a = false;
            amt.setSelection(i);
            if (amt.getChoiceMode() != 0) {
                amt.setItemChecked(i, true);
            }
        }
    }

    public final void j() {
        amt amt = this.e;
        if (amt != null) {
            amt.a = true;
            amt.requestLayout();
        }
    }

    public final boolean e() {
        return this.r.isShowing();
    }

    public final boolean k() {
        return this.r.getInputMethodMode() == 2;
    }

    public final ListView g_() {
        return this.e;
    }

    /* Access modifiers changed, original: 0000 */
    public amt a(Context context, boolean z) {
        return new amt(context, z);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x002c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
    static {
        /*
        r0 = 0;
        r1 = 1;
        r2 = android.widget.PopupWindow.class;
        r3 = "setClipToScreenEnabled";
        r4 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x0012 }
        r5 = java.lang.Boolean.TYPE;	 Catch:{ NoSuchMethodException -> 0x0012 }
        r4[r0] = r5;	 Catch:{ NoSuchMethodException -> 0x0012 }
        r2 = r2.getDeclaredMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x0012 }
        a = r2;	 Catch:{ NoSuchMethodException -> 0x0012 }
    L_0x0012:
        r2 = android.widget.PopupWindow.class;
        r3 = "getMaxAvailableHeight";
        r4 = 3;
        r4 = new java.lang.Class[r4];	 Catch:{ NoSuchMethodException -> 0x002c }
        r5 = android.view.View.class;
        r4[r0] = r5;	 Catch:{ NoSuchMethodException -> 0x002c }
        r5 = java.lang.Integer.TYPE;	 Catch:{ NoSuchMethodException -> 0x002c }
        r4[r1] = r5;	 Catch:{ NoSuchMethodException -> 0x002c }
        r5 = java.lang.Boolean.TYPE;	 Catch:{ NoSuchMethodException -> 0x002c }
        r6 = 2;
        r4[r6] = r5;	 Catch:{ NoSuchMethodException -> 0x002c }
        r2 = r2.getDeclaredMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x002c }
        b = r2;	 Catch:{ NoSuchMethodException -> 0x002c }
    L_0x002c:
        r2 = android.widget.PopupWindow.class;
        r3 = "setEpicenterBounds";
        r1 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x003c }
        r4 = android.graphics.Rect.class;
        r1[r0] = r4;	 Catch:{ NoSuchMethodException -> 0x003c }
        r0 = r2.getDeclaredMethod(r3, r1);	 Catch:{ NoSuchMethodException -> 0x003c }
        c = r0;	 Catch:{ NoSuchMethodException -> 0x003c }
    L_0x003c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoa.<clinit>():void");
    }
}
