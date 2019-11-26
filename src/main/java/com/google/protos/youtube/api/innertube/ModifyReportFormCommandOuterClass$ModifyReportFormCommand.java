package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.avcs;
import defpackage.avcu;

public final class ModifyReportFormCommandOuterClass$ModifyReportFormCommand extends anxl implements anzf {
    public static final ModifyReportFormCommandOuterClass$ModifyReportFormCommand c;
    private static volatile anzq d;
    public static final anxr modifyReportFormCommand;
    public int a;
    public int b;

    private ModifyReportFormCommandOuterClass$ModifyReportFormCommand() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"a", "b", avcu.a});
            case 3:
                return new ModifyReportFormCommandOuterClass$ModifyReportFormCommand();
            case 4:
                return new avcs();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (ModifyReportFormCommandOuterClass$ModifyReportFormCommand.class) {
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
        ModifyReportFormCommandOuterClass$ModifyReportFormCommand modifyReportFormCommandOuterClass$ModifyReportFormCommand = new ModifyReportFormCommandOuterClass$ModifyReportFormCommand();
        c = modifyReportFormCommandOuterClass$ModifyReportFormCommand;
        anxl.registerDefaultInstance(ModifyReportFormCommandOuterClass$ModifyReportFormCommand.class, modifyReportFormCommandOuterClass$ModifyReportFormCommand);
        apxu apxu = apxu.d;
        ModifyReportFormCommandOuterClass$ModifyReportFormCommand modifyReportFormCommandOuterClass$ModifyReportFormCommand2 = c;
        modifyReportFormCommand = anxl.newSingularGeneratedExtension(apxu, modifyReportFormCommandOuterClass$ModifyReportFormCommand2, modifyReportFormCommandOuterClass$ModifyReportFormCommand2, null, 171313789, aobm.MESSAGE, ModifyReportFormCommandOuterClass$ModifyReportFormCommand.class);
    }
}
