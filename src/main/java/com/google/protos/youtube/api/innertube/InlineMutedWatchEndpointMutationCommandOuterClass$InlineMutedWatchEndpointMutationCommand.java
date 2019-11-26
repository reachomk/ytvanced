package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arxy;

public final class InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand extends anxl implements anzf {
    public static final InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand c;
    private static volatile anzq e;
    public static final anxr inlineMutedWatchEndpointMutationCommand;
    public int a;
    public apxu b;
    private byte d = (byte) 2;

    private InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand();
            case 4:
                return new arxy();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand inlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand = new InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand();
        c = inlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand;
        anxl.registerDefaultInstance(InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.class, inlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand);
        apxu apxu = apxu.d;
        InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand inlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand2 = c;
        inlineMutedWatchEndpointMutationCommand = anxl.newSingularGeneratedExtension(apxu, inlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand2, inlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand2, null, 200453700, aobm.MESSAGE, InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.class);
    }
}
