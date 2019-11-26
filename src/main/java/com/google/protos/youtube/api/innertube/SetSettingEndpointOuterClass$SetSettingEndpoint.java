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
import defpackage.axga;

public final class SetSettingEndpointOuterClass$SetSettingEndpoint extends anxl implements anzf {
    public static final SetSettingEndpointOuterClass$SetSettingEndpoint f;
    private static volatile anzq h;
    public static final anxr setSettingEndpoint;
    public int a;
    public int b = 0;
    public Object c;
    public String d = "";
    public anyd e = anxl.emptyProtobufList();
    private byte g = (byte) 2;

    private SetSettingEndpointOuterClass$SetSettingEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\b\u0000\u0002;\u0000\u0003:\u0000\u00045\u0000\u0005Л", new Object[]{"c", "b", "a", "d", "e", apxu.class});
            case 3:
                return new SetSettingEndpointOuterClass$SetSettingEndpoint();
            case 4:
                return new axga();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (SetSettingEndpointOuterClass$SetSettingEndpoint.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        SetSettingEndpointOuterClass$SetSettingEndpoint setSettingEndpointOuterClass$SetSettingEndpoint = new SetSettingEndpointOuterClass$SetSettingEndpoint();
        f = setSettingEndpointOuterClass$SetSettingEndpoint;
        anxl.registerDefaultInstance(SetSettingEndpointOuterClass$SetSettingEndpoint.class, setSettingEndpointOuterClass$SetSettingEndpoint);
        apxu apxu = apxu.d;
        SetSettingEndpointOuterClass$SetSettingEndpoint setSettingEndpointOuterClass$SetSettingEndpoint2 = f;
        setSettingEndpoint = anxl.newSingularGeneratedExtension(apxu, setSettingEndpointOuterClass$SetSettingEndpoint2, setSettingEndpointOuterClass$SetSettingEndpoint2, null, 77872990, aobm.MESSAGE, SetSettingEndpointOuterClass$SetSettingEndpoint.class);
    }
}
