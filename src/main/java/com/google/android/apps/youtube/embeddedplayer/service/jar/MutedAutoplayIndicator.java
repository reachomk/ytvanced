package com.google.android.apps.youtube.embeddedplayer.service.jar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.lq;

public class MutedAutoplayIndicator extends ImageView {
    private boolean a;
    private lq b;

    public MutedAutoplayIndicator(Context context) {
        super(context);
    }

    public MutedAutoplayIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MutedAutoplayIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MutedAutoplayIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* JADX WARNING: Missing block: B:15:0x0026, code skipped:
            return;
     */
    public final synchronized void setVisibility(int r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.a;	 Catch:{ all -> 0x00a2 }
        if (r0 == 0) goto L_0x000e;
    L_0x0005:
        r0 = r2.getVisibility();	 Catch:{ all -> 0x00a2 }
        if (r0 == r3) goto L_0x000c;
    L_0x000b:
        goto L_0x000e;
    L_0x000c:
        monitor-exit(r2);
        return;
    L_0x000e:
        super.setVisibility(r3);	 Catch:{ all -> 0x00a2 }
        r0 = 0;
        if (r3 == 0) goto L_0x0027;
    L_0x0014:
        r3 = r2.animate();	 Catch:{ all -> 0x00a2 }
        r3.cancel();	 Catch:{ all -> 0x00a2 }
        r2.setAlpha(r0);	 Catch:{ all -> 0x00a2 }
        r3 = r2.b;	 Catch:{ all -> 0x00a2 }
        if (r3 == 0) goto L_0x0025;
    L_0x0022:
        r3.stop();	 Catch:{ all -> 0x00a2 }
    L_0x0025:
        monitor-exit(r2);
        return;
    L_0x0027:
        r2.setAlpha(r0);	 Catch:{ all -> 0x00a2 }
        r3 = r2.a;	 Catch:{ all -> 0x00a2 }
        if (r3 != 0) goto L_0x008d;
    L_0x002e:
        r3 = r2.getContext();	 Catch:{ all -> 0x00a2 }
        r0 = 2130837505; // 0x7f020001 float:1.7279966E38 double:1.052773608E-314;
        r3 = defpackage.lq.a(r3, r0);	 Catch:{ all -> 0x00a2 }
        r2.b = r3;	 Catch:{ all -> 0x00a2 }
        r3 = r2.b;	 Catch:{ all -> 0x00a2 }
        r2.setImageDrawable(r3);	 Catch:{ all -> 0x00a2 }
        r3 = r2.b;	 Catch:{ all -> 0x00a2 }
        r0 = new muh;	 Catch:{ all -> 0x00a2 }
        r0.<init>(r2);	 Catch:{ all -> 0x00a2 }
        r1 = r3.e;	 Catch:{ all -> 0x00a2 }
        if (r1 == 0) goto L_0x005e;
    L_0x004b:
        r1 = (android.graphics.drawable.AnimatedVectorDrawable) r1;	 Catch:{ all -> 0x00a2 }
        r3 = r0.a;	 Catch:{ all -> 0x00a2 }
        if (r3 != 0) goto L_0x0058;
    L_0x0051:
        r3 = new ln;	 Catch:{ all -> 0x00a2 }
        r3.<init>(r0);	 Catch:{ all -> 0x00a2 }
        r0.a = r3;	 Catch:{ all -> 0x00a2 }
    L_0x0058:
        r3 = r0.a;	 Catch:{ all -> 0x00a2 }
        r1.registerAnimationCallback(r3);	 Catch:{ all -> 0x00a2 }
        goto L_0x008a;
    L_0x005e:
        r1 = r3.c;	 Catch:{ all -> 0x00a2 }
        if (r1 != 0) goto L_0x0069;
    L_0x0062:
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x00a2 }
        r1.<init>();	 Catch:{ all -> 0x00a2 }
        r3.c = r1;	 Catch:{ all -> 0x00a2 }
    L_0x0069:
        r1 = r3.c;	 Catch:{ all -> 0x00a2 }
        r1 = r1.contains(r0);	 Catch:{ all -> 0x00a2 }
        if (r1 != 0) goto L_0x008a;
    L_0x0071:
        r1 = r3.c;	 Catch:{ all -> 0x00a2 }
        r1.add(r0);	 Catch:{ all -> 0x00a2 }
        r0 = r3.b;	 Catch:{ all -> 0x00a2 }
        if (r0 != 0) goto L_0x0081;
    L_0x007a:
        r0 = new ls;	 Catch:{ all -> 0x00a2 }
        r0.<init>(r3);	 Catch:{ all -> 0x00a2 }
        r3.b = r0;	 Catch:{ all -> 0x00a2 }
    L_0x0081:
        r0 = r3.a;	 Catch:{ all -> 0x00a2 }
        r0 = r0.b;	 Catch:{ all -> 0x00a2 }
        r3 = r3.b;	 Catch:{ all -> 0x00a2 }
        r0.addListener(r3);	 Catch:{ all -> 0x00a2 }
    L_0x008a:
        r3 = 1;
        r2.a = r3;	 Catch:{ all -> 0x00a2 }
    L_0x008d:
        r3 = r2.b;	 Catch:{ all -> 0x00a2 }
        r3.start();	 Catch:{ all -> 0x00a2 }
        r3 = r2.animate();	 Catch:{ all -> 0x00a2 }
        r0 = 1061997773; // 0x3f4ccccd float:0.8 double:5.246966156E-315;
        r3 = r3.alpha(r0);	 Catch:{ all -> 0x00a2 }
        r3.start();	 Catch:{ all -> 0x00a2 }
        monitor-exit(r2);
        return;
    L_0x00a2:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.jar.MutedAutoplayIndicator.setVisibility(int):void");
    }

    public final synchronized void a() {
        if (getVisibility() == 0) {
            this.b.start();
        }
    }
}
