package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;

/* renamed from: cvk */
public final class cvk extends cvl {
    private static final RectF a = new RectF();
    private static final RectF b = new RectF();
    private final cvm c;
    private Paint d;
    private Path e;
    private boolean f;

    private static void a(Canvas canvas, RectF rectF, Path path, float[] fArr, Paint paint) {
        float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
        if (path == null) {
            float min2 = Math.min(min, fArr[0]);
            canvas.drawRoundRect(rectF, min2, min2, paint);
            return;
        }
        if (path.isEmpty()) {
            path.addRoundRect(rectF, fArr, Direction.CW);
        }
        canvas.drawPath(path, paint);
    }

    public final int getOpacity() {
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e9  */
    public final void draw(android.graphics.Canvas r21) {
        /*
        r20 = this;
        r9 = r20;
        r10 = r21;
        r0 = r9.d;
        r1 = 1;
        r2 = 0;
        r11 = 0;
        if (r0 == 0) goto L_0x0011;
    L_0x000b:
        r0 = r9.e;
        if (r0 == 0) goto L_0x0011;
    L_0x000f:
        goto L_0x0084;
    L_0x0011:
        r0 = new android.graphics.Paint;
        r0.<init>();
        r9.d = r0;
        r0 = new android.graphics.Path;
        r0.<init>();
        r9.e = r0;
        r0 = 0;
        r3 = 0;
        r4 = 0;
    L_0x0022:
        r5 = r9.c;
        r5 = r5.j;
        r6 = r5.length;
        if (r0 >= r6) goto L_0x003e;
    L_0x0029:
        r5 = r5[r0];
        r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1));
        if (r7 > 0) goto L_0x0030;
    L_0x002f:
        goto L_0x0031;
    L_0x0030:
        r4 = 1;
    L_0x0031:
        if (r0 == 0) goto L_0x003a;
    L_0x0033:
        r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r5 == 0) goto L_0x003b;
    L_0x0037:
        r9.f = r1;
        goto L_0x003e;
    L_0x003a:
        r3 = r5;
    L_0x003b:
        r0 = r0 + 1;
        goto L_0x0022;
    L_0x003e:
        r0 = r9.f;
        if (r0 != 0) goto L_0x0043;
    L_0x0042:
        goto L_0x0063;
    L_0x0043:
        r0 = 8;
        if (r6 == r0) goto L_0x0063;
    L_0x0047:
        r0 = new float[r0];
        r3 = 0;
    L_0x004a:
        r5 = 4;
        if (r3 >= r5) goto L_0x005f;
    L_0x004d:
        r5 = r3 + r3;
        r6 = r9.c;
        r6 = r6.j;
        r7 = r6[r3];
        r0[r5] = r7;
        r5 = r5 + r1;
        r6 = r6[r3];
        r0[r5] = r6;
        r3 = r3 + 1;
        goto L_0x004a;
    L_0x005f:
        r3 = r9.c;
        r3.j = r0;
    L_0x0063:
        r0 = r9.d;
        r3 = r9.c;
        r3 = r3.i;
        r0.setPathEffect(r3);
        r0 = r9.d;
        r3 = r9.c;
        r3 = r3.i;
        if (r3 == 0) goto L_0x0076;
    L_0x0074:
        r3 = 1;
        goto L_0x007a;
    L_0x0076:
        if (r4 == 0) goto L_0x0079;
    L_0x0078:
        goto L_0x0074;
    L_0x0079:
        r3 = 0;
    L_0x007a:
        r0.setAntiAlias(r3);
        r0 = r9.d;
        r3 = android.graphics.Paint.Style.STROKE;
        r0.setStyle(r3);
    L_0x0084:
        r0 = r9.c;
        r3 = r0.e;
        r4 = r0.f;
        if (r3 != r4) goto L_0x0097;
    L_0x008c:
        r5 = r0.g;
        if (r4 != r5) goto L_0x0097;
    L_0x0090:
        r4 = r0.h;
        if (r5 == r4) goto L_0x0095;
    L_0x0094:
        goto L_0x0097;
    L_0x0095:
        r4 = 1;
        goto L_0x0098;
    L_0x0097:
        r4 = 0;
    L_0x0098:
        r5 = r0.a;
        r6 = r0.b;
        r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r7 != 0) goto L_0x00ae;
    L_0x00a0:
        r7 = r0.c;
        r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r6 != 0) goto L_0x00ae;
    L_0x00a6:
        r0 = r0.d;
        r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1));
        if (r0 == 0) goto L_0x00ad;
    L_0x00ac:
        goto L_0x00ae;
    L_0x00ad:
        r2 = 1;
    L_0x00ae:
        if (r2 == 0) goto L_0x00b6;
    L_0x00b0:
        r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1));
        if (r0 == 0) goto L_0x00b5;
    L_0x00b4:
        goto L_0x00b6;
    L_0x00b5:
        return;
    L_0x00b6:
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r2 == 0) goto L_0x00e7;
    L_0x00ba:
        if (r4 == 0) goto L_0x00e7;
    L_0x00bc:
        r0 = r5 / r0;
        r1 = b;
        r2 = r20.getBounds();
        r1.set(r2);
        r1 = b;
        r1.inset(r0, r0);
        r0 = r9.d;
        r0.setStrokeWidth(r5);
        r0 = r9.d;
        r0.setColor(r3);
        r0 = b;
        r1 = r20.a();
        r2 = r9.c;
        r2 = r2.j;
        r3 = r9.d;
        defpackage.cvk.a(r10, r0, r1, r2, r3);
        goto L_0x0308;
    L_0x00e7:
        if (r2 == 0) goto L_0x0254;
    L_0x00e9:
        r5 = r5 / r0;
        r1 = b;
        r2 = r20.getBounds();
        r1.set(r2);
        r6 = r21.save();
        r1 = b;
        r1 = r1.left;
        r2 = b;
        r2 = r2.top;
        r10.translate(r1, r2);
        r1 = b;
        r1.offsetTo(r11, r11);
        r1 = r9.d;
        r2 = r9.c;
        r2 = r2.a;
        r1.setStrokeWidth(r2);
        r1 = b;
        r1 = r1.height();
        r7 = java.lang.Math.round(r1);
        r1 = b;
        r1 = r1.width();
        r8 = java.lang.Math.round(r1);
        r12 = (float) r7;
        r0 = r12 / r0;
        r1 = r0 + r0;
        r1 = r1 * r0;
        r0 = (double) r1;
        r0 = java.lang.Math.sqrt(r0);
        r0 = java.lang.Math.round(r0);
        r13 = (int) r0;
        r0 = b;
        r0.inset(r5, r5);
        r0 = r9.c;
        r0 = r0.e;
        r14 = -1036779520; // 0xffffffffc2340000 float:-45.0 double:NaN;
        r15 = 1110704128; // 0x42340000 float:45.0 double:5.487607523E-315;
        if (r0 == 0) goto L_0x016d;
    L_0x0144:
        r0 = r21.save();
        r10.rotate(r15, r11, r11);
        r1 = (float) r13;
        r10.clipRect(r11, r11, r1, r1);
        r10.rotate(r14, r11, r11);
        r1 = r9.d;
        r2 = r9.c;
        r2 = r2.e;
        r1.setColor(r2);
        r1 = b;
        r2 = r20.a();
        r3 = r9.c;
        r3 = r3.j;
        r4 = r9.d;
        defpackage.cvk.a(r10, r1, r2, r3, r4);
        r10.restoreToCount(r0);
    L_0x016d:
        r0 = r9.c;
        r0 = r0.g;
        if (r0 == 0) goto L_0x01a0;
    L_0x0173:
        r0 = r21.save();
        r1 = (float) r8;
        r10.rotate(r14, r1, r11);
        r2 = r8 - r13;
        r2 = (float) r2;
        r3 = (float) r13;
        r10.clipRect(r2, r11, r1, r3);
        r10.rotate(r15, r1, r11);
        r1 = r9.d;
        r2 = r9.c;
        r2 = r2.g;
        r1.setColor(r2);
        r1 = b;
        r2 = r20.a();
        r3 = r9.c;
        r3 = r3.j;
        r4 = r9.d;
        defpackage.cvk.a(r10, r1, r2, r3, r4);
        r10.restoreToCount(r0);
    L_0x01a0:
        r0 = r9.c;
        r0 = r0.f;
        if (r0 == 0) goto L_0x01fc;
    L_0x01a6:
        r5 = r21.save();
        r10.rotate(r14, r11, r11);
        r4 = (float) r13;
        r10.clipRect(r11, r11, r4, r4);
        r10.rotate(r15, r11, r11);
        r3 = (float) r8;
        r10.rotate(r15, r3, r11);
        r0 = r8 - r13;
        r2 = (float) r0;
        r16 = 0;
        r17 = android.graphics.Region.Op.UNION;
        r0 = r21;
        r1 = r2;
        r18 = r2;
        r2 = r16;
        r16 = r3;
        r19 = r4;
        r15 = r5;
        r5 = r17;
        r0.clipRect(r1, r2, r3, r4, r5);
        r0 = r16;
        r10.rotate(r14, r0, r11);
        r2 = 0;
        r5 = android.graphics.Region.Op.UNION;
        r0 = r21;
        r1 = r19;
        r3 = r18;
        r0.clipRect(r1, r2, r3, r4, r5);
        r0 = r9.d;
        r1 = r9.c;
        r1 = r1.f;
        r0.setColor(r1);
        r0 = b;
        r1 = r20.a();
        r2 = r9.c;
        r2 = r2.j;
        r3 = r9.d;
        defpackage.cvk.a(r10, r0, r1, r2, r3);
        r10.restoreToCount(r15);
    L_0x01fc:
        r0 = r9.c;
        r0 = r0.h;
        if (r0 == 0) goto L_0x0250;
    L_0x0202:
        r15 = r21.save();
        r0 = 1110704128; // 0x42340000 float:45.0 double:5.487607523E-315;
        r10.rotate(r0, r11, r12);
        r7 = r7 - r13;
        r7 = (float) r7;
        r5 = (float) r13;
        r10.clipRect(r11, r7, r5, r12);
        r10.rotate(r14, r11, r12);
        r11 = (float) r8;
        r10.rotate(r14, r11, r12);
        r8 = r8 - r13;
        r8 = (float) r8;
        r13 = android.graphics.Region.Op.UNION;
        r0 = r21;
        r1 = r8;
        r2 = r7;
        r3 = r11;
        r4 = r12;
        r14 = r5;
        r5 = r13;
        r0.clipRect(r1, r2, r3, r4, r5);
        r0 = 1110704128; // 0x42340000 float:45.0 double:5.487607523E-315;
        r10.rotate(r0, r11, r12);
        r5 = android.graphics.Region.Op.UNION;
        r0 = r21;
        r1 = r14;
        r3 = r8;
        r0.clipRect(r1, r2, r3, r4, r5);
        r0 = r9.d;
        r1 = r9.c;
        r1 = r1.h;
        r0.setColor(r1);
        r0 = b;
        r1 = r20.a();
        r2 = r9.c;
        r2 = r2.j;
        r3 = r9.d;
        defpackage.cvk.a(r10, r0, r1, r2, r3);
        r10.restoreToCount(r15);
    L_0x0250:
        r10.restoreToCount(r6);
        return;
    L_0x0254:
        r12 = r20.getBounds();
        r0 = r9.c;
        r3 = r0.a;
        r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1));
        if (r1 <= 0) goto L_0x0284;
    L_0x0260:
        r2 = r0.e;
        if (r2 == 0) goto L_0x0284;
    L_0x0264:
        r0 = r12.left;
        r4 = (float) r0;
        r0 = r12.top;
        r5 = (float) r0;
        r0 = r12.left;
        r0 = (float) r0;
        r1 = r9.c;
        r1 = r1.a;
        r0 = r0 + r1;
        r1 = r12.right;
        r1 = (float) r1;
        r6 = java.lang.Math.min(r0, r1);
        r0 = r12.bottom;
        r7 = (float) r0;
        r8 = 1;
        r0 = r20;
        r1 = r21;
        r0.a(r1, r2, r3, r4, r5, r6, r7, r8);
    L_0x0284:
        r0 = r9.c;
        r3 = r0.c;
        r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1));
        if (r1 <= 0) goto L_0x02b0;
    L_0x028c:
        r2 = r0.g;
        if (r2 == 0) goto L_0x02b0;
    L_0x0290:
        r0 = r12.right;
        r0 = (float) r0;
        r1 = r9.c;
        r1 = r1.c;
        r0 = r0 - r1;
        r1 = r12.left;
        r1 = (float) r1;
        r4 = java.lang.Math.max(r0, r1);
        r0 = r12.top;
        r5 = (float) r0;
        r0 = r12.right;
        r6 = (float) r0;
        r0 = r12.bottom;
        r7 = (float) r0;
        r8 = 1;
        r0 = r20;
        r1 = r21;
        r0.a(r1, r2, r3, r4, r5, r6, r7, r8);
    L_0x02b0:
        r0 = r9.c;
        r3 = r0.b;
        r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1));
        if (r1 <= 0) goto L_0x02dc;
    L_0x02b8:
        r2 = r0.f;
        if (r2 == 0) goto L_0x02dc;
    L_0x02bc:
        r0 = r12.left;
        r4 = (float) r0;
        r0 = r12.top;
        r5 = (float) r0;
        r0 = r12.right;
        r6 = (float) r0;
        r0 = r12.top;
        r0 = (float) r0;
        r1 = r9.c;
        r1 = r1.b;
        r0 = r0 + r1;
        r1 = r12.bottom;
        r1 = (float) r1;
        r7 = java.lang.Math.min(r0, r1);
        r8 = 0;
        r0 = r20;
        r1 = r21;
        r0.a(r1, r2, r3, r4, r5, r6, r7, r8);
    L_0x02dc:
        r0 = r9.c;
        r3 = r0.d;
        r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1));
        if (r1 <= 0) goto L_0x0308;
    L_0x02e4:
        r2 = r0.h;
        if (r2 == 0) goto L_0x0308;
    L_0x02e8:
        r0 = r12.left;
        r4 = (float) r0;
        r0 = r12.bottom;
        r0 = (float) r0;
        r1 = r9.c;
        r1 = r1.d;
        r0 = r0 - r1;
        r1 = r12.top;
        r1 = (float) r1;
        r5 = java.lang.Math.max(r0, r1);
        r0 = r12.right;
        r6 = (float) r0;
        r0 = r12.bottom;
        r7 = (float) r0;
        r8 = 0;
        r0 = r20;
        r1 = r21;
        r0.a(r1, r2, r3, r4, r5, r6, r7, r8);
    L_0x0308:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvk.draw(android.graphics.Canvas):void");
    }

    private final void a(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5, boolean z) {
        this.d.setStrokeWidth(f);
        this.d.setColor(i);
        a.set(f2, f3, f4, f5);
        b.set(getBounds());
        if (z) {
            b.inset(a.centerX() - a.left, 0.0f);
        } else {
            b.inset(0.0f, a.centerY() - a.top);
        }
        i = canvas.save();
        canvas.clipRect(a);
        cvk.a(canvas, b, a(), this.c.j, this.d);
        canvas.restoreToCount(i);
    }

    private final Path a() {
        return this.f ? this.e : null;
    }

    public final void setAlpha(int i) {
        Paint paint = this.d;
        if (paint != null) {
            paint.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.d;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    public final boolean a(cvl cvl) {
        return equals(cvl);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvk)) {
            return false;
        }
        return clx.a(this.c, ((cvk) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public /* synthetic */ cvk(cvm cvm) {
        this.c = cvm;
    }
}
