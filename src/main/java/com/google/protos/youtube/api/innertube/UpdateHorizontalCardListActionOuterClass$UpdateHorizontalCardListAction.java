package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aysd;
import defpackage.aysf;

public final class UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction extends anxl implements anzf {
    public static final UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction e;
    private static volatile anzq g;
    public static final anxr updateHorizontalCardListAction;
    public int a;
    public int b = 0;
    public Object c;
    public aysf d;
    private byte f = (byte) 2;

    private UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001;\u0000\u0002Љ\u0002\u0003;\u0000", new Object[]{"c", "b", "a", "d"});
            case 3:
                return new UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction();
            case 4:
                return new aysd();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.class) {
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
        UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction = new UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction();
        e = updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction;
        anxl.registerDefaultInstance(UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.class, updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction);
        apxu apxu = apxu.d;
        UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction2 = e;
        updateHorizontalCardListAction = anxl.newSingularGeneratedExtension(apxu, updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction2, updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction2, null, 139828682, aobm.MESSAGE, UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.class);
    }
}
