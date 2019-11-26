package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arak;

public final class EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint extends anxl implements anzf {
    public static final EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint a;
    private static volatile anzq b;
    public static final anxr editChannelBannerEndpoint;

    private EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint();
            case 4:
                return new arak();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint.class) {
                        obj3 = b;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
                            b = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint editChannelBannerEndpointOuterClass$EditChannelBannerEndpoint = new EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint();
        a = editChannelBannerEndpointOuterClass$EditChannelBannerEndpoint;
        anxl.registerDefaultInstance(EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint.class, editChannelBannerEndpointOuterClass$EditChannelBannerEndpoint);
        apxu apxu = apxu.d;
        EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint editChannelBannerEndpointOuterClass$EditChannelBannerEndpoint2 = a;
        editChannelBannerEndpoint = anxl.newSingularGeneratedExtension(apxu, editChannelBannerEndpointOuterClass$EditChannelBannerEndpoint2, editChannelBannerEndpointOuterClass$EditChannelBannerEndpoint2, null, 113001276, aobm.MESSAGE, EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint.class);
    }
}
