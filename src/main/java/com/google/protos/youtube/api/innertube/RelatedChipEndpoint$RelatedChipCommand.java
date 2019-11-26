package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.aqll;
import defpackage.awzp;

public final class RelatedChipEndpoint$RelatedChipCommand extends anxl implements anzf {
    public static final RelatedChipEndpoint$RelatedChipCommand c;
    private static volatile anzq e;
    public static final anxr relatedChipCommand;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private RelatedChipEndpoint$RelatedChipCommand() {
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
                return anxl.newMessageInfo(c, "\u0001\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0000\u0001\u0001м\u0000\u0003:\u0000", new Object[]{"b", "a", aqll.class});
            case 3:
                return new RelatedChipEndpoint$RelatedChipCommand();
            case 4:
                return new awzp();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (RelatedChipEndpoint$RelatedChipCommand.class) {
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
        RelatedChipEndpoint$RelatedChipCommand relatedChipEndpoint$RelatedChipCommand = new RelatedChipEndpoint$RelatedChipCommand();
        c = relatedChipEndpoint$RelatedChipCommand;
        anxl.registerDefaultInstance(RelatedChipEndpoint$RelatedChipCommand.class, relatedChipEndpoint$RelatedChipCommand);
        apxu apxu = apxu.d;
        RelatedChipEndpoint$RelatedChipCommand relatedChipEndpoint$RelatedChipCommand2 = c;
        relatedChipCommand = anxl.newSingularGeneratedExtension(apxu, relatedChipEndpoint$RelatedChipCommand2, relatedChipEndpoint$RelatedChipCommand2, null, 189079648, aobm.MESSAGE, RelatedChipEndpoint$RelatedChipCommand.class);
    }
}
