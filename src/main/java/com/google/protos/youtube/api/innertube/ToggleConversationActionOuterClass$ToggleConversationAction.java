package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.ayhh;

public final class ToggleConversationActionOuterClass$ToggleConversationAction extends anxl implements anzf {
    public static final ToggleConversationActionOuterClass$ToggleConversationAction c;
    private static volatile anzq d;
    public static final anxr toggleConversationAction;
    public int a;
    public boolean b;

    private ToggleConversationActionOuterClass$ToggleConversationAction() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0007\u0001", new Object[]{"a", "b"});
            case 3:
                return new ToggleConversationActionOuterClass$ToggleConversationAction();
            case 4:
                return new ayhh();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (ToggleConversationActionOuterClass$ToggleConversationAction.class) {
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
        ToggleConversationActionOuterClass$ToggleConversationAction toggleConversationActionOuterClass$ToggleConversationAction = new ToggleConversationActionOuterClass$ToggleConversationAction();
        c = toggleConversationActionOuterClass$ToggleConversationAction;
        anxl.registerDefaultInstance(ToggleConversationActionOuterClass$ToggleConversationAction.class, toggleConversationActionOuterClass$ToggleConversationAction);
        apxu apxu = apxu.d;
        ToggleConversationActionOuterClass$ToggleConversationAction toggleConversationActionOuterClass$ToggleConversationAction2 = c;
        toggleConversationAction = anxl.newSingularGeneratedExtension(apxu, toggleConversationActionOuterClass$ToggleConversationAction2, toggleConversationActionOuterClass$ToggleConversationAction2, null, 130528991, aobm.MESSAGE, ToggleConversationActionOuterClass$ToggleConversationAction.class);
    }
}
