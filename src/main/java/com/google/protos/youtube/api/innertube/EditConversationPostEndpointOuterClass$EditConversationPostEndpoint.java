package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.araw;

public final class EditConversationPostEndpointOuterClass$EditConversationPostEndpoint extends anxl implements anzf {
    public static final EditConversationPostEndpointOuterClass$EditConversationPostEndpoint c;
    private static volatile anzq d;
    public static final anxr editConversationPostEndpoint;
    public int a;
    public String b = "";

    private EditConversationPostEndpointOuterClass$EditConversationPostEndpoint() {
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
                return new EditConversationPostEndpointOuterClass$EditConversationPostEndpoint();
            case 4:
                return new araw();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (EditConversationPostEndpointOuterClass$EditConversationPostEndpoint.class) {
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
        EditConversationPostEndpointOuterClass$EditConversationPostEndpoint editConversationPostEndpointOuterClass$EditConversationPostEndpoint = new EditConversationPostEndpointOuterClass$EditConversationPostEndpoint();
        c = editConversationPostEndpointOuterClass$EditConversationPostEndpoint;
        anxl.registerDefaultInstance(EditConversationPostEndpointOuterClass$EditConversationPostEndpoint.class, editConversationPostEndpointOuterClass$EditConversationPostEndpoint);
        apxu apxu = apxu.d;
        EditConversationPostEndpointOuterClass$EditConversationPostEndpoint editConversationPostEndpointOuterClass$EditConversationPostEndpoint2 = c;
        editConversationPostEndpoint = anxl.newSingularGeneratedExtension(apxu, editConversationPostEndpointOuterClass$EditConversationPostEndpoint2, editConversationPostEndpointOuterClass$EditConversationPostEndpoint2, null, 88564668, aobm.MESSAGE, EditConversationPostEndpointOuterClass$EditConversationPostEndpoint.class);
    }
}
