package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aysi;
import defpackage.azbz;
import defpackage.azdg;

public final class UpdateViewershipActionOuterClass$UpdateViewershipAction extends anxl implements anzf {
    public static final UpdateViewershipActionOuterClass$UpdateViewershipAction e;
    private static volatile anzq g;
    public static final anxr updateViewershipAction;
    public int a;
    public azbz b;
    public azdg c;
    public boolean d;
    private byte f = (byte) 2;

    private UpdateViewershipActionOuterClass$UpdateViewershipAction() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001Љ\u0000\u0002\u0007\u0002\u0003Љ\u0001", new Object[]{"a", "b", "d", "c"});
            case 3:
                return new UpdateViewershipActionOuterClass$UpdateViewershipAction();
            case 4:
                return new aysi();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (UpdateViewershipActionOuterClass$UpdateViewershipAction.class) {
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
        UpdateViewershipActionOuterClass$UpdateViewershipAction updateViewershipActionOuterClass$UpdateViewershipAction = new UpdateViewershipActionOuterClass$UpdateViewershipAction();
        e = updateViewershipActionOuterClass$UpdateViewershipAction;
        anxl.registerDefaultInstance(UpdateViewershipActionOuterClass$UpdateViewershipAction.class, updateViewershipActionOuterClass$UpdateViewershipAction);
        apxu apxu = apxu.d;
        UpdateViewershipActionOuterClass$UpdateViewershipAction updateViewershipActionOuterClass$UpdateViewershipAction2 = e;
        updateViewershipAction = anxl.newSingularGeneratedExtension(apxu, updateViewershipActionOuterClass$UpdateViewershipAction2, updateViewershipActionOuterClass$UpdateViewershipAction2, null, 104886333, aobm.MESSAGE, UpdateViewershipActionOuterClass$UpdateViewershipAction.class);
    }
}
