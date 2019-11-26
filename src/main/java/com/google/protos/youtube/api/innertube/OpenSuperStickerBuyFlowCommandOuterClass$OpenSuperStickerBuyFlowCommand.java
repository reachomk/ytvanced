package com.google.protos.youtube.api.innertube;

import defpackage.anvu;
import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.avty;

public final class OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand extends anxl implements anzf {
    public static final OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand c;
    private static volatile anzq d;
    public static final anxr openSuperStickerBuyFlowCommand;
    public int a;
    public anvu b = anvu.a;

    private OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n\u0000", new Object[]{"a", "b"});
            case 3:
                return new OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand();
            case 4:
                return new avty();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.class) {
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
        OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand openSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand = new OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand();
        c = openSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand;
        anxl.registerDefaultInstance(OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.class, openSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand);
        apxu apxu = apxu.d;
        OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand openSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand2 = c;
        openSuperStickerBuyFlowCommand = anxl.newSingularGeneratedExtension(apxu, openSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand2, openSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand2, null, 198340511, aobm.MESSAGE, OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.class);
    }
}
