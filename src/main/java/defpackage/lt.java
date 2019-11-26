package defpackage;

/* renamed from: lt */
public final class lt {
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0150  */
    public static android.view.animation.Interpolator a(android.content.Context r6, int r7) {
        /*
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 21;
        if (r0 >= r1) goto L_0x0154;
    L_0x0006:
        r0 = 17563663; // 0x10c000f float:2.571398E-38 double:8.6776025E-317;
        r1 = "Can't load animation resource ID #0x";
        r2 = 0;
        if (r7 == r0) goto L_0x010c;
    L_0x000e:
        r0 = 17563661; // 0x10c000d float:2.5713975E-38 double:8.6776015E-317;
        if (r7 == r0) goto L_0x0106;
    L_0x0013:
        r0 = 17563662; // 0x10c000e float:2.5713978E-38 double:8.677602E-317;
        if (r7 != r0) goto L_0x001e;
    L_0x0018:
        r6 = new ayu;	 Catch:{ XmlPullParserException -> 0x0131, IOException -> 0x0114 }
        r6.<init>();	 Catch:{ XmlPullParserException -> 0x0131, IOException -> 0x0114 }
        return r6;
    L_0x001e:
        r0 = r6.getResources();	 Catch:{ XmlPullParserException -> 0x0131, IOException -> 0x0114 }
        r0 = r0.getAnimation(r7);	 Catch:{ XmlPullParserException -> 0x0131, IOException -> 0x0114 }
        r6.getResources();	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        r6.getTheme();	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        r3 = r0.getDepth();	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
    L_0x0030:
        r4 = r0.next();	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        r5 = 3;
        if (r4 == r5) goto L_0x0038;
    L_0x0037:
        goto L_0x003e;
    L_0x0038:
        r5 = r0.getDepth();	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        if (r5 <= r3) goto L_0x00f9;
    L_0x003e:
        r5 = 1;
        if (r4 == r5) goto L_0x00f9;
    L_0x0041:
        r5 = 2;
        if (r4 == r5) goto L_0x0045;
    L_0x0044:
        goto L_0x0030;
    L_0x0045:
        r2 = android.util.Xml.asAttributeSet(r0);	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        r4 = r0.getName();	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        r5 = "linearInterpolator";
        r5 = r4.equals(r5);	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        if (r5 != 0) goto L_0x00f2;
    L_0x0055:
        r5 = "accelerateInterpolator";
        r5 = r4.equals(r5);	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        if (r5 != 0) goto L_0x00ea;
    L_0x005d:
        r5 = "decelerateInterpolator";
        r5 = r4.equals(r5);	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        if (r5 != 0) goto L_0x00e4;
    L_0x0065:
        r5 = "accelerateDecelerateInterpolator";
        r5 = r4.equals(r5);	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        if (r5 != 0) goto L_0x00dd;
    L_0x006d:
        r5 = "cycleInterpolator";
        r5 = r4.equals(r5);	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        if (r5 != 0) goto L_0x00d7;
    L_0x0075:
        r5 = "anticipateInterpolator";
        r5 = r4.equals(r5);	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        if (r5 != 0) goto L_0x00d1;
    L_0x007d:
        r5 = "overshootInterpolator";
        r5 = r4.equals(r5);	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        if (r5 != 0) goto L_0x00cb;
    L_0x0085:
        r5 = "anticipateOvershootInterpolator";
        r5 = r4.equals(r5);	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        if (r5 != 0) goto L_0x00c5;
    L_0x008d:
        r5 = "bounceInterpolator";
        r5 = r4.equals(r5);	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        if (r5 != 0) goto L_0x00be;
    L_0x0095:
        r5 = "pathInterpolator";
        r4 = r4.equals(r5);	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        if (r4 == 0) goto L_0x00a3;
    L_0x009d:
        r4 = new lx;	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        r4.<init>(r6, r2, r0);	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        goto L_0x00ef;
    L_0x00a3:
        r6 = new java.lang.RuntimeException;	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        r2 = new java.lang.StringBuilder;	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        r2.<init>();	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        r3 = "Unknown interpolator name: ";
        r2.append(r3);	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        r3 = r0.getName();	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        r2.append(r3);	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        r2 = r2.toString();	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        r6.<init>(r2);	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        throw r6;	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
    L_0x00be:
        r2 = new android.view.animation.BounceInterpolator;	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        r2.<init>();	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        goto L_0x0030;
    L_0x00c5:
        r4 = new android.view.animation.AnticipateOvershootInterpolator;	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        r4.<init>(r6, r2);	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        goto L_0x00ef;
    L_0x00cb:
        r4 = new android.view.animation.OvershootInterpolator;	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        r4.<init>(r6, r2);	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        goto L_0x00ef;
    L_0x00d1:
        r4 = new android.view.animation.AnticipateInterpolator;	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        r4.<init>(r6, r2);	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        goto L_0x00ef;
    L_0x00d7:
        r4 = new android.view.animation.CycleInterpolator;	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        r4.<init>(r6, r2);	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        goto L_0x00ef;
    L_0x00dd:
        r2 = new android.view.animation.AccelerateDecelerateInterpolator;	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        r2.<init>();	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        goto L_0x0030;
    L_0x00e4:
        r4 = new android.view.animation.DecelerateInterpolator;	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        r4.<init>(r6, r2);	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        goto L_0x00ef;
    L_0x00ea:
        r4 = new android.view.animation.AccelerateInterpolator;	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        r4.<init>(r6, r2);	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
    L_0x00ef:
        r2 = r4;
        goto L_0x0030;
    L_0x00f2:
        r2 = new android.view.animation.LinearInterpolator;	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        r2.<init>();	 Catch:{ XmlPullParserException -> 0x0103, IOException -> 0x0100, all -> 0x00fd }
        goto L_0x0030;
    L_0x00f9:
        r0.close();
        return r2;
    L_0x00fd:
        r6 = move-exception;
        r2 = r0;
        goto L_0x014e;
    L_0x0100:
        r6 = move-exception;
        r2 = r0;
        goto L_0x0115;
    L_0x0103:
        r6 = move-exception;
        r2 = r0;
        goto L_0x0132;
    L_0x0106:
        r6 = new ayr;	 Catch:{ XmlPullParserException -> 0x0131, IOException -> 0x0114 }
        r6.<init>();	 Catch:{ XmlPullParserException -> 0x0131, IOException -> 0x0114 }
        return r6;
    L_0x010c:
        r6 = new ays;	 Catch:{ XmlPullParserException -> 0x0131, IOException -> 0x0114 }
        r6.<init>();	 Catch:{ XmlPullParserException -> 0x0131, IOException -> 0x0114 }
        return r6;
    L_0x0112:
        r6 = move-exception;
        goto L_0x014e;
    L_0x0114:
        r6 = move-exception;
    L_0x0115:
        r0 = new android.content.res.Resources$NotFoundException;	 Catch:{ all -> 0x0112 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0112 }
        r3.<init>();	 Catch:{ all -> 0x0112 }
        r3.append(r1);	 Catch:{ all -> 0x0112 }
        r7 = java.lang.Integer.toHexString(r7);	 Catch:{ all -> 0x0112 }
        r3.append(r7);	 Catch:{ all -> 0x0112 }
        r7 = r3.toString();	 Catch:{ all -> 0x0112 }
        r0.<init>(r7);	 Catch:{ all -> 0x0112 }
        r0.initCause(r6);	 Catch:{ all -> 0x0112 }
        throw r0;	 Catch:{ all -> 0x0112 }
    L_0x0131:
        r6 = move-exception;
    L_0x0132:
        r0 = new android.content.res.Resources$NotFoundException;	 Catch:{ all -> 0x0112 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0112 }
        r3.<init>();	 Catch:{ all -> 0x0112 }
        r3.append(r1);	 Catch:{ all -> 0x0112 }
        r7 = java.lang.Integer.toHexString(r7);	 Catch:{ all -> 0x0112 }
        r3.append(r7);	 Catch:{ all -> 0x0112 }
        r7 = r3.toString();	 Catch:{ all -> 0x0112 }
        r0.<init>(r7);	 Catch:{ all -> 0x0112 }
        r0.initCause(r6);	 Catch:{ all -> 0x0112 }
        throw r0;	 Catch:{ all -> 0x0112 }
    L_0x014e:
        if (r2 == 0) goto L_0x0153;
    L_0x0150:
        r2.close();
    L_0x0153:
        throw r6;
    L_0x0154:
        r6 = android.view.animation.AnimationUtils.loadInterpolator(r6, r7);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lt.a(android.content.Context, int):android.view.animation.Interpolator");
    }
}
