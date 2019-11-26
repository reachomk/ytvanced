package com.google.protos.youtube.api.innertube;

import defpackage.anvu;
import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.azmn;

public final class YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint extends anxl implements anzf {
    public static final YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint h;
    private static volatile anzq j;
    public static final anxr ypcFixInstrumentEndpoint;
    public int a;
    public int b = 0;
    public Object c;
    public int d = 0;
    public Object e;
    public anvu f = anvu.a;
    public anvu g = anvu.a;
    private byte i = (byte) 2;

    private YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0002\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001\n\u0000\u0002м\u0000\u0003м\u0000\u0004м\u0001\u0005м\u0001\u0006\n\u0005", new Object[]{"c", "b", "e", "d", "a", "f", apxu.class, apxu.class, apxu.class, apxu.class, "g"});
            case 3:
                return new YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint();
            case 4:
                return new azmn();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint = new YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint();
        h = ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint;
        anxl.registerDefaultInstance(YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.class, ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint);
        apxu apxu = apxu.d;
        YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint2 = h;
        ypcFixInstrumentEndpoint = anxl.newSingularGeneratedExtension(apxu, ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint2, ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint2, null, 152316869, aobm.MESSAGE, YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.class);
    }
}
