package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arex;
import defpackage.axlm;

public final class ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint extends anxl implements anzf {
    public static final ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint d;
    private static volatile anzq f;
    public static final anxr showEngagementPanelEndpoint;
    public int a;
    public String b = "";
    public arex c;
    private byte e = (byte) 2;

    private ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\b\u0000\u0002Љ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint();
            case 4:
                return new axlm();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
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
        ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = new ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint();
        d = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
        anxl.registerDefaultInstance(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.class, showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint);
        apxu apxu = apxu.d;
        ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint2 = d;
        showEngagementPanelEndpoint = anxl.newSingularGeneratedExtension(apxu, showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint2, showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint2, null, 138681778, aobm.MESSAGE, ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.class);
    }
}
