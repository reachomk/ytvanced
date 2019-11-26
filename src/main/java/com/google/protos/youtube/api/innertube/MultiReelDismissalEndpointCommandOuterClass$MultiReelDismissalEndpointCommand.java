package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aved;
import defpackage.axak;

public final class MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand extends anxl implements anzf {
    public static final MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand c;
    private static volatile anzq e;
    public static final anxr multiReelDismissalEndpointCommand;
    public int a;
    public axak b;
    private byte d = (byte) 2;

    private MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand() {
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
                return new MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand();
            case 4:
                return new aved();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.class) {
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
        MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand multiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand = new MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand();
        c = multiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand;
        anxl.registerDefaultInstance(MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.class, multiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand);
        apxu apxu = apxu.d;
        MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand multiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand2 = c;
        multiReelDismissalEndpointCommand = anxl.newSingularGeneratedExtension(apxu, multiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand2, multiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand2, null, 187251317, aobm.MESSAGE, MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.class);
    }
}
