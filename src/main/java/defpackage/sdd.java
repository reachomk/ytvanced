package defpackage;

import android.content.BroadcastReceiver;

/* renamed from: sdd */
public final class sdd extends BroadcastReceiver {
    private static final String a = sdf.a(sdd.class);

    public final void onReceive(android.content.Context r6, android.content.Intent r7) {
        /*
        r5 = this;
        r0 = r7.getAction();
        if (r0 == 0) goto L_0x00e3;
    L_0x0006:
        r1 = defpackage.sap.o();
        r2 = r0.hashCode();
        r3 = 0;
        r4 = 1;
        switch(r2) {
            case -1659235314: goto L_0x0050;
            case -1532067277: goto L_0x0046;
            case -1531995789: goto L_0x003c;
            case -1134516793: goto L_0x0032;
            case 1153919611: goto L_0x0028;
            case 1706654521: goto L_0x001e;
            case 1997055314: goto L_0x0014;
            default: goto L_0x0013;
        };
    L_0x0013:
        goto L_0x005a;
    L_0x0014:
        r2 = "android.intent.action.MEDIA_BUTTON";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x005a;
    L_0x001c:
        r0 = 6;
        goto L_0x005b;
    L_0x001e:
        r2 = "com.google.android.libraries.cast.companionlibrary.action.forward";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x005a;
    L_0x0026:
        r0 = 3;
        goto L_0x005b;
    L_0x0028:
        r2 = "com.google.android.libraries.cast.companionlibrary.action.toggleplayback";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x005a;
    L_0x0030:
        r0 = 0;
        goto L_0x005b;
    L_0x0032:
        r2 = "com.google.android.libraries.cast.companionlibrary.action.rewind";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x005a;
    L_0x003a:
        r0 = 4;
        goto L_0x005b;
    L_0x003c:
        r2 = "com.google.android.libraries.cast.companionlibrary.action.playprev";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x005a;
    L_0x0044:
        r0 = 2;
        goto L_0x005b;
    L_0x0046:
        r2 = "com.google.android.libraries.cast.companionlibrary.action.playnext";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x005a;
    L_0x004e:
        r0 = 1;
        goto L_0x005b;
    L_0x0050:
        r2 = "com.google.android.libraries.cast.companionlibrary.action.stop";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x005a;
    L_0x0058:
        r0 = 5;
        goto L_0x005b;
    L_0x005a:
        r0 = -1;
    L_0x005b:
        r2 = "ccl_extra_forward_step_ms";
        switch(r0) {
            case 0: goto L_0x00d8;
            case 1: goto L_0x00cc;
            case 2: goto L_0x00c0;
            case 3: goto L_0x00b0;
            case 4: goto L_0x00a0;
            case 5: goto L_0x0090;
            case 6: goto L_0x0062;
            default: goto L_0x0060;
        };
    L_0x0060:
        goto L_0x00e3;
    L_0x0062:
        r6 = "android.intent.extra.KEY_EVENT";
        r0 = r7.hasExtra(r6);
        if (r0 == 0) goto L_0x008f;
    L_0x006a:
        r7 = r7.getExtras();
        r6 = r7.get(r6);
        r6 = (android.view.KeyEvent) r6;
        if (r6 == 0) goto L_0x008f;
    L_0x0076:
        r7 = r6.getAction();
        if (r7 != 0) goto L_0x008f;
    L_0x007c:
        r6 = r6.getKeyCode();
        r7 = 85;
        if (r6 != r7) goto L_0x00e3;
    L_0x0084:
        r1.G();	 Catch:{ sbq | sbt | sbv -> 0x0088, sbq | sbt | sbv -> 0x0088, sbq | sbt | sbv -> 0x0088 }
        return;
    L_0x0088:
        r6 = a;
        r7 = "onReceive() Failed to toggle playback ";
        defpackage.sdf.a(r6, r7);
    L_0x008f:
        return;
    L_0x0090:
        r1.a(r4, r4, r4);
        r7 = r1.u;
        if (r7 == 0) goto L_0x00e3;
    L_0x0097:
        r0 = new android.content.Intent;
        r0.<init>(r6, r7);
        r6.stopService(r0);
        goto L_0x00e3;
    L_0x00a0:
        r6 = r7.getIntExtra(r2, r3);
        r1.g(r6);	 Catch:{ sbt | sbv -> 0x00a8, sbt | sbv -> 0x00a8 }
        return;
    L_0x00a8:
        r6 = a;
        r7 = "onReceive() Failed to rewind the media";
        defpackage.sdf.a(r6, r7);
        return;
    L_0x00b0:
        r6 = r7.getIntExtra(r2, r3);
        r1.g(r6);	 Catch:{ sbt | sbv -> 0x00b8, sbt | sbv -> 0x00b8 }
        return;
    L_0x00b8:
        r6 = a;
        r7 = "onReceive() Failed to forward the media";
        defpackage.sdf.a(r6, r7);
        return;
    L_0x00c0:
        r1.D();	 Catch:{ sbt | sbv -> 0x00c4, sbt | sbv -> 0x00c4 }
        return;
    L_0x00c4:
        r6 = a;
        r7 = "onReceive() Failed to skip to the previous in queue";
        defpackage.sdf.a(r6, r7);
        return;
    L_0x00cc:
        r1.C();	 Catch:{ sbt | sbv -> 0x00d0, sbt | sbv -> 0x00d0 }
        return;
    L_0x00d0:
        r6 = a;
        r7 = "onReceive() Failed to skip to the next in queue";
        defpackage.sdf.a(r6, r7);
        return;
    L_0x00d8:
        r1.G();	 Catch:{ sbq | sbt | sbv -> 0x00dc, sbq | sbt | sbv -> 0x00dc, sbq | sbt | sbv -> 0x00dc }
        return;
    L_0x00dc:
        r6 = a;
        r7 = "onReceive() Failed to toggle playback";
        defpackage.sdf.a(r6, r7);
    L_0x00e3:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sdd.onReceive(android.content.Context, android.content.Intent):void");
    }
}
