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
import defpackage.azel;

public final class VideoSelectedActionOuterClass$VideoSelectedAction extends anxl implements anzf {
    public static final VideoSelectedActionOuterClass$VideoSelectedAction d;
    private static volatile anzq f;
    public static final anxr videoSelectedAction;
    public int a;
    public String b = "";
    public axak c;
    private byte e = (byte) 2;

    private VideoSelectedActionOuterClass$VideoSelectedAction() {
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
                return new VideoSelectedActionOuterClass$VideoSelectedAction();
            case 4:
                return new azel();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (VideoSelectedActionOuterClass$VideoSelectedAction.class) {
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
        VideoSelectedActionOuterClass$VideoSelectedAction videoSelectedActionOuterClass$VideoSelectedAction = new VideoSelectedActionOuterClass$VideoSelectedAction();
        d = videoSelectedActionOuterClass$VideoSelectedAction;
        anxl.registerDefaultInstance(VideoSelectedActionOuterClass$VideoSelectedAction.class, videoSelectedActionOuterClass$VideoSelectedAction);
        apxu apxu = apxu.d;
        VideoSelectedActionOuterClass$VideoSelectedAction videoSelectedActionOuterClass$VideoSelectedAction2 = d;
        videoSelectedAction = anxl.newSingularGeneratedExtension(apxu, videoSelectedActionOuterClass$VideoSelectedAction2, videoSelectedActionOuterClass$VideoSelectedAction2, null, 154342739, aobm.MESSAGE, VideoSelectedActionOuterClass$VideoSelectedAction.class);
    }
}
