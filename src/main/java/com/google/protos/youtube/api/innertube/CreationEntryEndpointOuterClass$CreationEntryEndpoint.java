package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apib;
import defpackage.apxu;
import defpackage.aqrf;

public final class CreationEntryEndpointOuterClass$CreationEntryEndpoint extends anxl implements anzf {
    public static final CreationEntryEndpointOuterClass$CreationEntryEndpoint c;
    public static final anxr creationEntryEndpoint;
    private static volatile anzq e;
    public int a;
    public apib b;
    private byte d = (byte) 2;

    private CreationEntryEndpointOuterClass$CreationEntryEndpoint() {
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
                return new CreationEntryEndpointOuterClass$CreationEntryEndpoint();
            case 4:
                return new aqrf();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (CreationEntryEndpointOuterClass$CreationEntryEndpoint.class) {
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
        CreationEntryEndpointOuterClass$CreationEntryEndpoint creationEntryEndpointOuterClass$CreationEntryEndpoint = new CreationEntryEndpointOuterClass$CreationEntryEndpoint();
        c = creationEntryEndpointOuterClass$CreationEntryEndpoint;
        anxl.registerDefaultInstance(CreationEntryEndpointOuterClass$CreationEntryEndpoint.class, creationEntryEndpointOuterClass$CreationEntryEndpoint);
        apxu apxu = apxu.d;
        CreationEntryEndpointOuterClass$CreationEntryEndpoint creationEntryEndpointOuterClass$CreationEntryEndpoint2 = c;
        creationEntryEndpoint = anxl.newSingularGeneratedExtension(apxu, creationEntryEndpointOuterClass$CreationEntryEndpoint2, creationEntryEndpointOuterClass$CreationEntryEndpoint2, null, 144891985, aobm.MESSAGE, CreationEntryEndpointOuterClass$CreationEntryEndpoint.class);
    }
}
