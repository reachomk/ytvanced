package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axfh;

public final class SelectSuperStickerPackCommandOuterClass$SelectSuperStickerPackCommand extends anxl implements anzf {
    public static final SelectSuperStickerPackCommandOuterClass$SelectSuperStickerPackCommand c;
    private static volatile anzq d;
    public static final anxr selectSuperStickerPackCommand;
    public int a;
    public String b = "";

    private SelectSuperStickerPackCommandOuterClass$SelectSuperStickerPackCommand() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"a", "b"});
            case 3:
                return new SelectSuperStickerPackCommandOuterClass$SelectSuperStickerPackCommand();
            case 4:
                return new axfh();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (SelectSuperStickerPackCommandOuterClass$SelectSuperStickerPackCommand.class) {
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
        SelectSuperStickerPackCommandOuterClass$SelectSuperStickerPackCommand selectSuperStickerPackCommandOuterClass$SelectSuperStickerPackCommand = new SelectSuperStickerPackCommandOuterClass$SelectSuperStickerPackCommand();
        c = selectSuperStickerPackCommandOuterClass$SelectSuperStickerPackCommand;
        anxl.registerDefaultInstance(SelectSuperStickerPackCommandOuterClass$SelectSuperStickerPackCommand.class, selectSuperStickerPackCommandOuterClass$SelectSuperStickerPackCommand);
        apxu apxu = apxu.d;
        SelectSuperStickerPackCommandOuterClass$SelectSuperStickerPackCommand selectSuperStickerPackCommandOuterClass$SelectSuperStickerPackCommand2 = c;
        selectSuperStickerPackCommand = anxl.newSingularGeneratedExtension(apxu, selectSuperStickerPackCommandOuterClass$SelectSuperStickerPackCommand2, selectSuperStickerPackCommandOuterClass$SelectSuperStickerPackCommand2, null, 200634914, aobm.MESSAGE, SelectSuperStickerPackCommandOuterClass$SelectSuperStickerPackCommand.class);
    }
}
