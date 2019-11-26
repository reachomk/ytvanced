package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import java.util.HashMap;
import java.util.Map;

/* renamed from: vzj */
public final class vzj implements OnClickListener {
    public vzm a;
    private final ImageButton b;
    private vtf c;
    private final aaas d;

    public vzj(ImageButton imageButton, aaas aaas) {
        this.b = (ImageButton) amqw.a((Object) imageButton);
        this.d = (aaas) amqw.a((Object) aaas);
        imageButton.setOnClickListener(this);
        a();
    }

    public final void a(vtf vtf) {
        this.c = vtf;
        a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    private final void a() {
        /*
        r5 = this;
        r0 = r5.c;
        r1 = 0;
        if (r0 != 0) goto L_0x0007;
    L_0x0005:
        r0 = 0;
        goto L_0x005d;
    L_0x0007:
        r2 = r0.b;
        if (r2 != 0) goto L_0x000e;
    L_0x000b:
        r0 = r0.c;
        goto L_0x0010;
    L_0x000e:
        r0 = r0.d;
    L_0x0010:
        if (r0 == 0) goto L_0x003b;
    L_0x0012:
        r2 = defpackage.vtf.a;
        r3 = r0.b;
        r3 = defpackage.arwh.a(r3);
        if (r3 != 0) goto L_0x001e;
    L_0x001c:
        r3 = defpackage.arwh.UNKNOWN;
    L_0x001e:
        r2 = r2.containsKey(r3);
        if (r2 == 0) goto L_0x003b;
    L_0x0024:
        r2 = defpackage.vtf.a;
        r0 = r0.b;
        r0 = defpackage.arwh.a(r0);
        if (r0 != 0) goto L_0x0030;
    L_0x002e:
        r0 = defpackage.arwh.UNKNOWN;
    L_0x0030:
        r0 = r2.get(r0);
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        goto L_0x003c;
    L_0x003b:
        r0 = 0;
    L_0x003c:
        if (r0 != 0) goto L_0x003f;
    L_0x003e:
        goto L_0x0044;
    L_0x003f:
        r2 = r5.b;
        r2.setImageResource(r0);
    L_0x0044:
        r2 = r5.b;
        r3 = r5.c;
        r3 = r3.b;
        r2.setSelected(r3);
        r2 = r5.b;
        r3 = r5.c;
        r4 = r3.b;
        if (r4 != 0) goto L_0x0058;
    L_0x0055:
        r3 = r3.g;
        goto L_0x005a;
    L_0x0058:
        r3 = r3.h;
    L_0x005a:
        r2.setContentDescription(r3);
    L_0x005d:
        r2 = r5.b;
        if (r0 == 0) goto L_0x0062;
    L_0x0061:
        r1 = 1;
    L_0x0062:
        defpackage.xpr.a(r2, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vzj.a():void");
    }

    public final void a(boolean z) {
        vtf vtf = this.c;
        if (vtf != null) {
            vtf.b = z;
            a();
        }
    }

    public final void onClick(View view) {
        vtf vtf = this.c;
        if (vtf != null) {
            apxu apxu;
            if (vtf.b) {
                apxu = vtf.f;
            } else {
                apxu = vtf.e;
            }
            if (apxu != null) {
                Map hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.c);
                this.d.a(apxu, hashMap);
                vtf = this.c;
                vtf.b ^= 1;
                a();
                vzm vzm = this.a;
                if (vzm != null) {
                    vzm.a();
                }
            }
        }
    }
}
