package com.google.protos.youtube.api.innertube;

import defpackage.anvu;
import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anyd;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.awvd;

public final class RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint extends anxl implements anzf {
    public static final RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint d;
    private static volatile anzq f;
    public static final anxr recordNotificationInteractionsEndpoint;
    public int a;
    public anvu b = anvu.a;
    public anyd c = anxl.emptyProtobufList();
    private byte e = (byte) 2;

    private RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\n\u0000\u0002Л", new Object[]{"a", "b", "c", apxu.class});
            case 3:
                return new RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint();
            case 4:
                return new awvd();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.class) {
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
        RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint recordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint = new RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint();
        d = recordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint;
        anxl.registerDefaultInstance(RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.class, recordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint);
        apxu apxu = apxu.d;
        RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint recordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint2 = d;
        recordNotificationInteractionsEndpoint = anxl.newSingularGeneratedExtension(apxu, recordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint2, recordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint2, null, 78414307, aobm.MESSAGE, RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.class);
    }
}
