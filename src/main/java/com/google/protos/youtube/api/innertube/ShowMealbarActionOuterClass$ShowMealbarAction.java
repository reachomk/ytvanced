package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axlu;
import defpackage.axlv;

public final class ShowMealbarActionOuterClass$ShowMealbarAction extends anxl implements anzf {
    public static final ShowMealbarActionOuterClass$ShowMealbarAction c;
    private static volatile anzq e;
    public static final anxr showMealbarAction;
    public int a;
    public axlu b;
    private byte d = (byte) 2;

    private ShowMealbarActionOuterClass$ShowMealbarAction() {
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
                return new ShowMealbarActionOuterClass$ShowMealbarAction();
            case 4:
                return new axlv();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ShowMealbarActionOuterClass$ShowMealbarAction.class) {
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
        ShowMealbarActionOuterClass$ShowMealbarAction showMealbarActionOuterClass$ShowMealbarAction = new ShowMealbarActionOuterClass$ShowMealbarAction();
        c = showMealbarActionOuterClass$ShowMealbarAction;
        anxl.registerDefaultInstance(ShowMealbarActionOuterClass$ShowMealbarAction.class, showMealbarActionOuterClass$ShowMealbarAction);
        apxu apxu = apxu.d;
        ShowMealbarActionOuterClass$ShowMealbarAction showMealbarActionOuterClass$ShowMealbarAction2 = c;
        showMealbarAction = anxl.newSingularGeneratedExtension(apxu, showMealbarActionOuterClass$ShowMealbarAction2, showMealbarActionOuterClass$ShowMealbarAction2, null, 109865460, aobm.MESSAGE, ShowMealbarActionOuterClass$ShowMealbarAction.class);
    }
}
