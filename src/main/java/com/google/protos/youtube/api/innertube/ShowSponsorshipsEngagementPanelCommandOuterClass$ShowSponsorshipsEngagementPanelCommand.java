package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axak;
import defpackage.axmo;

public final class ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand extends anxl implements anzf {
    public static final ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand e;
    private static volatile anzq g;
    public static final anxr showSponsorshipsEngagementPanelCommand;
    public int a;
    public String b = "";
    public axak c;
    public apxu d;
    private byte f = (byte) 2;

    private ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001Љ\u0001\u0002Љ\u0002\u0003\b\u0000", new Object[]{"a", "c", "d", "b"});
            case 3:
                return new ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand();
            case 4:
                return new axmo();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand = new ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand();
        e = showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand;
        anxl.registerDefaultInstance(ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.class, showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand);
        apxu apxu = apxu.d;
        ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand2 = e;
        showSponsorshipsEngagementPanelCommand = anxl.newSingularGeneratedExtension(apxu, showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand2, showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand2, null, 200394150, aobm.MESSAGE, ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.class);
    }
}
