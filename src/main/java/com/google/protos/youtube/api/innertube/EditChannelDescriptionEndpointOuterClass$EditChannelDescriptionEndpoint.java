package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aral;

public final class EditChannelDescriptionEndpointOuterClass$EditChannelDescriptionEndpoint extends anxl implements anzf {
    public static final EditChannelDescriptionEndpointOuterClass$EditChannelDescriptionEndpoint a;
    private static volatile anzq b;
    public static final anxr editChannelDescriptionEndpoint;

    private EditChannelDescriptionEndpointOuterClass$EditChannelDescriptionEndpoint() {
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
                return new EditChannelDescriptionEndpointOuterClass$EditChannelDescriptionEndpoint();
            case 4:
                return new aral();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (EditChannelDescriptionEndpointOuterClass$EditChannelDescriptionEndpoint.class) {
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
        EditChannelDescriptionEndpointOuterClass$EditChannelDescriptionEndpoint editChannelDescriptionEndpointOuterClass$EditChannelDescriptionEndpoint = new EditChannelDescriptionEndpointOuterClass$EditChannelDescriptionEndpoint();
        a = editChannelDescriptionEndpointOuterClass$EditChannelDescriptionEndpoint;
        anxl.registerDefaultInstance(EditChannelDescriptionEndpointOuterClass$EditChannelDescriptionEndpoint.class, editChannelDescriptionEndpointOuterClass$EditChannelDescriptionEndpoint);
        apxu apxu = apxu.d;
        EditChannelDescriptionEndpointOuterClass$EditChannelDescriptionEndpoint editChannelDescriptionEndpointOuterClass$EditChannelDescriptionEndpoint2 = a;
        editChannelDescriptionEndpoint = anxl.newSingularGeneratedExtension(apxu, editChannelDescriptionEndpointOuterClass$EditChannelDescriptionEndpoint2, editChannelDescriptionEndpointOuterClass$EditChannelDescriptionEndpoint2, null, 67267012, aobm.MESSAGE, EditChannelDescriptionEndpointOuterClass$EditChannelDescriptionEndpoint.class);
    }
}
