package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apae;
import defpackage.apxu;

public final class BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand extends anxl implements anzf {
    public static final BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand a;
    private static volatile anzq b;
    public static final anxr backgroundFetchBrowseCommand;

    private BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand() {
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
                return new BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand();
            case 4:
                return new apae();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand.class) {
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
        BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand backgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand = new BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand();
        a = backgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand;
        anxl.registerDefaultInstance(BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand.class, backgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand);
        apxu apxu = apxu.d;
        BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand backgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand2 = a;
        backgroundFetchBrowseCommand = anxl.newSingularGeneratedExtension(apxu, backgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand2, backgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand2, null, 182223933, aobm.MESSAGE, BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand.class);
    }
}
