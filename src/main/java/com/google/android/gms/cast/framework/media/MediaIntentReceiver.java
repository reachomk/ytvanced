package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import defpackage.pkq;
import defpackage.plw;
import defpackage.pmp;
import defpackage.pzr;

public class MediaIntentReceiver extends BroadcastReceiver {
    public final void onReceive(android.content.Context r8, android.content.Intent r9) {
        /*
        r7 = this;
        r0 = r9.getAction();
        if (r0 == 0) goto L_0x0139;
    L_0x0006:
        r8 = defpackage.pkp.a(r8);
        r8 = r8.b();
        r1 = r0.hashCode();
        r2 = 0;
        r3 = 1;
        switch(r1) {
            case -1699820260: goto L_0x005e;
            case -945151566: goto L_0x0054;
            case -945080078: goto L_0x004a;
            case -668151673: goto L_0x0040;
            case -124479363: goto L_0x0036;
            case 235550565: goto L_0x002c;
            case 1362116196: goto L_0x0022;
            case 1997055314: goto L_0x0018;
            default: goto L_0x0017;
        };
    L_0x0017:
        goto L_0x0068;
    L_0x0018:
        r1 = "android.intent.action.MEDIA_BUTTON";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0068;
    L_0x0020:
        r0 = 7;
        goto L_0x0069;
    L_0x0022:
        r1 = "com.google.android.gms.cast.framework.action.FORWARD";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0068;
    L_0x002a:
        r0 = 3;
        goto L_0x0069;
    L_0x002c:
        r1 = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0068;
    L_0x0034:
        r0 = 0;
        goto L_0x0069;
    L_0x0036:
        r1 = "com.google.android.gms.cast.framework.action.DISCONNECT";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0068;
    L_0x003e:
        r0 = 6;
        goto L_0x0069;
    L_0x0040:
        r1 = "com.google.android.gms.cast.framework.action.STOP_CASTING";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0068;
    L_0x0048:
        r0 = 5;
        goto L_0x0069;
    L_0x004a:
        r1 = "com.google.android.gms.cast.framework.action.SKIP_PREV";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0068;
    L_0x0052:
        r0 = 2;
        goto L_0x0069;
    L_0x0054:
        r1 = "com.google.android.gms.cast.framework.action.SKIP_NEXT";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0068;
    L_0x005c:
        r0 = 1;
        goto L_0x0069;
    L_0x005e:
        r1 = "com.google.android.gms.cast.framework.action.REWIND";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0068;
    L_0x0066:
        r0 = 4;
        goto L_0x0069;
    L_0x0068:
        r0 = -1;
    L_0x0069:
        r1 = "Must be called from the main thread.";
        r4 = 0;
        r6 = "googlecast-extra_skip_step_ms";
        switch(r0) {
            case 0: goto L_0x012c;
            case 1: goto L_0x00fe;
            case 2: goto L_0x00d0;
            case 3: goto L_0x00be;
            case 4: goto L_0x00ab;
            case 5: goto L_0x00a7;
            case 6: goto L_0x00a3;
            case 7: goto L_0x0073;
            default: goto L_0x0072;
        };
    L_0x0072:
        return;
    L_0x0073:
        r8 = r8.a();
        r0 = r8 instanceof defpackage.pkq;
        if (r0 == 0) goto L_0x00a2;
    L_0x007b:
        r0 = "android.intent.extra.KEY_EVENT";
        r1 = r9.hasExtra(r0);
        if (r1 == 0) goto L_0x00a2;
    L_0x0083:
        r9 = r9.getExtras();
        r9 = r9.get(r0);
        r9 = (android.view.KeyEvent) r9;
        if (r9 == 0) goto L_0x00a2;
    L_0x008f:
        r0 = r9.getAction();
        if (r0 != 0) goto L_0x00a2;
    L_0x0095:
        r9 = r9.getKeyCode();
        r0 = 85;
        if (r9 != r0) goto L_0x00a2;
    L_0x009d:
        r8 = (defpackage.pkq) r8;
        a(r8);
    L_0x00a2:
        return;
    L_0x00a3:
        r8.a(r2);
        return;
    L_0x00a7:
        r8.a(r3);
        return;
    L_0x00ab:
        r0 = r9.getLongExtra(r6, r4);
        r8 = r8.a();
        r9 = r8 instanceof defpackage.pkq;
        if (r9 == 0) goto L_0x00bd;
    L_0x00b7:
        r8 = (defpackage.pkq) r8;
        r0 = -r0;
        a(r8, r0);
    L_0x00bd:
        return;
    L_0x00be:
        r0 = r9.getLongExtra(r6, r4);
        r8 = r8.a();
        r9 = r8 instanceof defpackage.pkq;
        if (r9 == 0) goto L_0x00cf;
    L_0x00ca:
        r8 = (defpackage.pkq) r8;
        a(r8, r0);
    L_0x00cf:
        return;
    L_0x00d0:
        r8 = r8.a();
        r9 = r8 instanceof defpackage.pkq;
        if (r9 == 0) goto L_0x00fd;
    L_0x00d8:
        r8 = (defpackage.pkq) r8;
        r8 = b(r8);
        if (r8 == 0) goto L_0x00fd;
    L_0x00e0:
        r9 = r8.q();
        if (r9 != 0) goto L_0x00fd;
    L_0x00e6:
        defpackage.pzr.b(r1);
        r9 = r8.r();
        if (r9 != 0) goto L_0x00f3;
    L_0x00ef:
        defpackage.plw.s();
        goto L_0x00fd;
    L_0x00f3:
        r9 = new pmj;
        r0 = r8.e;
        r9.<init>(r8, r0);
        r8.a(r9);
    L_0x00fd:
        return;
    L_0x00fe:
        r8 = r8.a();
        r9 = r8 instanceof defpackage.pkq;
        if (r9 == 0) goto L_0x012b;
    L_0x0106:
        r8 = (defpackage.pkq) r8;
        r8 = b(r8);
        if (r8 == 0) goto L_0x012b;
    L_0x010e:
        r9 = r8.q();
        if (r9 != 0) goto L_0x012b;
    L_0x0114:
        defpackage.pzr.b(r1);
        r9 = r8.r();
        if (r9 != 0) goto L_0x0121;
    L_0x011d:
        defpackage.plw.s();
        goto L_0x012b;
    L_0x0121:
        r9 = new pmi;
        r0 = r8.e;
        r9.<init>(r8, r0);
        r8.a(r9);
    L_0x012b:
        return;
    L_0x012c:
        r8 = r8.a();
        r9 = r8 instanceof defpackage.pkq;
        if (r9 == 0) goto L_0x0139;
    L_0x0134:
        r8 = (defpackage.pkq) r8;
        a(r8);
    L_0x0139:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.MediaIntentReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    private static void a(pkq pkq) {
        plw b = b(pkq);
        if (b != null) {
            b.o();
        }
    }

    private static void a(pkq pkq, long j) {
        if (j != 0) {
            plw b = b(pkq);
            if (!(b == null || b.j() || b.q())) {
                long e = b.e() + j;
                pzr.b("Must be called from the main thread.");
                if (b.r()) {
                    b.a(new pmp(b, b.e, e));
                } else {
                    plw.s();
                }
            }
        }
    }

    private static plw b(pkq pkq) {
        return (pkq == null || !pkq.d()) ? null : pkq.a();
    }
}
