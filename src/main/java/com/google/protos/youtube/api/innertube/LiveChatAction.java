package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anyd;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arml;
import defpackage.aubh;
import defpackage.aubi;
import defpackage.aubk;
import defpackage.aubl;
import defpackage.aubn;
import defpackage.aubo;
import defpackage.aubr;
import defpackage.aubs;
import defpackage.aubt;
import defpackage.aubu;
import defpackage.aubw;
import defpackage.aubx;
import defpackage.auby;
import defpackage.auca;
import defpackage.audp;
import defpackage.augx;
import defpackage.axak;

public final class LiveChatAction {
    public static final anxr replaceLiveChatRendererAction = anxl.newSingularGeneratedExtension(apxu.d, aubw.d, aubw.d, null, 167912809, aobm.MESSAGE, aubw.class);
    public static final anxr showLiveChatSurveyCommand = anxl.newSingularGeneratedExtension(apxu.d, auca.c, auca.c, null, 181233165, aobm.MESSAGE, auca.class);

    public final class AddChatItemAction extends anxl implements anzf {
        public static final anxr addChatItemAction;
        public static final AddChatItemAction e;
        private static volatile anzq g;
        public int a;
        public audp b;
        public String c = "";
        public aubn d;
        private byte f = (byte) 2;

        private AddChatItemAction() {
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
                    return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001Љ\u0000\u0002\b\u0001\u0003\t\u0002", new Object[]{"a", "b", "c", "d"});
                case 3:
                    return new AddChatItemAction();
                case 4:
                    return new aubh();
                case 5:
                    return e;
                case 6:
                    Object obj3 = g;
                    if (obj3 == null) {
                        synchronized (AddChatItemAction.class) {
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
            AddChatItemAction addChatItemAction = new AddChatItemAction();
            e = addChatItemAction;
            anxl.registerDefaultInstance(AddChatItemAction.class, addChatItemAction);
            apxu apxu = apxu.d;
            AddChatItemAction addChatItemAction2 = e;
            addChatItemAction = anxl.newSingularGeneratedExtension(apxu, addChatItemAction2, addChatItemAction2, null, 117298952, aobm.MESSAGE, AddChatItemAction.class);
        }
    }

    public final class AddLiveChatTextMessageFromTemplateAction extends anxl implements anzf {
        public static final anxr addLiveChatTextMessageFromTemplateAction;
        public static final AddLiveChatTextMessageFromTemplateAction d;
        private static volatile anzq f;
        public int a;
        public aubk b;
        public aubn c;
        private byte e = (byte) 2;

        private AddLiveChatTextMessageFromTemplateAction() {
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
                    return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001Љ\u0000\u0002\t\u0001", new Object[]{"a", "b", "c"});
                case 3:
                    return new AddLiveChatTextMessageFromTemplateAction();
                case 4:
                    return new aubi();
                case 5:
                    return d;
                case 6:
                    Object obj3 = f;
                    if (obj3 == null) {
                        synchronized (AddLiveChatTextMessageFromTemplateAction.class) {
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
            AddLiveChatTextMessageFromTemplateAction addLiveChatTextMessageFromTemplateAction = new AddLiveChatTextMessageFromTemplateAction();
            d = addLiveChatTextMessageFromTemplateAction;
            anxl.registerDefaultInstance(AddLiveChatTextMessageFromTemplateAction.class, addLiveChatTextMessageFromTemplateAction);
            apxu apxu = apxu.d;
            AddLiveChatTextMessageFromTemplateAction addLiveChatTextMessageFromTemplateAction2 = d;
            addLiveChatTextMessageFromTemplateAction = anxl.newSingularGeneratedExtension(apxu, addLiveChatTextMessageFromTemplateAction2, addLiveChatTextMessageFromTemplateAction2, null, 126084307, aobm.MESSAGE, AddLiveChatTextMessageFromTemplateAction.class);
        }
    }

    public final class AddLiveChatTickerItemAction extends anxl implements anzf {
        public static final anxr addLiveChatTickerItemAction;
        public static final AddLiveChatTickerItemAction d;
        private static volatile anzq f;
        public int a;
        public augx b;
        public long c;
        private byte e = (byte) 2;

        private AddLiveChatTickerItemAction() {
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
                    return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001Љ\u0000\u0002\u0002\u0001", new Object[]{"a", "b", "c"});
                case 3:
                    return new AddLiveChatTickerItemAction();
                case 4:
                    return new aubl();
                case 5:
                    return d;
                case 6:
                    Object obj3 = f;
                    if (obj3 == null) {
                        synchronized (AddLiveChatTickerItemAction.class) {
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
            AddLiveChatTickerItemAction addLiveChatTickerItemAction = new AddLiveChatTickerItemAction();
            d = addLiveChatTickerItemAction;
            anxl.registerDefaultInstance(AddLiveChatTickerItemAction.class, addLiveChatTickerItemAction);
            apxu apxu = apxu.d;
            AddLiveChatTickerItemAction addLiveChatTickerItemAction2 = d;
            addLiveChatTickerItemAction = anxl.newSingularGeneratedExtension(apxu, addLiveChatTickerItemAction2, addLiveChatTickerItemAction2, null, 132845915, aobm.MESSAGE, AddLiveChatTickerItemAction.class);
        }
    }

    public final class ForceLiveChatContinuationCommand extends anxl implements anzf {
        public static final ForceLiveChatContinuationCommand c;
        private static volatile anzq d;
        public static final anxr forceLiveChatContinuationCommand;
        public int a;
        public boolean b;

        private ForceLiveChatContinuationCommand() {
        }

        /* Access modifiers changed, original: protected|final */
        public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
            switch (anxu.ordinal()) {
                case 0:
                    return Byte.valueOf((byte) 1);
                case 1:
                    return null;
                case 2:
                    return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0007\u0000", new Object[]{"a", "b"});
                case 3:
                    return new ForceLiveChatContinuationCommand();
                case 4:
                    return new aubo();
                case 5:
                    return c;
                case 6:
                    Object obj3 = d;
                    if (obj3 == null) {
                        synchronized (ForceLiveChatContinuationCommand.class) {
                            obj3 = d;
                            if (obj3 == null) {
                                obj3 = new anxn(c);
                                d = obj3;
                            }
                        }
                    }
                    return obj3;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            ForceLiveChatContinuationCommand forceLiveChatContinuationCommand = new ForceLiveChatContinuationCommand();
            c = forceLiveChatContinuationCommand;
            anxl.registerDefaultInstance(ForceLiveChatContinuationCommand.class, forceLiveChatContinuationCommand);
            apxu apxu = apxu.d;
            ForceLiveChatContinuationCommand forceLiveChatContinuationCommand2 = c;
            forceLiveChatContinuationCommand = anxl.newSingularGeneratedExtension(apxu, forceLiveChatContinuationCommand2, forceLiveChatContinuationCommand2, null, 220358198, aobm.MESSAGE, ForceLiveChatContinuationCommand.class);
        }
    }

    public final class MarkChatItemAsDeletedAction extends anxl implements anzf {
        public static final MarkChatItemAsDeletedAction e;
        private static volatile anzq g;
        public static final anxr markChatItemAsDeletedAction;
        public int a;
        public arml b;
        public arml c;
        public String d = "";
        private byte f = (byte) 2;

        private MarkChatItemAsDeletedAction() {
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
                    return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001Љ\u0000\u0002\b\u0002\u0003Љ\u0001", new Object[]{"a", "b", "d", "c"});
                case 3:
                    return new MarkChatItemAsDeletedAction();
                case 4:
                    return new aubr();
                case 5:
                    return e;
                case 6:
                    Object obj3 = g;
                    if (obj3 == null) {
                        synchronized (MarkChatItemAsDeletedAction.class) {
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
            MarkChatItemAsDeletedAction markChatItemAsDeletedAction = new MarkChatItemAsDeletedAction();
            e = markChatItemAsDeletedAction;
            anxl.registerDefaultInstance(MarkChatItemAsDeletedAction.class, markChatItemAsDeletedAction);
            apxu apxu = apxu.d;
            MarkChatItemAsDeletedAction markChatItemAsDeletedAction2 = e;
            markChatItemAsDeletedAction = anxl.newSingularGeneratedExtension(apxu, markChatItemAsDeletedAction2, markChatItemAsDeletedAction2, null, 135377179, aobm.MESSAGE, MarkChatItemAsDeletedAction.class);
        }
    }

    public final class MarkChatItemsByAuthorAsDeletedAction extends anxl implements anzf {
        public static final MarkChatItemsByAuthorAsDeletedAction e;
        private static volatile anzq g;
        public static final anxr markChatItemsByAuthorAsDeletedAction;
        public int a;
        public arml b;
        public arml c;
        public String d = "";
        private byte f = (byte) 2;

        private MarkChatItemsByAuthorAsDeletedAction() {
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
                    return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001Љ\u0000\u0002\b\u0002\u0003Љ\u0001", new Object[]{"a", "b", "d", "c"});
                case 3:
                    return new MarkChatItemsByAuthorAsDeletedAction();
                case 4:
                    return new aubs();
                case 5:
                    return e;
                case 6:
                    Object obj3 = g;
                    if (obj3 == null) {
                        synchronized (MarkChatItemsByAuthorAsDeletedAction.class) {
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
            MarkChatItemsByAuthorAsDeletedAction markChatItemsByAuthorAsDeletedAction = new MarkChatItemsByAuthorAsDeletedAction();
            e = markChatItemsByAuthorAsDeletedAction;
            anxl.registerDefaultInstance(MarkChatItemsByAuthorAsDeletedAction.class, markChatItemsByAuthorAsDeletedAction);
            apxu apxu = apxu.d;
            MarkChatItemsByAuthorAsDeletedAction markChatItemsByAuthorAsDeletedAction2 = e;
            markChatItemsByAuthorAsDeletedAction = anxl.newSingularGeneratedExtension(apxu, markChatItemsByAuthorAsDeletedAction2, markChatItemsByAuthorAsDeletedAction2, null, 133968669, aobm.MESSAGE, MarkChatItemsByAuthorAsDeletedAction.class);
        }
    }

    public final class RemoveChatItemAction extends anxl implements anzf {
        public static final RemoveChatItemAction c;
        private static volatile anzq d;
        public static final anxr removeChatItemAction;
        public int a;
        public String b = "";

        private RemoveChatItemAction() {
        }

        /* Access modifiers changed, original: protected|final */
        public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
            switch (anxu.ordinal()) {
                case 0:
                    return Byte.valueOf((byte) 1);
                case 1:
                    return null;
                case 2:
                    return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"a", "b"});
                case 3:
                    return new RemoveChatItemAction();
                case 4:
                    return new aubt();
                case 5:
                    return c;
                case 6:
                    Object obj3 = d;
                    if (obj3 == null) {
                        synchronized (RemoveChatItemAction.class) {
                            obj3 = d;
                            if (obj3 == null) {
                                obj3 = new anxn(c);
                                d = obj3;
                            }
                        }
                    }
                    return obj3;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            RemoveChatItemAction removeChatItemAction = new RemoveChatItemAction();
            c = removeChatItemAction;
            anxl.registerDefaultInstance(RemoveChatItemAction.class, removeChatItemAction);
            apxu apxu = apxu.d;
            RemoveChatItemAction removeChatItemAction2 = c;
            removeChatItemAction = anxl.newSingularGeneratedExtension(apxu, removeChatItemAction2, removeChatItemAction2, null, 130295727, aobm.MESSAGE, RemoveChatItemAction.class);
        }
    }

    public final class ReplaceChatItemAction extends anxl implements anzf {
        public static final ReplaceChatItemAction d;
        private static volatile anzq f;
        public static final anxr replaceChatItemAction;
        public int a;
        public String b = "";
        public audp c;
        private byte e = (byte) 2;

        private ReplaceChatItemAction() {
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
                    return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\b\u0000\u0002Љ\u0001", new Object[]{"a", "b", "c"});
                case 3:
                    return new ReplaceChatItemAction();
                case 4:
                    return new aubu();
                case 5:
                    return d;
                case 6:
                    Object obj3 = f;
                    if (obj3 == null) {
                        synchronized (ReplaceChatItemAction.class) {
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
            ReplaceChatItemAction replaceChatItemAction = new ReplaceChatItemAction();
            d = replaceChatItemAction;
            anxl.registerDefaultInstance(ReplaceChatItemAction.class, replaceChatItemAction);
            apxu apxu = apxu.d;
            ReplaceChatItemAction replaceChatItemAction2 = d;
            replaceChatItemAction = anxl.newSingularGeneratedExtension(apxu, replaceChatItemAction2, replaceChatItemAction2, null, 149968475, aobm.MESSAGE, ReplaceChatItemAction.class);
        }
    }

    public final class ReplayChatItemAction extends anxl implements anzf {
        public static final ReplayChatItemAction d;
        private static volatile anzq f;
        public static final anxr replayChatItemAction;
        public int a;
        public anyd b = anxl.emptyProtobufList();
        public long c;
        private byte e = (byte) 2;

        private ReplayChatItemAction() {
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
                    return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002\u0002\u0000", new Object[]{"a", "b", apxu.class, "c"});
                case 3:
                    return new ReplayChatItemAction();
                case 4:
                    return new aubx();
                case 5:
                    return d;
                case 6:
                    Object obj3 = f;
                    if (obj3 == null) {
                        synchronized (ReplayChatItemAction.class) {
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
            ReplayChatItemAction replayChatItemAction = new ReplayChatItemAction();
            d = replayChatItemAction;
            anxl.registerDefaultInstance(ReplayChatItemAction.class, replayChatItemAction);
            apxu apxu = apxu.d;
            ReplayChatItemAction replayChatItemAction2 = d;
            replayChatItemAction = anxl.newSingularGeneratedExtension(apxu, replayChatItemAction2, replayChatItemAction2, null, 145132565, aobm.MESSAGE, ReplayChatItemAction.class);
        }
    }

    public final class ShowLiveChatDialogAction extends anxl implements anzf {
        public static final ShowLiveChatDialogAction c;
        private static volatile anzq e;
        public static final anxr showLiveChatDialogAction;
        public int a;
        public axak b;
        private byte d = (byte) 2;

        private ShowLiveChatDialogAction() {
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
                    return new ShowLiveChatDialogAction();
                case 4:
                    return new auby();
                case 5:
                    return c;
                case 6:
                    Object obj3 = e;
                    if (obj3 == null) {
                        synchronized (ShowLiveChatDialogAction.class) {
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
            ShowLiveChatDialogAction showLiveChatDialogAction = new ShowLiveChatDialogAction();
            c = showLiveChatDialogAction;
            anxl.registerDefaultInstance(ShowLiveChatDialogAction.class, showLiveChatDialogAction);
            apxu apxu = apxu.d;
            ShowLiveChatDialogAction showLiveChatDialogAction2 = c;
            showLiveChatDialogAction = anxl.newSingularGeneratedExtension(apxu, showLiveChatDialogAction2, showLiveChatDialogAction2, null, 171299322, aobm.MESSAGE, ShowLiveChatDialogAction.class);
        }
    }

    private LiveChatAction() {
    }
}
