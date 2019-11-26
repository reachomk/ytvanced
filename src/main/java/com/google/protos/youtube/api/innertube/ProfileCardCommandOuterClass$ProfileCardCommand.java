package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.awol;

public final class ProfileCardCommandOuterClass$ProfileCardCommand extends anxl implements anzf {
    public static final ProfileCardCommandOuterClass$ProfileCardCommand d;
    private static volatile anzq e;
    public static final anxr profileCardCommand;
    public int a;
    public String b;
    public String c;

    private ProfileCardCommandOuterClass$ProfileCardCommand() {
        String str = "";
        this.b = str;
        this.c = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new ProfileCardCommandOuterClass$ProfileCardCommand();
            case 4:
                return new awol();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ProfileCardCommandOuterClass$ProfileCardCommand.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
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
        ProfileCardCommandOuterClass$ProfileCardCommand profileCardCommandOuterClass$ProfileCardCommand = new ProfileCardCommandOuterClass$ProfileCardCommand();
        d = profileCardCommandOuterClass$ProfileCardCommand;
        anxl.registerDefaultInstance(ProfileCardCommandOuterClass$ProfileCardCommand.class, profileCardCommandOuterClass$ProfileCardCommand);
        apxu apxu = apxu.d;
        ProfileCardCommandOuterClass$ProfileCardCommand profileCardCommandOuterClass$ProfileCardCommand2 = d;
        profileCardCommand = anxl.newSingularGeneratedExtension(apxu, profileCardCommandOuterClass$ProfileCardCommand2, profileCardCommandOuterClass$ProfileCardCommand2, null, 214503604, aobm.MESSAGE, ProfileCardCommandOuterClass$ProfileCardCommand.class);
    }
}
