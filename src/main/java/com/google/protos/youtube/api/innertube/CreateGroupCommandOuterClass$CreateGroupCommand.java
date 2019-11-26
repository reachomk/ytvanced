package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anyd;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aqqz;

public final class CreateGroupCommandOuterClass$CreateGroupCommand extends anxl implements anzf {
    public static final CreateGroupCommandOuterClass$CreateGroupCommand b;
    public static final anxr createGroupCommand;
    private static volatile anzq d;
    public anyd a = anxl.emptyProtobufList();
    private byte c = (byte) 2;

    private CreateGroupCommandOuterClass$CreateGroupCommand() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.c = b;
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", apxu.class});
            case 3:
                return new CreateGroupCommandOuterClass$CreateGroupCommand();
            case 4:
                return new aqqz();
            case 5:
                return b;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (CreateGroupCommandOuterClass$CreateGroupCommand.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(b);
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
        CreateGroupCommandOuterClass$CreateGroupCommand createGroupCommandOuterClass$CreateGroupCommand = new CreateGroupCommandOuterClass$CreateGroupCommand();
        b = createGroupCommandOuterClass$CreateGroupCommand;
        anxl.registerDefaultInstance(CreateGroupCommandOuterClass$CreateGroupCommand.class, createGroupCommandOuterClass$CreateGroupCommand);
        apxu apxu = apxu.d;
        CreateGroupCommandOuterClass$CreateGroupCommand createGroupCommandOuterClass$CreateGroupCommand2 = b;
        createGroupCommand = anxl.newSingularGeneratedExtension(apxu, createGroupCommandOuterClass$CreateGroupCommand2, createGroupCommandOuterClass$CreateGroupCommand2, null, 184158169, aobm.MESSAGE, CreateGroupCommandOuterClass$CreateGroupCommand.class);
    }
}
