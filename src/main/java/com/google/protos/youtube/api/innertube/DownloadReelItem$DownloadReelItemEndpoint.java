package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aqxv;

public final class DownloadReelItem$DownloadReelItemEndpoint extends anxl implements anzf {
    public static final DownloadReelItem$DownloadReelItemEndpoint c;
    private static volatile anzq d;
    public static final anxr downloadReelItemEndpoint;
    public int a;
    public String b = "";

    private DownloadReelItem$DownloadReelItemEndpoint() {
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
                return new DownloadReelItem$DownloadReelItemEndpoint();
            case 4:
                return new aqxv();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (DownloadReelItem$DownloadReelItemEndpoint.class) {
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
        DownloadReelItem$DownloadReelItemEndpoint downloadReelItem$DownloadReelItemEndpoint = new DownloadReelItem$DownloadReelItemEndpoint();
        c = downloadReelItem$DownloadReelItemEndpoint;
        anxl.registerDefaultInstance(DownloadReelItem$DownloadReelItemEndpoint.class, downloadReelItem$DownloadReelItemEndpoint);
        apxu apxu = apxu.d;
        DownloadReelItem$DownloadReelItemEndpoint downloadReelItem$DownloadReelItemEndpoint2 = c;
        downloadReelItemEndpoint = anxl.newSingularGeneratedExtension(apxu, downloadReelItem$DownloadReelItemEndpoint2, downloadReelItem$DownloadReelItemEndpoint2, null, 188662615, aobm.MESSAGE, DownloadReelItem$DownloadReelItemEndpoint.class);
    }
}
