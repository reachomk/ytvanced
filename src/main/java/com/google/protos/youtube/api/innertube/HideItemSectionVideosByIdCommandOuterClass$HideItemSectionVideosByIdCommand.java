package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.artn;

public final class HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand extends anxl implements anzf {
    public static final HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand c;
    private static volatile anzq d;
    public static final anxr hideItemSectionVideosByIdCommand;
    public int a;
    public String b = "";

    private HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand() {
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
                return new HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand();
            case 4:
                return new artn();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand.class) {
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
        HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand hideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand = new HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand();
        c = hideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand;
        anxl.registerDefaultInstance(HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand.class, hideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand);
        apxu apxu = apxu.d;
        HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand hideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand2 = c;
        hideItemSectionVideosByIdCommand = anxl.newSingularGeneratedExtension(apxu, hideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand2, hideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand2, null, 228198035, aobm.MESSAGE, HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand.class);
    }
}
