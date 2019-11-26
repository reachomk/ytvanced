package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axlh;
import defpackage.axli;

public final class ShowContentPillActionOuterClass$ShowContentPillAction extends anxl implements anzf {
    public static final ShowContentPillActionOuterClass$ShowContentPillAction c;
    private static volatile anzq e;
    public static final anxr showContentPillAction;
    public int a;
    public axlh b;
    private byte d = (byte) 2;

    private ShowContentPillActionOuterClass$ShowContentPillAction() {
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
                return new ShowContentPillActionOuterClass$ShowContentPillAction();
            case 4:
                return new axli();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ShowContentPillActionOuterClass$ShowContentPillAction.class) {
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
        ShowContentPillActionOuterClass$ShowContentPillAction showContentPillActionOuterClass$ShowContentPillAction = new ShowContentPillActionOuterClass$ShowContentPillAction();
        c = showContentPillActionOuterClass$ShowContentPillAction;
        anxl.registerDefaultInstance(ShowContentPillActionOuterClass$ShowContentPillAction.class, showContentPillActionOuterClass$ShowContentPillAction);
        apxu apxu = apxu.d;
        ShowContentPillActionOuterClass$ShowContentPillAction showContentPillActionOuterClass$ShowContentPillAction2 = c;
        showContentPillAction = anxl.newSingularGeneratedExtension(apxu, showContentPillActionOuterClass$ShowContentPillAction2, showContentPillActionOuterClass$ShowContentPillAction2, null, 135486026, aobm.MESSAGE, ShowContentPillActionOuterClass$ShowContentPillAction.class);
    }
}
