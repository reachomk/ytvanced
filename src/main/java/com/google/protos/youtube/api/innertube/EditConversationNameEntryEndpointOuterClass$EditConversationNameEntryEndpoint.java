package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.araq;
import defpackage.arav;

public final class EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint extends anxl implements anzf {
    public static final EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint c;
    private static volatile anzq e;
    public static final anxr editConversationNameEntryEndpoint;
    public int a;
    public araq b;
    private byte d = (byte) 2;

    private EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint() {
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
                return new EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint();
            case 4:
                return new arav();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.class) {
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
        EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint = new EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint();
        c = editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint;
        anxl.registerDefaultInstance(EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.class, editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint);
        apxu apxu = apxu.d;
        EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint2 = c;
        editConversationNameEntryEndpoint = anxl.newSingularGeneratedExtension(apxu, editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint2, editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint2, null, 127156142, aobm.MESSAGE, EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.class);
    }
}
