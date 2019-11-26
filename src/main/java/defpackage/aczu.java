package defpackage;

import android.content.BroadcastReceiver;

/* renamed from: aczu */
final class aczu extends BroadcastReceiver {
    private final /* synthetic */ aczv a;

    aczu(aczv aczv) {
        this.a = aczv;
    }

    public final void onReceive(android.content.Context r9, android.content.Intent r10) {
        /*
        r8 = this;
        r0 = r8.a;
        r0 = r0.b;
        if (r0 != 0) goto L_0x000e;
    L_0x0006:
        r9 = defpackage.aczv.a;
        r10 = "no action listener set, ignoring action";
        defpackage.xtl.b(r9, r10);
        return;
    L_0x000e:
        r1 = "INTERACTION_SCREEN";
        r1 = r10.getParcelableExtra(r1);
        r1 = (defpackage.acwp) r1;
        r10 = r10.getAction();
        r2 = java.lang.String.valueOf(r10);
        r3 = "action: ";
        r4 = r2.length();
        if (r4 != 0) goto L_0x002c;
    L_0x0026:
        r2 = new java.lang.String;
        r2.<init>(r3);
        goto L_0x002f;
    L_0x002c:
        r3.concat(r2);
    L_0x002f:
        r2 = r10.hashCode();
        r3 = 2;
        r4 = 1;
        r5 = 3;
        switch(r2) {
            case -670475291: goto L_0x0058;
            case 685086653: goto L_0x004e;
            case 1446453054: goto L_0x0044;
            case 1545822060: goto L_0x003a;
            default: goto L_0x0039;
        };
    L_0x0039:
        goto L_0x0062;
    L_0x003a:
        r2 = "com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.HELP";
        r2 = r10.equals(r2);
        if (r2 == 0) goto L_0x0062;
    L_0x0042:
        r2 = 0;
        goto L_0x0063;
    L_0x0044:
        r2 = "com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.DISMISSED";
        r2 = r10.equals(r2);
        if (r2 == 0) goto L_0x0062;
    L_0x004c:
        r2 = 3;
        goto L_0x0063;
    L_0x004e:
        r2 = "com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.RETRY";
        r2 = r10.equals(r2);
        if (r2 == 0) goto L_0x0062;
    L_0x0056:
        r2 = 1;
        goto L_0x0063;
    L_0x0058:
        r2 = "com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.CANCEL";
        r2 = r10.equals(r2);
        if (r2 == 0) goto L_0x0062;
    L_0x0060:
        r2 = 2;
        goto L_0x0063;
    L_0x0062:
        r2 = -1;
    L_0x0063:
        r6 = 0;
        r7 = "Interaction logging screen is not set";
        if (r2 == 0) goto L_0x00e9;
    L_0x0068:
        if (r2 == r4) goto L_0x00b7;
    L_0x006a:
        if (r2 == r3) goto L_0x008f;
    L_0x006c:
        if (r2 == r5) goto L_0x0086;
    L_0x006e:
        r9 = defpackage.aczv.a;
        r0 = "Unknown action:";
        r1 = r10.length();
        if (r1 != 0) goto L_0x007e;
    L_0x0078:
        r10 = new java.lang.String;
        r10.<init>(r0);
        goto L_0x0082;
    L_0x007e:
        r10 = r0.concat(r10);
    L_0x0082:
        defpackage.xtl.b(r9, r10);
        return;
    L_0x0086:
        r0.b();
        r9 = r8.a;
        r9.c();
        return;
    L_0x008f:
        r9 = r8.a;
        r9 = r9.d;
        if (r1 == 0) goto L_0x009d;
    L_0x0095:
        r10 = r9.b;
        r10 = r10.c();
        if (r10 != 0) goto L_0x00a2;
    L_0x009d:
        r10 = defpackage.aczs.a;
        defpackage.xtl.b(r10, r7);
    L_0x00a2:
        r10 = r9.b;
        r10.a(r1);
        r9 = r9.b;
        r10 = new acvs;
        r1 = defpackage.aczs.e;
        r10.<init>(r1);
        r9.a(r5, r10, r6);
        r0.c();
        return;
    L_0x00b7:
        r9 = r8.a;
        r9 = r9.d;
        if (r1 == 0) goto L_0x00c5;
    L_0x00bd:
        r10 = r9.b;
        r10 = r10.c();
        if (r10 != 0) goto L_0x00ca;
    L_0x00c5:
        r10 = defpackage.aczs.a;
        defpackage.xtl.b(r10, r7);
    L_0x00ca:
        r10 = r9.b;
        r10.a(r1);
        r9 = r9.b;
        r10 = new acvs;
        r1 = defpackage.aczs.f;
        r10.<init>(r1);
        r9.a(r5, r10, r6);
        r9 = r8.a;
        r9 = r9.c;
        r9 = defpackage.amqw.a(r9);
        r9 = (defpackage.aczq) r9;
        r0.a(r9);
        return;
    L_0x00e9:
        r10 = r8.a;
        r10 = r10.d;
        if (r1 == 0) goto L_0x00f7;
    L_0x00ef:
        r2 = r10.b;
        r2 = r2.c();
        if (r2 != 0) goto L_0x00fc;
    L_0x00f7:
        r2 = defpackage.aczs.a;
        defpackage.xtl.b(r2, r7);
    L_0x00fc:
        r2 = r10.b;
        r2.a(r1);
        r10 = r10.b;
        r1 = new acvs;
        r2 = defpackage.aczs.g;
        r1.<init>(r2);
        r10.a(r5, r1, r6);
        r10 = new android.content.Intent;
        r1 = "android.intent.action.CLOSE_SYSTEM_DIALOGS";
        r10.<init>(r1);
        r9.sendBroadcast(r10);
        r0.a();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aczu.onReceive(android.content.Context, android.content.Intent):void");
    }
}
