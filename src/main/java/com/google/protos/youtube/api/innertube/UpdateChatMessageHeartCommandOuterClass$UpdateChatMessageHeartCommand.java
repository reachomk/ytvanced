package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.ayrq;

public final class UpdateChatMessageHeartCommandOuterClass$UpdateChatMessageHeartCommand extends anxl implements anzf {
    public static final UpdateChatMessageHeartCommandOuterClass$UpdateChatMessageHeartCommand a;
    private static volatile anzq b;
    public static final anxr updateChatMessageHeartCommand;

    private UpdateChatMessageHeartCommandOuterClass$UpdateChatMessageHeartCommand() {
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
                return new UpdateChatMessageHeartCommandOuterClass$UpdateChatMessageHeartCommand();
            case 4:
                return new ayrq();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (UpdateChatMessageHeartCommandOuterClass$UpdateChatMessageHeartCommand.class) {
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
        UpdateChatMessageHeartCommandOuterClass$UpdateChatMessageHeartCommand updateChatMessageHeartCommandOuterClass$UpdateChatMessageHeartCommand = new UpdateChatMessageHeartCommandOuterClass$UpdateChatMessageHeartCommand();
        a = updateChatMessageHeartCommandOuterClass$UpdateChatMessageHeartCommand;
        anxl.registerDefaultInstance(UpdateChatMessageHeartCommandOuterClass$UpdateChatMessageHeartCommand.class, updateChatMessageHeartCommandOuterClass$UpdateChatMessageHeartCommand);
        apxu apxu = apxu.d;
        UpdateChatMessageHeartCommandOuterClass$UpdateChatMessageHeartCommand updateChatMessageHeartCommandOuterClass$UpdateChatMessageHeartCommand2 = a;
        updateChatMessageHeartCommand = anxl.newSingularGeneratedExtension(apxu, updateChatMessageHeartCommandOuterClass$UpdateChatMessageHeartCommand2, updateChatMessageHeartCommandOuterClass$UpdateChatMessageHeartCommand2, null, 216419085, aobm.MESSAGE, UpdateChatMessageHeartCommandOuterClass$UpdateChatMessageHeartCommand.class);
    }
}
