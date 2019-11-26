package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.youtube.R;

/* renamed from: hd */
public final class hd {
    private static final int[] a = new int[]{R.attr.colorPrimary};
    private static final int[] b = new int[]{R.attr.colorPrimaryVariant};
    private static final int[] c = new int[]{16842752, R.attr.theme};
    private static final int[] d = new int[]{R.attr.materialThemeOverlay};

    public static TypedArray a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        hd.a(context, attributeSet, i, i2);
        hd.b(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static void a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gz.e, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                hd.a(context, b, "Theme.MaterialComponents");
            }
        }
        hd.a(context);
    }

    /* JADX WARNING: Missing block: B:7:0x001e, code skipped:
            if (r0.getResourceId(defpackage.gz.f, -1) != -1) goto L_0x0020;
     */
    public static void b(android.content.Context r5, android.util.AttributeSet r6, int[] r7, int r8, int r9, int... r10) {
        /*
        r0 = defpackage.gz.e;
        r0 = r5.obtainStyledAttributes(r6, r0, r8, r9);
        r1 = defpackage.gz.g;
        r2 = 0;
        r1 = r0.getBoolean(r1, r2);
        if (r1 != 0) goto L_0x0013;
    L_0x000f:
        r0.recycle();
        return;
    L_0x0013:
        r1 = r10.length;
        r3 = 1;
        r4 = -1;
        if (r1 != 0) goto L_0x0022;
    L_0x0018:
        r5 = defpackage.gz.f;
        r5 = r0.getResourceId(r5, r4);
        if (r5 == r4) goto L_0x003c;
    L_0x0020:
        r2 = 1;
        goto L_0x003c;
    L_0x0022:
        r5 = r5.obtainStyledAttributes(r6, r7, r8, r9);
        r6 = 0;
    L_0x0027:
        if (r6 >= r1) goto L_0x0038;
    L_0x0029:
        r7 = r10[r6];
        r7 = r5.getResourceId(r7, r4);
        if (r7 == r4) goto L_0x0034;
    L_0x0031:
        r6 = r6 + 1;
        goto L_0x0027;
    L_0x0034:
        r5.recycle();
        goto L_0x003c;
    L_0x0038:
        r5.recycle();
        goto L_0x0020;
    L_0x003c:
        r0.recycle();
        if (r2 == 0) goto L_0x0042;
    L_0x0041:
        return;
    L_0x0042:
        r5 = new java.lang.IllegalArgumentException;
        r6 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).";
        r5.<init>(r6);
        goto L_0x004b;
    L_0x004a:
        throw r5;
    L_0x004b:
        goto L_0x004a;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd.b(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static void a(Context context) {
        hd.a(context, a, "Theme.AppCompat");
    }

    private static void a(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int i = 0;
        while (i < iArr.length) {
            if (obtainStyledAttributes.hasValue(i)) {
                i++;
            } else {
                obtainStyledAttributes.recycle();
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 77);
                stringBuilder.append("The style on this component requires your app theme to be ");
                stringBuilder.append(str);
                stringBuilder.append(" (or a descendant).");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static Context b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if (!(resourceId == 0 || ((context instanceof ahw) && ((ahw) context).a == resourceId))) {
            Context ahw = new ahw(context, resourceId);
            TypedArray obtainStyledAttributes2 = ahw.obtainStyledAttributes(attributeSet, c);
            int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
            i2 = obtainStyledAttributes2.getResourceId(1, 0);
            obtainStyledAttributes2.recycle();
            if (resourceId2 == 0) {
                resourceId2 = i2;
            }
            if (resourceId2 != 0) {
                return new ahw(ahw, resourceId2);
            }
            context = ahw;
        }
        return context;
    }
}
