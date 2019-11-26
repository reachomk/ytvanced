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
import defpackage.avcn;
import defpackage.avco;

public final class ModifyActivityCountActionOuterClass$ModifyActivityCountAction extends anxl implements anzf {
    public static final ModifyActivityCountActionOuterClass$ModifyActivityCountAction d;
    private static volatile anzq e;
    public static final anxr modifyActivityCountAction;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public long c;

    private ModifyActivityCountActionOuterClass$ModifyActivityCountAction() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001\u001b\u0004\u0002\u0000", new Object[]{"a", "b", avcn.class, "c"});
            case 3:
                return new ModifyActivityCountActionOuterClass$ModifyActivityCountAction();
            case 4:
                return new avco();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ModifyActivityCountActionOuterClass$ModifyActivityCountAction.class) {
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
        ModifyActivityCountActionOuterClass$ModifyActivityCountAction modifyActivityCountActionOuterClass$ModifyActivityCountAction = new ModifyActivityCountActionOuterClass$ModifyActivityCountAction();
        d = modifyActivityCountActionOuterClass$ModifyActivityCountAction;
        anxl.registerDefaultInstance(ModifyActivityCountActionOuterClass$ModifyActivityCountAction.class, modifyActivityCountActionOuterClass$ModifyActivityCountAction);
        apxu apxu = apxu.d;
        ModifyActivityCountActionOuterClass$ModifyActivityCountAction modifyActivityCountActionOuterClass$ModifyActivityCountAction2 = d;
        modifyActivityCountAction = anxl.newSingularGeneratedExtension(apxu, modifyActivityCountActionOuterClass$ModifyActivityCountAction2, modifyActivityCountActionOuterClass$ModifyActivityCountAction2, null, 143505435, aobm.MESSAGE, ModifyActivityCountActionOuterClass$ModifyActivityCountAction.class);
    }
}
