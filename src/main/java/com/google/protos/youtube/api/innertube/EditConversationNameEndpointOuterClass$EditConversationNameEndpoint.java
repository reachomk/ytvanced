package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arau;

public final class EditConversationNameEndpointOuterClass$EditConversationNameEndpoint extends anxl implements anzf {
    public static final EditConversationNameEndpointOuterClass$EditConversationNameEndpoint e;
    public static final anxr editConversationNameEndpoint;
    private static volatile anzq f;
    public int a;
    public String b;
    public String c;
    public long d;

    private EditConversationNameEndpointOuterClass$EditConversationNameEndpoint() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0002\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new EditConversationNameEndpointOuterClass$EditConversationNameEndpoint();
            case 4:
                return new arau();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (EditConversationNameEndpointOuterClass$EditConversationNameEndpoint.class) {
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
        EditConversationNameEndpointOuterClass$EditConversationNameEndpoint editConversationNameEndpointOuterClass$EditConversationNameEndpoint = new EditConversationNameEndpointOuterClass$EditConversationNameEndpoint();
        e = editConversationNameEndpointOuterClass$EditConversationNameEndpoint;
        anxl.registerDefaultInstance(EditConversationNameEndpointOuterClass$EditConversationNameEndpoint.class, editConversationNameEndpointOuterClass$EditConversationNameEndpoint);
        apxu apxu = apxu.d;
        EditConversationNameEndpointOuterClass$EditConversationNameEndpoint editConversationNameEndpointOuterClass$EditConversationNameEndpoint2 = e;
        editConversationNameEndpoint = anxl.newSingularGeneratedExtension(apxu, editConversationNameEndpointOuterClass$EditConversationNameEndpoint2, editConversationNameEndpointOuterClass$EditConversationNameEndpoint2, null, 127156150, aobm.MESSAGE, EditConversationNameEndpointOuterClass$EditConversationNameEndpoint.class);
    }
}
