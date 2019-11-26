package defpackage;

import android.util.Base64;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: aags */
public final class aags extends afns {
    private aagr a;

    private aags() {
    }

    public final int a() {
        return 1;
    }

    public aags(aagr aagr) {
        this.a = aagr;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(JSONObject jSONObject) {
        Object name;
        afns.b(jSONObject, "impressionUris", this.a.b);
        afns.a(jSONObject, "adVideoId", (Object) this.a.c);
        afns.a(jSONObject, "originalVideoId", (Object) this.a.d);
        afns.a(jSONObject, "contentPlayerAdParams", (Object) this.a.e);
        afns.a(jSONObject, "contentPlayerAdNextParams", (Object) this.a.f);
        afns.a(jSONObject, "adPlayerAdNextParams", (Object) this.a.g);
        byte[] bArr = this.a.h;
        afns.a(jSONObject, "requestTrackingParams", bArr != null ? Base64.encodeToString(bArr, 2) : null);
        afns.a(jSONObject, "adBreakId", (Object) this.a.i);
        afns.a(jSONObject, "vastAdId", (Object) this.a.k);
        afns.a(jSONObject, "vastAdSystem", (Object) this.a.l);
        aagc aagc = this.a.m;
        if (aagc != null) {
            name = aagc.name();
        } else {
            name = JSONObject.NULL;
        }
        jSONObject.put("billingPartner", name);
        afns.a(jSONObject, "adFormat", (Object) this.a.n);
        jSONObject.put("duration", this.a.o);
        aakj aakj = this.a.p;
        if (aakj != null) {
            afns.a(jSONObject, "playerResponse", (Object) Base64.encodeToString(aakj.w(), 2));
        }
        afns.a(jSONObject, "playbackTracking", (Object) Base64.encodeToString(this.a.q.k.toByteArray(), 2));
        afns.a(jSONObject, "playerConfig", (Object) Base64.encodeToString(this.a.r.aF(), 2));
        afns.a(jSONObject, "clickthroughUri", (Object) this.a.t);
        afns.b(jSONObject, "startPingUris", this.a.u);
        afns.b(jSONObject, "firstQuartilePingUris", this.a.v);
        afns.b(jSONObject, "midpointPingUris", this.a.w);
        afns.b(jSONObject, "thirdQuartilePingUris", this.a.x);
        afns.a(jSONObject, "progressPings", (List) this.a.y);
        afns.b(jSONObject, "skipPingUris", this.a.z);
        afns.b(jSONObject, "skipShownPingUris", this.a.A);
        afns.b(jSONObject, "engagedViewPingUris", this.a.B);
        afns.b(jSONObject, "completePingUris", this.a.C);
        afns.b(jSONObject, "closePingUris", this.a.E);
        afns.b(jSONObject, "pausePingUris", this.a.F);
        afns.b(jSONObject, "resumePingUris", this.a.G);
        afns.b(jSONObject, "mutePingUris", this.a.H);
        afns.b(jSONObject, "fullscreenPingUris", this.a.I);
        afns.b(jSONObject, "endFullscreenPingUris", this.a.J);
        afns.b(jSONObject, "clickthroughPingUris", this.a.K);
        afns.b(jSONObject, "videoTitleClickedPingUris", this.a.L);
        afns.b(jSONObject, "errorPingUris", this.a.M);
        afns.b(jSONObject, "exclusionReasonPingUris", this.a.N);
        afns.b(jSONObject, "abandonPingUris", this.a.O);
        afns.b(jSONObject, "instreamAdCompletePingUris", this.a.D);
        afns.a(jSONObject, "videoAdTrackingTemplateUri", (Object) this.a.P);
        afns.a(jSONObject, "adSenseBaseConversionUri", (Object) this.a.Q);
        jSONObject.put("fallbackHint", this.a.R);
        jSONObject.put("expirationTimeMillis", this.a.S);
        jSONObject.put("assetFrequencyCap", this.a.T);
        jSONObject.put("isPublicVideo", this.a.U);
        aovw aovw = this.a.V;
        if (aovw != null) {
            afns.a(jSONObject, "adAnnotations", (Object) Base64.encodeToString(aovw.toByteArray(), 2));
        }
        ajwf ajwf = this.a.W;
        if (ajwf != null) {
            afns.a(jSONObject, "adInfoCards", (Object) Base64.encodeToString(aocf.toByteArray(ajwf), 2));
        }
        awcq awcq = this.a.s;
        if (awcq != null) {
            afns.a(jSONObject, "playerAttestation", (Object) Base64.encodeToString(awcq.toByteArray(), 2));
        }
        jSONObject.put("requestTimeMilliseconds", this.a.aa);
        jSONObject.put("offlineShouldCountPlayback", this.a.ab);
        jSONObject.put("shouldAllowQueuedOfflinePings", this.a.ac);
        afns.a(jSONObject, "adWrapperUri", (Object) this.a.X);
        afns.a(jSONObject, "prefetchedAd", (afnt) this.a.Y);
        afns.a(jSONObject, "parentWrapper", (afnt) this.a.Z);
        afns.a(jSONObject, "infoCards", (List) this.a.ad);
        afns.a(jSONObject, "survey", (afnt) this.a.ae);
        afns.b(jSONObject, "activeViewGroupMViewablePingUris", this.a.ag);
        afns.b(jSONObject, "activeViewViewablePingUris", this.a.ah);
        afns.b(jSONObject, "activeViewMeasurablePingUris", this.a.ai);
        jSONObject.put("isSurveyEnabled", this.a.af);
        Pattern pattern = this.a.aj;
        if (pattern == null) {
            name = "";
        } else {
            name = pattern.pattern();
        }
        afns.a(jSONObject, "trackingDecorationRegexpPattern", name);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x02ad  */
    public final /* synthetic */ java.lang.Object b(org.json.JSONObject r70, int r71) {
        /*
        r69 = this;
        r0 = r69;
        r1 = r70;
        r2 = 1;
        r3 = r71;
        if (r3 != r2) goto L_0x0324;
    L_0x0009:
        r2 = new aagr;
        r3 = "impressionUris";
        r4 = defpackage.afns.e(r1, r3);
        r3 = "adVideoId";
        r5 = defpackage.afns.a(r1, r3);
        r3 = "originalVideoId";
        r6 = defpackage.afns.a(r1, r3);
        r3 = "contentPlayerAdParams";
        r7 = defpackage.afns.a(r1, r3);
        r3 = "contentPlayerAdNextParams";
        r8 = defpackage.afns.a(r1, r3);
        r3 = "adPlayerAdNextParams";
        r9 = defpackage.afns.a(r1, r3);
        r3 = "requestTrackingParams";
        r3 = defpackage.afns.a(r1, r3);
        r10 = android.text.TextUtils.isEmpty(r3);
        r11 = 2;
        if (r10 != 0) goto L_0x0042;
    L_0x003c:
        r3 = android.util.Base64.decode(r3, r11);
        r10 = r3;
        goto L_0x0043;
    L_0x0042:
        r10 = 0;
    L_0x0043:
        r3 = "adBreakId";
        r13 = defpackage.afns.a(r1, r3);
        r3 = "vastAdId";
        r14 = defpackage.afns.a(r1, r3);
        r3 = "vastAdSystem";
        r15 = defpackage.afns.a(r1, r3);
        r3 = "billingPartner";
        r12 = defpackage.aagc.class;
        r16 = r1.isNull(r3);
        if (r16 != 0) goto L_0x0068;
    L_0x005f:
        r3 = r1.getString(r3);
        r12 = java.lang.Enum.valueOf(r12, r3);
        goto L_0x0069;
    L_0x0068:
        r12 = 0;
    L_0x0069:
        r16 = r12;
        r16 = (defpackage.aagc) r16;
        r3 = "adFormat";
        r17 = defpackage.afns.a(r1, r3);
        r3 = "duration";
        r18 = r1.getInt(r3);
        r3 = "playerResponse";
        r3 = defpackage.afns.a(r1, r3);
        r12 = android.text.TextUtils.isEmpty(r3);
        if (r12 != 0) goto L_0x0092;
    L_0x0085:
        r3 = android.util.Base64.decode(r3, r11);
        r11 = 0;
        r3 = defpackage.aakj.a(r3, r11);
        r20 = r3;
        goto L_0x0094;
    L_0x0092:
        r20 = 0;
    L_0x0094:
        r3 = "playbackTracking";
        r3 = defpackage.afns.a(r1, r3);
        r11 = android.text.TextUtils.isEmpty(r3);
        if (r11 == 0) goto L_0x00a9;
    L_0x00a0:
        r3 = new aakh;
        r3.<init>();
        r21 = r3;
        r11 = 2;
        goto L_0x00b4;
    L_0x00a9:
        r11 = 2;
        r3 = android.util.Base64.decode(r3, r11);
        r3 = defpackage.aakh.a(r3);
        r21 = r3;
    L_0x00b4:
        r3 = "playerConfig";
        r3 = defpackage.afns.a(r1, r3);
        r12 = android.text.TextUtils.isEmpty(r3);
        if (r12 == 0) goto L_0x00c5;
    L_0x00c0:
        r3 = defpackage.aajj.b;
    L_0x00c2:
        r22 = r3;
        goto L_0x00e9;
    L_0x00c5:
        r3 = android.util.Base64.decode(r3, r11);
        r11 = defpackage.awdg.J;
        r11 = r11.createBuilder();
        r11 = (defpackage.awdf) r11;
        r12 = defpackage.anxa.c();	 Catch:{ anyg -> 0x00e6 }
        r11.mergeFrom(r3, r12);	 Catch:{ anyg -> 0x00e6 }
        r3 = new aajj;
        r11 = r11.build();
        r11 = (defpackage.anxl) r11;
        r11 = (defpackage.awdg) r11;
        r3.<init>(r11);
        goto L_0x00c2;
    L_0x00e6:
        r3 = defpackage.aajj.b;
        goto L_0x00c2;
    L_0x00e9:
        r3 = "playerAttestation";
        r3 = defpackage.afns.a(r1, r3);
        r11 = android.text.TextUtils.isEmpty(r3);
        if (r11 != 0) goto L_0x0119;
    L_0x00f5:
        r11 = 2;
        r3 = android.util.Base64.decode(r3, r11);
        r11 = defpackage.awcq.c;	 Catch:{ anyg -> 0x0119 }
        r11 = r11.createBuilder();	 Catch:{ anyg -> 0x0119 }
        r11 = (defpackage.awcp) r11;	 Catch:{ anyg -> 0x0119 }
        r12 = defpackage.anxa.c();	 Catch:{ anyg -> 0x0119 }
        r3 = r11.mergeFrom(r3, r12);	 Catch:{ anyg -> 0x0119 }
        r3 = (defpackage.anvi) r3;	 Catch:{ anyg -> 0x0119 }
        r3 = (defpackage.awcp) r3;	 Catch:{ anyg -> 0x0119 }
        r3 = r3.build();	 Catch:{ anyg -> 0x0119 }
        r3 = (defpackage.anxl) r3;	 Catch:{ anyg -> 0x0119 }
        r3 = (defpackage.awcq) r3;	 Catch:{ anyg -> 0x0119 }
        r23 = r3;
        goto L_0x011b;
    L_0x0119:
        r23 = 0;
    L_0x011b:
        r3 = "clickthroughUri";
        r24 = defpackage.afns.c(r1, r3);
        r3 = "startPingUris";
        r25 = defpackage.afns.e(r1, r3);
        r3 = "firstQuartilePingUris";
        r26 = defpackage.afns.e(r1, r3);
        r3 = "midpointPingUris";
        r27 = defpackage.afns.e(r1, r3);
        r3 = "thirdQuartilePingUris";
        r28 = defpackage.afns.e(r1, r3);
        r3 = defpackage.aagv.d;
        r11 = "progressPings";
        r29 = r3.d(r1, r11);
        r3 = "skipPingUris";
        r30 = defpackage.afns.e(r1, r3);
        r3 = "skipShownPingUris";
        r31 = defpackage.afns.e(r1, r3);
        r3 = "engagedViewPingUris";
        r32 = defpackage.afns.e(r1, r3);
        r3 = "completePingUris";
        r33 = defpackage.afns.e(r1, r3);
        r3 = "closePingUris";
        r34 = defpackage.afns.e(r1, r3);
        r3 = "pausePingUris";
        r35 = defpackage.afns.e(r1, r3);
        r3 = "resumePingUris";
        r36 = defpackage.afns.e(r1, r3);
        r3 = "mutePingUris";
        r37 = defpackage.afns.e(r1, r3);
        r3 = "fullscreenPingUris";
        r38 = defpackage.afns.e(r1, r3);
        r3 = "endFullscreenPingUris";
        r39 = defpackage.afns.e(r1, r3);
        r3 = "clickthroughPingUris";
        r40 = defpackage.afns.e(r1, r3);
        r3 = "videoTitleClickedPingUris";
        r41 = defpackage.afns.e(r1, r3);
        r3 = "errorPingUris";
        r42 = defpackage.afns.e(r1, r3);
        r3 = "exclusionReasonPingUris";
        r43 = defpackage.afns.e(r1, r3);
        r3 = "abandonPingUris";
        r11 = r1.has(r3);
        if (r11 == 0) goto L_0x01a4;
    L_0x019d:
        r3 = defpackage.afns.e(r1, r3);
        r44 = r3;
        goto L_0x01a6;
    L_0x01a4:
        r44 = 0;
    L_0x01a6:
        r3 = "instreamAdCompletePingUris";
        r11 = r1.has(r3);
        if (r11 == 0) goto L_0x01b5;
    L_0x01ae:
        r3 = defpackage.afns.e(r1, r3);
        r45 = r3;
        goto L_0x01b7;
    L_0x01b5:
        r45 = 0;
    L_0x01b7:
        r3 = "videoAdTrackingTemplateUri";
        r46 = defpackage.afns.c(r1, r3);
        r3 = "adSenseBaseConversionUri";
        r47 = defpackage.afns.c(r1, r3);
        r3 = "fallbackHint";
        r48 = r1.getBoolean(r3);
        r3 = "expirationTimeMillis";
        r49 = r1.getLong(r3);
        r3 = "assetFrequencyCap";
        r51 = r1.getInt(r3);
        r3 = "isPublicVideo";
        r52 = r1.getBoolean(r3);
        r3 = "adAnnotations";
        r3 = defpackage.afns.a(r1, r3);
        r11 = android.text.TextUtils.isEmpty(r3);
        if (r11 != 0) goto L_0x0213;
    L_0x01e7:
        r11 = 2;
        r3 = android.util.Base64.decode(r3, r11);
        r11 = defpackage.aovw.e;	 Catch:{ anyg -> 0x020b }
        r11 = r11.createBuilder();	 Catch:{ anyg -> 0x020b }
        r11 = (defpackage.aovz) r11;	 Catch:{ anyg -> 0x020b }
        r12 = defpackage.anxa.c();	 Catch:{ anyg -> 0x020b }
        r3 = r11.mergeFrom(r3, r12);	 Catch:{ anyg -> 0x020b }
        r3 = (defpackage.anvi) r3;	 Catch:{ anyg -> 0x020b }
        r3 = (defpackage.aovz) r3;	 Catch:{ anyg -> 0x020b }
        r3 = r3.build();	 Catch:{ anyg -> 0x020b }
        r3 = (defpackage.anxl) r3;	 Catch:{ anyg -> 0x020b }
        r3 = (defpackage.aovw) r3;	 Catch:{ anyg -> 0x020b }
        r53 = r3;
        goto L_0x0215;
    L_0x020b:
        r1 = new org.json.JSONException;
        r2 = "Invalid protobuf";
        r1.<init>(r2);
        throw r1;
    L_0x0213:
        r53 = 0;
    L_0x0215:
        r3 = "adInfoCards";
        r3 = defpackage.afns.a(r1, r3);
        r11 = android.text.TextUtils.isEmpty(r3);
        if (r11 != 0) goto L_0x023c;
    L_0x0221:
        r11 = 2;
        r3 = android.util.Base64.decode(r3, r11);
        r11 = new ajwf;	 Catch:{ aocg -> 0x0234 }
        r11.<init>();	 Catch:{ aocg -> 0x0234 }
        r3 = defpackage.aocf.mergeFrom(r11, r3);	 Catch:{ aocg -> 0x0234 }
        r3 = (defpackage.ajwf) r3;	 Catch:{ aocg -> 0x0234 }
        r54 = r3;
        goto L_0x023e;
    L_0x0234:
        r1 = new org.json.JSONException;
        r2 = "Invalid InfoCardCollectionRenderer protobuf";
        r1.<init>(r2);
        throw r1;
    L_0x023c:
        r54 = 0;
    L_0x023e:
        r3 = "requestTimeMilliseconds";
        r55 = r1.getLong(r3);
        r3 = "offlineShouldCountPlayback";
        r57 = r1.getBoolean(r3);
        r3 = "shouldAllowQueuedOfflinePings";
        r58 = r1.getBoolean(r3);
        r3 = "adWrapperUri";
        r59 = defpackage.afns.c(r1, r3);
        r3 = "prefetchedAd";
        r3 = r0.b(r1, r3);
        r60 = r3;
        r60 = (defpackage.aagr) r60;
        r3 = "parentWrapper";
        r3 = r0.b(r1, r3);
        r62 = r3;
        r62 = (defpackage.aagr) r62;
        r3 = "infoCards";
        r11 = r1.isNull(r3);
        if (r11 != 0) goto L_0x027b;
    L_0x0272:
        r11 = defpackage.aagw.e;
        r3 = r11.d(r1, r3);
        r63 = r3;
        goto L_0x027d;
    L_0x027b:
        r63 = 0;
    L_0x027d:
        r3 = defpackage.aagh.b;
        r11 = "survey";
        r3 = r3.b(r1, r11);
        r64 = r3;
        r64 = (defpackage.aagh) r64;
        r3 = "activeViewGroupMViewablePingUris";
        r65 = defpackage.afns.e(r1, r3);
        r3 = "activeViewViewablePingUris";
        r66 = defpackage.afns.e(r1, r3);
        r3 = "activeViewMeasurablePingUris";
        r67 = defpackage.afns.e(r1, r3);
        r3 = "isSurveyEnabled";
        r68 = r1.getBoolean(r3);
        r3 = "trackingDecorationRegexpPattern";
        r1 = defpackage.afns.a(r1, r3);
        r3 = android.text.TextUtils.isEmpty(r1);
        if (r3 != 0) goto L_0x02b2;
    L_0x02ad:
        r1 = java.util.regex.Pattern.compile(r1);
        goto L_0x02b3;
    L_0x02b2:
        r1 = 0;
    L_0x02b3:
        r12 = 0;
        r19 = 0;
        r61 = 0;
        r3 = r2;
        r11 = r13;
        r13 = r14;
        r14 = r15;
        r15 = r16;
        r16 = r17;
        r17 = r18;
        r18 = r20;
        r20 = r21;
        r21 = r22;
        r22 = r23;
        r23 = r24;
        r24 = r25;
        r25 = r26;
        r26 = r27;
        r27 = r28;
        r28 = r29;
        r29 = r30;
        r30 = r31;
        r31 = r32;
        r32 = r33;
        r33 = r34;
        r34 = r35;
        r35 = r36;
        r36 = r37;
        r37 = r38;
        r38 = r39;
        r39 = r40;
        r40 = r41;
        r41 = r42;
        r42 = r43;
        r43 = r44;
        r44 = r45;
        r45 = r46;
        r46 = r47;
        r47 = r48;
        r48 = r49;
        r50 = r51;
        r51 = r52;
        r52 = r53;
        r53 = r54;
        r54 = r55;
        r56 = r57;
        r57 = r58;
        r58 = r59;
        r59 = r60;
        r60 = r62;
        r62 = r63;
        r63 = r64;
        r64 = r65;
        r65 = r66;
        r66 = r67;
        r67 = r68;
        r68 = r1;
        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r51, r52, r53, r54, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68);
        return r2;
    L_0x0324:
        r1 = new org.json.JSONException;
        r2 = "Unsupported version";
        r1.<init>(r2);
        goto L_0x032d;
    L_0x032c:
        throw r1;
    L_0x032d:
        goto L_0x032c;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aags.b(org.json.JSONObject, int):java.lang.Object");
    }
}
