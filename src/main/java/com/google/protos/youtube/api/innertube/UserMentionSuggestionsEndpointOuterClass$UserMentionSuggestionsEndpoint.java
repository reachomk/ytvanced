package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aywe;

public final class UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint extends anxl implements anzf {
    public static final UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint a;
    private static volatile anzq b;
    public static final anxr userMentionSuggestionsEndpoint;

    private UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint();
            case 4:
                return new aywe();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint.class) {
                        obj3 = b;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
                            b = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint userMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint = new UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint();
        a = userMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint;
        anxl.registerDefaultInstance(UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint.class, userMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint);
        apxu apxu = apxu.d;
        UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint userMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint2 = a;
        userMentionSuggestionsEndpoint = anxl.newSingularGeneratedExtension(apxu, userMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint2, userMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint2, null, 215442723, aobm.MESSAGE, UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint.class);
    }
}
