package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aofm;
import defpackage.apqa;
import defpackage.apxu;

public final class AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand extends anxl implements anzf {
    public static final anxr acknowledgeChannelTouStrikeCommand;
    public static final AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand c;
    private static volatile anzq d;
    public int a;
    public apqa b;

    private AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand() {
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
                return new AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand();
            case 4:
                return new aofm();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.class) {
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
        AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand acknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand = new AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand();
        c = acknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand;
        anxl.registerDefaultInstance(AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.class, acknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand);
        apxu apxu = apxu.d;
        AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand acknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand2 = c;
        acknowledgeChannelTouStrikeCommand = anxl.newSingularGeneratedExtension(apxu, acknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand2, acknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand2, null, 230421059, aobm.MESSAGE, AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.class);
    }
}
