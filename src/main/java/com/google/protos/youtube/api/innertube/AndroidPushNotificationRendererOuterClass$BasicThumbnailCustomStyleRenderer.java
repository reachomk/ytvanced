package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aovb;
import defpackage.avkp;
import defpackage.avkr;
import defpackage.axak;
import defpackage.aygk;

public final class AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer extends anxl implements anzf {
    public static final anxr basicThumbnailCustomStyleRenderer;
    public static final AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer h;
    private static volatile anzq j;
    public int a;
    public int b = 0;
    public Object c;
    public aygk d;
    public int e;
    public boolean f;
    public int g;
    private byte i = (byte) 2;

    private AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001Љ\u0000\u0002\f\u0001\u0003>\u0000\u0004\f\u0006\u0005\u0007\u0005\u0006:\u0000\u0007:\u0000", new Object[]{"c", "b", "a", "d", "e", avkp.a, "g", avkr.a, "f"});
            case 3:
                return new AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer();
            case 4:
                return new aovb();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer = new AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer();
        h = androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer;
        anxl.registerDefaultInstance(AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.class, androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer);
        axak axak = axak.a;
        AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer2 = h;
        basicThumbnailCustomStyleRenderer = anxl.newSingularGeneratedExtension(axak, androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer2, androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer2, null, 179869979, aobm.MESSAGE, AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.class);
    }
}
