package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anyd;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aove;
import defpackage.axak;

public final class AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer extends anxl implements anzf {
    public static final AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer b;
    private static volatile anzq d;
    public static final anxr notificationSurveyCustomStyleRenderer;
    public anyd a = anxl.emptyProtobufList();
    private byte c = (byte) 2;

    private AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.c = b;
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", axak.class});
            case 3:
                return new AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer();
            case 4:
                return new aove();
            case 5:
                return b;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(b);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer androidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer = new AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer();
        b = androidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer;
        anxl.registerDefaultInstance(AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.class, androidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer);
        axak axak = axak.a;
        AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer androidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer2 = b;
        notificationSurveyCustomStyleRenderer = anxl.newSingularGeneratedExtension(axak, androidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer2, androidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer2, null, 195330824, aobm.MESSAGE, AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.class);
    }
}
