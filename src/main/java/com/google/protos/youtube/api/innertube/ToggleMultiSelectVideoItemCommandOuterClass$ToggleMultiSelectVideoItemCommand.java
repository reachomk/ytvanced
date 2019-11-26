package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.ayhk;

public final class ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand extends anxl implements anzf {
    public static final ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand d;
    private static volatile anzq e;
    public static final anxr toggleMultiSelectVideoItemCommand;
    public int a;
    public String b;
    public String c;

    private ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand() {
        String str = "";
        this.b = str;
        this.c = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand();
            case 4:
                return new ayhk();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
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
        ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand = new ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand();
        d = toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand;
        anxl.registerDefaultInstance(ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.class, toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand);
        apxu apxu = apxu.d;
        ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand2 = d;
        toggleMultiSelectVideoItemCommand = anxl.newSingularGeneratedExtension(apxu, toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand2, toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand2, null, 229250685, aobm.MESSAGE, ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.class);
    }
}
