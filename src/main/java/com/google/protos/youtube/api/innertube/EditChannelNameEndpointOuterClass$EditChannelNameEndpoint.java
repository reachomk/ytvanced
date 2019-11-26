package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aram;

public final class EditChannelNameEndpointOuterClass$EditChannelNameEndpoint extends anxl implements anzf {
    public static final EditChannelNameEndpointOuterClass$EditChannelNameEndpoint a;
    private static volatile anzq b;
    public static final anxr editChannelNameEndpoint;

    private EditChannelNameEndpointOuterClass$EditChannelNameEndpoint() {
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
                return new EditChannelNameEndpointOuterClass$EditChannelNameEndpoint();
            case 4:
                return new aram();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (EditChannelNameEndpointOuterClass$EditChannelNameEndpoint.class) {
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
        EditChannelNameEndpointOuterClass$EditChannelNameEndpoint editChannelNameEndpointOuterClass$EditChannelNameEndpoint = new EditChannelNameEndpointOuterClass$EditChannelNameEndpoint();
        a = editChannelNameEndpointOuterClass$EditChannelNameEndpoint;
        anxl.registerDefaultInstance(EditChannelNameEndpointOuterClass$EditChannelNameEndpoint.class, editChannelNameEndpointOuterClass$EditChannelNameEndpoint);
        apxu apxu = apxu.d;
        EditChannelNameEndpointOuterClass$EditChannelNameEndpoint editChannelNameEndpointOuterClass$EditChannelNameEndpoint2 = a;
        editChannelNameEndpoint = anxl.newSingularGeneratedExtension(apxu, editChannelNameEndpointOuterClass$EditChannelNameEndpoint2, editChannelNameEndpointOuterClass$EditChannelNameEndpoint2, null, 108642391, aobm.MESSAGE, EditChannelNameEndpointOuterClass$EditChannelNameEndpoint.class);
    }
}
