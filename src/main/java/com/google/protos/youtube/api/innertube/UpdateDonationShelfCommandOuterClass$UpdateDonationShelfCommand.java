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
import defpackage.aysb;

public final class UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand extends anxl implements anzf {
    public static final UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand d;
    private static volatile anzq f;
    public static final anxr updateDonationShelfCommand;
    public int a;
    public axak b;
    public axak c;
    private byte e = (byte) 2;

    private UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001Љ\u0000\u0002Љ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand();
            case 4:
                return new aysb();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.class) {
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
        UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand updateDonationShelfCommandOuterClass$UpdateDonationShelfCommand = new UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand();
        d = updateDonationShelfCommandOuterClass$UpdateDonationShelfCommand;
        anxl.registerDefaultInstance(UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.class, updateDonationShelfCommandOuterClass$UpdateDonationShelfCommand);
        apxu apxu = apxu.d;
        UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand updateDonationShelfCommandOuterClass$UpdateDonationShelfCommand2 = d;
        updateDonationShelfCommand = anxl.newSingularGeneratedExtension(apxu, updateDonationShelfCommandOuterClass$UpdateDonationShelfCommand2, updateDonationShelfCommandOuterClass$UpdateDonationShelfCommand2, null, 219123099, aobm.MESSAGE, UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.class);
    }
}
