package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: agym */
final class agym extends Handler {
    private final /* synthetic */ agyk a;

    agym(agyk agyk, Looper looper) {
        this.a = agyk;
        super(looper);
    }

    /* JADX WARNING: Removed duplicated region for block: B:220:0x05fe A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x05fe A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x05fe A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x05fe A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x05fe A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x05fe A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x05fe A:{SYNTHETIC} */
    /* JADX WARNING: Missing block: B:44:0x00e1, code skipped:
            if (r2.E.isHeld() == false) goto L_0x00ee;
     */
    /* JADX WARNING: Missing block: B:45:0x00e3, code skipped:
            defpackage.xtl.d("wifiLock held in quit");
            r2.E.release();
     */
    /* JADX WARNING: Missing block: B:46:0x00ee, code skipped:
            r3 = r2.y;
     */
    /* JADX WARNING: Missing block: B:47:0x00f0, code skipped:
            monitor-enter(r3);
     */
    /* JADX WARNING: Missing block: B:49:?, code skipped:
            r0 = r2.A;
            r0 = r2.z;
     */
    /* JADX WARNING: Missing block: B:50:0x00f5, code skipped:
            monitor-exit(r3);
     */
    /* JADX WARNING: Missing block: B:52:?, code skipped:
            r0 = r2.w;
     */
    /* JADX WARNING: Missing block: B:53:0x00f8, code skipped:
            if (r0 == null) goto L_0x00fd;
     */
    /* JADX WARNING: Missing block: B:54:0x00fa, code skipped:
            r0.quit();
     */
    /* JADX WARNING: Missing block: B:55:0x00fd, code skipped:
            r2.G = true;
     */
    /* JADX WARNING: Missing block: B:193:?, code skipped:
            r0 = r4.iterator();
     */
    /* JADX WARNING: Missing block: B:195:0x0591, code skipped:
            if (r0.hasNext() == false) goto L_0x05da;
     */
    /* JADX WARNING: Missing block: B:196:0x0593, code skipped:
            r1 = (defpackage.agxh) r0.next();
            r2 = r1.a;
            r3 = r1.h;
            r4 = r1.b.name();
            java.lang.String.valueOf(r2).length();
            java.lang.String.valueOf(r3).length();
            java.lang.String.valueOf(r4).length();
     */
    /* JADX WARNING: Missing block: B:197:0x05b8, code skipped:
            r2 = r25;
     */
    /* JADX WARNING: Missing block: B:199:?, code skipped:
            r2.r.a(r1);
     */
    /* JADX WARNING: Missing block: B:200:0x05c3, code skipped:
            if (r1.b() == false) goto L_0x05d7;
     */
    /* JADX WARNING: Missing block: B:202:0x05c9, code skipped:
            if (r1.b == defpackage.agrc.PENDING) goto L_0x05d7;
     */
    /* JADX WARNING: Missing block: B:203:0x05cb, code skipped:
            r1.b = defpackage.agrc.PENDING;
            r1.c = 1;
            r2.k.b(r1);
     */
    /* JADX WARNING: Missing block: B:204:0x05d7, code skipped:
            r25 = r2;
     */
    /* JADX WARNING: Missing block: B:205:0x05da, code skipped:
            r2 = r25;
            r2.u.a(r2.r.a());
            r2.h();
     */
    /* JADX WARNING: Missing block: B:206:0x05eb, code skipped:
            r0 = th;
     */
    /* JADX WARNING: Missing block: B:207:0x05ec, code skipped:
            r2 = r25;
     */
    public final void handleMessage(android.os.Message r30) {
        /*
        r29 = this;
        r1 = r29;
        r0 = r30;
        r2 = r1.a;
        r3 = r2.B;
        if (r3 == 0) goto L_0x0010;
    L_0x000a:
        r3 = r0.what;
        r4 = 18;
        if (r3 != r4) goto L_0x064b;
    L_0x0010:
        r3 = r2.G;
        if (r3 != 0) goto L_0x064b;
    L_0x0014:
        r3 = r2.D;
        r3.acquire();
        r3 = r2.k;
        r4 = r3.c;
        monitor-enter(r4);
        r5 = r3.c;	 Catch:{ all -> 0x0648 }
        monitor-enter(r5);	 Catch:{ all -> 0x0648 }
        r6 = r3.d;	 Catch:{ all -> 0x0645 }
        r7 = 0;
        r8 = 1;
        if (r6 == 0) goto L_0x0030;
    L_0x0027:
        r6 = r6.isOpen();	 Catch:{ all -> 0x0645 }
        if (r6 != 0) goto L_0x002e;
    L_0x002d:
        goto L_0x0030;
    L_0x002e:
        r6 = 1;
        goto L_0x0031;
    L_0x0030:
        r6 = 0;
    L_0x0031:
        monitor-exit(r5);	 Catch:{ all -> 0x0645 }
        if (r6 != 0) goto L_0x0043;
    L_0x0034:
        r5 = new agye;	 Catch:{ all -> 0x0648 }
        r6 = r3.b;	 Catch:{ all -> 0x0648 }
        r9 = "bgol_tasks.db";
        r5.<init>(r6, r9);	 Catch:{ all -> 0x0648 }
        r5 = r5.getWritableDatabase();	 Catch:{ all -> 0x0648 }
        r3.d = r5;	 Catch:{ all -> 0x0648 }
    L_0x0043:
        monitor-exit(r4);	 Catch:{ all -> 0x0648 }
        r3 = r0.what;	 Catch:{ all -> 0x063e }
        r4 = 0;
        r5 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        switch(r3) {
            case 1: goto L_0x0469;
            case 2: goto L_0x0404;
            case 3: goto L_0x03bc;
            case 4: goto L_0x03ac;
            case 5: goto L_0x004c;
            case 6: goto L_0x004c;
            case 7: goto L_0x03a7;
            case 8: goto L_0x037f;
            case 9: goto L_0x034b;
            case 10: goto L_0x02fb;
            case 11: goto L_0x0202;
            case 12: goto L_0x0180;
            case 13: goto L_0x016f;
            case 14: goto L_0x011e;
            case 15: goto L_0x004c;
            case 16: goto L_0x010b;
            case 17: goto L_0x0104;
            case 18: goto L_0x00db;
            case 19: goto L_0x00c4;
            case 20: goto L_0x006b;
            case 21: goto L_0x004e;
            default: goto L_0x004c;
        };	 Catch:{ all -> 0x063e }
    L_0x004c:
        goto L_0x05fb;
    L_0x004e:
        r0 = r0.obj;	 Catch:{ all -> 0x063e }
        r0 = (android.util.Pair) r0;	 Catch:{ all -> 0x063e }
        r3 = r2.r;	 Catch:{ all -> 0x063e }
        r4 = r0.first;	 Catch:{ all -> 0x063e }
        r4 = (java.lang.String) r4;	 Catch:{ all -> 0x063e }
        r3 = r3.c(r4);	 Catch:{ all -> 0x063e }
        if (r3 == 0) goto L_0x05fb;
    L_0x005e:
        r0 = r0.second;	 Catch:{ all -> 0x063e }
        r0 = (defpackage.agpw) r0;	 Catch:{ all -> 0x063e }
        r3.g = r0;	 Catch:{ all -> 0x063e }
        r0 = r2.k;	 Catch:{ all -> 0x063e }
        r0.b(r3);	 Catch:{ all -> 0x063e }
        goto L_0x05fb;
    L_0x006b:
        r0 = r2.r;	 Catch:{ all -> 0x063e }
        r0 = r0.c();	 Catch:{ all -> 0x063e }
        r0 = r0.iterator();	 Catch:{ all -> 0x063e }
    L_0x0075:
        r3 = r0.hasNext();	 Catch:{ all -> 0x063e }
        if (r3 == 0) goto L_0x00b8;
    L_0x007b:
        r3 = r0.next();	 Catch:{ all -> 0x063e }
        r3 = (defpackage.agxh) r3;	 Catch:{ all -> 0x063e }
        r4 = r3.a;	 Catch:{ all -> 0x063e }
        r6 = r3.h;	 Catch:{ all -> 0x063e }
        r7 = r3.b;	 Catch:{ all -> 0x063e }
        r7 = r7.name();	 Catch:{ all -> 0x063e }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x063e }
        r4.length();	 Catch:{ all -> 0x063e }
        r4 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x063e }
        r4.length();	 Catch:{ all -> 0x063e }
        r4 = java.lang.String.valueOf(r7);	 Catch:{ all -> 0x063e }
        r4.length();	 Catch:{ all -> 0x063e }
        r4 = r3.b;	 Catch:{ all -> 0x063e }
        r6 = defpackage.agrc.RUNNING;	 Catch:{ all -> 0x063e }
        r4 = r4.equals(r6);	 Catch:{ all -> 0x063e }
        if (r4 != 0) goto L_0x00b4;
    L_0x00aa:
        r4 = r3.b;	 Catch:{ all -> 0x063e }
        r6 = defpackage.agrc.PENDING;	 Catch:{ all -> 0x063e }
        r4 = r4.equals(r6);	 Catch:{ all -> 0x063e }
        if (r4 == 0) goto L_0x0075;
    L_0x00b4:
        r2.a(r3, r5);	 Catch:{ all -> 0x063e }
        goto L_0x0075;
    L_0x00b8:
        r0 = r2.r;	 Catch:{ all -> 0x063e }
        r0.b();	 Catch:{ all -> 0x063e }
        r0 = r2.C;	 Catch:{ all -> 0x063e }
        r0.clear();	 Catch:{ all -> 0x063e }
        goto L_0x05fb;
    L_0x00c4:
        r3 = r2.r;	 Catch:{ all -> 0x063e }
        r0 = r0.obj;	 Catch:{ all -> 0x063e }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x063e }
        r0 = r3.c(r0);	 Catch:{ all -> 0x063e }
        if (r0 == 0) goto L_0x05fb;
    L_0x00d0:
        r3 = r2.u;	 Catch:{ all -> 0x063e }
        r0 = r0.a();	 Catch:{ all -> 0x063e }
        r3.b(r0);	 Catch:{ all -> 0x063e }
        goto L_0x05fb;
    L_0x00db:
        r0 = r2.E;	 Catch:{ all -> 0x063e }
        r0 = r0.isHeld();	 Catch:{ all -> 0x063e }
        if (r0 == 0) goto L_0x00ee;
    L_0x00e3:
        r0 = "wifiLock held in quit";
        defpackage.xtl.d(r0);	 Catch:{ all -> 0x063e }
        r0 = r2.E;	 Catch:{ all -> 0x063e }
        r0.release();	 Catch:{ all -> 0x063e }
        goto L_0x00db;
    L_0x00ee:
        r3 = r2.y;	 Catch:{ all -> 0x063e }
        monitor-enter(r3);	 Catch:{ all -> 0x063e }
        r0 = r2.A;	 Catch:{ all -> 0x0101 }
        r0 = r2.z;	 Catch:{ all -> 0x0101 }
        monitor-exit(r3);	 Catch:{ all -> 0x0101 }
        r0 = r2.w;	 Catch:{ all -> 0x063e }
        if (r0 == 0) goto L_0x00fd;
    L_0x00fa:
        r0.quit();	 Catch:{ all -> 0x063e }
    L_0x00fd:
        r2.G = r8;	 Catch:{ all -> 0x063e }
        goto L_0x05fb;
    L_0x0101:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0101 }
        throw r0;	 Catch:{ all -> 0x063e }
    L_0x0104:
        r0 = r2.q;	 Catch:{ all -> 0x063e }
        r0.b();	 Catch:{ all -> 0x063e }
        goto L_0x05fb;
    L_0x010b:
        r3 = r2.r;	 Catch:{ all -> 0x063e }
        r4 = r0.obj;	 Catch:{ all -> 0x063e }
        r4 = (java.lang.String) r4;	 Catch:{ all -> 0x063e }
        r3 = r3.c(r4);	 Catch:{ all -> 0x063e }
        if (r3 == 0) goto L_0x05fb;
    L_0x0117:
        r0 = r0.arg1;	 Catch:{ all -> 0x063e }
        r2.a(r3, r0);	 Catch:{ all -> 0x063e }
        goto L_0x05fb;
    L_0x011e:
        r0 = r2.r;	 Catch:{ all -> 0x063e }
        r0 = r0.c();	 Catch:{ all -> 0x063e }
        r0 = r0.iterator();	 Catch:{ all -> 0x063e }
    L_0x0128:
        r3 = r0.hasNext();	 Catch:{ all -> 0x063e }
        if (r3 == 0) goto L_0x0161;
    L_0x012e:
        r3 = r0.next();	 Catch:{ all -> 0x063e }
        r3 = (defpackage.agxh) r3;	 Catch:{ all -> 0x063e }
        r6 = r3.a;	 Catch:{ all -> 0x063e }
        r7 = r3.h;	 Catch:{ all -> 0x063e }
        r9 = r3.b;	 Catch:{ all -> 0x063e }
        r9 = r9.name();	 Catch:{ all -> 0x063e }
        r6 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x063e }
        r6.length();	 Catch:{ all -> 0x063e }
        r6 = java.lang.String.valueOf(r7);	 Catch:{ all -> 0x063e }
        r6.length();	 Catch:{ all -> 0x063e }
        r6 = java.lang.String.valueOf(r9);	 Catch:{ all -> 0x063e }
        r6.length();	 Catch:{ all -> 0x063e }
        r6 = r3.b;	 Catch:{ all -> 0x063e }
        r7 = defpackage.agrc.RUNNING;	 Catch:{ all -> 0x063e }
        r6 = r6.equals(r7);	 Catch:{ all -> 0x063e }
        if (r6 == 0) goto L_0x0128;
    L_0x015d:
        r2.a(r3, r5);	 Catch:{ all -> 0x063e }
        goto L_0x0128;
    L_0x0161:
        r2.J = r4;	 Catch:{ all -> 0x063e }
        r0 = r2.r;	 Catch:{ all -> 0x063e }
        r0.b();	 Catch:{ all -> 0x063e }
        r0 = r2.C;	 Catch:{ all -> 0x063e }
        r0.clear();	 Catch:{ all -> 0x063e }
        goto L_0x05fb;
    L_0x016f:
        r0 = r0.obj;	 Catch:{ all -> 0x063e }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x063e }
        r3 = r2.C;	 Catch:{ all -> 0x063e }
        r0 = r3.remove(r0);	 Catch:{ all -> 0x063e }
        if (r0 == 0) goto L_0x05fb;
    L_0x017b:
        r2.h();	 Catch:{ all -> 0x063e }
        goto L_0x05fb;
    L_0x0180:
        r0 = r0.obj;	 Catch:{ all -> 0x063e }
        r0 = (defpackage.agyl) r0;	 Catch:{ all -> 0x063e }
        r3 = r2.r;	 Catch:{ all -> 0x063e }
        r5 = r0.a;	 Catch:{ all -> 0x063e }
        r3 = r3.c(r5);	 Catch:{ all -> 0x063e }
        if (r3 == 0) goto L_0x05fb;
    L_0x018e:
        r5 = r0.a;	 Catch:{ all -> 0x063e }
        r6 = r0.c;	 Catch:{ all -> 0x063e }
        r9 = r6 + -1;
        if (r6 == 0) goto L_0x0201;
    L_0x0196:
        r4 = r0.b;	 Catch:{ all -> 0x063e }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x063e }
        r6 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x063e }
        r6 = r6.length();	 Catch:{ all -> 0x063e }
        r6 = r6 + 58;
        r10 = r4.length();	 Catch:{ all -> 0x063e }
        r6 = r6 + r10;
        r10 = new java.lang.StringBuilder;	 Catch:{ all -> 0x063e }
        r10.<init>(r6);	 Catch:{ all -> 0x063e }
        r6 = "transfer fatal fail Id:";
        r10.append(r6);	 Catch:{ all -> 0x063e }
        r10.append(r5);	 Catch:{ all -> 0x063e }
        r5 = " Reason: ";
        r10.append(r5);	 Catch:{ all -> 0x063e }
        r10.append(r9);	 Catch:{ all -> 0x063e }
        r5 = " Media Status: ";
        r10.append(r5);	 Catch:{ all -> 0x063e }
        r10.append(r4);	 Catch:{ all -> 0x063e }
        r4 = r10.toString();	 Catch:{ all -> 0x063e }
        defpackage.xtl.c(r4);	 Catch:{ all -> 0x063e }
        r4 = defpackage.agrc.FAILED;	 Catch:{ all -> 0x063e }
        r3.b = r4;	 Catch:{ all -> 0x063e }
        r3.j = r7;	 Catch:{ all -> 0x063e }
        r4 = r2.r;	 Catch:{ all -> 0x063e }
        r5 = r0.a;	 Catch:{ all -> 0x063e }
        r4.b(r5);	 Catch:{ all -> 0x063e }
        r4 = r2.k;	 Catch:{ all -> 0x063e }
        r4.c(r3);	 Catch:{ all -> 0x063e }
        r4 = r2.s;	 Catch:{ all -> 0x063e }
        r5 = r0.a;	 Catch:{ all -> 0x063e }
        r4.b(r5);	 Catch:{ all -> 0x063e }
        r4 = r2.C;	 Catch:{ all -> 0x063e }
        r5 = r0.a;	 Catch:{ all -> 0x063e }
        r4.remove(r5);	 Catch:{ all -> 0x063e }
        r4 = r2.u;	 Catch:{ all -> 0x063e }
        r3 = r3.a();	 Catch:{ all -> 0x063e }
        r5 = r0.c;	 Catch:{ all -> 0x063e }
        r0 = r0.b;	 Catch:{ all -> 0x063e }
        r4.a(r3, r5, r0);	 Catch:{ all -> 0x063e }
        r2.h();	 Catch:{ all -> 0x063e }
        goto L_0x05fb;
    L_0x0201:
        throw r4;	 Catch:{ all -> 0x063e }
    L_0x0202:
        r0 = r0.obj;	 Catch:{ all -> 0x063e }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x063e }
        r3 = r2.r;	 Catch:{ all -> 0x063e }
        r3 = r3.c(r0);	 Catch:{ all -> 0x063e }
        if (r3 == 0) goto L_0x05fb;
    L_0x020e:
        r4 = "transfer retry ";
        r5 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x063e }
        r6 = r5.length();	 Catch:{ all -> 0x063e }
        if (r6 != 0) goto L_0x0220;
    L_0x021a:
        r5 = new java.lang.String;	 Catch:{ all -> 0x063e }
        r5.<init>(r4);	 Catch:{ all -> 0x063e }
        goto L_0x0224;
    L_0x0220:
        r5 = r4.concat(r5);	 Catch:{ all -> 0x063e }
    L_0x0224:
        defpackage.xtl.d(r5);	 Catch:{ all -> 0x063e }
        r4 = r3.f;	 Catch:{ all -> 0x063e }
        r5 = r2.s;	 Catch:{ all -> 0x063e }
        r5.b(r0);	 Catch:{ all -> 0x063e }
        r5 = r3.j;	 Catch:{ all -> 0x063e }
        r5 = r5 + r8;
        r3.j = r5;	 Catch:{ all -> 0x063e }
        r5 = r2.k;	 Catch:{ all -> 0x063e }
        r5.b(r3);	 Catch:{ all -> 0x063e }
        r3 = r3.j;	 Catch:{ all -> 0x063e }
        r3 = java.lang.Math.max(r3, r8);	 Catch:{ all -> 0x063e }
        r5 = 20;
        r3 = java.lang.Math.min(r3, r5);	 Catch:{ all -> 0x063e }
        if (r3 <= r8) goto L_0x02f6;
    L_0x0246:
        r3 = r3 + -1;
        r3 = r8 << r3;
        r5 = (long) r3;	 Catch:{ all -> 0x063e }
        r9 = defpackage.agxj.r(r4);	 Catch:{ all -> 0x063e }
        r5 = r5 * r9;
        r3 = "max_retry_milli_secs";
        r9 = defpackage.agxj.a;	 Catch:{ all -> 0x063e }
        r3 = r4.b(r3, r9);	 Catch:{ all -> 0x063e }
        r3 = java.lang.Math.min(r5, r3);	 Catch:{ all -> 0x063e }
        r5 = defpackage.agyk.c;	 Catch:{ all -> 0x063e }
        r9 = 4602678819172646912; // 0x3fe0000000000000 float:0.0 double:0.5;
        r11 = 13;
        r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r12 <= 0) goto L_0x02bd;
    L_0x0267:
        r5 = r2.C;	 Catch:{ all -> 0x063e }
        r6 = java.lang.Boolean.valueOf(r7);	 Catch:{ all -> 0x063e }
        r5.put(r0, r6);	 Catch:{ all -> 0x063e }
        r5 = r2.y;	 Catch:{ all -> 0x063e }
        monitor-enter(r5);	 Catch:{ all -> 0x063e }
        r6 = new android.os.Bundle;	 Catch:{ all -> 0x02ba }
        r6.<init>();	 Catch:{ all -> 0x02ba }
        r7 = "servicePath";
        r12 = r2.v;	 Catch:{ all -> 0x02ba }
        r6.putString(r7, r12);	 Catch:{ all -> 0x02ba }
        r7 = "intentAction";
        r12 = "com.google.android.libraries.youtube.offline.transfer.service.ActionDelayedMessage";
        r6.putString(r7, r12);	 Catch:{ all -> 0x02ba }
        r7 = "messageId";
        r6.putInt(r7, r11);	 Catch:{ all -> 0x02ba }
        r7 = "messageData";
        r6.putString(r7, r0);	 Catch:{ all -> 0x02ba }
        r12 = r2.f;	 Catch:{ all -> 0x02ba }
        r13 = "transfer_dm2";
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x02ba }
        r14 = r0.toSeconds(r3);	 Catch:{ all -> 0x02ba }
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x02ba }
        r3 = (double) r3;
        java.lang.Double.isNaN(r3);
        r3 = r3 * r9;
        r3 = (long) r3;
        r16 = r0.toSeconds(r3);	 Catch:{ all -> 0x02ba }
        r18 = 1;
        r19 = 0;
        r20 = 0;
        r22 = 0;
        r23 = 1;
        r24 = 1;
        r21 = r6;
        r12.a(r13, r14, r16, r18, r19, r20, r21, r22, r23, r24);	 Catch:{ all -> 0x02ba }
        monitor-exit(r5);	 Catch:{ all -> 0x02ba }
        goto L_0x02f6;
    L_0x02ba:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x02ba }
        throw r0;	 Catch:{ all -> 0x063e }
    L_0x02bd:
        r5 = r2.C;	 Catch:{ all -> 0x063e }
        r6 = java.lang.Boolean.valueOf(r8);	 Catch:{ all -> 0x063e }
        r5.put(r0, r6);	 Catch:{ all -> 0x063e }
        r5 = r2.y;	 Catch:{ all -> 0x063e }
        monitor-enter(r5);	 Catch:{ all -> 0x063e }
        r6 = r2.x;	 Catch:{ all -> 0x02f3 }
        r7 = r2.K;	 Catch:{ all -> 0x02f3 }
        r6.removeCallbacks(r7);	 Catch:{ all -> 0x02f3 }
        r6 = r2.A;	 Catch:{ all -> 0x02f3 }
        r6 = r6 + r8;
        r2.A = r6;	 Catch:{ all -> 0x02f3 }
        r6 = r2.x;	 Catch:{ all -> 0x02f3 }
        r0 = r6.obtainMessage(r11, r0);	 Catch:{ all -> 0x02f3 }
        r7 = r2.e;	 Catch:{ all -> 0x02f3 }
        r3 = (double) r3;
        java.lang.Double.isNaN(r3);
        r9 = r9 * r3;
        java.lang.Double.isNaN(r3);
        r9 = r9 + r3;
        r3 = r7.a(r3, r9);	 Catch:{ all -> 0x02f3 }
        r3 = (long) r3;	 Catch:{ all -> 0x02f3 }
        r6.sendMessageDelayed(r0, r3);	 Catch:{ all -> 0x02f3 }
        r0 = r2.A;	 Catch:{ all -> 0x02f3 }
        monitor-exit(r5);	 Catch:{ all -> 0x02f3 }
        goto L_0x02f6;
    L_0x02f3:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x02f3 }
        throw r0;	 Catch:{ all -> 0x063e }
    L_0x02f6:
        r2.h();	 Catch:{ all -> 0x063e }
        goto L_0x05fb;
    L_0x02fb:
        r0 = r0.obj;	 Catch:{ all -> 0x063e }
        r0 = (android.util.Pair) r0;	 Catch:{ all -> 0x063e }
        r3 = r0.first;	 Catch:{ all -> 0x063e }
        r3 = (java.lang.String) r3;	 Catch:{ all -> 0x063e }
        r4 = r2.r;	 Catch:{ all -> 0x063e }
        r3 = r4.c(r3);	 Catch:{ all -> 0x063e }
        if (r3 == 0) goto L_0x05fb;
    L_0x030b:
        r4 = r0.second;	 Catch:{ all -> 0x063e }
        if (r4 != 0) goto L_0x0315;
    L_0x030f:
        r0 = new agpw;	 Catch:{ all -> 0x063e }
        r0.<init>();	 Catch:{ all -> 0x063e }
        goto L_0x0319;
    L_0x0315:
        r0 = r0.second;	 Catch:{ all -> 0x063e }
        r0 = (defpackage.agpw) r0;	 Catch:{ all -> 0x063e }
    L_0x0319:
        r3.g = r0;	 Catch:{ all -> 0x063e }
        r0 = defpackage.agrc.COMPLETED;	 Catch:{ all -> 0x063e }
        r3.b = r0;	 Catch:{ all -> 0x063e }
        r0 = r3.a;	 Catch:{ all -> 0x063e }
        r4 = r2.s;	 Catch:{ all -> 0x063e }
        r4.b(r0);	 Catch:{ all -> 0x063e }
        r3.j = r7;	 Catch:{ all -> 0x063e }
        r4 = r2.C;	 Catch:{ all -> 0x063e }
        r4.remove(r0);	 Catch:{ all -> 0x063e }
        r4 = r2.r;	 Catch:{ all -> 0x063e }
        r4.b(r0);	 Catch:{ all -> 0x063e }
        r0 = r2.k;	 Catch:{ all -> 0x063e }
        r0.c(r3);	 Catch:{ all -> 0x063e }
        r0 = r2.u;	 Catch:{ all -> 0x063e }
        r4 = r3.a();	 Catch:{ all -> 0x063e }
        r3 = r3.f;	 Catch:{ all -> 0x063e }
        r3 = defpackage.agxj.x(r3);	 Catch:{ all -> 0x063e }
        r0.a(r4, r8, r3);	 Catch:{ all -> 0x063e }
        r2.h();	 Catch:{ all -> 0x063e }
        goto L_0x05fb;
    L_0x034b:
        r0 = r0.obj;	 Catch:{ all -> 0x063e }
        r0 = (defpackage.agyo) r0;	 Catch:{ all -> 0x063e }
        r3 = r2.r;	 Catch:{ all -> 0x063e }
        r4 = r0.a;	 Catch:{ all -> 0x063e }
        r3 = r3.c(r4);	 Catch:{ all -> 0x063e }
        if (r3 == 0) goto L_0x05fb;
    L_0x0359:
        r4 = r3.d;	 Catch:{ all -> 0x063e }
        r9 = r0.b;	 Catch:{ all -> 0x063e }
        r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1));
        if (r6 < 0) goto L_0x0362;
    L_0x0361:
        goto L_0x0366;
    L_0x0362:
        r3.j = r7;	 Catch:{ all -> 0x063e }
        r3.d = r9;	 Catch:{ all -> 0x063e }
    L_0x0366:
        r4 = r3.g;	 Catch:{ all -> 0x063e }
        r5 = r0.c;	 Catch:{ all -> 0x063e }
        defpackage.agxj.a(r4, r5);	 Catch:{ all -> 0x063e }
        r4 = r2.k;	 Catch:{ all -> 0x063e }
        r4.b(r3);	 Catch:{ all -> 0x063e }
        r4 = r2.u;	 Catch:{ all -> 0x063e }
        r3 = r3.a();	 Catch:{ all -> 0x063e }
        r0 = r0.d;	 Catch:{ all -> 0x063e }
        r4.a(r3, r0);	 Catch:{ all -> 0x063e }
        goto L_0x05fb;
    L_0x037f:
        r3 = r2.r;	 Catch:{ all -> 0x063e }
        r4 = r0.obj;	 Catch:{ all -> 0x063e }
        r4 = (java.lang.String) r4;	 Catch:{ all -> 0x063e }
        r3 = r3.c(r4);	 Catch:{ all -> 0x063e }
        if (r3 == 0) goto L_0x05fb;
    L_0x038b:
        r4 = r0.arg1;	 Catch:{ all -> 0x063e }
        r4 = (long) r4;	 Catch:{ all -> 0x063e }
        r6 = 31;
        r4 = r4 << r6;
        r0 = r0.arg2;	 Catch:{ all -> 0x063e }
        r6 = (long) r0;	 Catch:{ all -> 0x063e }
        r4 = r4 + r6;
        r3.e = r4;	 Catch:{ all -> 0x063e }
        r0 = r2.k;	 Catch:{ all -> 0x063e }
        r0.b(r3);	 Catch:{ all -> 0x063e }
        r0 = r2.u;	 Catch:{ all -> 0x063e }
        r3 = r3.a();	 Catch:{ all -> 0x063e }
        r0.d(r3);	 Catch:{ all -> 0x063e }
        goto L_0x05fb;
    L_0x03a7:
        r2.h();	 Catch:{ all -> 0x063e }
        goto L_0x05fb;
    L_0x03ac:
        r0 = r0.arg1;	 Catch:{ all -> 0x063e }
        if (r0 == 0) goto L_0x03b1;
    L_0x03b0:
        r7 = 1;
    L_0x03b1:
        r0 = r2.F;	 Catch:{ all -> 0x063e }
        if (r0 == r7) goto L_0x05fb;
    L_0x03b5:
        r2.F = r7;	 Catch:{ all -> 0x063e }
        r2.h();	 Catch:{ all -> 0x063e }
        goto L_0x05fb;
    L_0x03bc:
        r3 = r0.obj;	 Catch:{ all -> 0x063e }
        r3 = (java.lang.String) r3;	 Catch:{ all -> 0x063e }
        r0 = r0.arg1;	 Catch:{ all -> 0x063e }
        r4 = r2.r;	 Catch:{ all -> 0x063e }
        r4 = r4.a(r3);	 Catch:{ all -> 0x063e }
        if (r4 != 0) goto L_0x03d1;
    L_0x03ca:
        r0 = r2.k;	 Catch:{ all -> 0x063e }
        r0.a(r3);	 Catch:{ all -> 0x063e }
        goto L_0x05fb;
    L_0x03d1:
        r4 = r2.s;	 Catch:{ all -> 0x063e }
        r4 = r4.b(r3);	 Catch:{ all -> 0x063e }
        if (r4 == 0) goto L_0x03dc;
    L_0x03d9:
        r4.a(r0);	 Catch:{ all -> 0x063e }
    L_0x03dc:
        r4 = r2.C;	 Catch:{ all -> 0x063e }
        r4.remove(r3);	 Catch:{ all -> 0x063e }
        r4 = r2.r;	 Catch:{ all -> 0x063e }
        r3 = r4.b(r3);	 Catch:{ all -> 0x063e }
        r4 = r3.c;	 Catch:{ all -> 0x063e }
        r0 = r0 | r4;
        r3.c = r0;	 Catch:{ all -> 0x063e }
        r0 = r2.k;	 Catch:{ all -> 0x063e }
        r0.c(r3);	 Catch:{ all -> 0x063e }
        r0 = r3.a();	 Catch:{ all -> 0x063e }
        r3 = r2.t;	 Catch:{ all -> 0x063e }
        r3.f();	 Catch:{ all -> 0x063e }
        r3 = r2.u;	 Catch:{ all -> 0x063e }
        r3.c(r0);	 Catch:{ all -> 0x063e }
        r2.h();	 Catch:{ all -> 0x063e }
        goto L_0x05fb;
    L_0x0404:
        r0 = r0.obj;	 Catch:{ all -> 0x063e }
        r0 = (defpackage.agxh) r0;	 Catch:{ all -> 0x063e }
        r3 = r2.r;	 Catch:{ all -> 0x063e }
        r4 = r0.a;	 Catch:{ all -> 0x063e }
        r3 = r3.a(r4);	 Catch:{ all -> 0x063e }
        if (r3 == 0) goto L_0x0447;
    L_0x0412:
        r3 = r2.r;	 Catch:{ all -> 0x063e }
        r4 = r0.a;	 Catch:{ all -> 0x063e }
        r3 = r3.c(r4);	 Catch:{ all -> 0x063e }
        r4 = r3.b;	 Catch:{ all -> 0x063e }
        r6 = defpackage.agrc.RUNNING;	 Catch:{ all -> 0x063e }
        if (r4 != r6) goto L_0x0423;
    L_0x0420:
        r2.a(r3, r5);	 Catch:{ all -> 0x063e }
    L_0x0423:
        r4 = r2.k;	 Catch:{ all -> 0x063e }
        r4.c(r3);	 Catch:{ all -> 0x063e }
        r3 = r2.k;	 Catch:{ all -> 0x063e }
        r3.a(r0);	 Catch:{ all -> 0x063e }
        r3 = r2.r;	 Catch:{ all -> 0x063e }
        r3.a(r0);	 Catch:{ all -> 0x063e }
        r3 = r2.u;	 Catch:{ all -> 0x063e }
        r4 = r0.a();	 Catch:{ all -> 0x063e }
        r3.a(r4);	 Catch:{ all -> 0x063e }
        r3 = r2.C;	 Catch:{ all -> 0x063e }
        r0 = r0.a;	 Catch:{ all -> 0x063e }
        r3.remove(r0);	 Catch:{ all -> 0x063e }
        r2.h();	 Catch:{ all -> 0x063e }
        goto L_0x05fb;
    L_0x0447:
        r3 = r2.k;	 Catch:{ all -> 0x063e }
        r3.a(r0);	 Catch:{ all -> 0x063e }
        r3 = r2.J;	 Catch:{ all -> 0x063e }
        r4 = r0.h;	 Catch:{ all -> 0x063e }
        r3 = android.text.TextUtils.equals(r3, r4);	 Catch:{ all -> 0x063e }
        if (r3 == 0) goto L_0x05fb;
    L_0x0456:
        r3 = r2.r;	 Catch:{ all -> 0x063e }
        r3.a(r0);	 Catch:{ all -> 0x063e }
        r3 = r2.u;	 Catch:{ all -> 0x063e }
        r0 = r0.a();	 Catch:{ all -> 0x063e }
        r3.a(r0);	 Catch:{ all -> 0x063e }
        r2.h();	 Catch:{ all -> 0x063e }
        goto L_0x05fb;
    L_0x0469:
        r3 = r2.l;	 Catch:{ all -> 0x063e }
        r3 = defpackage.ahda.a(r3);	 Catch:{ all -> 0x063e }
        r4 = 0;
        if (r3 == 0) goto L_0x0476;
    L_0x0473:
        r9 = r3.p;	 Catch:{ all -> 0x063e }
        goto L_0x0477;
    L_0x0476:
        r9 = r4;
    L_0x0477:
        r3 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1));
        if (r3 > 0) goto L_0x047c;
    L_0x047b:
        goto L_0x048d;
    L_0x047c:
        r3 = r2.h;	 Catch:{ all -> 0x063e }
        r3 = r3.c();	 Catch:{ all -> 0x063e }
        r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1));
        if (r5 >= 0) goto L_0x048d;
    L_0x0486:
        r0 = "Restoring task failed: not enough free space";
        defpackage.xtl.c(r0);	 Catch:{ all -> 0x063e }
        goto L_0x05fb;
    L_0x048d:
        r0 = r0.obj;	 Catch:{ all -> 0x063e }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x063e }
        r3 = r2.J;	 Catch:{ all -> 0x063e }
        r3 = android.text.TextUtils.equals(r0, r3);	 Catch:{ all -> 0x063e }
        if (r3 != 0) goto L_0x05fb;
    L_0x0499:
        r2.J = r0;	 Catch:{ all -> 0x063e }
        r3 = r2.k;	 Catch:{ all -> 0x063e }
        r4 = new java.util.ArrayList;	 Catch:{ all -> 0x063e }
        r4.<init>();	 Catch:{ all -> 0x063e }
        r5 = r3.c;	 Catch:{ all -> 0x063e }
        monitor-enter(r5);	 Catch:{ all -> 0x063e }
        if (r0 != 0) goto L_0x04b9;
    L_0x04a7:
        r9 = r3.d;	 Catch:{ all -> 0x05f8 }
        r10 = "transfers";
        r11 = defpackage.agyb.a;	 Catch:{ all -> 0x05f8 }
        r12 = 0;
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r0 = r9.query(r10, r11, r12, r13, r14, r15, r16);	 Catch:{ all -> 0x05f8 }
    L_0x04b7:
        r3 = r0;
        goto L_0x04ce;
    L_0x04b9:
        r9 = r3.d;	 Catch:{ all -> 0x05f8 }
        r10 = "transfers";
        r11 = defpackage.agyb.a;	 Catch:{ all -> 0x05f8 }
        r12 = "accountname=?";
        r13 = new java.lang.String[r8];	 Catch:{ all -> 0x05f8 }
        r13[r7] = r0;	 Catch:{ all -> 0x05f8 }
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r0 = r9.query(r10, r11, r12, r13, r14, r15, r16);	 Catch:{ all -> 0x05f8 }
        goto L_0x04b7;
    L_0x04ce:
        r0 = "file_path";
        r0 = r3.getColumnIndex(r0);	 Catch:{ all -> 0x05f3 }
        r6 = "status";
        r6 = r3.getColumnIndex(r6);	 Catch:{ all -> 0x05f3 }
        r7 = "status_reason";
        r7 = r3.getColumnIndex(r7);	 Catch:{ all -> 0x05f3 }
        r9 = "bytes_transferred";
        r9 = r3.getColumnIndex(r9);	 Catch:{ all -> 0x05f3 }
        r10 = "bytes_total";
        r10 = r3.getColumnIndex(r10);	 Catch:{ all -> 0x05f3 }
        r11 = "extras";
        r11 = r3.getColumnIndex(r11);	 Catch:{ all -> 0x05f3 }
        r12 = "output_extras";
        r12 = r3.getColumnIndex(r12);	 Catch:{ all -> 0x05f3 }
        r13 = "accountname";
        r13 = r3.getColumnIndex(r13);	 Catch:{ all -> 0x05f3 }
        r14 = "priority";
        r14 = r3.getColumnIndex(r14);	 Catch:{ all -> 0x05f3 }
        r15 = "failure_count";
        r15 = r3.getColumnIndex(r15);	 Catch:{ all -> 0x05f3 }
    L_0x050a:
        r16 = r3.moveToNext();	 Catch:{ all -> 0x05f3 }
        if (r16 == 0) goto L_0x0583;
    L_0x0510:
        r19 = r3.getString(r0);	 Catch:{ all -> 0x05f3 }
        r16 = defpackage.agrc.values();	 Catch:{ all -> 0x05f3 }
        r17 = r3.getInt(r6);	 Catch:{ all -> 0x05f3 }
        r8 = r16[r17];	 Catch:{ all -> 0x05f3 }
        r30 = r0;
        r0 = r3.getInt(r7);	 Catch:{ all -> 0x05f3 }
        r16 = r6;
        r24 = r7;
        r6 = r3.getLong(r9);	 Catch:{ all -> 0x05f3 }
        r25 = r2;
        r1 = r3.getLong(r10);	 Catch:{ all -> 0x057e }
        r26 = r9;
        r9 = new agpw;	 Catch:{ all -> 0x057e }
        r27 = r10;
        r10 = r3.getBlob(r11);	 Catch:{ all -> 0x057e }
        r9.<init>(r10);	 Catch:{ all -> 0x057e }
        r10 = new agpw;	 Catch:{ all -> 0x057e }
        r28 = r11;
        r11 = r3.getBlob(r12);	 Catch:{ all -> 0x057e }
        r10.<init>(r11);	 Catch:{ all -> 0x057e }
        r18 = r3.getString(r13);	 Catch:{ all -> 0x057e }
        r20 = r3.getInt(r14);	 Catch:{ all -> 0x057e }
        r22 = r3.getInt(r15);	 Catch:{ all -> 0x057e }
        r11 = new agxh;	 Catch:{ all -> 0x057e }
        r17 = r11;
        r21 = r9;
        r17.<init>(r18, r19, r20, r21, r22);	 Catch:{ all -> 0x057e }
        r11.b = r8;	 Catch:{ all -> 0x057e }
        r11.c = r0;	 Catch:{ all -> 0x057e }
        r11.e = r1;	 Catch:{ all -> 0x057e }
        r11.d = r6;	 Catch:{ all -> 0x057e }
        r11.g = r10;	 Catch:{ all -> 0x057e }
        r4.add(r11);	 Catch:{ all -> 0x057e }
        r1 = r29;
        r0 = r30;
        r6 = r16;
        r7 = r24;
        r2 = r25;
        r9 = r26;
        r10 = r27;
        r11 = r28;
        r8 = 1;
        goto L_0x050a;
    L_0x057e:
        r0 = move-exception;
        r2 = r25;
        goto L_0x05f4;
    L_0x0583:
        r25 = r2;
        r3.close();	 Catch:{ all -> 0x05ef }
        monitor-exit(r5);	 Catch:{ all -> 0x05ef }
        r0 = r4.iterator();	 Catch:{ all -> 0x05eb }
    L_0x058d:
        r1 = r0.hasNext();	 Catch:{ all -> 0x05eb }
        if (r1 == 0) goto L_0x05da;
    L_0x0593:
        r1 = r0.next();	 Catch:{ all -> 0x05eb }
        r1 = (defpackage.agxh) r1;	 Catch:{ all -> 0x05eb }
        r2 = r1.a;	 Catch:{ all -> 0x05eb }
        r3 = r1.h;	 Catch:{ all -> 0x05eb }
        r4 = r1.b;	 Catch:{ all -> 0x05eb }
        r4 = r4.name();	 Catch:{ all -> 0x05eb }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x05eb }
        r2.length();	 Catch:{ all -> 0x05eb }
        r2 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x05eb }
        r2.length();	 Catch:{ all -> 0x05eb }
        r2 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x05eb }
        r2.length();	 Catch:{ all -> 0x05eb }
        r2 = r25;
        r3 = r2.r;	 Catch:{ all -> 0x063e }
        r3.a(r1);	 Catch:{ all -> 0x063e }
        r3 = r1.b();	 Catch:{ all -> 0x063e }
        if (r3 == 0) goto L_0x05d7;
    L_0x05c5:
        r3 = r1.b;	 Catch:{ all -> 0x063e }
        r4 = defpackage.agrc.PENDING;	 Catch:{ all -> 0x063e }
        if (r3 == r4) goto L_0x05d7;
    L_0x05cb:
        r3 = defpackage.agrc.PENDING;	 Catch:{ all -> 0x063e }
        r1.b = r3;	 Catch:{ all -> 0x063e }
        r3 = 1;
        r1.c = r3;	 Catch:{ all -> 0x063e }
        r3 = r2.k;	 Catch:{ all -> 0x063e }
        r3.b(r1);	 Catch:{ all -> 0x063e }
    L_0x05d7:
        r25 = r2;
        goto L_0x058d;
    L_0x05da:
        r2 = r25;
        r0 = r2.u;	 Catch:{ all -> 0x063e }
        r1 = r2.r;	 Catch:{ all -> 0x063e }
        r1 = r1.a();	 Catch:{ all -> 0x063e }
        r0.a(r1);	 Catch:{ all -> 0x063e }
        r2.h();	 Catch:{ all -> 0x063e }
        goto L_0x05fb;
    L_0x05eb:
        r0 = move-exception;
        r2 = r25;
        goto L_0x063f;
    L_0x05ef:
        r0 = move-exception;
        r2 = r25;
        goto L_0x05f9;
    L_0x05f3:
        r0 = move-exception;
    L_0x05f4:
        r3.close();	 Catch:{ all -> 0x05f8 }
        throw r0;	 Catch:{ all -> 0x05f8 }
    L_0x05f8:
        r0 = move-exception;
    L_0x05f9:
        monitor-exit(r5);	 Catch:{ all -> 0x05f8 }
        throw r0;	 Catch:{ all -> 0x063e }
    L_0x05fb:
        r1 = r2.y;	 Catch:{ all -> 0x063e }
        monitor-enter(r1);	 Catch:{ all -> 0x063e }
        r0 = r2.z;	 Catch:{ all -> 0x063b }
        r3 = 1;
        r0 = r0 + r3;
        r2.z = r0;	 Catch:{ all -> 0x063b }
        r0 = r2.z;	 Catch:{ all -> 0x063b }
        r3 = r2.A;	 Catch:{ all -> 0x063b }
        if (r0 != r3) goto L_0x0634;
    L_0x060a:
        r0 = r2.H;	 Catch:{ all -> 0x063b }
        if (r0 != 0) goto L_0x0634;
    L_0x060e:
        r0 = r2.L;	 Catch:{ all -> 0x063b }
        if (r0 == 0) goto L_0x0631;
    L_0x0612:
        r0 = r2.x;	 Catch:{ all -> 0x063b }
        r3 = r2.K;	 Catch:{ all -> 0x063b }
        r0.removeCallbacks(r3);	 Catch:{ all -> 0x063b }
        r0 = r2.I;	 Catch:{ all -> 0x063b }
        if (r0 == 0) goto L_0x0627;
    L_0x061d:
        r0 = r2.x;	 Catch:{ all -> 0x063b }
        r3 = r2.K;	 Catch:{ all -> 0x063b }
        r4 = defpackage.agyk.b;	 Catch:{ all -> 0x063b }
        r0.postDelayed(r3, r4);	 Catch:{ all -> 0x063b }
        goto L_0x0634;
    L_0x0627:
        r0 = r2.x;	 Catch:{ all -> 0x063b }
        r3 = r2.K;	 Catch:{ all -> 0x063b }
        r4 = defpackage.agyk.a;	 Catch:{ all -> 0x063b }
        r0.postDelayed(r3, r4);	 Catch:{ all -> 0x063b }
        goto L_0x0634;
    L_0x0631:
        r2.g();	 Catch:{ all -> 0x063b }
    L_0x0634:
        monitor-exit(r1);	 Catch:{ all -> 0x063b }
        r0 = r2.D;
        r0.release();
        goto L_0x064b;
    L_0x063b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x063b }
        throw r0;	 Catch:{ all -> 0x063e }
    L_0x063e:
        r0 = move-exception;
    L_0x063f:
        r1 = r2.D;
        r1.release();
        throw r0;
    L_0x0645:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0645 }
        throw r0;	 Catch:{ all -> 0x0648 }
    L_0x0648:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0648 }
        throw r0;
    L_0x064b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agym.handleMessage(android.os.Message):void");
    }
}
