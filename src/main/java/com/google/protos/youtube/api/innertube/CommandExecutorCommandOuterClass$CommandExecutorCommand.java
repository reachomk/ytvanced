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
import defpackage.apxv;

public final class CommandExecutorCommandOuterClass$CommandExecutorCommand extends anxl implements anzf {
    public static final CommandExecutorCommandOuterClass$CommandExecutorCommand b;
    public static final anxr commandExecutorCommand;
    private static volatile anzq d;
    public anyd a = anxl.emptyProtobufList();
    private byte c = (byte) 2;

    private CommandExecutorCommandOuterClass$CommandExecutorCommand() {
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
                return anxl.newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", apxu.class});
            case 3:
                return new CommandExecutorCommandOuterClass$CommandExecutorCommand();
            case 4:
                return new apxv();
            case 5:
                return b;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (CommandExecutorCommandOuterClass$CommandExecutorCommand.class) {
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
        CommandExecutorCommandOuterClass$CommandExecutorCommand commandExecutorCommandOuterClass$CommandExecutorCommand = new CommandExecutorCommandOuterClass$CommandExecutorCommand();
        b = commandExecutorCommandOuterClass$CommandExecutorCommand;
        anxl.registerDefaultInstance(CommandExecutorCommandOuterClass$CommandExecutorCommand.class, commandExecutorCommandOuterClass$CommandExecutorCommand);
        apxu apxu = apxu.d;
        CommandExecutorCommandOuterClass$CommandExecutorCommand commandExecutorCommandOuterClass$CommandExecutorCommand2 = b;
        commandExecutorCommand = anxl.newSingularGeneratedExtension(apxu, commandExecutorCommandOuterClass$CommandExecutorCommand2, commandExecutorCommandOuterClass$CommandExecutorCommand2, null, 174116574, aobm.MESSAGE, CommandExecutorCommandOuterClass$CommandExecutorCommand.class);
    }
}
