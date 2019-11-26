package com.google.android.libraries.youtube.mdx.notification;

import android.content.BroadcastReceiver;
import defpackage.adjs;
import defpackage.adjt;
import defpackage.adjz;
import defpackage.xtl;

public class ContinueWatchingOnTvNotificationBroadcastReceiver extends BroadcastReceiver {
    private static final String d = xtl.b("MDX.ContinueWatchingBroadcastReceiver");
    public adjz a;
    public adjs b;
    public adjt c;

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    public final void onReceive(android.content.Context r7, android.content.Intent r8) {
        /*
        r6 = this;
        r7 = defpackage.xse.a(r7);
        r7 = (defpackage.adjr) r7;
        r7.a(r6);
        r7 = "INTERACTION_SCREEN";
        r7 = r8.getParcelableExtra(r7);
        r7 = (defpackage.acwp) r7;
        r8 = r8.getAction();
        r0 = r8.hashCode();
        r1 = -1644207426; // 0xffffffff9dff62be float:-6.7600035E-21 double:NaN;
        r2 = 2;
        r3 = 1;
        if (r0 == r1) goto L_0x003f;
    L_0x0020:
        r1 = 531238881; // 0x1faa0fe1 float:7.202407E-20 double:2.62466881E-315;
        if (r0 == r1) goto L_0x0035;
    L_0x0025:
        r1 = 798292259; // 0x2f94f923 float:2.7098065E-10 double:3.944087805E-315;
        if (r0 == r1) goto L_0x002b;
    L_0x002a:
        goto L_0x0049;
    L_0x002b:
        r0 = "android.intent.action.BOOT_COMPLETED";
        r0 = r8.equals(r0);
        if (r0 == 0) goto L_0x0049;
    L_0x0033:
        r0 = 2;
        goto L_0x004a;
    L_0x0035:
        r0 = "com.google.android.libraries.youtube.mdx.notification.action.DISMISS";
        r0 = r8.equals(r0);
        if (r0 == 0) goto L_0x0049;
    L_0x003d:
        r0 = 1;
        goto L_0x004a;
    L_0x003f:
        r0 = "com.google.android.libraries.youtube.mdx.notification.action.NO_THANKS";
        r0 = r8.equals(r0);
        if (r0 == 0) goto L_0x0049;
    L_0x0047:
        r0 = 0;
        goto L_0x004a;
    L_0x0049:
        r0 = -1;
    L_0x004a:
        r1 = "Interaction logging screen is not set";
        r4 = 0;
        r5 = 3;
        if (r0 == 0) goto L_0x0095;
    L_0x0050:
        if (r0 == r3) goto L_0x0072;
    L_0x0052:
        if (r0 == r2) goto L_0x006c;
    L_0x0054:
        r7 = d;
        r0 = "Invalid action:";
        r1 = r8.length();
        if (r1 != 0) goto L_0x0064;
    L_0x005e:
        r8 = new java.lang.String;
        r8.<init>(r0);
        goto L_0x0068;
    L_0x0064:
        r8 = r0.concat(r8);
    L_0x0068:
        defpackage.xtl.b(r7, r8);
        return;
    L_0x006c:
        r7 = r6.a;
        r7.a();
        return;
    L_0x0072:
        r8 = r6.c;
        if (r7 != 0) goto L_0x0083;
    L_0x0076:
        r0 = r8.g;
        r0 = r0.c();
        if (r0 != 0) goto L_0x0083;
    L_0x007e:
        r0 = defpackage.adjt.a;
        defpackage.xtl.b(r0, r1);
    L_0x0083:
        r0 = r8.g;
        r0.a(r7);
        r7 = r8.g;
        r8 = new acvs;
        r0 = defpackage.adjt.e;
        r8.<init>(r0);
        r7.a(r5, r8, r4);
        return;
    L_0x0095:
        r8 = r6.a;
        r8 = r8.a;
        r8 = r8.edit();
        r0 = "mdx.disabled_by_user";
        r8 = r8.putBoolean(r0, r3);
        r8.apply();
        r8 = r6.b;
        r8.h();
        r8 = r6.c;
        if (r7 != 0) goto L_0x00bc;
    L_0x00af:
        r0 = r8.g;
        r0 = r0.c();
        if (r0 != 0) goto L_0x00bc;
    L_0x00b7:
        r0 = defpackage.adjt.a;
        defpackage.xtl.b(r0, r1);
    L_0x00bc:
        r0 = r8.g;
        r0.a(r7);
        r7 = r8.g;
        r8 = new acvs;
        r0 = defpackage.adjt.f;
        r8.<init>(r0);
        r7.a(r5, r8, r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.mdx.notification.ContinueWatchingOnTvNotificationBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
