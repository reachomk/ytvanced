package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: alz */
final class alz {
    private static final RectF i = new RectF();
    private static ConcurrentHashMap j = new ConcurrentHashMap();
    private static ConcurrentHashMap k = new ConcurrentHashMap();
    public int a = 0;
    public boolean b = false;
    public float c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public int[] f = new int[0];
    public boolean g = false;
    public final Context h;
    private TextPaint l;
    private final TextView m;

    alz(TextView textView) {
        this.m = textView;
        this.h = this.m.getContext();
    }

    /* Access modifiers changed, original: final */
    public final int a() {
        return Math.round(this.c);
    }

    /* Access modifiers changed, original: final */
    public final int b() {
        return Math.round(this.d);
    }

    /* Access modifiers changed, original: final */
    public final int c() {
        return Math.round(this.e);
    }

    public final boolean d() {
        int[] iArr = this.f;
        int length = iArr.length;
        boolean z = length > 0;
        this.g = z;
        if (z) {
            this.a = 1;
            this.d = (float) iArr[0];
            this.e = (float) iArr[length - 1];
            this.c = -1.0f;
        }
        return z;
    }

    public static int[] a(int[] iArr) {
        if (r0 != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0) {
                    Integer valueOf = Integer.valueOf(i);
                    if (Collections.binarySearch(arrayList, valueOf) < 0) {
                        arrayList.add(valueOf);
                    }
                }
            }
            if (r0 != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public final void a(float f, float f2, float f3) {
        String str = "px) is less or equal to (0px)";
        if (f <= 0.0f) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Minimum auto-size text size (");
            stringBuilder.append(f);
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (f2 <= f) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Maximum auto-size text size (");
            stringBuilder2.append(f2);
            stringBuilder2.append("px) is less or equal to minimum auto-size text size (");
            stringBuilder2.append(f);
            stringBuilder2.append("px)");
            throw new IllegalArgumentException(stringBuilder2.toString());
        } else if (f3 > 0.0f) {
            this.a = 1;
            this.d = f;
            this.e = f2;
            this.c = f3;
            this.g = false;
        } else {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("The auto-size step granularity (");
            stringBuilder3.append(f3);
            stringBuilder3.append(str);
            throw new IllegalArgumentException(stringBuilder3.toString());
        }
    }

    public final boolean e() {
        int i = 0;
        if (h() && this.a == 1) {
            if (!this.g || this.f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.e - this.d) / this.c))) + 1;
                int[] iArr = new int[floor];
                while (i < floor) {
                    iArr[i] = Math.round(this.d + (((float) i) * this.c));
                    i++;
                }
                this.f = alz.a(iArr);
            }
            this.b = true;
            return true;
        }
        this.b = false;
        return false;
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x01a9 */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:43|(1:45)(1:46)|47|48|49|50|51|52) */
    /* JADX WARNING: Missing block: B:58:0x01cc, code skipped:
            if (r9.getLineEnd(r9.getLineCount() - 1) == r10.length()) goto L_0x01ce;
     */
    public final void f() {
        /*
        r22 = this;
        r1 = r22;
        r0 = r22.g();
        if (r0 == 0) goto L_0x0209;
    L_0x0008:
        r0 = r1.b;
        r2 = 1;
        if (r0 == 0) goto L_0x0207;
    L_0x000d:
        r0 = r1.m;
        r0 = r0.getMeasuredHeight();
        if (r0 <= 0) goto L_0x0206;
    L_0x0015:
        r0 = r1.m;
        r0 = r0.getMeasuredWidth();
        if (r0 <= 0) goto L_0x0206;
    L_0x001d:
        r0 = r1.m;
        r3 = 0;
        r4 = java.lang.Boolean.valueOf(r3);
        r5 = "getHorizontallyScrolling";
        r0 = defpackage.alz.a(r0, r5, r4);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x0047;
    L_0x0032:
        r0 = r1.m;
        r0 = r0.getMeasuredWidth();
        r4 = r1.m;
        r4 = r4.getTotalPaddingLeft();
        r0 = r0 - r4;
        r4 = r1.m;
        r4 = r4.getTotalPaddingRight();
        r0 = r0 - r4;
        goto L_0x0049;
    L_0x0047:
        r0 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
    L_0x0049:
        r4 = r1.m;
        r4 = r4.getHeight();
        r5 = r1.m;
        r5 = r5.getCompoundPaddingBottom();
        r4 = r4 - r5;
        r5 = r1.m;
        r5 = r5.getCompoundPaddingTop();
        r4 = r4 - r5;
        if (r0 <= 0) goto L_0x0206;
    L_0x005f:
        if (r4 <= 0) goto L_0x0206;
    L_0x0061:
        r5 = i;
        monitor-enter(r5);
        r6 = i;	 Catch:{ all -> 0x0203 }
        r6.setEmpty();	 Catch:{ all -> 0x0203 }
        r6 = i;	 Catch:{ all -> 0x0203 }
        r0 = (float) r0;	 Catch:{ all -> 0x0203 }
        r6.right = r0;	 Catch:{ all -> 0x0203 }
        r0 = i;	 Catch:{ all -> 0x0203 }
        r4 = (float) r4;	 Catch:{ all -> 0x0203 }
        r0.bottom = r4;	 Catch:{ all -> 0x0203 }
        r0 = i;	 Catch:{ all -> 0x0203 }
        r4 = r1.f;	 Catch:{ all -> 0x0203 }
        r4 = r4.length;	 Catch:{ all -> 0x0203 }
        if (r4 == 0) goto L_0x01fb;
    L_0x007a:
        r6 = -1;
        r4 = r4 + r6;
        r7 = r4;
        r4 = 1;
        r8 = 0;
    L_0x007f:
        if (r4 > r7) goto L_0x01e7;
    L_0x0081:
        r8 = r4 + r7;
        r8 = r8 / 2;
        r9 = r1.f;	 Catch:{ all -> 0x0203 }
        r9 = r9[r8];	 Catch:{ all -> 0x0203 }
        r10 = r1.m;	 Catch:{ all -> 0x0203 }
        r10 = r10.getText();	 Catch:{ all -> 0x0203 }
        r11 = r1.m;	 Catch:{ all -> 0x0203 }
        r11 = r11.getTransformationMethod();	 Catch:{ all -> 0x0203 }
        if (r11 == 0) goto L_0x00a1;
    L_0x0097:
        r12 = r1.m;	 Catch:{ all -> 0x0203 }
        r11 = r11.getTransformation(r10, r12);	 Catch:{ all -> 0x0203 }
        if (r11 != 0) goto L_0x00a0;
    L_0x009f:
        goto L_0x00a1;
    L_0x00a0:
        r10 = r11;
    L_0x00a1:
        r11 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x0203 }
        r12 = 16;
        if (r11 < r12) goto L_0x00ae;
    L_0x00a7:
        r11 = r1.m;	 Catch:{ all -> 0x0203 }
        r11 = r11.getMaxLines();	 Catch:{ all -> 0x0203 }
        goto L_0x00af;
    L_0x00ae:
        r11 = -1;
    L_0x00af:
        r13 = r1.l;	 Catch:{ all -> 0x0203 }
        if (r13 != 0) goto L_0x00bb;
    L_0x00b3:
        r13 = new android.text.TextPaint;	 Catch:{ all -> 0x0203 }
        r13.<init>();	 Catch:{ all -> 0x0203 }
        r1.l = r13;	 Catch:{ all -> 0x0203 }
        goto L_0x00be;
    L_0x00bb:
        r13.reset();	 Catch:{ all -> 0x0203 }
    L_0x00be:
        r13 = r1.l;	 Catch:{ all -> 0x0203 }
        r14 = r1.m;	 Catch:{ all -> 0x0203 }
        r14 = r14.getPaint();	 Catch:{ all -> 0x0203 }
        r13.set(r14);	 Catch:{ all -> 0x0203 }
        r13 = r1.l;	 Catch:{ all -> 0x0203 }
        r9 = (float) r9;	 Catch:{ all -> 0x0203 }
        r13.setTextSize(r9);	 Catch:{ all -> 0x0203 }
        r9 = r1.m;	 Catch:{ all -> 0x0203 }
        r13 = "getLayoutAlignment";
        r14 = android.text.Layout.Alignment.ALIGN_NORMAL;	 Catch:{ all -> 0x0203 }
        r9 = defpackage.alz.a(r9, r13, r14);	 Catch:{ all -> 0x0203 }
        r9 = (android.text.Layout.Alignment) r9;	 Catch:{ all -> 0x0203 }
        r13 = r0.right;	 Catch:{ all -> 0x0203 }
        r15 = java.lang.Math.round(r13);	 Catch:{ all -> 0x0203 }
        r13 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x0203 }
        r14 = 23;
        if (r13 >= r14) goto L_0x0153;
    L_0x00e7:
        r13 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x0203 }
        if (r13 < r12) goto L_0x010d;
    L_0x00eb:
        r12 = r1.m;	 Catch:{ all -> 0x0203 }
        r17 = r12.getLineSpacingMultiplier();	 Catch:{ all -> 0x0203 }
        r12 = r1.m;	 Catch:{ all -> 0x0203 }
        r18 = r12.getLineSpacingExtra();	 Catch:{ all -> 0x0203 }
        r12 = r1.m;	 Catch:{ all -> 0x0203 }
        r19 = r12.getIncludeFontPadding();	 Catch:{ all -> 0x0203 }
        r20 = new android.text.StaticLayout;	 Catch:{ all -> 0x0203 }
        r14 = r1.l;	 Catch:{ all -> 0x0203 }
        r12 = r20;
        r13 = r10;
        r16 = r9;
        r12.<init>(r13, r14, r15, r16, r17, r18, r19);	 Catch:{ all -> 0x0203 }
    L_0x0109:
        r9 = r20;
        goto L_0x01b6;
    L_0x010d:
        r12 = r1.m;	 Catch:{ all -> 0x0203 }
        r13 = "mSpacingMult";
        r14 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r14 = java.lang.Float.valueOf(r14);	 Catch:{ all -> 0x0203 }
        r12 = defpackage.alz.b(r12, r13, r14);	 Catch:{ all -> 0x0203 }
        r12 = (java.lang.Float) r12;	 Catch:{ all -> 0x0203 }
        r17 = r12.floatValue();	 Catch:{ all -> 0x0203 }
        r12 = r1.m;	 Catch:{ all -> 0x0203 }
        r13 = "mSpacingAdd";
        r14 = 0;
        r14 = java.lang.Float.valueOf(r14);	 Catch:{ all -> 0x0203 }
        r12 = defpackage.alz.b(r12, r13, r14);	 Catch:{ all -> 0x0203 }
        r12 = (java.lang.Float) r12;	 Catch:{ all -> 0x0203 }
        r18 = r12.floatValue();	 Catch:{ all -> 0x0203 }
        r12 = r1.m;	 Catch:{ all -> 0x0203 }
        r13 = "mIncludePad";
        r14 = java.lang.Boolean.valueOf(r2);	 Catch:{ all -> 0x0203 }
        r12 = defpackage.alz.b(r12, r13, r14);	 Catch:{ all -> 0x0203 }
        r12 = (java.lang.Boolean) r12;	 Catch:{ all -> 0x0203 }
        r19 = r12.booleanValue();	 Catch:{ all -> 0x0203 }
        r20 = new android.text.StaticLayout;	 Catch:{ all -> 0x0203 }
        r14 = r1.l;	 Catch:{ all -> 0x0203 }
        r12 = r20;
        r13 = r10;
        r16 = r9;
        r12.<init>(r13, r14, r15, r16, r17, r18, r19);	 Catch:{ all -> 0x0203 }
        goto L_0x0109;
    L_0x0153:
        r12 = r10.length();	 Catch:{ all -> 0x0203 }
        r13 = r1.l;	 Catch:{ all -> 0x0203 }
        r12 = android.text.StaticLayout.Builder.obtain(r10, r3, r12, r13, r15);	 Catch:{ all -> 0x0203 }
        r9 = r12.setAlignment(r9);	 Catch:{ all -> 0x0203 }
        r13 = r1.m;	 Catch:{ all -> 0x0203 }
        r13 = r13.getLineSpacingExtra();	 Catch:{ all -> 0x0203 }
        r14 = r1.m;	 Catch:{ all -> 0x0203 }
        r14 = r14.getLineSpacingMultiplier();	 Catch:{ all -> 0x0203 }
        r9 = r9.setLineSpacing(r13, r14);	 Catch:{ all -> 0x0203 }
        r13 = r1.m;	 Catch:{ all -> 0x0203 }
        r13 = r13.getIncludeFontPadding();	 Catch:{ all -> 0x0203 }
        r9 = r9.setIncludePad(r13);	 Catch:{ all -> 0x0203 }
        r13 = r1.m;	 Catch:{ all -> 0x0203 }
        r13 = r13.getBreakStrategy();	 Catch:{ all -> 0x0203 }
        r9 = r9.setBreakStrategy(r13);	 Catch:{ all -> 0x0203 }
        r13 = r1.m;	 Catch:{ all -> 0x0203 }
        r13 = r13.getHyphenationFrequency();	 Catch:{ all -> 0x0203 }
        r9 = r9.setHyphenationFrequency(r13);	 Catch:{ all -> 0x0203 }
        if (r11 != r6) goto L_0x0195;
    L_0x0191:
        r13 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        goto L_0x0196;
    L_0x0195:
        r13 = r11;
    L_0x0196:
        r9.setMaxLines(r13);	 Catch:{ all -> 0x0203 }
        r9 = r1.m;	 Catch:{ ClassCastException -> 0x01a9 }
        r13 = "getTextDirectionHeuristic";
        r14 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;	 Catch:{ ClassCastException -> 0x01a9 }
        r9 = defpackage.alz.a(r9, r13, r14);	 Catch:{ ClassCastException -> 0x01a9 }
        r9 = (android.text.TextDirectionHeuristic) r9;	 Catch:{ ClassCastException -> 0x01a9 }
        r12.setTextDirection(r9);	 Catch:{ ClassCastException -> 0x01a9 }
        goto L_0x01b0;
    L_0x01a9:
        r9 = "ACTVAutoSizeHelper";
        r13 = "Failed to obtain TextDirectionHeuristic, auto size may be incorrect";
        android.util.Log.w(r9, r13);	 Catch:{ all -> 0x0203 }
    L_0x01b0:
        r20 = r12.build();	 Catch:{ all -> 0x0203 }
        goto L_0x0109;
    L_0x01b6:
        if (r11 != r6) goto L_0x01b9;
    L_0x01b8:
        goto L_0x01ce;
    L_0x01b9:
        r12 = r9.getLineCount();	 Catch:{ all -> 0x0203 }
        if (r12 > r11) goto L_0x01e2;
    L_0x01bf:
        r11 = r9.getLineCount();	 Catch:{ all -> 0x0203 }
        r11 = r11 + r6;
        r11 = r9.getLineEnd(r11);	 Catch:{ all -> 0x0203 }
        r10 = r10.length();	 Catch:{ all -> 0x0203 }
        if (r11 != r10) goto L_0x01e2;
    L_0x01ce:
        r9 = r9.getHeight();	 Catch:{ all -> 0x0203 }
        r9 = (float) r9;	 Catch:{ all -> 0x0203 }
        r10 = r0.bottom;	 Catch:{ all -> 0x0203 }
        r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1));
        if (r9 > 0) goto L_0x01e2;
    L_0x01d9:
        r8 = r8 + 1;
        r21 = r8;
        r8 = r4;
        r4 = r21;
        goto L_0x007f;
    L_0x01e2:
        r8 = r8 + -1;
        r7 = r8;
        goto L_0x007f;
    L_0x01e7:
        r0 = r1.f;	 Catch:{ all -> 0x0203 }
        r0 = r0[r8];	 Catch:{ all -> 0x0203 }
        r0 = (float) r0;	 Catch:{ all -> 0x0203 }
        r4 = r1.m;	 Catch:{ all -> 0x0203 }
        r4 = r4.getTextSize();	 Catch:{ all -> 0x0203 }
        r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r4 == 0) goto L_0x01f9;
    L_0x01f6:
        r1.a(r3, r0);	 Catch:{ all -> 0x0203 }
    L_0x01f9:
        monitor-exit(r5);	 Catch:{ all -> 0x0203 }
        goto L_0x0207;
    L_0x01fb:
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0203 }
        r2 = "No available text sizes to choose from.";
        r0.<init>(r2);	 Catch:{ all -> 0x0203 }
        throw r0;	 Catch:{ all -> 0x0203 }
    L_0x0203:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0203 }
        throw r0;
    L_0x0206:
        return;
    L_0x0207:
        r1.b = r2;
    L_0x0209:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alz.f():void");
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, float f) {
        Resources system;
        Context context = this.h;
        if (context == null) {
            system = Resources.getSystem();
        } else {
            system = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i, f, system.getDisplayMetrics());
        if (applyDimension != this.m.getPaint().getTextSize()) {
            this.m.getPaint().setTextSize(applyDimension);
            boolean isInLayout = this.m.isInLayout();
            if (this.m.getLayout() != null) {
                this.b = false;
                try {
                    Method a = alz.a("nullLayouts");
                    if (a != null) {
                        a.invoke(this.m, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (isInLayout) {
                    this.m.forceLayout();
                } else {
                    this.m.requestLayout();
                }
                this.m.invalidate();
            }
        }
    }

    private static Object a(Object obj, String str, Object obj2) {
        try {
            obj2 = alz.a(str).invoke(obj, new Object[0]);
            if (obj2 == null) {
                return null;
            }
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to invoke TextView#");
            stringBuilder.append(str);
            stringBuilder.append("() method");
            Log.w("ACTVAutoSizeHelper", stringBuilder.toString(), e);
        }
        return obj2;
    }

    private static Object b(Object obj, String str, Object obj2) {
        try {
            Field b = alz.b(str);
            return b != null ? b.get(obj) : obj2;
        } catch (IllegalAccessException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to access TextView#");
            stringBuilder.append(str);
            stringBuilder.append(" member");
            Log.w("ACTVAutoSizeHelper", stringBuilder.toString(), e);
            return obj2;
        }
    }

    private static Method a(String str) {
        try {
            Method method = (Method) j.get(str);
            if (method == null) {
                method = TextView.class.getDeclaredMethod(str, new Class[0]);
                if (method != null) {
                    method.setAccessible(true);
                    j.put(str, method);
                }
            }
            return method;
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to retrieve TextView#");
            stringBuilder.append(str);
            stringBuilder.append("() method");
            Log.w("ACTVAutoSizeHelper", stringBuilder.toString(), e);
            return null;
        }
    }

    private static Field b(String str) {
        try {
            Field field = (Field) k.get(str);
            if (field == null) {
                field = TextView.class.getDeclaredField(str);
                if (field != null) {
                    field.setAccessible(true);
                    k.put(str, field);
                }
            }
            return field;
        } catch (NoSuchFieldException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to access TextView#");
            stringBuilder.append(str);
            stringBuilder.append(" member");
            Log.w("ACTVAutoSizeHelper", stringBuilder.toString(), e);
            return null;
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean g() {
        return h() && this.a != 0;
    }

    public final boolean h() {
        return (this.m instanceof ala) ^ 1;
    }
}
