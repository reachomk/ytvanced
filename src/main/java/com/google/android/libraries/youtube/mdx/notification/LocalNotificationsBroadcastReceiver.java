package com.google.android.libraries.youtube.mdx.notification;

import android.content.BroadcastReceiver;
import defpackage.adkn;
import defpackage.adku;
import defpackage.adkw;
import defpackage.xtl;

public class LocalNotificationsBroadcastReceiver extends BroadcastReceiver {
    private static final String d = xtl.b("MDX.LocalNotificationsBroadcastReceiver");
    public adkw a;
    public adkn b;
    public adku c;

    public final void onReceive(android.content.Context r10, android.content.Intent r11) {
        /*
        r9 = this;
        r0 = r10.getApplicationContext();
        r0 = defpackage.xse.a(r0);
        r0 = (defpackage.adkm) r0;
        r0.a(r9);
        r0 = r11.getAction();
        r1 = "INTERACTION_SCREEN";
        r1 = r11.getParcelableExtra(r1);
        r1 = (defpackage.acwp) r1;
        if (r0 == 0) goto L_0x00f9;
    L_0x001b:
        r2 = r0.hashCode();
        r3 = 2;
        r4 = 1;
        r5 = 3;
        r6 = 0;
        switch(r2) {
            case 252583441: goto L_0x0045;
            case 401553130: goto L_0x003b;
            case 798292259: goto L_0x0031;
            case 2095897197: goto L_0x0027;
            default: goto L_0x0026;
        };
    L_0x0026:
        goto L_0x004f;
    L_0x0027:
        r2 = "com.google.android.libraries.youtube.mdx.background.actions.DISMISS";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x004f;
    L_0x002f:
        r2 = 0;
        goto L_0x0050;
    L_0x0031:
        r2 = "android.intent.action.BOOT_COMPLETED";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x004f;
    L_0x0039:
        r2 = 1;
        goto L_0x0050;
    L_0x003b:
        r2 = "com.google.android.libraries.youtube.mdx.background.actions.TURN_OFF";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x004f;
    L_0x0043:
        r2 = 3;
        goto L_0x0050;
    L_0x0045:
        r2 = "com.google.android.libraries.youtube.mdx.background.actions.PLAY";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x004f;
    L_0x004d:
        r2 = 2;
        goto L_0x0050;
    L_0x004f:
        r2 = -1;
    L_0x0050:
        r7 = "Interaction logging screen is not set";
        r8 = 0;
        if (r2 == 0) goto L_0x00cd;
    L_0x0055:
        if (r2 == r4) goto L_0x00c7;
    L_0x0057:
        if (r2 == r3) goto L_0x00ab;
    L_0x0059:
        if (r2 == r5) goto L_0x006d;
    L_0x005b:
        r10 = "Unknown action: ";
        r11 = r0.length();
        if (r11 != 0) goto L_0x0069;
    L_0x0063:
        r11 = new java.lang.String;
        r11.<init>(r10);
        return;
    L_0x0069:
        r10.concat(r0);
        return;
    L_0x006d:
        r10 = r9.a;
        r10 = r10.a;
        r10 = r10.edit();
        r11 = "com.google.android.libraries.youtube.mdx.notification.DISABLED";
        r10 = r10.putBoolean(r11, r4);
        r10.apply();
        r10 = r9.b;
        if (r1 != 0) goto L_0x008f;
    L_0x0082:
        r11 = r10.g;
        r11 = r11.c();
        if (r11 != 0) goto L_0x008f;
    L_0x008a:
        r11 = defpackage.adkn.a;
        defpackage.xtl.b(r11, r7);
    L_0x008f:
        r11 = r10.g;
        r11.a(r1);
        r10 = r10.g;
        r11 = new acvs;
        r0 = defpackage.adkn.f;
        r11.<init>(r0);
        r10.a(r5, r11, r8);
        r10 = r9.c;
        r10.a();
        r10 = r9.a;
        r10.a(r6);
        return;
    L_0x00ab:
        r0 = r9.a;
        r0.a();
        r0 = r9.a;
        r0.a(r6);
        r0 = new android.content.Intent;
        r1 = com.google.android.libraries.youtube.mdx.background.MdxBackgroundPlaybackBroadcastReceiver.class;
        r0.<init>(r10, r1);
        r11 = r11.getExtras();
        r0.putExtras(r11);
        r10.sendBroadcast(r0);
        return;
    L_0x00c7:
        r10 = r9.a;
        r10.a(r6);
        return;
    L_0x00cd:
        r10 = r9.b;
        if (r1 != 0) goto L_0x00de;
    L_0x00d1:
        r11 = r10.g;
        r11 = r11.c();
        if (r11 != 0) goto L_0x00de;
    L_0x00d9:
        r11 = defpackage.adkn.a;
        defpackage.xtl.b(r11, r7);
    L_0x00de:
        r11 = r10.g;
        r11.a(r1);
        r10 = r10.g;
        r11 = new acvs;
        r0 = defpackage.adkn.e;
        r11.<init>(r0);
        r10.a(r5, r11, r8);
        r10 = r9.a;
        r10.a();
        r10 = r9.a;
        r10.a(r6);
    L_0x00f9:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.mdx.notification.LocalNotificationsBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
