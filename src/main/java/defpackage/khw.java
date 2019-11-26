package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivity;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.HashMap;
import java.util.Map;

/* renamed from: khw */
class khw extends akpl {
    public final Context a;
    public final akvo b;
    public final akkq c;
    public final aaas d;
    public final View e;
    public final akko f = akko.h().a((int) R.drawable.missing_avatar).a();
    private final gax g;
    private final View h;

    public khw(Context context, akvo akvo, akkq akkq, aaas aaas, gax gax, int i, int i2) {
        this.a = context;
        this.b = akvo;
        this.c = akkq;
        this.d = aaas;
        this.g = gax;
        View view = null;
        this.e = LayoutInflater.from(context).inflate(i, null);
        if (i2 != 0) {
            view = this.e.findViewById(i2);
        }
        this.h = view;
    }

    public void a(akpb akpb) {
    }

    /* Access modifiers changed, original: protected */
    public void a(akor akor, ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        aygk aygk = null;
        akor.a.a(reelItemRendererOuterClass$ReelItemRenderer.m.d(), null);
        Map b = akor.b();
        if ((reelItemRendererOuterClass$ReelItemRenderer.a & 512) != 0) {
            gax gax = this.g;
            apxu apxu = reelItemRendererOuterClass$ReelItemRenderer.j;
            if (apxu == null) {
                apxu = apxu.d;
            }
            int a = awwn.a(reelItemRendererOuterClass$ReelItemRenderer.l);
            if (a == 0) {
                a = 1;
            }
            gax.a(1, apxu, a == 2);
            gax = this.g;
            apxu = reelItemRendererOuterClass$ReelItemRenderer.j;
            if (apxu == null) {
                apxu = apxu.d;
            }
            apxu c = gax.c(apxu);
            if (c != null) {
                anxr access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                c.a(access$000);
                if (c.h.a(access$000.d)) {
                    Object obj;
                    Object b2;
                    aygk aygk2;
                    access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                    c.a(access$000);
                    Object b3 = c.h.b(access$000.d);
                    if (b3 == null) {
                        obj = access$000.b;
                    } else {
                        obj = access$000.a(b3);
                    }
                    if ((((ReelWatchEndpointOuterClass$ReelWatchEndpoint) obj).a & 16) != 0) {
                        access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                        c.a(access$000);
                        b2 = c.h.b(access$000.d);
                        if (b2 == null) {
                            b2 = access$000.b;
                        } else {
                            b2 = access$000.a(b2);
                        }
                        aygk2 = ((ReelWatchEndpointOuterClass$ReelWatchEndpoint) b2).f;
                        if (aygk2 == null) {
                            aygk2 = aygk.f;
                        }
                    } else {
                        aygk2 = null;
                    }
                    if (aygk2 != null) {
                        aygk = aygk2;
                    } else {
                        anxp anxp = reelItemRendererOuterClass$ReelItemRenderer.j;
                        if (anxp == null) {
                            anxp = apxu.d;
                        }
                        access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                        anxp.a(access$000);
                        b2 = anxp.h.b(access$000.d);
                        if (b2 == null) {
                            b2 = access$000.b;
                        } else {
                            b2 = access$000.a(b2);
                        }
                        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) b2;
                        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.a & 16) != 0) {
                            aygk = reelWatchEndpointOuterClass$ReelWatchEndpoint.f;
                            if (aygk == null) {
                                aygk = aygk.f;
                            }
                        }
                    }
                    if (aygk != null) {
                        this.c.a(aygk, ReelWatchActivity.b(aygk), ReelWatchActivity.a(aygk));
                        if (b == null) {
                            b = new HashMap();
                        } else {
                            b = new HashMap(b);
                        }
                        b.put("com.google.android.libraries.youtube.innertube.bundle", ReelWatchActivity.c(aygk));
                    }
                }
            }
        }
        gas gas = (gas) akor.a("ReelToReelListDecorator");
        if (gas != null) {
            b = gas.a(gas, b);
        }
        this.g.a(this.e, new khz(this, reelItemRendererOuterClass$ReelItemRenderer));
        a(reelItemRendererOuterClass$ReelItemRenderer);
        this.e.setOnClickListener(new khy(this, reelItemRendererOuterClass$ReelItemRenderer, b));
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Missing block: B:15:0x002b, code skipped:
            if (r0.d(r5) != false) goto L_0x0015;
     */
    public boolean a(com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer r5) {
        /*
        r4 = this;
        r0 = r4.h;
        r1 = 0;
        if (r0 != 0) goto L_0x0006;
    L_0x0005:
        goto L_0x0035;
    L_0x0006:
        if (r5 != 0) goto L_0x0009;
    L_0x0008:
        goto L_0x0035;
    L_0x0009:
        r0 = r5.l;
        r0 = defpackage.awwn.a(r0);
        r2 = 1;
        if (r0 == 0) goto L_0x0017;
    L_0x0012:
        r3 = 2;
        if (r0 != r3) goto L_0x0017;
    L_0x0015:
        r1 = 1;
        goto L_0x002e;
    L_0x0017:
        r0 = r4.g;
        r3 = r5.a;
        r3 = r3 & 512;
        if (r3 == 0) goto L_0x0026;
    L_0x001f:
        r5 = r5.j;
        if (r5 != 0) goto L_0x0027;
    L_0x0023:
        r5 = defpackage.apxu.d;
        goto L_0x0027;
    L_0x0026:
        r5 = 0;
    L_0x0027:
        r5 = r0.d(r5);
        if (r5 == 0) goto L_0x002e;
    L_0x002d:
        goto L_0x0015;
    L_0x002e:
        r5 = r4.h;
        r0 = r1 ^ 1;
        r5.setEnabled(r0);
    L_0x0035:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khw.a(com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer):boolean");
    }

    public final View K_() {
        return this.e;
    }
}
