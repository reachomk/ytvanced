package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axmt;

public final class ShowSuperChatContractCommandOuterClass$ShowSuperChatContractCommand extends anxl implements anzf {
    public static final ShowSuperChatContractCommandOuterClass$ShowSuperChatContractCommand a;
    private static volatile anzq b;
    public static final anxr showSuperChatContractCommand;

    private ShowSuperChatContractCommandOuterClass$ShowSuperChatContractCommand() {
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
                return new ShowSuperChatContractCommandOuterClass$ShowSuperChatContractCommand();
            case 4:
                return new axmt();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (ShowSuperChatContractCommandOuterClass$ShowSuperChatContractCommand.class) {
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
        ShowSuperChatContractCommandOuterClass$ShowSuperChatContractCommand showSuperChatContractCommandOuterClass$ShowSuperChatContractCommand = new ShowSuperChatContractCommandOuterClass$ShowSuperChatContractCommand();
        a = showSuperChatContractCommandOuterClass$ShowSuperChatContractCommand;
        anxl.registerDefaultInstance(ShowSuperChatContractCommandOuterClass$ShowSuperChatContractCommand.class, showSuperChatContractCommandOuterClass$ShowSuperChatContractCommand);
        apxu apxu = apxu.d;
        ShowSuperChatContractCommandOuterClass$ShowSuperChatContractCommand showSuperChatContractCommandOuterClass$ShowSuperChatContractCommand2 = a;
        showSuperChatContractCommand = anxl.newSingularGeneratedExtension(apxu, showSuperChatContractCommandOuterClass$ShowSuperChatContractCommand2, showSuperChatContractCommandOuterClass$ShowSuperChatContractCommand2, null, 186560756, aobm.MESSAGE, ShowSuperChatContractCommandOuterClass$ShowSuperChatContractCommand.class);
    }
}
