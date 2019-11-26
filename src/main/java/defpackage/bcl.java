package defpackage;

import android.os.Handler;
import java.lang.ref.WeakReference;

/* renamed from: bcl */
final class bcl extends Handler {
    public final WeakReference a;

    public bcl(bci bci) {
        this.a = new WeakReference(bci);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    public final void handleMessage(android.os.Message r19) {
        /*
        r18 = this;
        r1 = r18;
        r0 = r19;
        r2 = r1.a;
        r2 = r2.get();
        r2 = (defpackage.bci) r2;
        if (r2 == 0) goto L_0x01a9;
    L_0x000e:
        r3 = r0.what;
        r4 = r0.arg1;
        r5 = r0.arg2;
        r6 = r0.obj;
        r0 = r19.peekData();
        r7 = 0;
        r8 = 0;
        if (r3 == 0) goto L_0x0188;
    L_0x001e:
        r9 = 1;
        switch(r3) {
            case 2: goto L_0x013d;
            case 3: goto L_0x0122;
            case 4: goto L_0x00ff;
            case 5: goto L_0x00e9;
            case 6: goto L_0x00ba;
            case 7: goto L_0x0024;
            default: goto L_0x0022;
        };
    L_0x0022:
        goto L_0x01a9;
    L_0x0024:
        if (r6 == 0) goto L_0x002a;
    L_0x0026:
        r0 = r6 instanceof android.os.Bundle;
        if (r0 == 0) goto L_0x01a9;
    L_0x002a:
        r6 = (android.os.Bundle) r6;
        r0 = r2.e;
        if (r0 == 0) goto L_0x01a9;
    L_0x0030:
        r0 = "dynamicRoutes";
        r0 = r6.getParcelableArrayList(r0);
        r3 = new java.util.ArrayList;
        r3.<init>();
        r4 = r0.size();
        r6 = 0;
    L_0x0040:
        if (r6 >= r4) goto L_0x007a;
    L_0x0042:
        r10 = r0.get(r6);
        r10 = (android.os.Bundle) r10;
        if (r10 == 0) goto L_0x0073;
    L_0x004a:
        r11 = "mrDescriptor";
        r11 = r10.getBundle(r11);
        r13 = defpackage.bam.a(r11);
        r11 = "selectionState";
        r14 = r10.getInt(r11, r9);
        r11 = "isUnselectable";
        r15 = r10.getBoolean(r11, r8);
        r11 = "isGroupable";
        r16 = r10.getBoolean(r11, r8);
        r11 = "isTransferable";
        r17 = r10.getBoolean(r11, r8);
        r10 = new bau;
        r12 = r10;
        r12.<init>(r13, r14, r15, r16, r17);
        goto L_0x0074;
    L_0x0073:
        r10 = r7;
    L_0x0074:
        r3.add(r10);
        r6 = r6 + 1;
        goto L_0x0040;
    L_0x007a:
        r0 = r2.h;
        r4 = r0.m;
        if (r4 != r2) goto L_0x01a9;
    L_0x0080:
        r0 = r0.k;
        r2 = r0.size();
    L_0x0086:
        if (r8 >= r2) goto L_0x0097;
    L_0x0088:
        r4 = r0.get(r8);
        r4 = (defpackage.bcj) r4;
        r8 = r8 + 1;
        r6 = r4.d();
        if (r6 != r5) goto L_0x0086;
    L_0x0096:
        goto L_0x0098;
    L_0x0097:
        r4 = r7;
    L_0x0098:
        r0 = r4 instanceof defpackage.bco;
        if (r0 == 0) goto L_0x01a9;
    L_0x009c:
        r4 = (defpackage.bco) r4;
        r2 = r4.a;
        monitor-enter(r2);
        r0 = r4.b;	 Catch:{ all -> 0x00b7 }
        if (r0 == 0) goto L_0x00ae;
    L_0x00a5:
        r5 = new bar;	 Catch:{ all -> 0x00b7 }
        r5.<init>(r4, r3);	 Catch:{ all -> 0x00b7 }
        r0.execute(r5);	 Catch:{ all -> 0x00b7 }
        goto L_0x00b5;
    L_0x00ae:
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x00b7 }
        r0.<init>(r3);	 Catch:{ all -> 0x00b7 }
        r4.d = r0;	 Catch:{ all -> 0x00b7 }
    L_0x00b5:
        monitor-exit(r2);	 Catch:{ all -> 0x00b7 }
        return;
    L_0x00b7:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00b7 }
        throw r0;
    L_0x00ba:
        r0 = r6 instanceof android.os.Bundle;
        if (r0 == 0) goto L_0x00e1;
    L_0x00be:
        r6 = (android.os.Bundle) r6;
        r0 = r2.g;
        r0 = r0.get(r4);
        r0 = (defpackage.bbg) r0;
        if (r6 == 0) goto L_0x00db;
    L_0x00ca:
        r3 = "routeId";
        r3 = r6.containsKey(r3);
        if (r3 == 0) goto L_0x00db;
    L_0x00d2:
        r2 = r2.g;
        r2.remove(r4);
        r0.a(r6);
        return;
    L_0x00db:
        r2 = "DynamicGroupRouteController is created without valid route id.";
        r0.a(r2, r6);
        return;
    L_0x00e1:
        r0 = "MediaRouteProviderProxy";
        r2 = "No further information on the dynamic group controller";
        android.util.Log.w(r0, r2);
        return;
    L_0x00e9:
        if (r6 == 0) goto L_0x00ef;
    L_0x00eb:
        r0 = r6 instanceof android.os.Bundle;
        if (r0 == 0) goto L_0x01a9;
    L_0x00ef:
        r6 = (android.os.Bundle) r6;
        r0 = r2.e;
        if (r0 == 0) goto L_0x01a9;
    L_0x00f5:
        r0 = r2.h;
        r3 = defpackage.bax.a(r6);
        r0.a(r2, r3);
        return;
    L_0x00ff:
        if (r6 == 0) goto L_0x0105;
    L_0x0101:
        r3 = r6 instanceof android.os.Bundle;
        if (r3 == 0) goto L_0x01a9;
    L_0x0105:
        if (r0 == 0) goto L_0x010d;
    L_0x0107:
        r3 = "error";
        r7 = r0.getString(r3);
    L_0x010d:
        r6 = (android.os.Bundle) r6;
        r0 = r2.g;
        r0 = r0.get(r4);
        r0 = (defpackage.bbg) r0;
        if (r0 == 0) goto L_0x01a9;
    L_0x0119:
        r2 = r2.g;
        r2.remove(r4);
        r0.a(r7, r6);
        return;
    L_0x0122:
        if (r6 == 0) goto L_0x0128;
    L_0x0124:
        r0 = r6 instanceof android.os.Bundle;
        if (r0 == 0) goto L_0x01a9;
    L_0x0128:
        r6 = (android.os.Bundle) r6;
        r0 = r2.g;
        r0 = r0.get(r4);
        r0 = (defpackage.bbg) r0;
        if (r0 == 0) goto L_0x01a9;
    L_0x0134:
        r2 = r2.g;
        r2.remove(r4);
        r0.a(r6);
        return;
    L_0x013d:
        if (r6 != 0) goto L_0x0140;
    L_0x013f:
        goto L_0x0145;
    L_0x0140:
        r0 = r6 instanceof android.os.Bundle;
        if (r0 != 0) goto L_0x0145;
    L_0x0144:
        goto L_0x01a9;
    L_0x0145:
        r6 = (android.os.Bundle) r6;
        r0 = r2.e;
        if (r0 != 0) goto L_0x01a9;
    L_0x014b:
        r0 = r2.f;
        if (r4 != r0) goto L_0x01a9;
    L_0x014f:
        if (r5 <= 0) goto L_0x01a9;
    L_0x0151:
        r2.f = r8;
        r2.e = r5;
        r0 = r2.h;
        r3 = defpackage.bax.a(r6);
        r0.a(r2, r3);
        r0 = r2.h;
        r3 = r0.m;
        if (r3 != r2) goto L_0x01a9;
    L_0x0164:
        r0.n = r9;
        r2 = r0.k;
        r2 = r2.size();
    L_0x016c:
        if (r8 >= r2) goto L_0x017e;
    L_0x016e:
        r3 = r0.k;
        r3 = r3.get(r8);
        r3 = (defpackage.bcj) r3;
        r4 = r0.m;
        r3.a(r4);
        r8 = r8 + 1;
        goto L_0x016c;
    L_0x017e:
        r2 = r0.e;
        if (r2 == 0) goto L_0x01a9;
    L_0x0182:
        r0 = r0.m;
        r0.a(r2);
        return;
    L_0x0188:
        r0 = r2.f;
        if (r4 != r0) goto L_0x0197;
    L_0x018c:
        r2.f = r8;
        r0 = r2.h;
        r3 = r0.m;
        if (r3 != r2) goto L_0x0197;
    L_0x0194:
        r0.e();
    L_0x0197:
        r0 = r2.g;
        r0 = r0.get(r4);
        r0 = (defpackage.bbg) r0;
        if (r0 == 0) goto L_0x01a9;
    L_0x01a1:
        r2 = r2.g;
        r2.remove(r4);
        r0.a(r7, r7);
    L_0x01a9:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcl.handleMessage(android.os.Message):void");
    }
}
