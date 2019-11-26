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
import defpackage.ayei;

public final class TextMessageEndpointOuterClass$TextMessageEndpoint extends anxl implements anzf {
    public static final TextMessageEndpointOuterClass$TextMessageEndpoint d;
    private static volatile anzq f;
    public static final anxr textMessageEndpoint;
    public int a;
    public String b = "";
    public anyd c = anxl.emptyProtobufList();
    private byte e = (byte) 2;

    private TextMessageEndpointOuterClass$TextMessageEndpoint() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002\b\u0001\u0003\u001a", new Object[]{"a", "b", "c"});
            case 3:
                return new TextMessageEndpointOuterClass$TextMessageEndpoint();
            case 4:
                return new ayei();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (TextMessageEndpointOuterClass$TextMessageEndpoint.class) {
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
        TextMessageEndpointOuterClass$TextMessageEndpoint textMessageEndpointOuterClass$TextMessageEndpoint = new TextMessageEndpointOuterClass$TextMessageEndpoint();
        d = textMessageEndpointOuterClass$TextMessageEndpoint;
        anxl.registerDefaultInstance(TextMessageEndpointOuterClass$TextMessageEndpoint.class, textMessageEndpointOuterClass$TextMessageEndpoint);
        apxu apxu = apxu.d;
        TextMessageEndpointOuterClass$TextMessageEndpoint textMessageEndpointOuterClass$TextMessageEndpoint2 = d;
        textMessageEndpoint = anxl.newSingularGeneratedExtension(apxu, textMessageEndpointOuterClass$TextMessageEndpoint2, textMessageEndpointOuterClass$TextMessageEndpoint2, null, 90566164, aobm.MESSAGE, TextMessageEndpointOuterClass$TextMessageEndpoint.class);
    }
}
