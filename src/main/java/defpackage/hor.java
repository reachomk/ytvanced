package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.LikeEndpointOuterClass$LikeEndpoint;
import com.google.protos.youtube.api.innertube.ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand;

/* renamed from: hor */
public final class hor extends hnn {
    private final Context a;
    private final zyw b;

    public hor(Context context, zyw zyw) {
        super(agqp.class, axpw.class);
        this.a = context;
        this.b = zyw;
    }

    private static axpe a(axpc axpc) {
        axpd axpd = (axpd) axpe.c.createBuilder();
        axpd.a(axpc);
        return (axpe) ((anxl) axpd.build());
    }

    private static axpc a(String str, arwh arwh, String str2, auac auac, boolean z) {
        aphf aphf = (aphf) aphg.s.createBuilder();
        aphf.a(ajqy.a(str2));
        arwe arwe = (arwe) arwf.c.createBuilder();
        arwe.a(arwh);
        aphf.a(arwe);
        if (z) {
            hor.a(aphf);
        } else {
            apxx apxx = (apxx) apxu.d.createBuilder();
            anxr anxr = LikeEndpointOuterClass$LikeEndpoint.likeEndpoint;
            atzu atzu = (atzu) LikeEndpointOuterClass$LikeEndpoint.e.createBuilder();
            atzu.a(auac);
            auag auag = (auag) auad.d.createBuilder();
            auag.a(str);
            atzu.a(auag);
            apxx.a(anxr, (LikeEndpointOuterClass$LikeEndpoint) ((anxl) atzu.build()));
            aphf.a(apxx);
        }
        axpb axpb = (axpb) axpc.f.createBuilder();
        aphm aphm = (aphm) aphj.d.createBuilder();
        aphm.a(aphf);
        axpb.a(aphm);
        return (axpc) ((anxl) axpb.build());
    }

    private static void a(aphf aphf) {
        ayew ayew = (ayew) ayet.d.createBuilder();
        ayem ayem = ayem.THEME_ATTRIBUTE_ICON_DISABLED;
        ayew.copyOnWrite();
        ayet ayet = (ayet) ayew.instance;
        if (ayem != null) {
            ayet.a |= 2;
            ayet.c = ayem.N;
            ayem = ayem.THEME_ATTRIBUTE_TEXT_DISABLED;
            ayew.copyOnWrite();
            ayet = (ayet) ayew.instance;
            if (ayem != null) {
                ayet.a |= 1;
                ayet.b = ayem.N;
                aphf.copyOnWrite();
                aphg aphg = (aphg) aphf.instance;
                aphg.c = (anxl) ayew.build();
                aphg.b = 20;
                apxx apxx = (apxx) apxu.d.createBuilder();
                apxx.a(ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.showNoConnectionBarCommand, ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.a);
                aphf.a(apxx);
                return;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0293  */
    public final /* synthetic */ java.lang.Object a(java.lang.Object r11, defpackage.amur r12) {
        /*
        r10 = this;
        r11 = (defpackage.agqp) r11;
        r12 = defpackage.axpw.e;
        r12 = r12.createBuilder();
        r12 = (defpackage.axpz) r12;
        r0 = r11.a();
        r12.copyOnWrite();
        r1 = r12.instance;
        r1 = (defpackage.axpw) r1;
        if (r0 == 0) goto L_0x02f5;
    L_0x0017:
        r2 = r1.a;
        r3 = 1;
        r2 = r2 | r3;
        r1.a = r2;
        r1.c = r0;
        r0 = r10.a;
        r1 = new java.lang.Object[r3];
        r4 = r11.g();
        r2 = java.lang.Long.valueOf(r4);
        r4 = 0;
        r1[r4] = r2;
        r2 = 2131953862; // 0x7f1308c6 float:1.9544207E38 double:1.0533251617E-314;
        r0 = r0.getString(r2, r1);
        r1 = defpackage.axak.a;
        r1 = r1.createBuilder();
        r1 = (defpackage.axaj) r1;
        r2 = com.google.protos.youtube.api.innertube.SlimVideoMetadataSectionRendererOuterClass.slimVideoInformationRenderer;
        r5 = defpackage.axpu.i;
        r5 = r5.createBuilder();
        r5 = (defpackage.axpx) r5;
        r6 = new java.lang.String[r3];
        r7 = r11.b();
        r6[r4] = r7;
        r6 = defpackage.ajqy.a(r6);
        r5.copyOnWrite();
        r7 = r5.instance;
        r7 = (defpackage.axpu) r7;
        if (r6 == 0) goto L_0x02ef;
    L_0x005c:
        r7.b = r6;
        r6 = r7.a;
        r6 = r6 | r3;
        r7.a = r6;
        r6 = new java.lang.String[r3];
        r6[r4] = r0;
        r6 = defpackage.ajqy.a(r6);
        r5.copyOnWrite();
        r7 = r5.instance;
        r7 = (defpackage.axpu) r7;
        if (r6 == 0) goto L_0x02e9;
    L_0x0074:
        r7.c = r6;
        r6 = r7.a;
        r6 = r6 | 2;
        r7.a = r6;
        r6 = new java.lang.String[r3];
        r6[r4] = r0;
        r0 = defpackage.ajqy.a(r6);
        r5.copyOnWrite();
        r6 = r5.instance;
        r6 = (defpackage.axpu) r6;
        if (r0 == 0) goto L_0x02e3;
    L_0x008d:
        r6.d = r0;
        r0 = r6.a;
        r0 = r0 | 4;
        r6.a = r0;
        r0 = r5.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.axpu) r0;
        r1.a(r2, r0);
        r0 = r1.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.axak) r0;
        r12.a(r0);
        r0 = r10.a;
        r1 = r10.b;
        r2 = r11.a();
        r5 = r1.a();
        if (r5 == 0) goto L_0x00c6;
    L_0x00b9:
        r5 = r5.e;
        if (r5 != 0) goto L_0x00bf;
    L_0x00bd:
        r5 = defpackage.aulu.bw;
    L_0x00bf:
        r5 = r5.bl;
        if (r5 != 0) goto L_0x00c4;
    L_0x00c3:
        goto L_0x00c6;
    L_0x00c4:
        r5 = 1;
        goto L_0x00c7;
    L_0x00c6:
        r5 = 0;
    L_0x00c7:
        r1 = r1.a();
        if (r1 == 0) goto L_0x00da;
    L_0x00cd:
        r1 = r1.e;
        if (r1 != 0) goto L_0x00d3;
    L_0x00d1:
        r1 = defpackage.aulu.bw;
    L_0x00d3:
        r1 = r1.bm;
        if (r1 != 0) goto L_0x00d8;
    L_0x00d7:
        goto L_0x00da;
    L_0x00d8:
        r1 = 1;
        goto L_0x00db;
    L_0x00da:
        r1 = 0;
    L_0x00db:
        r6 = defpackage.axpr.f;
        r6 = r6.createBuilder();
        r6 = (defpackage.axpt) r6;
        r7 = defpackage.arwh.LIKE;
        r8 = r11.d();
        r9 = defpackage.auac.LIKE;
        r7 = defpackage.hor.a(r2, r7, r8, r9, r1);
        r7 = defpackage.hor.a(r7);
        r6.a(r7);
        r7 = defpackage.arwh.DISLIKE;
        r8 = r11.e();
        r9 = defpackage.auac.DISLIKE;
        r2 = defpackage.hor.a(r2, r7, r8, r9, r1);
        r2 = defpackage.hor.a(r2);
        r6.a(r2);
        if (r5 == 0) goto L_0x015f;
    L_0x010b:
        r2 = defpackage.aphg.s;
        r2 = r2.createBuilder();
        r2 = (defpackage.aphf) r2;
        r7 = defpackage.arwf.c;
        r7 = r7.createBuilder();
        r7 = (defpackage.arwe) r7;
        r8 = defpackage.arwh.SHARE_ARROW;
        r7.a(r8);
        r2.a(r7);
        r7 = new java.lang.String[r3];
        r8 = 2131953033; // 0x7f130589 float:1.9542526E38 double:1.053324752E-314;
        r8 = r0.getString(r8);
        r7[r4] = r8;
        r7 = defpackage.ajqy.a(r7);
        r2.a(r7);
        if (r1 == 0) goto L_0x013a;
    L_0x0137:
        defpackage.hor.a(r2);
    L_0x013a:
        r7 = defpackage.axpc.f;
        r7 = r7.createBuilder();
        r7 = (defpackage.axpb) r7;
        r8 = defpackage.aphj.d;
        r8 = r8.createBuilder();
        r8 = (defpackage.aphm) r8;
        r8.a(r2);
        r7.a(r8);
        r2 = r7.build();
        r2 = (defpackage.anxl) r2;
        r2 = (defpackage.axpc) r2;
        r2 = defpackage.hor.a(r2);
        r6.a(r2);
    L_0x015f:
        r2 = defpackage.axpc.f;
        r2 = r2.createBuilder();
        r2 = (defpackage.axpb) r2;
        r7 = defpackage.aphj.d;
        r7 = r7.createBuilder();
        r7 = (defpackage.aphm) r7;
        r8 = defpackage.aphg.s;
        r7.a(r8);
        r2.a(r7);
        r2.a();
        r7 = new java.lang.String[r3];
        r8 = 2131952976; // 0x7f130550 float:1.954241E38 double:1.053324724E-314;
        r8 = r0.getString(r8);
        r7[r4] = r8;
        r7 = defpackage.ajqy.a(r7);
        r2.a(r7);
        r2 = r2.build();
        r2 = (defpackage.anxl) r2;
        r2 = (defpackage.axpc) r2;
        r2 = defpackage.hor.a(r2);
        r6.a(r2);
        if (r5 != 0) goto L_0x019e;
    L_0x019d:
        goto L_0x01f2;
    L_0x019e:
        r2 = defpackage.aphg.s;
        r2 = r2.createBuilder();
        r2 = (defpackage.aphf) r2;
        r5 = defpackage.arwf.c;
        r5 = r5.createBuilder();
        r5 = (defpackage.arwe) r5;
        r7 = defpackage.arwh.ADD_TO_PLAYLIST;
        r5.a(r7);
        r2.a(r5);
        r5 = new java.lang.String[r3];
        r7 = 2131953032; // 0x7f130588 float:1.9542524E38 double:1.0533247517E-314;
        r0 = r0.getString(r7);
        r5[r4] = r0;
        r0 = defpackage.ajqy.a(r5);
        r2.a(r0);
        if (r1 == 0) goto L_0x01cd;
    L_0x01ca:
        defpackage.hor.a(r2);
    L_0x01cd:
        r0 = defpackage.axpc.f;
        r0 = r0.createBuilder();
        r0 = (defpackage.axpb) r0;
        r1 = defpackage.aphj.d;
        r1 = r1.createBuilder();
        r1 = (defpackage.aphm) r1;
        r1.a(r2);
        r0.a(r1);
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.axpc) r0;
        r0 = defpackage.hor.a(r0);
        r6.a(r0);
    L_0x01f2:
        r0 = defpackage.axak.a;
        r0 = r0.createBuilder();
        r0 = (defpackage.axaj) r0;
        r1 = com.google.protos.youtube.api.innertube.SlimVideoMetadataSectionRendererOuterClass.slimVideoActionBarRenderer;
        r2 = r6.build();
        r2 = (defpackage.anxl) r2;
        r2 = (defpackage.axpr) r2;
        r0.a(r1, r2);
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.axak) r0;
        r12.a(r0);
        r0 = new ett;
        r0.<init>();
        r1 = r11.a;
        if (r1 == 0) goto L_0x022c;
    L_0x021b:
        r1 = r1.b;
        r0.a(r1);
        r1 = r11.a;
        r1 = r1.c;
        if (r1 == 0) goto L_0x022c;
    L_0x0226:
        r1 = r1.d();
        r0.a = r1;
    L_0x022c:
        r0 = r0.a();
        r1 = new ajzw;
        r1.<init>();
        if (r0 != 0) goto L_0x0238;
    L_0x0237:
        goto L_0x023d;
    L_0x0238:
        r2 = r0.I;
        r1.a(r2, r0);
    L_0x023d:
        r0 = defpackage.ajzv.a(r1);
        r12.a(r0);
        r0 = r10.a;
        r1 = defpackage.arml.f;
        r1 = r1.createBuilder();
        r1 = (defpackage.armk) r1;
        r2 = r11.d;
        if (r2 == 0) goto L_0x026d;
    L_0x0252:
        r2 = defpackage.armp.m;
        r2 = r2.createBuilder();
        r2 = (defpackage.armo) r2;
        r2.a();
        r0 = android.text.format.DateFormat.getLongDateFormat(r0);
        r4 = r11.d;
        r0 = r0.format(r4);
        r2.a(r0);
        r1.a(r2);
    L_0x026d:
        r0 = defpackage.axps.e;
        r0 = r0.createBuilder();
        r0 = (defpackage.axpv) r0;
        r0.copyOnWrite();
        r2 = r0.instance;
        r2 = (defpackage.axps) r2;
        r1 = r1.build();
        r1 = (defpackage.anxl) r1;
        r1 = (defpackage.arml) r1;
        r2.b = r1;
        r1 = r2.a;
        r1 = r1 | r3;
        r2.a = r1;
        r11 = r11.e;
        r1 = r11.a;
        r1 = r1 & 512;
        if (r1 == 0) goto L_0x02b1;
    L_0x0293:
        r11 = r11.j;
        if (r11 != 0) goto L_0x0299;
    L_0x0297:
        r11 = defpackage.arml.f;
    L_0x0299:
        r0.copyOnWrite();
        r1 = r0.instance;
        r1 = (defpackage.axps) r1;
        if (r11 == 0) goto L_0x02ab;
    L_0x02a2:
        r1.c = r11;
        r11 = r1.a;
        r11 = r11 | 2;
        r1.a = r11;
        goto L_0x02b1;
    L_0x02ab:
        r11 = new java.lang.NullPointerException;
        r11.<init>();
        throw r11;
    L_0x02b1:
        r11 = defpackage.axak.a;
        r11 = r11.createBuilder();
        r11 = (defpackage.axaj) r11;
        r1 = com.google.protos.youtube.api.innertube.SlimVideoMetadataSectionRendererOuterClass.slimVideoDescriptionRenderer;
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.axps) r0;
        r11.a(r1, r0);
        r11 = r11.build();
        r11 = (defpackage.anxl) r11;
        r11 = (defpackage.axak) r11;
        r12.a(r11);
        r11 = defpackage.axpq.b;
        r0 = java.lang.Boolean.valueOf(r3);
        r12.a(r11, r0);
        r11 = r12.build();
        r11 = (defpackage.anxl) r11;
        r11 = (defpackage.axpw) r11;
        return r11;
    L_0x02e3:
        r11 = new java.lang.NullPointerException;
        r11.<init>();
        throw r11;
    L_0x02e9:
        r11 = new java.lang.NullPointerException;
        r11.<init>();
        throw r11;
    L_0x02ef:
        r11 = new java.lang.NullPointerException;
        r11.<init>();
        throw r11;
    L_0x02f5:
        r11 = new java.lang.NullPointerException;
        r11.<init>();
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hor.a(java.lang.Object, amur):java.lang.Object");
    }
}
