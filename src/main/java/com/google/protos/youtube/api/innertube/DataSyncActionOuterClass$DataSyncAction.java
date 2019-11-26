package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aqss;
import defpackage.aqst;

public final class DataSyncActionOuterClass$DataSyncAction extends anxl implements anzf {
    public static final DataSyncActionOuterClass$DataSyncAction c;
    public static final anxr dataSyncAction;
    private static volatile anzq e;
    public int a;
    public aqss b;
    private byte d = (byte) 2;

    private DataSyncActionOuterClass$DataSyncAction() {
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
                return new DataSyncActionOuterClass$DataSyncAction();
            case 4:
                return new aqst();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (DataSyncActionOuterClass$DataSyncAction.class) {
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
        DataSyncActionOuterClass$DataSyncAction dataSyncActionOuterClass$DataSyncAction = new DataSyncActionOuterClass$DataSyncAction();
        c = dataSyncActionOuterClass$DataSyncAction;
        anxl.registerDefaultInstance(DataSyncActionOuterClass$DataSyncAction.class, dataSyncActionOuterClass$DataSyncAction);
        apxu apxu = apxu.d;
        DataSyncActionOuterClass$DataSyncAction dataSyncActionOuterClass$DataSyncAction2 = c;
        dataSyncAction = anxl.newSingularGeneratedExtension(apxu, dataSyncActionOuterClass$DataSyncAction2, dataSyncActionOuterClass$DataSyncAction2, null, 143523974, aobm.MESSAGE, DataSyncActionOuterClass$DataSyncAction.class);
    }
}
