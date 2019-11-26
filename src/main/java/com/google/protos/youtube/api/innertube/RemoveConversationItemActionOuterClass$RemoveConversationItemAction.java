package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.awzz;

public final class RemoveConversationItemActionOuterClass$RemoveConversationItemAction extends anxl implements anzf {
    public static final RemoveConversationItemActionOuterClass$RemoveConversationItemAction d;
    private static volatile anzq e;
    public static final anxr removeConversationItemAction;
    public int a;
    public String b;
    public String c;

    private RemoveConversationItemActionOuterClass$RemoveConversationItemAction() {
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
                return new RemoveConversationItemActionOuterClass$RemoveConversationItemAction();
            case 4:
                return new awzz();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (RemoveConversationItemActionOuterClass$RemoveConversationItemAction.class) {
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
        RemoveConversationItemActionOuterClass$RemoveConversationItemAction removeConversationItemActionOuterClass$RemoveConversationItemAction = new RemoveConversationItemActionOuterClass$RemoveConversationItemAction();
        d = removeConversationItemActionOuterClass$RemoveConversationItemAction;
        anxl.registerDefaultInstance(RemoveConversationItemActionOuterClass$RemoveConversationItemAction.class, removeConversationItemActionOuterClass$RemoveConversationItemAction);
        apxu apxu = apxu.d;
        RemoveConversationItemActionOuterClass$RemoveConversationItemAction removeConversationItemActionOuterClass$RemoveConversationItemAction2 = d;
        removeConversationItemAction = anxl.newSingularGeneratedExtension(apxu, removeConversationItemActionOuterClass$RemoveConversationItemAction2, removeConversationItemActionOuterClass$RemoveConversationItemAction2, null, 124957126, aobm.MESSAGE, RemoveConversationItemActionOuterClass$RemoveConversationItemAction.class);
    }
}
