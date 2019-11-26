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
import defpackage.arxw;
import defpackage.axak;

public final class InlineAuthCommandOuterClass$InlineAuthCommand extends anxl implements anzf {
    public static final InlineAuthCommandOuterClass$InlineAuthCommand h;
    public static final anxr inlineAuthCommand;
    private static volatile anzq j;
    public int a;
    public apxu b;
    public apxu c;
    public apxu d;
    public apxu e;
    public axak f;
    public anyd g = anxl.emptyProtobufList();
    private byte i = (byte) 2;

    private InlineAuthCommandOuterClass$InlineAuthCommand() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0006\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Л", new Object[]{"a", "b", "c", "d", "e", "f", "g", axak.class});
            case 3:
                return new InlineAuthCommandOuterClass$InlineAuthCommand();
            case 4:
                return new arxw();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (InlineAuthCommandOuterClass$InlineAuthCommand.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand = new InlineAuthCommandOuterClass$InlineAuthCommand();
        h = inlineAuthCommandOuterClass$InlineAuthCommand;
        anxl.registerDefaultInstance(InlineAuthCommandOuterClass$InlineAuthCommand.class, inlineAuthCommandOuterClass$InlineAuthCommand);
        apxu apxu = apxu.d;
        InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand2 = h;
        inlineAuthCommand = anxl.newSingularGeneratedExtension(apxu, inlineAuthCommandOuterClass$InlineAuthCommand2, inlineAuthCommandOuterClass$InlineAuthCommand2, null, 196607391, aobm.MESSAGE, InlineAuthCommandOuterClass$InlineAuthCommand.class);
    }
}
