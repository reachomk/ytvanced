package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLoggerCoordinator;
import com.google.android.youtube.R;

/* renamed from: nje */
public final class nje implements xcp {
    public final EmbedInteractionLoggerCoordinator a;
    public final Context b;
    public aakj c;
    public aphg d;
    private final nhv e;
    private ahkr f;
    private ahkn g;

    public nje(EmbedInteractionLoggerCoordinator embedInteractionLoggerCoordinator, nhv nhv, Context context) {
        this.a = embedInteractionLoggerCoordinator;
        this.e = nhv;
        this.b = context;
        this.e.a((int) R.id.player_share_button, new njd(this));
    }

    /* JADX WARNING: Missing block: B:13:0x0028, code skipped:
            if (r0 == 4) goto L_0x002a;
     */
    /* JADX WARNING: Missing block: B:15:0x0032, code skipped:
            if (r3.g.a.a() == false) goto L_0x0034;
     */
    /* JADX WARNING: Missing block: B:17:0x0036, code skipped:
            if (r3.d != null) goto L_0x0039;
     */
    /* JADX WARNING: Missing block: B:18:0x0039, code skipped:
            r1 = true;
     */
    private final void a() {
        /*
        r3 = this;
        r0 = r3.f;
        r1 = 0;
        if (r0 == 0) goto L_0x003a;
    L_0x0005:
        r2 = r3.g;
        if (r2 == 0) goto L_0x003a;
    L_0x0009:
        r0 = r0.c();
        if (r0 != 0) goto L_0x002a;
    L_0x000f:
        r0 = r3.f;
        r0 = r0.b();
        if (r0 != 0) goto L_0x002a;
    L_0x0017:
        r0 = r3.f;
        r0 = r0.a();
        if (r0 != 0) goto L_0x002a;
    L_0x001f:
        r0 = r3.f;
        r0 = r0.a;
        r2 = 7;
        if (r0 != r2) goto L_0x0027;
    L_0x0026:
        goto L_0x002a;
    L_0x0027:
        r2 = 4;
        if (r0 != r2) goto L_0x0034;
    L_0x002a:
        r0 = r3.g;
        r0 = r0.a;
        r0 = r0.a();
        if (r0 != 0) goto L_0x003a;
    L_0x0034:
        r0 = r3.d;
        if (r0 != 0) goto L_0x0039;
    L_0x0038:
        goto L_0x003a;
    L_0x0039:
        r1 = 1;
    L_0x003a:
        r0 = r3.e;
        r2 = 2131756477; // 0x7f1005bd float:1.9143863E38 double:1.0532276406E-314;
        r0 = r0.a(r2);
        if (r0 == r1) goto L_0x0059;
    L_0x0045:
        r0 = r3.e;
        r0.a(r2, r1);
        r0 = r3.d;
        if (r0 == 0) goto L_0x0059;
    L_0x004e:
        r1 = r3.a;
        r0 = r0.r;
        r0 = r0.d();
        r1.a(r0);
    L_0x0059:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nje.a():void");
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkf.class, ahkn.class, ahkr.class};
        } else if (i == 0) {
            aafv aafv = ((ahkf) obj).c;
            if (aafv != null) {
                akcb akcb = aafv.a;
                if (akcb != null) {
                    ajxr ajxr = akcb.e;
                    if (ajxr != null) {
                        ajxs ajxs = ajxr.b;
                        if (ajxs != null) {
                            awfm awfm = ajxs.d;
                            if (awfm != null) {
                                aphg aphg;
                                if ((awfm.a & 1) != 0) {
                                    aphg = awfm.b;
                                    if (aphg == null) {
                                        aphg = aphg.s;
                                    }
                                } else {
                                    aphg = null;
                                }
                                this.d = aphg;
                                a();
                                return null;
                            }
                        }
                        this.d = null;
                        a();
                        return null;
                    }
                }
            }
            this.d = null;
            a();
            return null;
        } else if (i == 1) {
            this.g = (ahkn) obj;
            this.c = this.g.b;
            a();
            return null;
        } else if (i == 2) {
            this.f = (ahkr) obj;
            a();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
