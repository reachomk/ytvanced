package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anyd;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aras;

public final class EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint extends anxl implements anzf {
    public static final EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint d;
    public static final anxr editConnectionStateEndpoint;
    private static volatile anzq f;
    public int a;
    public String b = "";
    public anyd c = anxl.emptyProtobufList();
    private byte e = (byte) 2;

    private EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\b\u0000\u0002Л", new Object[]{"a", "b", "c", apxu.class});
            case 3:
                return new EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint();
            case 4:
                return new aras();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint = new EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint();
        d = editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint;
        anxl.registerDefaultInstance(EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.class, editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint);
        apxu apxu = apxu.d;
        EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint2 = d;
        editConnectionStateEndpoint = anxl.newSingularGeneratedExtension(apxu, editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint2, editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint2, null, 90427601, aobm.MESSAGE, EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.class);
    }
}
