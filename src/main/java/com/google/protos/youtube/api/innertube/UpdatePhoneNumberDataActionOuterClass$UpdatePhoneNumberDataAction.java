package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.avyu;
import defpackage.aysh;

public final class UpdatePhoneNumberDataActionOuterClass$UpdatePhoneNumberDataAction extends anxl implements anzf {
    public static final UpdatePhoneNumberDataActionOuterClass$UpdatePhoneNumberDataAction c;
    private static volatile anzq d;
    public static final anxr updatePhoneNumberDataAction;
    public int a;
    public avyu b;

    private UpdatePhoneNumberDataActionOuterClass$UpdatePhoneNumberDataAction() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t\u0000", new Object[]{"a", "b"});
            case 3:
                return new UpdatePhoneNumberDataActionOuterClass$UpdatePhoneNumberDataAction();
            case 4:
                return new aysh();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (UpdatePhoneNumberDataActionOuterClass$UpdatePhoneNumberDataAction.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        UpdatePhoneNumberDataActionOuterClass$UpdatePhoneNumberDataAction updatePhoneNumberDataActionOuterClass$UpdatePhoneNumberDataAction = new UpdatePhoneNumberDataActionOuterClass$UpdatePhoneNumberDataAction();
        c = updatePhoneNumberDataActionOuterClass$UpdatePhoneNumberDataAction;
        anxl.registerDefaultInstance(UpdatePhoneNumberDataActionOuterClass$UpdatePhoneNumberDataAction.class, updatePhoneNumberDataActionOuterClass$UpdatePhoneNumberDataAction);
        apxu apxu = apxu.d;
        UpdatePhoneNumberDataActionOuterClass$UpdatePhoneNumberDataAction updatePhoneNumberDataActionOuterClass$UpdatePhoneNumberDataAction2 = c;
        updatePhoneNumberDataAction = anxl.newSingularGeneratedExtension(apxu, updatePhoneNumberDataActionOuterClass$UpdatePhoneNumberDataAction2, updatePhoneNumberDataActionOuterClass$UpdatePhoneNumberDataAction2, null, 131723472, aobm.MESSAGE, UpdatePhoneNumberDataActionOuterClass$UpdatePhoneNumberDataAction.class);
    }
}
