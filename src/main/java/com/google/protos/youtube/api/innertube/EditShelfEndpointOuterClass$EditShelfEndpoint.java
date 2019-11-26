package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aray;

public final class EditShelfEndpointOuterClass$EditShelfEndpoint extends anxl implements anzf {
    public static final EditShelfEndpointOuterClass$EditShelfEndpoint a;
    private static volatile anzq b;
    public static final anxr editShelfEndpoint;

    private EditShelfEndpointOuterClass$EditShelfEndpoint() {
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
                return new EditShelfEndpointOuterClass$EditShelfEndpoint();
            case 4:
                return new aray();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (EditShelfEndpointOuterClass$EditShelfEndpoint.class) {
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
        EditShelfEndpointOuterClass$EditShelfEndpoint editShelfEndpointOuterClass$EditShelfEndpoint = new EditShelfEndpointOuterClass$EditShelfEndpoint();
        a = editShelfEndpointOuterClass$EditShelfEndpoint;
        anxl.registerDefaultInstance(EditShelfEndpointOuterClass$EditShelfEndpoint.class, editShelfEndpointOuterClass$EditShelfEndpoint);
        apxu apxu = apxu.d;
        EditShelfEndpointOuterClass$EditShelfEndpoint editShelfEndpointOuterClass$EditShelfEndpoint2 = a;
        editShelfEndpoint = anxl.newSingularGeneratedExtension(apxu, editShelfEndpointOuterClass$EditShelfEndpoint2, editShelfEndpointOuterClass$EditShelfEndpoint2, null, 66909867, aobm.MESSAGE, EditShelfEndpointOuterClass$EditShelfEndpoint.class);
    }
}
