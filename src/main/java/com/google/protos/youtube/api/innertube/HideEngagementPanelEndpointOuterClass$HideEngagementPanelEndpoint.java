package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.artm;

public final class HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint extends anxl implements anzf {
    public static final HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint c;
    private static volatile anzq d;
    public static final anxr hideEngagementPanelEndpoint;
    public int a;
    public String b = "";

    private HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint() {
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
                return new HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint();
            case 4:
                return new artm();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.class) {
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
        HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint = new HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint();
        c = hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;
        anxl.registerDefaultInstance(HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.class, hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint);
        apxu apxu = apxu.d;
        HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint2 = c;
        hideEngagementPanelEndpoint = anxl.newSingularGeneratedExtension(apxu, hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint2, hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint2, null, 183437148, aobm.MESSAGE, HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.class);
    }
}
