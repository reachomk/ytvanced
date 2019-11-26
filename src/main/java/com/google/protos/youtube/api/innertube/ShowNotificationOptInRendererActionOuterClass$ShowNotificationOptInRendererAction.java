package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axmb;

public final class ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction extends anxl implements anzf {
    public static final ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction a;
    private static volatile anzq b;
    public static final anxr showNotificationOptInRendererAction;

    private ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction() {
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
                return new ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction();
            case 4:
                return new axmb();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction.class) {
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
        ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction showNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction = new ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction();
        a = showNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction;
        anxl.registerDefaultInstance(ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction.class, showNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction);
        apxu apxu = apxu.d;
        ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction showNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction2 = a;
        showNotificationOptInRendererAction = anxl.newSingularGeneratedExtension(apxu, showNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction2, showNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction2, null, 135114359, aobm.MESSAGE, ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction.class);
    }
}
