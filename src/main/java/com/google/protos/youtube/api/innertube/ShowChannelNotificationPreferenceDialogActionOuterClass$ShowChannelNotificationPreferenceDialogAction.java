package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axlc;
import defpackage.axld;

public final class ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction extends anxl implements anzf {
    public static final ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction c;
    private static volatile anzq e;
    public static final anxr showChannelNotificationPreferenceDialogAction;
    public int a;
    public axlc b;
    private byte d = (byte) 2;

    private ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction();
            case 4:
                return new axld();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction.class) {
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
        ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction showChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction = new ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction();
        c = showChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction;
        anxl.registerDefaultInstance(ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction.class, showChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction);
        apxu apxu = apxu.d;
        ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction showChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction2 = c;
        showChannelNotificationPreferenceDialogAction = anxl.newSingularGeneratedExtension(apxu, showChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction2, showChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction2, null, 90188060, aobm.MESSAGE, ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction.class);
    }
}
