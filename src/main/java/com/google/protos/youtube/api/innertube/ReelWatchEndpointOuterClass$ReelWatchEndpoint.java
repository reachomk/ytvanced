package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.avtq;
import defpackage.awyu;
import defpackage.axak;
import defpackage.aygk;

public final class ReelWatchEndpointOuterClass$ReelWatchEndpoint extends anxl implements anzf {
    public static final ReelWatchEndpointOuterClass$ReelWatchEndpoint m;
    private static volatile anzq o;
    public static final anxr reelWatchEndpoint;
    public int a;
    public String b;
    public String c;
    public int d;
    public String e;
    public aygk f;
    public apxu g;
    public axak h;
    public boolean i;
    public avtq j;
    public apxu k;
    public String l;
    private byte n = (byte) 2;

    private ReelWatchEndpointOuterClass$ReelWatchEndpoint() {
        String str = "";
        this.b = str;
        this.c = str;
        this.e = str;
        this.l = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.n = b;
                return null;
            case 2:
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0001☔\u000b\u0000\u0000\u0004\u0001\b\u0000\u0002\b\u0001\u0003\u000b\u0002\u0004\b\u0003\u0005Љ\u0004\u0007Љ\u0005\bЉ\u0006\n\u0007\u0007\u000b\b\nϩЉ\t☔\t\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "l", "k", "j"});
            case 3:
                return new ReelWatchEndpointOuterClass$ReelWatchEndpoint();
            case 4:
                return new awyu();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (ReelWatchEndpointOuterClass$ReelWatchEndpoint.class) {
                        obj3 = o;
                        if (obj3 == null) {
                            obj3 = new anxn(m);
                            o = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = new ReelWatchEndpointOuterClass$ReelWatchEndpoint();
        m = reelWatchEndpointOuterClass$ReelWatchEndpoint;
        anxl.registerDefaultInstance(ReelWatchEndpointOuterClass$ReelWatchEndpoint.class, reelWatchEndpointOuterClass$ReelWatchEndpoint);
        apxu apxu = apxu.d;
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint2 = m;
        reelWatchEndpoint = anxl.newSingularGeneratedExtension(apxu, reelWatchEndpointOuterClass$ReelWatchEndpoint2, reelWatchEndpointOuterClass$ReelWatchEndpoint2, null, 139608561, aobm.MESSAGE, ReelWatchEndpointOuterClass$ReelWatchEndpoint.class);
    }
}
