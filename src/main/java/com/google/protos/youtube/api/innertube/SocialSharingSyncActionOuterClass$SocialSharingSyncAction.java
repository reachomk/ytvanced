package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxp;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anyd;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axqg;

public final class SocialSharingSyncActionOuterClass$SocialSharingSyncAction extends anxp implements anzf {
    public static final SocialSharingSyncActionOuterClass$SocialSharingSyncAction d;
    private static volatile anzq f;
    public static final anxr socialSharingSyncAction;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public long c;
    private byte e = (byte) 2;

    private SocialSharingSyncActionOuterClass$SocialSharingSyncAction() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0001\u0000\u0002\u0002\u0000\u0004\u001a", new Object[]{"a", "c", "b"});
            case 3:
                return new SocialSharingSyncActionOuterClass$SocialSharingSyncAction();
            case 4:
                return new axqg();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (SocialSharingSyncActionOuterClass$SocialSharingSyncAction.class) {
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
        SocialSharingSyncActionOuterClass$SocialSharingSyncAction socialSharingSyncActionOuterClass$SocialSharingSyncAction = new SocialSharingSyncActionOuterClass$SocialSharingSyncAction();
        d = socialSharingSyncActionOuterClass$SocialSharingSyncAction;
        anxl.registerDefaultInstance(SocialSharingSyncActionOuterClass$SocialSharingSyncAction.class, socialSharingSyncActionOuterClass$SocialSharingSyncAction);
        apxu apxu = apxu.d;
        SocialSharingSyncActionOuterClass$SocialSharingSyncAction socialSharingSyncActionOuterClass$SocialSharingSyncAction2 = d;
        socialSharingSyncAction = anxl.newSingularGeneratedExtension(apxu, socialSharingSyncActionOuterClass$SocialSharingSyncAction2, socialSharingSyncActionOuterClass$SocialSharingSyncAction2, null, 181483165, aobm.MESSAGE, SocialSharingSyncActionOuterClass$SocialSharingSyncAction.class);
    }
}
