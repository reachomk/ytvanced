package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.apzc;
import defpackage.arml;
import defpackage.ayro;

public final class UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction extends anxl implements anzf {
    public static final UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction e;
    private static volatile anzq g;
    public static final anxr updateBackstagePollAction;
    public int a;
    public int b;
    public arml c;
    public int d;
    private byte f = (byte) 2;

    private UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\f\u0001\u0002Љ\u0002\u0003\u0004\u0003", new Object[]{"a", "b", apzc.a(), "c", "d"});
            case 3:
                return new UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction();
            case 4:
                return new ayro();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction = new UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction();
        e = updateBackstagePollActionOuterClass$UpdateBackstagePollAction;
        anxl.registerDefaultInstance(UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.class, updateBackstagePollActionOuterClass$UpdateBackstagePollAction);
        apxu apxu = apxu.d;
        UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction2 = e;
        updateBackstagePollAction = anxl.newSingularGeneratedExtension(apxu, updateBackstagePollActionOuterClass$UpdateBackstagePollAction2, updateBackstagePollActionOuterClass$UpdateBackstagePollAction2, null, 139609360, aobm.MESSAGE, UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.class);
    }
}
