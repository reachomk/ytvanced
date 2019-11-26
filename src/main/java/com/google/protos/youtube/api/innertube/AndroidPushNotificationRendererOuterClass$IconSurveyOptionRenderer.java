package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aovc;
import defpackage.apxu;
import defpackage.arwf;
import defpackage.axak;

public final class AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer extends anxl implements anzf {
    public static final AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer e;
    private static volatile anzq g;
    public static final anxr iconSurveyOptionRenderer;
    public int a;
    public arwf b;
    public apxu c;
    public apxu d;
    private byte f = (byte) 2;

    private AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\t\u0000\u0002Љ\u0001\u0003Љ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer();
            case 4:
                return new aovc();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer = new AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer();
        e = androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer;
        anxl.registerDefaultInstance(AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.class, androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer);
        axak axak = axak.a;
        AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer2 = e;
        iconSurveyOptionRenderer = anxl.newSingularGeneratedExtension(axak, androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer2, androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer2, null, 202680135, aobm.MESSAGE, AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.class);
    }
}
