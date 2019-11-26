package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* renamed from: zkm */
final class zkm extends Handler {
    private final WeakReference a;

    zkm(Looper looper, zkk zkk) {
        super(looper);
        this.a = new WeakReference(zkk);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:122:0x01f2 */
    /* JADX WARNING: Failed to process nested try/catch */
    public final void handleMessage(android.os.Message r8) {
        /*
        r7 = this;
        r0 = r7.a;
        r0 = r0.get();
        r0 = (defpackage.zkk) r0;
        if (r0 != 0) goto L_0x0010;
    L_0x000a:
        r8 = "handleMessage: glThreadReference is Null!";
        defpackage.xtl.c(r8);
        return;
    L_0x0010:
        r1 = r8.what;
        r2 = 21;
        r3 = 1;
        r4 = 0;
        r5 = 0;
        switch(r1) {
            case 1: goto L_0x02a3;
            case 2: goto L_0x0289;
            case 3: goto L_0x01fe;
            case 4: goto L_0x01eb;
            case 5: goto L_0x016b;
            case 6: goto L_0x013c;
            case 7: goto L_0x010c;
            case 8: goto L_0x00de;
            case 9: goto L_0x00b4;
            case 10: goto L_0x008c;
            case 11: goto L_0x0072;
            case 12: goto L_0x005c;
            case 13: goto L_0x0047;
            case 14: goto L_0x003c;
            case 15: goto L_0x0031;
            default: goto L_0x001a;
        };
    L_0x001a:
        r8 = r8.toString();
        r8 = java.lang.String.valueOf(r8);
        r0 = "Unhandled message: ";
        r1 = r8.length();
        if (r1 != 0) goto L_0x02c5;
    L_0x002a:
        r8 = new java.lang.String;
        r8.<init>(r0);
        goto L_0x02c9;
    L_0x0031:
        r8 = r8.obj;
        r8 = (java.lang.Float) r8;
        r8 = r8.floatValue();
        r0.t = r8;
        return;
    L_0x003c:
        r8 = r8.obj;
        r8 = (java.lang.Integer) r8;
        r8 = r8.intValue();
        r0.s = r8;
        return;
    L_0x0047:
        r8 = r8.obj;
        r8 = (java.lang.String) r8;
        r1 = r0.F;
        r8 = defpackage.zjt.a(r1, r8);
        if (r8 == 0) goto L_0x0058;
    L_0x0053:
        r1 = r0.n;
        r1.add(r8);
    L_0x0058:
        r0.b();
        return;
    L_0x005c:
        r8 = r8.obj;
        r8 = (android.graphics.Bitmap) r8;
        r0.m = r8;
        r8 = r0.n;
        r8.clear();
        r8 = r0.n;
        r1 = r0.F;
        r8.addAll(r1);
        r0.b();
        return;
    L_0x0072:
        r8 = r8.obj;
        r8 = (java.lang.Boolean) r8;
        r8 = r8.booleanValue();
        r8 = r0.a(r8);
        if (r8 == 0) goto L_0x008b;
    L_0x0080:
        r8 = r0.L;
        if (r8 == 0) goto L_0x008b;
    L_0x0084:
        r0 = java.lang.System.currentTimeMillis();
        r8.a(r0);
    L_0x008b:
        return;
    L_0x008c:
        r8 = r8.obj;
        r8 = (android.graphics.SurfaceTexture) r8;
        r1 = r0.O;
        if (r1 == 0) goto L_0x0099;
    L_0x0094:
        r1 = android.os.Build.VERSION.SDK_INT;
        if (r1 < r2) goto L_0x0099;
    L_0x0098:
        goto L_0x00a0;
    L_0x0099:
        r1 = r0.c;
        if (r1 == 0) goto L_0x00b3;
    L_0x009d:
        r8.updateTexImage();
    L_0x00a0:
        r0.r = r3;
        r8 = r0.a(r5);
        if (r8 == 0) goto L_0x00b3;
    L_0x00a8:
        r8 = r0.L;
        if (r8 == 0) goto L_0x00b3;
    L_0x00ac:
        r0 = java.lang.System.currentTimeMillis();
        r8.a(r0);
    L_0x00b3:
        return;
    L_0x00b4:
        r8 = r8.obj;
        r8 = (java.lang.Integer) r8;
        r8 = r8.intValue();
        r1 = r0.K;
        r3 = 0;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 == 0) goto L_0x00db;
    L_0x00c4:
        r0 = new java.lang.StringBuilder;
        r1 = 48;
        r0.<init>(r1);
        r1 = "Ignoring setMaxProcessingResolution: ";
        r0.append(r1);
        r0.append(r8);
        r8 = r0.toString();
        defpackage.xtl.d(r8);
        return;
    L_0x00db:
        r0.j = r8;
        return;
    L_0x00de:
        r1 = r8.arg1;
        r8 = r8.arg2;
        if (r1 <= 0) goto L_0x00e6;
    L_0x00e4:
        r2 = 1;
        goto L_0x00e7;
    L_0x00e6:
        r2 = 0;
    L_0x00e7:
        defpackage.amqw.a(r2);
        if (r8 <= 0) goto L_0x00ed;
    L_0x00ec:
        goto L_0x00ee;
    L_0x00ed:
        r3 = 0;
    L_0x00ee:
        defpackage.amqw.a(r3);
        r2 = r0.A;
        if (r2 != r1) goto L_0x00f9;
    L_0x00f5:
        r2 = r0.B;
        if (r2 == r8) goto L_0x010b;
    L_0x00f9:
        r0.A = r1;
        r0.B = r8;
        r8 = r0.y;
        if (r8 == 0) goto L_0x0104;
    L_0x0101:
        r0.d();
    L_0x0104:
        r8 = r0.c;
        if (r8 == 0) goto L_0x010b;
    L_0x0108:
        r0.b();
    L_0x010b:
        return;
    L_0x010c:
        r1 = r8.obj;
        r1 = (defpackage.ayx) r1;
        r2 = r8.arg1;
        r8 = r8.arg2;
        if (r1 != 0) goto L_0x0117;
    L_0x0116:
        goto L_0x0121;
    L_0x0117:
        r6 = r0.c;
        if (r6 == 0) goto L_0x0121;
    L_0x011b:
        r6 = r0.z;
        if (r6 != 0) goto L_0x0120;
    L_0x011f:
        goto L_0x0121;
    L_0x0120:
        r3 = 0;
    L_0x0121:
        defpackage.amqw.b(r3);
        r0.f();
        if (r1 == 0) goto L_0x013b;
    L_0x0129:
        r1.a(r2, r8);	 Catch:{ RuntimeException -> 0x0133 }
        r8 = defpackage.zkd.a(r1);	 Catch:{ RuntimeException -> 0x0133 }
        r0.z = r8;	 Catch:{ RuntimeException -> 0x0133 }
        goto L_0x013b;
    L_0x0133:
        r8 = move-exception;
        r1 = "internalSetOutputTarget: forTexture failed: ";
        defpackage.xtl.a(r1, r8);
        r0.z = r4;
    L_0x013b:
        return;
    L_0x013c:
        r8 = r8.obj;
        r8 = (android.graphics.SurfaceTexture) r8;
        r1 = java.lang.String.valueOf(r8);
        r1.length();
        if (r8 == 0) goto L_0x0151;
    L_0x0149:
        r1 = r0.y;
        r1 = r8.equals(r1);
        if (r1 != 0) goto L_0x016a;
    L_0x0151:
        r0.f();
        r0.y = r8;
        r8 = r0.y;
        if (r8 != 0) goto L_0x015f;
    L_0x015a:
        r0.A = r5;
        r0.B = r5;
        goto L_0x016a;
    L_0x015f:
        r8 = r0.A;
        if (r8 <= 0) goto L_0x016a;
    L_0x0163:
        r8 = r0.B;
        if (r8 <= 0) goto L_0x016a;
    L_0x0167:
        r0.d();
    L_0x016a:
        return;
    L_0x016b:
        r8 = r0.E;
        r8.e();
        r8 = r0.h;	 Catch:{ RuntimeException -> 0x0176 }
        r8.b();	 Catch:{ RuntimeException -> 0x0176 }
        goto L_0x017c;
    L_0x0176:
        r8 = move-exception;
        r1 = "internalTearDown: focus failed: ";
        defpackage.xtl.a(r1, r8);
    L_0x017c:
        r0.f();
        r8 = r0.w;
        r8 = r8.iterator();
    L_0x0185:
        r1 = r8.hasNext();
        if (r1 == 0) goto L_0x0197;
    L_0x018b:
        r1 = r8.next();
        r1 = (defpackage.zkn) r1;
        if (r1 == 0) goto L_0x0185;
    L_0x0193:
        r1.a();
        goto L_0x0185;
    L_0x0197:
        r8 = r0.x;
        defpackage.zkk.a(r8);
        r0.x = r4;
        r8 = r0.u;
        defpackage.zkk.a(r8);
        r0.u = r4;
        r8 = r0.v;
        defpackage.zkk.a(r8);
        r0.v = r4;
        r8 = r0.p;
        defpackage.zkk.a(r8);
        r0.p = r4;
        r8 = r0.q;
        if (r8 == 0) goto L_0x01c3;
    L_0x01b7:
        r8.setOnFrameAvailableListener(r4);
        r8 = r0.q;
        r8.release();
        r0.q = r4;
        r0.r = r5;
    L_0x01c3:
        r8 = r0.J;
        if (r8 == 0) goto L_0x01ca;
    L_0x01c7:
        r8.a();
    L_0x01ca:
        defpackage.zkd.c();	 Catch:{ RuntimeException -> 0x01ce }
        goto L_0x01d4;
    L_0x01ce:
        r8 = move-exception;
        r1 = "internalTearDown: focusNone failed: ";
        defpackage.xtl.a(r1, r8);
    L_0x01d4:
        r8 = r0.h;
        if (r8 == 0) goto L_0x01dd;
    L_0x01d8:
        r8.e();
        r0.h = r4;
    L_0x01dd:
        r8 = r0.J;
        if (r8 == 0) goto L_0x01e6;
    L_0x01e1:
        r8.b();
        r0.J = r4;
    L_0x01e6:
        r0.L = r4;
        r0.I = r4;
        return;
    L_0x01eb:
        r0.c = r5;
        r8 = r0.E;	 Catch:{ MediaPipeException -> 0x01f2 }
        r8.c();	 Catch:{ MediaPipeException -> 0x01f2 }
    L_0x01f2:
        r8 = r0.E;	 Catch:{ MediaPipeException -> 0x01f7 }
        r8.d();	 Catch:{ MediaPipeException -> 0x01f7 }
    L_0x01f7:
        r8 = r0.b;
        r0 = 5;
        r8.sendEmptyMessage(r0);
        return;
    L_0x01fe:
        r8 = r0.q;
        r8 = java.lang.String.valueOf(r8);
        r8.length();
        r8 = r0.h;
        r8.b();
        r8 = r0.p;
        if (r8 == 0) goto L_0x0215;
    L_0x0210:
        r1 = r0.q;
        if (r1 == 0) goto L_0x0215;
    L_0x0214:
        goto L_0x0251;
    L_0x0215:
        if (r8 == 0) goto L_0x021a;
    L_0x0217:
        r8.b();
    L_0x021a:
        r8 = new ayx;
        r1 = defpackage.ayv.a();
        r4 = 36197; // 0x8d65 float:5.0723E-41 double:1.78837E-319;
        r8.<init>(r1, r4, r3);
        r0.p = r8;
        r8 = r0.q;
        if (r8 == 0) goto L_0x022f;
    L_0x022c:
        r8.release();
    L_0x022f:
        r8 = new android.graphics.SurfaceTexture;
        r1 = r0.p;
        r1 = r1.a;
        r8.<init>(r1);
        r0.q = r8;
        r0.r = r5;
        r8 = r0.O;
        if (r8 == 0) goto L_0x024c;
    L_0x0240:
        r8 = android.os.Build.VERSION.SDK_INT;
        if (r8 < r2) goto L_0x024c;
    L_0x0244:
        r8 = r0.q;
        r1 = r0.b;
        r8.setOnFrameAvailableListener(r0, r1);
        goto L_0x0251;
    L_0x024c:
        r8 = r0.q;
        r8.setOnFrameAvailableListener(r0);
    L_0x0251:
        r8 = r0.a;
        monitor-enter(r8);
        r1 = r0.f;	 Catch:{ all -> 0x0286 }
        if (r1 == 0) goto L_0x0259;
    L_0x0258:
        goto L_0x026c;
    L_0x0259:
        r1 = r0.c;	 Catch:{ all -> 0x0286 }
        if (r1 != 0) goto L_0x026c;
    L_0x025d:
        r1 = r0.q;	 Catch:{ all -> 0x0286 }
        if (r1 == 0) goto L_0x026c;
    L_0x0261:
        r2 = r0.D;	 Catch:{ all -> 0x0286 }
        if (r2 == 0) goto L_0x026c;
    L_0x0265:
        r4 = r0.p;	 Catch:{ all -> 0x0286 }
        r4 = r4.a;	 Catch:{ all -> 0x0286 }
        r2.a(r1, r4);	 Catch:{ all -> 0x0286 }
    L_0x026c:
        monitor-exit(r8);	 Catch:{ all -> 0x0286 }
        r8 = r0.d;
        if (r8 == 0) goto L_0x0278;
    L_0x0271:
        r8 = r0.e;
        if (r8 != 0) goto L_0x0278;
    L_0x0275:
        r0.c();
    L_0x0278:
        r0.c = r3;
        r8 = r0.l;
        r0 = r8.b;
        if (r0 == 0) goto L_0x0285;
    L_0x0280:
        r8 = r8.d;
        r8.run();
    L_0x0285:
        return;
    L_0x0286:
        r0 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x0286 }
        throw r0;
    L_0x0289:
        r8 = r0.q;
        r8 = java.lang.String.valueOf(r8);
        r8.length();
        r0.c = r5;
        r0.b(r5);
        r8 = r0.l;
        r0 = r8.e;
        r0 = r0.b;
        r8 = r8.d;
        r0.removeCallbacks(r8);
        return;
    L_0x02a3:
        r8 = r8.obj;
        r8 = (defpackage.zko) r8;
        r1 = r0.d;
        r1 = r1 ^ r3;
        defpackage.amqw.b(r1);
        r1 = r0.H;
        if (r1 != 0) goto L_0x02b4;
    L_0x02b1:
        r0.g = r8;
        goto L_0x02c4;
    L_0x02b4:
        r8.c();
        r0.d = r3;
        r8 = r0.c;
        if (r8 == 0) goto L_0x02c4;
    L_0x02bd:
        r8 = r0.e;
        if (r8 != 0) goto L_0x02c4;
    L_0x02c1:
        r0.c();
    L_0x02c4:
        return;
    L_0x02c5:
        r8 = r0.concat(r8);
    L_0x02c9:
        defpackage.xtl.d(r8);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zkm.handleMessage(android.os.Message):void");
    }
}
