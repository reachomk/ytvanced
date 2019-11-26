package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: bfv */
public final class bfv extends bgx {
    private static final String[] t;
    private static final Property u = new bfu(float[].class, "nonTranslations");
    private static final Property v = new bfx(PointF.class, "translations");
    private static final boolean w;
    public final boolean a = true;
    private final boolean x = true;
    private final Matrix y = new Matrix();

    public final String[] a() {
        return t;
    }

    private final void d(bhn bhn) {
        View view = bhn.b;
        if (view.getVisibility() != 8) {
            bhn.a.put("android:changeTransform:parent", view.getParent());
            bhn.a.put("android:changeTransform:transforms", new bgb(view));
            Matrix matrix = view.getMatrix();
            Object obj = null;
            if (!(matrix == null || matrix.isIdentity())) {
                obj = new Matrix(matrix);
            }
            bhn.a.put("android:changeTransform:matrix", obj);
            if (this.x) {
                matrix = new Matrix();
                View view2 = (ViewGroup) view.getParent();
                bht.a(view2, matrix);
                matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                bhn.a.put("android:changeTransform:parentMatrix", matrix);
                bhn.a.put("android:changeTransform:intermediateMatrix", view.getTag(R.id.transition_transform));
                bhn.a.put("android:changeTransform:intermediateParentMatrix", view.getTag(R.id.parent_matrix));
            }
        }
    }

    public final void a(bhn bhn) {
        d(bhn);
        if (!w) {
            ((ViewGroup) bhn.b.getParent()).startViewTransition(bhn.b);
        }
    }

    public final void b(bhn bhn) {
        d(bhn);
    }

    /* JADX WARNING: Removed duplicated region for block: B:191:0x0395 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0330 A:{SYNTHETIC, Splitter:B:132:0x0330} */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0395 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0330 A:{SYNTHETIC, Splitter:B:132:0x0330} */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0395 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x035d  */
    /* JADX WARNING: Missing block: B:16:0x0048, code skipped:
            if (r1 == r2.b) goto L_0x0051;
     */
    /* JADX WARNING: Missing block: B:17:0x004b, code skipped:
            if (r13 == r1) goto L_0x0051;
     */
    /* JADX WARNING: Missing block: B:153:0x0392, code skipped:
            if (r3.size() == r6) goto L_0x039f;
     */
    public final android.animation.Animator a(android.view.ViewGroup r25, defpackage.bhn r26, defpackage.bhn r27) {
        /*
        r24 = this;
        r8 = r24;
        r0 = r25;
        r9 = r26;
        r10 = r27;
        if (r9 == 0) goto L_0x042b;
    L_0x000a:
        if (r10 == 0) goto L_0x042b;
    L_0x000c:
        r1 = r9.a;
        r12 = "android:changeTransform:parent";
        r1 = r1.containsKey(r12);
        if (r1 == 0) goto L_0x042b;
    L_0x0016:
        r1 = r10.a;
        r1 = r1.containsKey(r12);
        if (r1 == 0) goto L_0x042b;
    L_0x001e:
        r1 = r9.a;
        r1 = r1.get(r12);
        r13 = r1;
        r13 = (android.view.ViewGroup) r13;
        r1 = r10.a;
        r1 = r1.get(r12);
        r1 = (android.view.ViewGroup) r1;
        r2 = r8.x;
        r15 = 1;
        if (r2 == 0) goto L_0x0051;
    L_0x0034:
        r2 = r8.b(r13);
        if (r2 == 0) goto L_0x004b;
    L_0x003a:
        r2 = r8.b(r1);
        if (r2 == 0) goto L_0x004b;
    L_0x0040:
        r2 = r8.b(r13, r15);
        if (r2 == 0) goto L_0x004e;
    L_0x0046:
        r2 = r2.b;
        if (r1 != r2) goto L_0x004e;
    L_0x004a:
        goto L_0x0051;
    L_0x004b:
        if (r13 != r1) goto L_0x004e;
    L_0x004d:
        goto L_0x0051;
    L_0x004e:
        r16 = 1;
        goto L_0x0053;
    L_0x0051:
        r16 = 0;
    L_0x0053:
        r1 = r9.a;
        r2 = "android:changeTransform:intermediateMatrix";
        r1 = r1.get(r2);
        r1 = (android.graphics.Matrix) r1;
        r2 = "android:changeTransform:matrix";
        if (r1 == 0) goto L_0x0066;
    L_0x0061:
        r3 = r9.a;
        r3.put(r2, r1);
    L_0x0066:
        r1 = r9.a;
        r3 = "android:changeTransform:intermediateParentMatrix";
        r1 = r1.get(r3);
        r1 = (android.graphics.Matrix) r1;
        r7 = "android:changeTransform:parentMatrix";
        if (r1 == 0) goto L_0x0079;
    L_0x0074:
        r3 = r9.a;
        r3.put(r7, r1);
    L_0x0079:
        if (r16 != 0) goto L_0x007c;
    L_0x007b:
        goto L_0x00b6;
    L_0x007c:
        r1 = r10.a;
        r1 = r1.get(r7);
        r1 = (android.graphics.Matrix) r1;
        r3 = r10.b;
        r4 = 2131755139; // 0x7f100083 float:1.9141149E38 double:1.0532269795E-314;
        r3.setTag(r4, r1);
        r3 = r8.y;
        r3.reset();
        r1.invert(r3);
        r1 = r9.a;
        r1 = r1.get(r2);
        r1 = (android.graphics.Matrix) r1;
        if (r1 != 0) goto L_0x00a8;
    L_0x009e:
        r1 = new android.graphics.Matrix;
        r1.<init>();
        r4 = r9.a;
        r4.put(r2, r1);
    L_0x00a8:
        r4 = r9.a;
        r4 = r4.get(r7);
        r4 = (android.graphics.Matrix) r4;
        r1.postConcat(r4);
        r1.postConcat(r3);
    L_0x00b6:
        r1 = r9.a;
        r1 = r1.get(r2);
        r1 = (android.graphics.Matrix) r1;
        r3 = r10.a;
        r2 = r3.get(r2);
        r2 = (android.graphics.Matrix) r2;
        if (r1 != 0) goto L_0x00ca;
    L_0x00c8:
        r1 = defpackage.bgo.a;
    L_0x00ca:
        if (r2 != 0) goto L_0x00ce;
    L_0x00cc:
        r2 = defpackage.bgo.a;
    L_0x00ce:
        r4 = r2;
        r2 = r1.equals(r4);
        r5 = 2;
        if (r2 != 0) goto L_0x0166;
    L_0x00d6:
        r2 = r10.a;
        r3 = "android:changeTransform:transforms";
        r2 = r2.get(r3);
        r17 = r2;
        r17 = (defpackage.bgb) r17;
        r3 = r10.b;
        defpackage.bfv.a(r3);
        r2 = 9;
        r11 = new float[r2];
        r1.getValues(r11);
        r1 = new float[r2];
        r4.getValues(r1);
        r6 = new bfy;
        r6.<init>(r3, r11);
        r15 = u;
        r14 = new bgf;
        r2 = new float[r2];
        r14.<init>(r2);
        r2 = new float[r5][];
        r21 = 0;
        r2[r21] = r11;
        r20 = 1;
        r2[r20] = r1;
        r2 = android.animation.PropertyValuesHolder.ofObject(r15, r14, r2);
        r14 = r8.s;
        r15 = r11[r5];
        r22 = 5;
        r11 = r11[r22];
        r23 = r3;
        r3 = r1[r5];
        r1 = r1[r22];
        r1 = r14.a(r15, r11, r3, r1);
        r3 = v;
        r11 = android.os.Build.VERSION.SDK_INT;
        r14 = 21;
        if (r11 < r14) goto L_0x012f;
    L_0x0129:
        r11 = 0;
        r1 = android.animation.PropertyValuesHolder.ofObject(r3, r11, r1);
        goto L_0x013d;
    L_0x012f:
        r11 = new bgs;
        r11.<init>(r3, r1);
        r1 = new float[r5];
        r1 = {0, 1065353216};
        r1 = android.animation.PropertyValuesHolder.ofFloat(r11, r1);
    L_0x013d:
        r3 = new android.animation.PropertyValuesHolder[r5];
        r11 = 0;
        r3[r11] = r2;
        r2 = 1;
        r3[r2] = r1;
        r11 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r6, r3);
        r15 = new bfw;
        r1 = r15;
        r2 = r24;
        r19 = r23;
        r3 = r16;
        r14 = 2;
        r5 = r19;
        r19 = r6;
        r6 = r17;
        r14 = r7;
        r7 = r19;
        r1.<init>(r2, r3, r4, r5, r6, r7);
        r11.addListener(r15);
        r11.addPauseListener(r15);
        goto L_0x0168;
    L_0x0166:
        r14 = r7;
        r11 = 0;
    L_0x0168:
        if (r16 != 0) goto L_0x016e;
    L_0x016a:
        r19 = r11;
        goto L_0x0421;
    L_0x016e:
        if (r11 == 0) goto L_0x016a;
    L_0x0170:
        r1 = r8.a;
        if (r1 == 0) goto L_0x016a;
    L_0x0174:
        r1 = r10.b;
        r2 = r10.a;
        r2 = r2.get(r14);
        r2 = (android.graphics.Matrix) r2;
        r3 = new android.graphics.Matrix;
        r3.<init>(r2);
        defpackage.bht.b(r0, r3);
        r2 = android.os.Build.VERSION.SDK_INT;
        r4 = 28;
        if (r2 < r4) goto L_0x01ee;
    L_0x018c:
        r2 = defpackage.bgn.c;
        r4 = 3;
        if (r2 != 0) goto L_0x01b5;
    L_0x0191:
        defpackage.bgn.a();	 Catch:{ NoSuchMethodException -> 0x01b2 }
        r2 = defpackage.bgn.a;	 Catch:{ NoSuchMethodException -> 0x01b2 }
        r5 = "addGhost";
        r6 = new java.lang.Class[r4];	 Catch:{ NoSuchMethodException -> 0x01b2 }
        r7 = android.view.View.class;
        r13 = 0;
        r6[r13] = r7;	 Catch:{ NoSuchMethodException -> 0x01b2 }
        r7 = android.view.ViewGroup.class;
        r13 = 1;
        r6[r13] = r7;	 Catch:{ NoSuchMethodException -> 0x01b2 }
        r7 = android.graphics.Matrix.class;
        r14 = 2;
        r6[r14] = r7;	 Catch:{ NoSuchMethodException -> 0x01b2 }
        r2 = r2.getDeclaredMethod(r5, r6);	 Catch:{ NoSuchMethodException -> 0x01b2 }
        defpackage.bgn.b = r2;	 Catch:{ NoSuchMethodException -> 0x01b2 }
        r2.setAccessible(r13);	 Catch:{ NoSuchMethodException -> 0x01b2 }
    L_0x01b2:
        r2 = 1;
        defpackage.bgn.c = r2;
    L_0x01b5:
        r2 = defpackage.bgn.b;
        if (r2 == 0) goto L_0x01e5;
    L_0x01b9:
        r2 = new bgn;	 Catch:{ IllegalAccessException -> 0x01e5, InvocationTargetException -> 0x01da }
        r5 = defpackage.bgn.b;	 Catch:{ IllegalAccessException -> 0x01e5, InvocationTargetException -> 0x01da }
        r4 = new java.lang.Object[r4];	 Catch:{ IllegalAccessException -> 0x01e5, InvocationTargetException -> 0x01da }
        r6 = 0;
        r4[r6] = r1;	 Catch:{ IllegalAccessException -> 0x01e5, InvocationTargetException -> 0x01da }
        r6 = 1;
        r4[r6] = r0;	 Catch:{ IllegalAccessException -> 0x01e5, InvocationTargetException -> 0x01da }
        r0 = 2;
        r4[r0] = r3;	 Catch:{ IllegalAccessException -> 0x01e5, InvocationTargetException -> 0x01da }
        r0 = 0;
        r3 = r5.invoke(r0, r4);	 Catch:{ IllegalAccessException -> 0x01e5, InvocationTargetException -> 0x01da }
        r3 = (android.view.View) r3;	 Catch:{ IllegalAccessException -> 0x01e5, InvocationTargetException -> 0x01da }
        r2.<init>(r3);	 Catch:{ IllegalAccessException -> 0x01e5, InvocationTargetException -> 0x01da }
        r22 = r1;
        r19 = r11;
        r23 = r12;
        goto L_0x03de;
    L_0x01da:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r0 = r0.getCause();
        r1.<init>(r0);
        throw r1;
    L_0x01e5:
        r22 = r1;
        r19 = r11;
        r23 = r12;
        r2 = 0;
        goto L_0x03de;
    L_0x01ee:
        r2 = r1.getParent();
        r2 = r2 instanceof android.view.ViewGroup;
        if (r2 == 0) goto L_0x0419;
    L_0x01f6:
        r2 = 2131755102; // 0x7f10005e float:1.9141074E38 double:1.053226961E-314;
        r2 = r0.getTag(r2);
        r2 = (defpackage.bgk) r2;
        r4 = defpackage.bgm.a(r1);
        if (r4 == 0) goto L_0x0214;
    L_0x0205:
        r5 = r4.getParent();
        r5 = (defpackage.bgk) r5;
        if (r5 == r2) goto L_0x0214;
    L_0x020d:
        r14 = r4.d;
        r5.removeView(r4);
        r4 = 0;
        goto L_0x0215;
    L_0x0214:
        r14 = 0;
    L_0x0215:
        if (r4 != 0) goto L_0x03ce;
    L_0x0217:
        r4 = new bgm;
        r4.<init>(r1);
        r4.e = r3;
        if (r2 == 0) goto L_0x023f;
    L_0x0220:
        r3 = r2.b;
        if (r3 == 0) goto L_0x0237;
    L_0x0224:
        r3 = r2.a;
        r3 = defpackage.bhr.a(r3);
        r3.b(r2);
        r3 = r2.a;
        r3 = defpackage.bhr.a(r3);
        r3.a(r2);
        goto L_0x0244;
    L_0x0237:
        r0 = new java.lang.IllegalStateException;
        r1 = "This GhostViewHolder is detached!";
        r0.<init>(r1);
        throw r0;
    L_0x023f:
        r2 = new bgk;
        r2.<init>(r0);
    L_0x0244:
        defpackage.bgm.a(r0, r2);
        defpackage.bgm.a(r0, r4);
        r0 = new java.util.ArrayList;
        r0.<init>();
        r3 = r4.c;
        defpackage.bgk.a(r3, r0);
        r3 = new java.util.ArrayList;
        r3.<init>();
        r5 = r2.getChildCount();
        r5 = r5 + -1;
        r6 = r5;
        r5 = 0;
    L_0x0261:
        if (r5 > r6) goto L_0x03b5;
    L_0x0263:
        r7 = r5 + r6;
        r13 = 2;
        r7 = r7 / r13;
        r13 = r2.getChildAt(r7);
        r13 = (defpackage.bgm) r13;
        r13 = r13.c;
        defpackage.bgk.a(r13, r3);
        r13 = r0.isEmpty();
        if (r13 == 0) goto L_0x0287;
    L_0x0278:
        r25 = r0;
        r22 = r1;
        r16 = r6;
    L_0x027e:
        r19 = r11;
    L_0x0280:
        r23 = r12;
        r10 = 2;
        r17 = 0;
        goto L_0x039f;
    L_0x0287:
        r13 = r3.isEmpty();
        if (r13 != 0) goto L_0x0278;
    L_0x028d:
        r13 = 0;
        r15 = r0.get(r13);
        r16 = r6;
        r6 = r3.get(r13);
        if (r15 != r6) goto L_0x0399;
    L_0x029a:
        r6 = r0.size();
        r13 = r3.size();
        r6 = java.lang.Math.min(r6, r13);
        r13 = 1;
    L_0x02a7:
        if (r13 >= r6) goto L_0x0383;
    L_0x02a9:
        r15 = r0.get(r13);
        r15 = (android.view.View) r15;
        r18 = r3.get(r13);
        r25 = r0;
        r0 = r18;
        r0 = (android.view.View) r0;
        if (r15 == r0) goto L_0x0370;
    L_0x02bb:
        r6 = r15.getParent();
        r6 = (android.view.ViewGroup) r6;
        r13 = r6.getChildCount();
        r8 = android.os.Build.VERSION.SDK_INT;
        r19 = r11;
        r11 = 21;
        if (r8 < r11) goto L_0x02ee;
    L_0x02cd:
        r8 = r15.getZ();
        r18 = r0.getZ();
        r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1));
        if (r8 == 0) goto L_0x02ee;
    L_0x02d9:
        r6 = r15.getZ();
        r0 = r0.getZ();
        r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1));
        if (r0 > 0) goto L_0x036c;
    L_0x02e5:
        r22 = r1;
        r23 = r12;
        r10 = 2;
        r17 = 0;
        goto L_0x0395;
    L_0x02ee:
        r8 = 0;
    L_0x02ef:
        if (r8 >= r13) goto L_0x036c;
    L_0x02f1:
        r18 = defpackage.bhr.b;
        if (r18 != 0) goto L_0x0326;
    L_0x02f5:
        r11 = android.view.ViewGroup.class;
        r18 = r13;
        r13 = "getChildDrawingOrder";
        r22 = r1;
        r10 = 2;
        r1 = new java.lang.Class[r10];	 Catch:{ NoSuchMethodException -> 0x0319 }
        r10 = java.lang.Integer.TYPE;	 Catch:{ NoSuchMethodException -> 0x0319 }
        r21 = 0;
        r1[r21] = r10;	 Catch:{ NoSuchMethodException -> 0x0319 }
        r10 = java.lang.Integer.TYPE;	 Catch:{ NoSuchMethodException -> 0x0319 }
        r23 = r12;
        r12 = 1;
        r1[r12] = r10;	 Catch:{ NoSuchMethodException -> 0x0322 }
        r1 = r11.getDeclaredMethod(r13, r1);	 Catch:{ NoSuchMethodException -> 0x0322 }
        defpackage.bhr.a = r1;	 Catch:{ NoSuchMethodException -> 0x0322 }
        r1.setAccessible(r12);	 Catch:{ NoSuchMethodException -> 0x0322 }
        goto L_0x0322;
    L_0x0317:
        r22 = r1;
    L_0x0319:
        r23 = r12;
        goto L_0x0322;
    L_0x031c:
        r22 = r1;
        r23 = r12;
        r18 = r13;
    L_0x0322:
        r1 = 1;
        defpackage.bhr.b = r1;
        goto L_0x032c;
    L_0x0326:
        r22 = r1;
        r23 = r12;
        r18 = r13;
    L_0x032c:
        r1 = defpackage.bhr.a;
        if (r1 == 0) goto L_0x0353;
    L_0x0330:
        r1 = defpackage.bhr.a;	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0353, IllegalAccessException | InvocationTargetException -> 0x0353 }
        r10 = 2;
        r11 = new java.lang.Object[r10];	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0354, IllegalAccessException | InvocationTargetException -> 0x0354 }
        r12 = r6.getChildCount();	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0354, IllegalAccessException | InvocationTargetException -> 0x0354 }
        r12 = java.lang.Integer.valueOf(r12);	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0354, IllegalAccessException | InvocationTargetException -> 0x0354 }
        r17 = 0;
        r11[r17] = r12;	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0356, IllegalAccessException | InvocationTargetException -> 0x0356 }
        r12 = java.lang.Integer.valueOf(r8);	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0356, IllegalAccessException | InvocationTargetException -> 0x0356 }
        r13 = 1;
        r11[r13] = r12;	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0356, IllegalAccessException | InvocationTargetException -> 0x0356 }
        r1 = r1.invoke(r6, r11);	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0356, IllegalAccessException | InvocationTargetException -> 0x0356 }
        r1 = (java.lang.Integer) r1;	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0356, IllegalAccessException | InvocationTargetException -> 0x0356 }
        r1 = r1.intValue();	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0356, IllegalAccessException | InvocationTargetException -> 0x0356 }
        goto L_0x0357;
    L_0x0353:
        r10 = 2;
    L_0x0354:
        r17 = 0;
    L_0x0356:
        r1 = r8;
    L_0x0357:
        r1 = r6.getChildAt(r1);
        if (r1 == r15) goto L_0x0395;
    L_0x035d:
        if (r1 == r0) goto L_0x039f;
    L_0x035f:
        r8 = r8 + 1;
        r10 = r27;
        r13 = r18;
        r1 = r22;
        r12 = r23;
        r11 = 21;
        goto L_0x02ef;
    L_0x036c:
        r22 = r1;
        goto L_0x0280;
    L_0x0370:
        r22 = r1;
        r19 = r11;
        r23 = r12;
        r10 = 2;
        r17 = 0;
        r13 = r13 + 1;
        r8 = r24;
        r0 = r25;
        r10 = r27;
        goto L_0x02a7;
    L_0x0383:
        r25 = r0;
        r22 = r1;
        r19 = r11;
        r23 = r12;
        r10 = 2;
        r17 = 0;
        r0 = r3.size();
        if (r0 != r6) goto L_0x0395;
    L_0x0394:
        goto L_0x039f;
    L_0x0395:
        r7 = r7 + -1;
        r6 = r7;
        goto L_0x03a4;
    L_0x0399:
        r25 = r0;
        r22 = r1;
        goto L_0x027e;
    L_0x039f:
        r7 = r7 + 1;
        r5 = r7;
        r6 = r16;
    L_0x03a4:
        r3.clear();
        r8 = r24;
        r0 = r25;
        r10 = r27;
        r11 = r19;
        r1 = r22;
        r12 = r23;
        goto L_0x0261;
    L_0x03b5:
        r22 = r1;
        r19 = r11;
        r23 = r12;
        if (r5 >= 0) goto L_0x03be;
    L_0x03bd:
        goto L_0x03c8;
    L_0x03be:
        r0 = r2.getChildCount();
        if (r5 >= r0) goto L_0x03c8;
    L_0x03c4:
        r2.addView(r4, r5);
        goto L_0x03cb;
    L_0x03c8:
        r2.addView(r4);
    L_0x03cb:
        r4.d = r14;
        goto L_0x03d6;
    L_0x03ce:
        r22 = r1;
        r19 = r11;
        r23 = r12;
        r4.e = r3;
    L_0x03d6:
        r11 = r4;
        r0 = r11.d;
        r1 = 1;
        r0 = r0 + r1;
        r11.d = r0;
        r2 = r11;
    L_0x03de:
        if (r2 == 0) goto L_0x042a;
    L_0x03e0:
        r0 = r9.a;
        r1 = r23;
        r0 = r0.get(r1);
        r0 = (android.view.ViewGroup) r0;
        r1 = r9.b;
        r2.a(r0, r1);
        r0 = r24;
    L_0x03f1:
        r1 = r0.k;
        if (r1 != 0) goto L_0x0415;
    L_0x03f5:
        r1 = new bfz;
        r3 = r22;
        r1.<init>(r3, r2);
        r0.a(r1);
        r0 = w;
        if (r0 == 0) goto L_0x042a;
    L_0x0403:
        r0 = r9.b;
        r4 = r27;
        r1 = r4.b;
        if (r0 == r1) goto L_0x040f;
    L_0x040b:
        r1 = 0;
        defpackage.bht.a(r0, r1);
    L_0x040f:
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        defpackage.bht.a(r3, r0);
        goto L_0x042a;
    L_0x0415:
        r4 = r27;
        r0 = r1;
        goto L_0x03f1;
    L_0x0419:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "Ghosted views must be parented by a ViewGroup";
        r0.<init>(r1);
        throw r0;
    L_0x0421:
        r0 = w;
        if (r0 != 0) goto L_0x042a;
    L_0x0425:
        r0 = r9.b;
        r13.endViewTransition(r0);
    L_0x042a:
        return r19;
    L_0x042b:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfv.a(android.view.ViewGroup, bhn, bhn):android.animation.Animator");
    }

    static void a(View view) {
        bfv.a(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    static void a(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        abe.e(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    static {
        r0 = new String[3];
        boolean z = false;
        r0[0] = "android:changeTransform:matrix";
        r0[1] = "android:changeTransform:transforms";
        r0[2] = "android:changeTransform:parentMatrix";
        t = r0;
        if (VERSION.SDK_INT >= 21) {
            z = true;
        }
        w = z;
    }
}
