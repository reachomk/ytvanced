package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arml;
import defpackage.axmw;

public final class ShowSystemToastActionOuterClass$ShowSystemToastAction extends anxl implements anzf {
    public static final ShowSystemToastActionOuterClass$ShowSystemToastAction c;
    private static volatile anzq e;
    public static final anxr showSystemToastAction;
    public int a;
    public arml b;
    private byte d = (byte) 2;

    private ShowSystemToastActionOuterClass$ShowSystemToastAction() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new ShowSystemToastActionOuterClass$ShowSystemToastAction();
            case 4:
                return new axmw();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ShowSystemToastActionOuterClass$ShowSystemToastAction.class) {
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
        ShowSystemToastActionOuterClass$ShowSystemToastAction showSystemToastActionOuterClass$ShowSystemToastAction = new ShowSystemToastActionOuterClass$ShowSystemToastAction();
        c = showSystemToastActionOuterClass$ShowSystemToastAction;
        anxl.registerDefaultInstance(ShowSystemToastActionOuterClass$ShowSystemToastAction.class, showSystemToastActionOuterClass$ShowSystemToastAction);
        apxu apxu = apxu.d;
        ShowSystemToastActionOuterClass$ShowSystemToastAction showSystemToastActionOuterClass$ShowSystemToastAction2 = c;
        showSystemToastAction = anxl.newSingularGeneratedExtension(apxu, showSystemToastActionOuterClass$ShowSystemToastAction2, showSystemToastActionOuterClass$ShowSystemToastAction2, null, 173351111, aobm.MESSAGE, ShowSystemToastActionOuterClass$ShowSystemToastAction.class);
    }
}
