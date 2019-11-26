package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axfu;
import defpackage.axfv;

public final class SetAppThemeCommandOuterClass$SetAppThemeCommand extends anxl implements anzf {
    public static final SetAppThemeCommandOuterClass$SetAppThemeCommand c;
    private static volatile anzq d;
    public static final anxr setAppThemeCommand;
    public int a;
    public int b;

    private SetAppThemeCommandOuterClass$SetAppThemeCommand() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"a", "b", axfv.a});
            case 3:
                return new SetAppThemeCommandOuterClass$SetAppThemeCommand();
            case 4:
                return new axfu();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (SetAppThemeCommandOuterClass$SetAppThemeCommand.class) {
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
        SetAppThemeCommandOuterClass$SetAppThemeCommand setAppThemeCommandOuterClass$SetAppThemeCommand = new SetAppThemeCommandOuterClass$SetAppThemeCommand();
        c = setAppThemeCommandOuterClass$SetAppThemeCommand;
        anxl.registerDefaultInstance(SetAppThemeCommandOuterClass$SetAppThemeCommand.class, setAppThemeCommandOuterClass$SetAppThemeCommand);
        apxu apxu = apxu.d;
        SetAppThemeCommandOuterClass$SetAppThemeCommand setAppThemeCommandOuterClass$SetAppThemeCommand2 = c;
        setAppThemeCommand = anxl.newSingularGeneratedExtension(apxu, setAppThemeCommandOuterClass$SetAppThemeCommand2, setAppThemeCommandOuterClass$SetAppThemeCommand2, null, 195899132, aobm.MESSAGE, SetAppThemeCommandOuterClass$SetAppThemeCommand.class);
    }
}
