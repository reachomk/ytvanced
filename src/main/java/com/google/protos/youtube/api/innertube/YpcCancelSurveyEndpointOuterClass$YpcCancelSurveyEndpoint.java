package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aybc;
import defpackage.azlm;

public final class YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint extends anxl implements anzf {
    public static final YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint c;
    private static volatile anzq e;
    public static final anxr ypcCancelSurveyEndpoint;
    public int a;
    public aybc b;
    private byte d = (byte) 2;

    private YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint();
            case 4:
                return new azlm();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint ypcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint = new YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint();
        c = ypcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint;
        anxl.registerDefaultInstance(YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint.class, ypcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint);
        apxu apxu = apxu.d;
        YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint ypcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint2 = c;
        ypcCancelSurveyEndpoint = anxl.newSingularGeneratedExtension(apxu, ypcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint2, ypcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint2, null, 152893416, aobm.MESSAGE, YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint.class);
    }
}
