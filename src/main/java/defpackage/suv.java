package defpackage;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;

/* renamed from: suv */
final class suv extends sxt {
    public final WindowManager a;
    public final View b;
    public final int c;
    public final int d;
    private final bbmi e;

    suv(Context context, suq suq, swk swk) {
        this.b = swk.a();
        this.a = (WindowManager) context.getSystemService("window");
        int i = 0;
        this.c = swk.b() != null ? swk.b().intValue() : 0;
        if (swk.c() != null) {
            i = swk.c().intValue();
        }
        this.d = i;
        this.e = bbmi.a(new suy(this, suq));
    }

    public final bbmi a() {
        return this.e;
    }

    /* Access modifiers changed, original: protected|final */
    public final byte[] b() {
        return suv.a(this.a, this.b, this.c, this.d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0074  */
    public static byte[] a(android.view.WindowManager r8, android.view.View r9, int r10, int r11) {
        /*
        r0 = 4;
        r1 = 0;
        r2 = 2;
        r3 = 1;
        if (r8 == 0) goto L_0x0021;
    L_0x0006:
        r1 = new android.util.DisplayMetrics;
        r1.<init>();
        r8 = r8.getDefaultDisplay();
        r8.getMetrics(r1);
        r8 = r1.widthPixels;
        r1 = r1.heightPixels;
        if (r8 != 0) goto L_0x0019;
    L_0x0018:
        goto L_0x0022;
    L_0x0019:
        if (r1 == 0) goto L_0x0022;
    L_0x001b:
        if (r1 <= r8) goto L_0x001f;
    L_0x001d:
        r4 = 4;
        goto L_0x0023;
    L_0x001f:
        r4 = 2;
        goto L_0x0023;
    L_0x0021:
        r8 = 0;
    L_0x0022:
        r4 = 1;
    L_0x0023:
        r5 = defpackage.azul.f;
        r5 = r5.createBuilder();
        r5 = (defpackage.azuk) r5;
        if (r9 != 0) goto L_0x002e;
    L_0x002d:
        goto L_0x0032;
    L_0x002e:
        r10 = r9.getWidth();
    L_0x0032:
        r10 = (float) r10;
        r5.copyOnWrite();
        r6 = r5.instance;
        r6 = (defpackage.azul) r6;
        r7 = r6.a;
        r7 = r7 | r3;
        r6.a = r7;
        r6.b = r10;
        if (r9 != 0) goto L_0x0045;
    L_0x0043:
        r9 = (float) r11;
        goto L_0x004a;
    L_0x0045:
        r9 = r9.getHeight();
        r9 = (float) r9;
    L_0x004a:
        r5.copyOnWrite();
        r10 = r5.instance;
        r10 = (defpackage.azul) r10;
        r11 = r10.a;
        r11 = r11 | r2;
        r10.a = r11;
        r10.c = r9;
        r9 = defpackage.aztu.c;
        r9 = r9.createBuilder();
        r9 = (defpackage.aztx) r9;
        r9.a(r4);
        r9 = r9.build();
        r9 = (defpackage.anxl) r9;
        r9 = (defpackage.aztu) r9;
        r5.copyOnWrite();
        r10 = r5.instance;
        r10 = (defpackage.azul) r10;
        if (r9 == 0) goto L_0x00cd;
    L_0x0074:
        r10.d = r9;
        r9 = r10.a;
        r9 = r9 | r0;
        r10.a = r9;
        r9 = defpackage.azvr.d;
        r9 = r9.createBuilder();
        r9 = (defpackage.azvq) r9;
        r9.copyOnWrite();
        r10 = r9.instance;
        r10 = (defpackage.azvr) r10;
        r11 = r10.a;
        r11 = r11 | r3;
        r10.a = r11;
        r8 = (float) r8;
        r10.b = r8;
        r9.copyOnWrite();
        r8 = r9.instance;
        r8 = (defpackage.azvr) r8;
        r10 = r8.a;
        r10 = r10 | r2;
        r8.a = r10;
        r10 = (float) r1;
        r8.c = r10;
        r8 = r9.build();
        r8 = (defpackage.anxl) r8;
        r8 = (defpackage.azvr) r8;
        r5.copyOnWrite();
        r9 = r5.instance;
        r9 = (defpackage.azul) r9;
        if (r8 == 0) goto L_0x00c7;
    L_0x00b2:
        r9.e = r8;
        r8 = r9.a;
        r8 = r8 | 8;
        r9.a = r8;
        r8 = r5.build();
        r8 = (defpackage.anxl) r8;
        r8 = (defpackage.azul) r8;
        r8 = r8.toByteArray();
        return r8;
    L_0x00c7:
        r8 = new java.lang.NullPointerException;
        r8.<init>();
        throw r8;
    L_0x00cd:
        r8 = new java.lang.NullPointerException;
        r8.<init>();
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.suv.a(android.view.WindowManager, android.view.View, int, int):byte[]");
    }
}
