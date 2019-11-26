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
import defpackage.arjz;

public final class FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint extends anxl implements anzf {
    public static final FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint e;
    private static volatile anzq f;
    public static final anxr fetchTopicPickerEndpoint;
    public int a;
    public String b;
    public String c;
    public anyd d = anxl.emptyProtobufList();

    private FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint() {
        String str = "";
        this.b = str;
        this.c = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u001a", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint();
            case 4:
                return new arjz();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
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
        FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint = new FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint();
        e = fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint;
        anxl.registerDefaultInstance(FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.class, fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint);
        apxu apxu = apxu.d;
        FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint2 = e;
        fetchTopicPickerEndpoint = anxl.newSingularGeneratedExtension(apxu, fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint2, fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint2, null, 168068692, aobm.MESSAGE, FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.class);
    }
}
