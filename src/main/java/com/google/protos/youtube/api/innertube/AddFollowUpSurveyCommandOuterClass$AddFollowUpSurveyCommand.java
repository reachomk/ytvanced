package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anyd;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aomy;
import defpackage.apxu;
import defpackage.arml;
import defpackage.axak;

public final class AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand extends anxl implements anzf {
    public static final anxr addFollowUpSurveyCommand;
    public static final AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand d;
    private static volatile anzq f;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public arml c;
    private byte e = (byte) 2;

    private AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002Љ\u0000", new Object[]{"a", "b", axak.class, "c"});
            case 3:
                return new AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand();
            case 4:
                return new aomy();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.class) {
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
        AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand = new AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand();
        d = addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand;
        anxl.registerDefaultInstance(AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.class, addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand);
        apxu apxu = apxu.d;
        AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand2 = d;
        addFollowUpSurveyCommand = anxl.newSingularGeneratedExtension(apxu, addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand2, addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand2, null, 194801007, aobm.MESSAGE, AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.class);
    }
}
