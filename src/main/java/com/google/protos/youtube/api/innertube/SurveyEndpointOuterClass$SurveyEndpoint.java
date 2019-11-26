package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axzm;
import defpackage.aybc;

public final class SurveyEndpointOuterClass$SurveyEndpoint extends anxl implements anzf {
    public static final SurveyEndpointOuterClass$SurveyEndpoint c;
    private static volatile anzq e;
    public static final anxr surveyEndpoint;
    public int a;
    public aybc b;
    private byte d = (byte) 2;

    private SurveyEndpointOuterClass$SurveyEndpoint() {
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
                return new SurveyEndpointOuterClass$SurveyEndpoint();
            case 4:
                return new axzm();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (SurveyEndpointOuterClass$SurveyEndpoint.class) {
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
        SurveyEndpointOuterClass$SurveyEndpoint surveyEndpointOuterClass$SurveyEndpoint = new SurveyEndpointOuterClass$SurveyEndpoint();
        c = surveyEndpointOuterClass$SurveyEndpoint;
        anxl.registerDefaultInstance(SurveyEndpointOuterClass$SurveyEndpoint.class, surveyEndpointOuterClass$SurveyEndpoint);
        apxu apxu = apxu.d;
        SurveyEndpointOuterClass$SurveyEndpoint surveyEndpointOuterClass$SurveyEndpoint2 = c;
        surveyEndpoint = anxl.newSingularGeneratedExtension(apxu, surveyEndpointOuterClass$SurveyEndpoint2, surveyEndpointOuterClass$SurveyEndpoint2, null, 162669933, aobm.MESSAGE, SurveyEndpointOuterClass$SurveyEndpoint.class);
    }
}
