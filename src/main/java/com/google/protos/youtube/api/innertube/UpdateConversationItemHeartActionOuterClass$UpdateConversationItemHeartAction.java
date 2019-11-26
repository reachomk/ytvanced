package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aysa;

public final class UpdateConversationItemHeartActionOuterClass$UpdateConversationItemHeartAction extends anxl implements anzf {
    public static final UpdateConversationItemHeartActionOuterClass$UpdateConversationItemHeartAction e;
    private static volatile anzq f;
    public static final anxr updateConversationItemHeartAction;
    public int a;
    public String b;
    public String c;
    public boolean d;

    private UpdateConversationItemHeartActionOuterClass$UpdateConversationItemHeartAction() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0007\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new UpdateConversationItemHeartActionOuterClass$UpdateConversationItemHeartAction();
            case 4:
                return new aysa();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (UpdateConversationItemHeartActionOuterClass$UpdateConversationItemHeartAction.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        UpdateConversationItemHeartActionOuterClass$UpdateConversationItemHeartAction updateConversationItemHeartActionOuterClass$UpdateConversationItemHeartAction = new UpdateConversationItemHeartActionOuterClass$UpdateConversationItemHeartAction();
        e = updateConversationItemHeartActionOuterClass$UpdateConversationItemHeartAction;
        anxl.registerDefaultInstance(UpdateConversationItemHeartActionOuterClass$UpdateConversationItemHeartAction.class, updateConversationItemHeartActionOuterClass$UpdateConversationItemHeartAction);
        apxu apxu = apxu.d;
        UpdateConversationItemHeartActionOuterClass$UpdateConversationItemHeartAction updateConversationItemHeartActionOuterClass$UpdateConversationItemHeartAction2 = e;
        updateConversationItemHeartAction = anxl.newSingularGeneratedExtension(apxu, updateConversationItemHeartActionOuterClass$UpdateConversationItemHeartAction2, updateConversationItemHeartActionOuterClass$UpdateConversationItemHeartAction2, null, 175560671, aobm.MESSAGE, UpdateConversationItemHeartActionOuterClass$UpdateConversationItemHeartAction.class);
    }
}
