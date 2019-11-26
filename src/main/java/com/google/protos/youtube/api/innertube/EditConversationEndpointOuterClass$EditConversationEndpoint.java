package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arat;

public final class EditConversationEndpointOuterClass$EditConversationEndpoint extends anxl implements anzf {
    public static final EditConversationEndpointOuterClass$EditConversationEndpoint e;
    public static final anxr editConversationEndpoint;
    private static volatile anzq f;
    public int a;
    public String b = "";
    public boolean c;
    public long d;

    private EditConversationEndpointOuterClass$EditConversationEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002\b\u0000\u0004\u0007\u0001\u0005\u0002\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new EditConversationEndpointOuterClass$EditConversationEndpoint();
            case 4:
                return new arat();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (EditConversationEndpointOuterClass$EditConversationEndpoint.class) {
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
        EditConversationEndpointOuterClass$EditConversationEndpoint editConversationEndpointOuterClass$EditConversationEndpoint = new EditConversationEndpointOuterClass$EditConversationEndpoint();
        e = editConversationEndpointOuterClass$EditConversationEndpoint;
        anxl.registerDefaultInstance(EditConversationEndpointOuterClass$EditConversationEndpoint.class, editConversationEndpointOuterClass$EditConversationEndpoint);
        apxu apxu = apxu.d;
        EditConversationEndpointOuterClass$EditConversationEndpoint editConversationEndpointOuterClass$EditConversationEndpoint2 = e;
        editConversationEndpoint = anxl.newSingularGeneratedExtension(apxu, editConversationEndpointOuterClass$EditConversationEndpoint2, editConversationEndpointOuterClass$EditConversationEndpoint2, null, 81744007, aobm.MESSAGE, EditConversationEndpointOuterClass$EditConversationEndpoint.class);
    }
}
