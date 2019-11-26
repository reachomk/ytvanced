package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arrg;

public final class GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand extends anxl implements anzf {
    public static final GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand a;
    private static volatile anzq b;
    public static final anxr getSuggestedPlaylistVideosCommand;

    private GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand() {
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
                return new GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand();
            case 4:
                return new arrg();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand.class) {
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
        GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand getSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand = new GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand();
        a = getSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand;
        anxl.registerDefaultInstance(GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand.class, getSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand);
        apxu apxu = apxu.d;
        GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand getSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand2 = a;
        getSuggestedPlaylistVideosCommand = anxl.newSingularGeneratedExtension(apxu, getSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand2, getSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand2, null, 229815794, aobm.MESSAGE, GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand.class);
    }
}
