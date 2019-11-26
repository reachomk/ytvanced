package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.awzy;

public final class RemoveConversationActionOuterClass$RemoveConversationAction extends anxl implements anzf {
    public static final RemoveConversationActionOuterClass$RemoveConversationAction c;
    private static volatile anzq d;
    public static final anxr removeConversationAction;
    public int a;
    public String b = "";

    private RemoveConversationActionOuterClass$RemoveConversationAction() {
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
                return new RemoveConversationActionOuterClass$RemoveConversationAction();
            case 4:
                return new awzy();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (RemoveConversationActionOuterClass$RemoveConversationAction.class) {
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
        RemoveConversationActionOuterClass$RemoveConversationAction removeConversationActionOuterClass$RemoveConversationAction = new RemoveConversationActionOuterClass$RemoveConversationAction();
        c = removeConversationActionOuterClass$RemoveConversationAction;
        anxl.registerDefaultInstance(RemoveConversationActionOuterClass$RemoveConversationAction.class, removeConversationActionOuterClass$RemoveConversationAction);
        apxu apxu = apxu.d;
        RemoveConversationActionOuterClass$RemoveConversationAction removeConversationActionOuterClass$RemoveConversationAction2 = c;
        removeConversationAction = anxl.newSingularGeneratedExtension(apxu, removeConversationActionOuterClass$RemoveConversationAction2, removeConversationActionOuterClass$RemoveConversationAction2, null, 105902475, aobm.MESSAGE, RemoveConversationActionOuterClass$RemoveConversationAction.class);
    }
}
