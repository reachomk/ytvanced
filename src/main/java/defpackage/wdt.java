package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction;
import java.util.Map;

/* renamed from: wdt */
public final class wdt {
    public final Context a;
    public final aaas b;
    public final wlx c;
    public final xoi d;

    public wdt(Context context, aaas aaas, wlx wlx, xoi xoi) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (aaas) amqw.a((Object) aaas);
        this.c = (wlx) amqw.a((Object) wlx);
        this.d = (xoi) amqw.a((Object) xoi);
    }

    public final void a(wei wei, awly awly, awlw awlw, apzc apzc, acvx acvx) {
        apxu apxu;
        UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction;
        if (awlw.d) {
            apxu = awlw.j;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = awlw.i;
            if (apxu == null) {
                apxu = apxu.d;
            }
        }
        if (apxu == null) {
            apxu = awlw.e;
            if (apxu == null) {
                apxu = apxu.d;
            }
        }
        ayro ayro = (ayro) UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.e.createBuilder();
        if ((awly.a & 8) != 0) {
            arml arml = awly.f;
            if (arml == null) {
                arml = arml.f;
            }
            ayro.copyOnWrite();
            updateBackstagePollActionOuterClass$UpdateBackstagePollAction = (UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction) ayro.instance;
            if (arml != null) {
                updateBackstagePollActionOuterClass$UpdateBackstagePollAction.c = arml;
                updateBackstagePollActionOuterClass$UpdateBackstagePollAction.a |= 4;
            } else {
                throw new NullPointerException();
            }
        }
        ayro.a(-1);
        for (int i = 0; i < awly.c.size(); i++) {
            if (((awlw) awly.c.get(i)).d) {
                ayro.a(i);
                break;
            }
        }
        if (apzc != null) {
            ayro.copyOnWrite();
            updateBackstagePollActionOuterClass$UpdateBackstagePollAction = (UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction) ayro.instance;
            updateBackstagePollActionOuterClass$UpdateBackstagePollAction.a |= 2;
            updateBackstagePollActionOuterClass$UpdateBackstagePollAction.b = apzc.f;
        }
        UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction2 = (UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction) ((anxl) ayro.build());
        Map zjVar = new zj(2);
        zjVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", new wdv(this, wei, updateBackstagePollActionOuterClass$UpdateBackstagePollAction2, awly));
        zjVar.put("com.google.android.libraries.youtube.comment.action_tag", new wdy(this, wei, awly));
        if (!(acvx == null || (awly.a & 4) == 0)) {
            acvx.a(3, new acvs(awly.d.d()), null);
        }
        this.b.a(apxu, zjVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b7 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARNING: Missing block: B:14:0x004a, code skipped:
            if (r4 != defpackage.apzc.COMMENT_POLL_STATUS_NO_VOTE) goto L_0x004c;
     */
    public final void a(java.lang.String r7, defpackage.awly r8, com.google.protos.youtube.api.innertube.UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction r9) {
        /*
        r6 = this;
        r0 = r8.toBuilder();
        r0 = (defpackage.anxo) r0;
        r0 = (defpackage.awmb) r0;
        r1 = r9.c;
        if (r1 != 0) goto L_0x000e;
    L_0x000c:
        r1 = defpackage.arml.f;
    L_0x000e:
        r0.copyOnWrite();
        r2 = r0.instance;
        r2 = (defpackage.awly) r2;
        if (r1 == 0) goto L_0x00e7;
    L_0x0017:
        r2.f = r1;
        r1 = r2.a;
        r1 = r1 | 8;
        r2.a = r1;
        r1 = 0;
        r2 = 0;
    L_0x0021:
        r3 = r8.c;
        r3 = r3.size();
        if (r2 >= r3) goto L_0x00c8;
    L_0x0029:
        r3 = r8.c;
        r3 = r3.get(r2);
        r3 = (defpackage.awlw) r3;
        r3 = r3.toBuilder();
        r3 = (defpackage.anxo) r3;
        r3 = (defpackage.awlz) r3;
        r4 = r9.d;
        if (r4 == 0) goto L_0x003e;
    L_0x003d:
        goto L_0x004c;
    L_0x003e:
        r4 = r9.b;
        r4 = defpackage.apzc.a(r4);
        if (r4 != 0) goto L_0x0048;
    L_0x0046:
        r4 = defpackage.apzc.COMMENT_POLL_STATUS_UNKNOWN;
    L_0x0048:
        r5 = defpackage.apzc.COMMENT_POLL_STATUS_NO_VOTE;
        if (r4 == r5) goto L_0x0088;
    L_0x004c:
        r4 = r9.d;
        r5 = -1;
        if (r4 == r5) goto L_0x0088;
    L_0x0051:
        if (r4 == r2) goto L_0x006d;
    L_0x0053:
        r3.a(r1);
        r4 = r3.instance;
        r4 = (defpackage.awlw) r4;
        r4 = r4.m;
        r3.a(r4);
        r4 = r3.instance;
        r4 = (defpackage.awlw) r4;
        r4 = r4.n;
        if (r4 != 0) goto L_0x0069;
    L_0x0067:
        r4 = defpackage.arml.f;
    L_0x0069:
        r3.a(r4);
        goto L_0x00a0;
    L_0x006d:
        r4 = 1;
        r3.a(r4);
        r4 = r3.instance;
        r4 = (defpackage.awlw) r4;
        r4 = r4.k;
        r3.a(r4);
        r4 = r3.instance;
        r4 = (defpackage.awlw) r4;
        r4 = r4.l;
        if (r4 != 0) goto L_0x0084;
    L_0x0082:
        r4 = defpackage.arml.f;
    L_0x0084:
        r3.a(r4);
        goto L_0x00a0;
    L_0x0088:
        r3.a(r1);
        r4 = 0;
        r3.a(r4);
        r3.copyOnWrite();
        r4 = r3.instance;
        r4 = (defpackage.awlw) r4;
        r5 = 0;
        r4.g = r5;
        r5 = r4.a;
        r5 = r5 & -33;
        r4.a = r5;
    L_0x00a0:
        r0.copyOnWrite();
        r4 = r0.instance;
        r4 = (defpackage.awly) r4;
        r5 = r4.c;
        r5 = r5.a();
        if (r5 != 0) goto L_0x00b7;
    L_0x00af:
        r5 = r4.c;
        r5 = defpackage.anxl.mutableCopy(r5);
        r4.c = r5;
    L_0x00b7:
        r4 = r4.c;
        r3 = r3.build();
        r3 = (defpackage.anxl) r3;
        r3 = (defpackage.awlw) r3;
        r4.set(r2, r3);
        r2 = r2 + 1;
        goto L_0x0021;
    L_0x00c8:
        r1 = r6.c;
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.awly) r0;
        r1.a(r7, r0);
        r0 = r6.c;
        r1 = r8.i;
        r8 = r9.b;
        r8 = defpackage.apzc.a(r8);
        if (r8 != 0) goto L_0x00e3;
    L_0x00e1:
        r8 = defpackage.apzc.COMMENT_POLL_STATUS_UNKNOWN;
    L_0x00e3:
        r0.a(r7, r1, r8);
        return;
    L_0x00e7:
        r7 = new java.lang.NullPointerException;
        r7.<init>();
        goto L_0x00ee;
    L_0x00ed:
        throw r7;
    L_0x00ee:
        goto L_0x00ed;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wdt.a(java.lang.String, awly, com.google.protos.youtube.api.innertube.UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction):void");
    }
}
