package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arfl;

public final class EnterVrModeCommandOuterClass$EnterVrModeCommand extends anxl implements anzf {
    public static final EnterVrModeCommandOuterClass$EnterVrModeCommand a;
    private static volatile anzq b;
    public static final anxr enterVrModeCommand;

    private EnterVrModeCommandOuterClass$EnterVrModeCommand() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new EnterVrModeCommandOuterClass$EnterVrModeCommand();
            case 4:
                return new arfl();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (EnterVrModeCommandOuterClass$EnterVrModeCommand.class) {
                        obj3 = b;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
                            b = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        EnterVrModeCommandOuterClass$EnterVrModeCommand enterVrModeCommandOuterClass$EnterVrModeCommand = new EnterVrModeCommandOuterClass$EnterVrModeCommand();
        a = enterVrModeCommandOuterClass$EnterVrModeCommand;
        anxl.registerDefaultInstance(EnterVrModeCommandOuterClass$EnterVrModeCommand.class, enterVrModeCommandOuterClass$EnterVrModeCommand);
        apxu apxu = apxu.d;
        EnterVrModeCommandOuterClass$EnterVrModeCommand enterVrModeCommandOuterClass$EnterVrModeCommand2 = a;
        enterVrModeCommand = anxl.newSingularGeneratedExtension(apxu, enterVrModeCommandOuterClass$EnterVrModeCommand2, enterVrModeCommandOuterClass$EnterVrModeCommand2, null, 245319097, aobm.MESSAGE, EnterVrModeCommandOuterClass$EnterVrModeCommand.class);
    }
}
