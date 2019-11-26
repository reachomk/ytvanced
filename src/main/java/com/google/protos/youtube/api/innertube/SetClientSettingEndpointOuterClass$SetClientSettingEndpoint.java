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
import defpackage.axfy;
import defpackage.axfz;

public final class SetClientSettingEndpointOuterClass$SetClientSettingEndpoint extends anxl implements anzf {
    public static final SetClientSettingEndpointOuterClass$SetClientSettingEndpoint c;
    private static volatile anzq e;
    public static final anxr setClientSettingEndpoint;
    public anyd a = anxl.emptyProtobufList();
    public anyd b = anxl.emptyProtobufList();
    private byte d = (byte) 2;

    private SetClientSettingEndpointOuterClass$SetClientSettingEndpoint() {
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
                return anxl.newMessageInfo(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001\u001b\u0002Л", new Object[]{"a", axfy.class, "b", apxu.class});
            case 3:
                return new SetClientSettingEndpointOuterClass$SetClientSettingEndpoint();
            case 4:
                return new axfz();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.class) {
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
        SetClientSettingEndpointOuterClass$SetClientSettingEndpoint setClientSettingEndpointOuterClass$SetClientSettingEndpoint = new SetClientSettingEndpointOuterClass$SetClientSettingEndpoint();
        c = setClientSettingEndpointOuterClass$SetClientSettingEndpoint;
        anxl.registerDefaultInstance(SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.class, setClientSettingEndpointOuterClass$SetClientSettingEndpoint);
        apxu apxu = apxu.d;
        SetClientSettingEndpointOuterClass$SetClientSettingEndpoint setClientSettingEndpointOuterClass$SetClientSettingEndpoint2 = c;
        setClientSettingEndpoint = anxl.newSingularGeneratedExtension(apxu, setClientSettingEndpointOuterClass$SetClientSettingEndpoint2, setClientSettingEndpointOuterClass$SetClientSettingEndpoint2, null, 81212182, aobm.MESSAGE, SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.class);
    }
}
