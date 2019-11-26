package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: pc */
public abstract class pc {
    public abstract Object a(Object obj, Object obj2, Object obj3);

    public abstract void a(ViewGroup viewGroup, Object obj);

    public abstract void a(Object obj, Rect rect);

    public abstract void a(Object obj, View view);

    public abstract void a(Object obj, View view, ArrayList arrayList);

    public abstract void a(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public abstract void a(Object obj, ArrayList arrayList);

    public abstract void a(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract boolean a(Object obj);

    public abstract Object b(Object obj);

    public abstract void b(Object obj, View view);

    public abstract void b(Object obj, View view, ArrayList arrayList);

    public abstract void b(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object c(Object obj);

    public abstract void c(Object obj, View view);

    protected static void a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        rect.set(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:7:0x0016, code skipped:
            if (r5.isTransitionGroup() != false) goto L_0x0048;
     */
    /* JADX WARNING: Missing block: B:11:0x0028, code skipped:
            if (r0.booleanValue() != false) goto L_0x0048;
     */
    /* JADX WARNING: Missing block: B:15:0x0034, code skipped:
            if (defpackage.abe.s(r5) != null) goto L_0x0048;
     */
    public final void a(java.util.ArrayList r4, android.view.View r5) {
        /*
        r3 = this;
        r0 = r5.getVisibility();
        if (r0 != 0) goto L_0x004f;
    L_0x0006:
        r0 = r5 instanceof android.view.ViewGroup;
        if (r0 == 0) goto L_0x004c;
    L_0x000a:
        r5 = (android.view.ViewGroup) r5;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 21;
        if (r0 < r1) goto L_0x0019;
    L_0x0012:
        r0 = r5.isTransitionGroup();
        if (r0 == 0) goto L_0x0037;
    L_0x0018:
        goto L_0x0048;
    L_0x0019:
        r0 = 2131755179; // 0x7f1000ab float:1.914123E38 double:1.0532269993E-314;
        r0 = r5.getTag(r0);
        r0 = (java.lang.Boolean) r0;
        if (r0 == 0) goto L_0x002a;
    L_0x0024:
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x0048;
    L_0x002a:
        r0 = r5.getBackground();
        if (r0 != 0) goto L_0x0048;
    L_0x0030:
        r0 = defpackage.abe.s(r5);
        if (r0 == 0) goto L_0x0037;
    L_0x0036:
        goto L_0x0048;
    L_0x0037:
        r0 = r5.getChildCount();
        r1 = 0;
    L_0x003c:
        if (r1 >= r0) goto L_0x004f;
    L_0x003e:
        r2 = r5.getChildAt(r1);
        r3.a(r4, r2);
        r1 = r1 + 1;
        goto L_0x003c;
    L_0x0048:
        r4.add(r5);
        goto L_0x004f;
    L_0x004c:
        r4.add(r5);
    L_0x004f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc.a(java.util.ArrayList, android.view.View):void");
    }

    /* Access modifiers changed, original: final */
    public final void a(Map map, View view) {
        if (view.getVisibility() == 0) {
            String s = abe.s(view);
            if (s != null) {
                map.put(s, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    protected static void a(List list, View view) {
        int size = list.size();
        if (!pc.a(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!pc.a(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    private static boolean a(List list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    protected static boolean a(List list) {
        return list == null || list.isEmpty();
    }
}
