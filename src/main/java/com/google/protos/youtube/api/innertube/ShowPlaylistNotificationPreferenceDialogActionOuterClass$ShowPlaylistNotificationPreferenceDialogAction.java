package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axmc;
import defpackage.axmd;

public final class ShowPlaylistNotificationPreferenceDialogActionOuterClass$ShowPlaylistNotificationPreferenceDialogAction extends anxl implements anzf {
    public static final ShowPlaylistNotificationPreferenceDialogActionOuterClass$ShowPlaylistNotificationPreferenceDialogAction c;
    private static volatile anzq e;
    public static final anxr showPlaylistNotificationPreferenceDialogAction;
    public int a;
    public axmc b;
    private byte d = (byte) 2;

    private ShowPlaylistNotificationPreferenceDialogActionOuterClass$ShowPlaylistNotificationPreferenceDialogAction() {
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
                return new ShowPlaylistNotificationPreferenceDialogActionOuterClass$ShowPlaylistNotificationPreferenceDialogAction();
            case 4:
                return new axmd();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ShowPlaylistNotificationPreferenceDialogActionOuterClass$ShowPlaylistNotificationPreferenceDialogAction.class) {
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
        ShowPlaylistNotificationPreferenceDialogActionOuterClass$ShowPlaylistNotificationPreferenceDialogAction showPlaylistNotificationPreferenceDialogActionOuterClass$ShowPlaylistNotificationPreferenceDialogAction = new ShowPlaylistNotificationPreferenceDialogActionOuterClass$ShowPlaylistNotificationPreferenceDialogAction();
        c = showPlaylistNotificationPreferenceDialogActionOuterClass$ShowPlaylistNotificationPreferenceDialogAction;
        anxl.registerDefaultInstance(ShowPlaylistNotificationPreferenceDialogActionOuterClass$ShowPlaylistNotificationPreferenceDialogAction.class, showPlaylistNotificationPreferenceDialogActionOuterClass$ShowPlaylistNotificationPreferenceDialogAction);
        apxu apxu = apxu.d;
        ShowPlaylistNotificationPreferenceDialogActionOuterClass$ShowPlaylistNotificationPreferenceDialogAction showPlaylistNotificationPreferenceDialogActionOuterClass$ShowPlaylistNotificationPreferenceDialogAction2 = c;
        showPlaylistNotificationPreferenceDialogAction = anxl.newSingularGeneratedExtension(apxu, showPlaylistNotificationPreferenceDialogActionOuterClass$ShowPlaylistNotificationPreferenceDialogAction2, showPlaylistNotificationPreferenceDialogActionOuterClass$ShowPlaylistNotificationPreferenceDialogAction2, null, 113374775, aobm.MESSAGE, ShowPlaylistNotificationPreferenceDialogActionOuterClass$ShowPlaylistNotificationPreferenceDialogAction.class);
    }
}
