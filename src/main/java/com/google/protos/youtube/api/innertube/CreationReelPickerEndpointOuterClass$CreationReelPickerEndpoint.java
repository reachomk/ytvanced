package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aqrg;
import defpackage.axak;

public final class CreationReelPickerEndpointOuterClass$CreationReelPickerEndpoint extends anxl implements anzf {
    public static final CreationReelPickerEndpointOuterClass$CreationReelPickerEndpoint c;
    public static final anxr creationReelPickerEndpoint;
    private static volatile anzq e;
    public int a;
    public axak b;
    private byte d = (byte) 2;

    private CreationReelPickerEndpointOuterClass$CreationReelPickerEndpoint() {
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
                return new CreationReelPickerEndpointOuterClass$CreationReelPickerEndpoint();
            case 4:
                return new aqrg();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (CreationReelPickerEndpointOuterClass$CreationReelPickerEndpoint.class) {
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
        CreationReelPickerEndpointOuterClass$CreationReelPickerEndpoint creationReelPickerEndpointOuterClass$CreationReelPickerEndpoint = new CreationReelPickerEndpointOuterClass$CreationReelPickerEndpoint();
        c = creationReelPickerEndpointOuterClass$CreationReelPickerEndpoint;
        anxl.registerDefaultInstance(CreationReelPickerEndpointOuterClass$CreationReelPickerEndpoint.class, creationReelPickerEndpointOuterClass$CreationReelPickerEndpoint);
        apxu apxu = apxu.d;
        CreationReelPickerEndpointOuterClass$CreationReelPickerEndpoint creationReelPickerEndpointOuterClass$CreationReelPickerEndpoint2 = c;
        creationReelPickerEndpoint = anxl.newSingularGeneratedExtension(apxu, creationReelPickerEndpointOuterClass$CreationReelPickerEndpoint2, creationReelPickerEndpointOuterClass$CreationReelPickerEndpoint2, null, 166773264, aobm.MESSAGE, CreationReelPickerEndpointOuterClass$CreationReelPickerEndpoint.class);
    }
}
