package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aqmh;
import defpackage.axak;

public final class ConversationNewGroupCommandOuterClass$ConversationNewGroupCommand extends anxl implements anzf {
    public static final ConversationNewGroupCommandOuterClass$ConversationNewGroupCommand c;
    public static final anxr conversationNewGroupCommand;
    private static volatile anzq e;
    public int a;
    public axak b;
    private byte d = (byte) 2;

    private ConversationNewGroupCommandOuterClass$ConversationNewGroupCommand() {
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
                return new ConversationNewGroupCommandOuterClass$ConversationNewGroupCommand();
            case 4:
                return new aqmh();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ConversationNewGroupCommandOuterClass$ConversationNewGroupCommand.class) {
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
        ConversationNewGroupCommandOuterClass$ConversationNewGroupCommand conversationNewGroupCommandOuterClass$ConversationNewGroupCommand = new ConversationNewGroupCommandOuterClass$ConversationNewGroupCommand();
        c = conversationNewGroupCommandOuterClass$ConversationNewGroupCommand;
        anxl.registerDefaultInstance(ConversationNewGroupCommandOuterClass$ConversationNewGroupCommand.class, conversationNewGroupCommandOuterClass$ConversationNewGroupCommand);
        apxu apxu = apxu.d;
        ConversationNewGroupCommandOuterClass$ConversationNewGroupCommand conversationNewGroupCommandOuterClass$ConversationNewGroupCommand2 = c;
        conversationNewGroupCommand = anxl.newSingularGeneratedExtension(apxu, conversationNewGroupCommandOuterClass$ConversationNewGroupCommand2, conversationNewGroupCommandOuterClass$ConversationNewGroupCommand2, null, 183443903, aobm.MESSAGE, ConversationNewGroupCommandOuterClass$ConversationNewGroupCommand.class);
    }
}
