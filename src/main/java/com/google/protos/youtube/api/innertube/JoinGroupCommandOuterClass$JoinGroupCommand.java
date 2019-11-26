package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.atwg;
import defpackage.axak;

public final class JoinGroupCommandOuterClass$JoinGroupCommand extends anxl implements anzf {
    public static final JoinGroupCommandOuterClass$JoinGroupCommand c;
    private static volatile anzq e;
    public static final anxr joinGroupCommand;
    public int a;
    public axak b;
    private byte d = (byte) 2;

    private JoinGroupCommandOuterClass$JoinGroupCommand() {
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
                return new JoinGroupCommandOuterClass$JoinGroupCommand();
            case 4:
                return new atwg();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (JoinGroupCommandOuterClass$JoinGroupCommand.class) {
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
        JoinGroupCommandOuterClass$JoinGroupCommand joinGroupCommandOuterClass$JoinGroupCommand = new JoinGroupCommandOuterClass$JoinGroupCommand();
        c = joinGroupCommandOuterClass$JoinGroupCommand;
        anxl.registerDefaultInstance(JoinGroupCommandOuterClass$JoinGroupCommand.class, joinGroupCommandOuterClass$JoinGroupCommand);
        apxu apxu = apxu.d;
        JoinGroupCommandOuterClass$JoinGroupCommand joinGroupCommandOuterClass$JoinGroupCommand2 = c;
        joinGroupCommand = anxl.newSingularGeneratedExtension(apxu, joinGroupCommandOuterClass$JoinGroupCommand2, joinGroupCommandOuterClass$JoinGroupCommand2, null, 183859585, aobm.MESSAGE, JoinGroupCommandOuterClass$JoinGroupCommand.class);
    }
}
