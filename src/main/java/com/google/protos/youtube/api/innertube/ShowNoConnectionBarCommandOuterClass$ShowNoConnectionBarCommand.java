package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axma;

public final class ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand extends anxl implements anzf {
    public static final ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand a;
    private static volatile anzq b;
    public static final anxr showNoConnectionBarCommand;

    private ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand() {
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
                return new ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand();
            case 4:
                return new axma();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.class) {
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
        ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand showNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand = new ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand();
        a = showNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand;
        anxl.registerDefaultInstance(ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.class, showNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand);
        apxu apxu = apxu.d;
        ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand showNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand2 = a;
        showNoConnectionBarCommand = anxl.newSingularGeneratedExtension(apxu, showNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand2, showNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand2, null, 246536901, aobm.MESSAGE, ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.class);
    }
}
