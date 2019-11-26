package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axlo;

public final class ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint extends anxl implements anzf {
    public static final ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint c;
    private static volatile anzq d;
    public static final anxr showEngagementPanelNavigationEndpoint;
    public int a;
    public String b = "";

    private ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint() {
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
                return new ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint();
            case 4:
                return new axlo();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.class) {
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
        ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint showEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint = new ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint();
        c = showEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint;
        anxl.registerDefaultInstance(ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.class, showEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint);
        apxu apxu = apxu.d;
        ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint showEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint2 = c;
        showEngagementPanelNavigationEndpoint = anxl.newSingularGeneratedExtension(apxu, showEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint2, showEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint2, null, 163501208, aobm.MESSAGE, ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.class);
    }
}
