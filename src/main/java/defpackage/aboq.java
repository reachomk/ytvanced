package defpackage;

import java.util.List;

/* renamed from: aboq */
public final class aboq {
    private final aaas a;

    public aboq(aaas aaas) {
        this.a = (aaas) amqw.a((Object) aaas);
    }

    public final void a(List list, abor abor) {
        a((apxu[]) list.toArray(new apxu[0]), abor, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0419  */
    /* JADX WARNING: Missing block: B:38:0x00a7, code skipped:
            if (r14.a(r5, r15, r4) == false) goto L_0x00a9;
     */
    public final void a(defpackage.apxu[] r20, defpackage.abor r21, boolean r22) {
        /*
        r19 = this;
        r1 = r19;
        r2 = r20;
        r3 = r21;
        r4 = r22;
        r5 = 0;
        r6 = 1;
        r7 = 0;
        if (r3 == 0) goto L_0x000e;
    L_0x000d:
        goto L_0x002c;
    L_0x000e:
        r0 = r2.length;
        if (r0 != r6) goto L_0x002c;
    L_0x0011:
        r0 = r2[r7];
        r8 = com.google.protos.youtube.api.innertube.AddToToastActionOuterClass$AddToToastAction.addToToastAction;
        r8 = defpackage.anxl.checkIsLite(r8);
        r0.a(r8);
        r0 = r0.h;
        r8 = r8.d;
        r0 = r0.a(r8);
        if (r0 == 0) goto L_0x002c;
    L_0x0026:
        r0 = r1.a;
        r0.a(r2, r5);
        return;
    L_0x002c:
        r8 = r21.h();
        if (r8 != 0) goto L_0x0035;
    L_0x0032:
        r9 = 0;
    L_0x0033:
        r10 = 0;
        goto L_0x0057;
    L_0x0035:
        r0 = r8.g();
        if (r0 != 0) goto L_0x0044;
    L_0x003b:
        r0 = r8.f();
        if (r0 != 0) goto L_0x0042;
    L_0x0041:
        goto L_0x0044;
    L_0x0042:
        r0 = 1;
        goto L_0x0045;
    L_0x0044:
        r0 = 0;
    L_0x0045:
        r9 = r8.j();
        if (r9 != 0) goto L_0x0055;
    L_0x004b:
        r9 = r8.i();
        if (r9 != 0) goto L_0x0052;
    L_0x0051:
        goto L_0x0055;
    L_0x0052:
        r9 = r0;
        r10 = 1;
        goto L_0x0057;
    L_0x0055:
        r9 = r0;
        goto L_0x0033;
    L_0x0057:
        r11 = new defpackage.apxu[r6];
        r12 = r2.length;
        r13 = 0;
    L_0x005b:
        if (r13 >= r12) goto L_0x0412;
    L_0x005d:
        r0 = r2[r13];
        r14 = com.google.protos.youtube.api.innertube.LiveChatAction.AddChatItemAction.addChatItemAction;
        r14 = defpackage.anxl.checkIsLite(r14);
        r0.a(r14);
        r15 = r0.h;
        r14 = r14.d;
        r14 = r15.a(r14);
        if (r14 == 0) goto L_0x00cb;
    L_0x0072:
        r14 = r21.f();
        r15 = com.google.protos.youtube.api.innertube.LiveChatAction.AddChatItemAction.addChatItemAction;
        r15 = defpackage.anxl.checkIsLite(r15);
        r0.a(r15);
        r0 = r0.h;
        r5 = r15.d;
        r0 = r0.b(r5);
        if (r0 != 0) goto L_0x008c;
    L_0x0089:
        r0 = r15.b;
        goto L_0x0090;
    L_0x008c:
        r0 = r15.a(r0);
    L_0x0090:
        r0 = (com.google.protos.youtube.api.innertube.LiveChatAction.AddChatItemAction) r0;
        r5 = r0.c;
        r5 = r5.isEmpty();
        if (r5 == 0) goto L_0x009b;
    L_0x009a:
        goto L_0x00a9;
    L_0x009b:
        r5 = r0.c;
        r15 = r0.b;
        if (r15 != 0) goto L_0x00a3;
    L_0x00a1:
        r15 = defpackage.audp.c;
    L_0x00a3:
        r5 = r14.a(r5, r15, r4);
        if (r5 != 0) goto L_0x01fc;
    L_0x00a9:
        r5 = r0.b;
        if (r5 != 0) goto L_0x00af;
    L_0x00ad:
        r5 = defpackage.audp.c;
    L_0x00af:
        r14.a(r5, r4);
        r5 = r0.b;
        if (r5 != 0) goto L_0x00b8;
    L_0x00b6:
        r5 = defpackage.audp.c;
    L_0x00b8:
        r15 = r0.a;
        r15 = r15 & 4;
        if (r15 == 0) goto L_0x00c5;
    L_0x00be:
        r0 = r0.d;
        if (r0 != 0) goto L_0x00c6;
    L_0x00c2:
        r0 = defpackage.aubn.c;
        goto L_0x00c6;
    L_0x00c5:
        r0 = 0;
    L_0x00c6:
        defpackage.aboq.a(r14, r5, r0);
        goto L_0x01fc;
    L_0x00cb:
        r5 = com.google.protos.youtube.api.innertube.LiveChatAction.AddLiveChatTextMessageFromTemplateAction.addLiveChatTextMessageFromTemplateAction;
        r5 = defpackage.anxl.checkIsLite(r5);
        r0.a(r5);
        r14 = r0.h;
        r5 = r5.d;
        r5 = r14.a(r5);
        if (r5 == 0) goto L_0x01c4;
    L_0x00de:
        r5 = com.google.protos.youtube.api.innertube.LiveChatAction.AddLiveChatTextMessageFromTemplateAction.addLiveChatTextMessageFromTemplateAction;
        r5 = defpackage.anxl.checkIsLite(r5);
        r0.a(r5);
        r0 = r0.h;
        r15 = r5.d;
        r0 = r0.b(r15);
        if (r0 != 0) goto L_0x00f4;
    L_0x00f1:
        r0 = r5.b;
        goto L_0x00f8;
    L_0x00f4:
        r0 = r5.a(r0);
    L_0x00f8:
        r0 = (com.google.protos.youtube.api.innertube.LiveChatAction.AddLiveChatTextMessageFromTemplateAction) r0;
        r5 = r0.b;	 Catch:{ anyg -> 0x01bd }
        if (r5 != 0) goto L_0x0100;
    L_0x00fe:
        r5 = defpackage.aubk.c;	 Catch:{ anyg -> 0x01bd }
    L_0x0100:
        r15 = r5.a;	 Catch:{ anyg -> 0x01bd }
        r14 = 117300536; // 0x6fddd38 float:9.5493074E-35 double:5.7954165E-316;
        if (r15 != r14) goto L_0x010c;
    L_0x0107:
        r5 = r5.b;	 Catch:{ anyg -> 0x01bd }
        r5 = (defpackage.auej) r5;	 Catch:{ anyg -> 0x01bd }
        goto L_0x010e;
    L_0x010c:
        r5 = defpackage.auej.m;	 Catch:{ anyg -> 0x01bd }
    L_0x010e:
        r5 = r5.toByteArray();	 Catch:{ anyg -> 0x01bd }
        r15 = defpackage.anxa.c();	 Catch:{ anyg -> 0x01bd }
        r14 = defpackage.auej.m;	 Catch:{ anyg -> 0x01bd }
        r5 = defpackage.anxl.parseFrom(r14, r5, r15);	 Catch:{ anyg -> 0x01bd }
        r5 = (defpackage.auej) r5;	 Catch:{ anyg -> 0x01bd }
        r5 = r5.toBuilder();	 Catch:{ anyg -> 0x01bd }
        r5 = (defpackage.anxo) r5;	 Catch:{ anyg -> 0x01bd }
        r5 = (defpackage.auei) r5;	 Catch:{ anyg -> 0x01bd }
        if (r5 == 0) goto L_0x0180;
    L_0x0128:
        r14 = "ClientMessageIdKey";
        r14 = r3.a(r14);
        r14 = (java.lang.String) r14;
        r5.copyOnWrite();
        r15 = r5.instance;
        r15 = (defpackage.auej) r15;
        if (r14 == 0) goto L_0x017a;
    L_0x0139:
        r7 = r15.a;
        r7 = r7 | r6;
        r15.a = r7;
        r15.b = r14;
        r7 = "MessageKey";
        r7 = r3.a(r7);
        r14 = r7 instanceof defpackage.arml;
        if (r14 == 0) goto L_0x0150;
    L_0x014a:
        r7 = (defpackage.arml) r7;
        r5.a(r7);
        goto L_0x0160;
    L_0x0150:
        if (r7 == 0) goto L_0x0160;
    L_0x0152:
        r14 = new java.lang.String[r6];
        r7 = (java.lang.String) r7;
        r15 = 0;
        r14[r15] = r7;
        r7 = defpackage.ajqy.a(r14);
        r5.a(r7);
    L_0x0160:
        r14 = java.lang.System.currentTimeMillis();
        r5.copyOnWrite();
        r7 = r5.instance;
        r7 = (defpackage.auej) r7;
        r6 = r7.a;
        r18 = 2;
        r6 = r6 | 2;
        r7.a = r6;
        r16 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r14 = r14 * r16;
        r7.c = r14;
        goto L_0x0180;
    L_0x017a:
        r0 = new java.lang.NullPointerException;
        r0.<init>();
        throw r0;
    L_0x0180:
        r6 = defpackage.audp.c;
        r6 = r6.createBuilder();
        r6 = (defpackage.audo) r6;
        r6.copyOnWrite();
        r7 = r6.instance;
        r7 = (defpackage.audp) r7;
        r5 = r5.build();
        r5 = (defpackage.anxl) r5;
        r7.b = r5;
        r5 = 117300536; // 0x6fddd38 float:9.5493074E-35 double:5.7954165E-316;
        r7.a = r5;
        r5 = r6.build();
        r5 = (defpackage.anxl) r5;
        r5 = (defpackage.audp) r5;
        r6 = r21.f();
        r6.a(r5, r4);
        r7 = r0.a;
        r14 = 2;
        r7 = r7 & r14;
        if (r7 == 0) goto L_0x01b8;
    L_0x01b1:
        r0 = r0.c;
        if (r0 != 0) goto L_0x01b9;
    L_0x01b5:
        r0 = defpackage.aubn.c;
        goto L_0x01b9;
    L_0x01b8:
        r0 = 0;
    L_0x01b9:
        defpackage.aboq.a(r6, r5, r0);
        goto L_0x01fc;
    L_0x01bd:
        r0 = move-exception;
        r5 = "Error parsing live chat template";
        defpackage.xtl.a(r5, r0);
        goto L_0x01fc;
    L_0x01c4:
        r5 = com.google.protos.youtube.api.innertube.LiveChatAction.RemoveChatItemAction.removeChatItemAction;
        r5 = defpackage.anxl.checkIsLite(r5);
        r0.a(r5);
        r6 = r0.h;
        r5 = r5.d;
        r5 = r6.a(r5);
        if (r5 == 0) goto L_0x01ff;
    L_0x01d7:
        r5 = r21.f();
        r6 = com.google.protos.youtube.api.innertube.LiveChatAction.RemoveChatItemAction.removeChatItemAction;
        r6 = defpackage.anxl.checkIsLite(r6);
        r0.a(r6);
        r0 = r0.h;
        r7 = r6.d;
        r0 = r0.b(r7);
        if (r0 != 0) goto L_0x01f1;
    L_0x01ee:
        r0 = r6.b;
        goto L_0x01f5;
    L_0x01f1:
        r0 = r6.a(r0);
    L_0x01f5:
        r0 = (com.google.protos.youtube.api.innertube.LiveChatAction.RemoveChatItemAction) r0;
        r0 = r0.b;
        r5.a(r0, r4);
    L_0x01fc:
        r5 = 0;
        goto L_0x040b;
    L_0x01ff:
        r5 = com.google.protos.youtube.api.innertube.LiveChatAction.AddLiveChatTickerItemAction.addLiveChatTickerItemAction;
        r5 = defpackage.anxl.checkIsLite(r5);
        r0.a(r5);
        r6 = r0.h;
        r5 = r5.d;
        r5 = r6.a(r5);
        if (r5 == 0) goto L_0x024b;
    L_0x0212:
        r5 = r21.g();
        r6 = com.google.protos.youtube.api.innertube.LiveChatAction.AddLiveChatTickerItemAction.addLiveChatTickerItemAction;
        r6 = defpackage.anxl.checkIsLite(r6);
        r0.a(r6);
        r0 = r0.h;
        r7 = r6.d;
        r0 = r0.b(r7);
        if (r0 != 0) goto L_0x022c;
    L_0x0229:
        r0 = r6.b;
        goto L_0x0230;
    L_0x022c:
        r0 = r6.a(r0);
    L_0x0230:
        r0 = (com.google.protos.youtube.api.innertube.LiveChatAction.AddLiveChatTickerItemAction) r0;
        r6 = r0.b;
        if (r6 != 0) goto L_0x0238;
    L_0x0236:
        r6 = defpackage.augx.c;
    L_0x0238:
        r14 = r0.c;
        r0 = r5.a;
        r7 = new abph;
        r16 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r14 = r14 * r16;
        r7.<init>(r5, r6, r14);
        r5 = 100;
        r0.postDelayed(r7, r5);
        goto L_0x01fc;
    L_0x024b:
        r5 = com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction;
        r5 = defpackage.anxl.checkIsLite(r5);
        r0.a(r5);
        r6 = r0.h;
        r5 = r5.d;
        r5 = r6.a(r5);
        if (r5 != 0) goto L_0x0407;
    L_0x025e:
        r5 = com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction;
        r5 = defpackage.anxl.checkIsLite(r5);
        r0.a(r5);
        r6 = r0.h;
        r5 = r5.d;
        r5 = r6.a(r5);
        if (r5 != 0) goto L_0x0402;
    L_0x0271:
        r5 = com.google.protos.youtube.api.innertube.LiveChatAction.ReplaceChatItemAction.replaceChatItemAction;
        r5 = defpackage.anxl.checkIsLite(r5);
        r0.a(r5);
        r6 = r0.h;
        r5 = r5.d;
        r5 = r6.a(r5);
        if (r5 == 0) goto L_0x02b9;
    L_0x0284:
        r5 = r21.f();
        r6 = com.google.protos.youtube.api.innertube.LiveChatAction.ReplaceChatItemAction.replaceChatItemAction;
        r6 = defpackage.anxl.checkIsLite(r6);
        r0.a(r6);
        r0 = r0.h;
        r7 = r6.d;
        r0 = r0.b(r7);
        if (r0 != 0) goto L_0x029e;
    L_0x029b:
        r0 = r6.b;
        goto L_0x02a2;
    L_0x029e:
        r0 = r6.a(r0);
    L_0x02a2:
        r0 = (com.google.protos.youtube.api.innertube.LiveChatAction.ReplaceChatItemAction) r0;
        r6 = r0.b;
        r6 = r6.isEmpty();
        if (r6 != 0) goto L_0x01fc;
    L_0x02ac:
        r6 = r0.b;
        r0 = r0.c;
        if (r0 != 0) goto L_0x02b4;
    L_0x02b2:
        r0 = defpackage.audp.c;
    L_0x02b4:
        r5.a(r6, r0, r4);
        goto L_0x01fc;
    L_0x02b9:
        r5 = com.google.protos.youtube.api.innertube.LiveChatAction.replaceLiveChatRendererAction;
        r5 = defpackage.anxl.checkIsLite(r5);
        r0.a(r5);
        r6 = r0.h;
        r5 = r5.d;
        r5 = r6.a(r5);
        if (r5 != 0) goto L_0x02d6;
    L_0x02cc:
        r5 = 0;
        r11[r5] = r0;
        r0 = r1.a;
        r0.a(r11, r3);
        goto L_0x040b;
    L_0x02d6:
        r5 = 0;
        r6 = com.google.protos.youtube.api.innertube.LiveChatAction.replaceLiveChatRendererAction;
        r6 = defpackage.anxl.checkIsLite(r6);
        r0.a(r6);
        r0 = r0.h;
        r7 = r6.d;
        r0 = r0.b(r7);
        if (r0 != 0) goto L_0x02ed;
    L_0x02ea:
        r0 = r6.b;
        goto L_0x02f1;
    L_0x02ed:
        r0 = r6.a(r0);
    L_0x02f1:
        r0 = (defpackage.aubw) r0;
        r6 = r0.b;
        r6 = defpackage.aubq.a(r6);
        r7 = "Unhandled replacement renderer";
        if (r6 != 0) goto L_0x02ff;
    L_0x02fd:
        goto L_0x0387;
    L_0x02ff:
        r14 = 2;
        if (r6 != r14) goto L_0x0387;
    L_0x0302:
        r6 = r21.i();
        if (r6 == 0) goto L_0x040b;
    L_0x0308:
        r15 = r0.a;
        r14 = r14 & r15;
        if (r14 == 0) goto L_0x0382;
    L_0x030d:
        r14 = r0.c;
        if (r14 == 0) goto L_0x0312;
    L_0x0311:
        goto L_0x0314;
    L_0x0312:
        r14 = defpackage.axak.a;
    L_0x0314:
        r15 = defpackage.augc.a;
        r15 = defpackage.anxl.checkIsLite(r15);
        r14.a(r15);
        r14 = r14.h;
        r15 = r15.d;
        r14 = r14.a(r15);
        if (r14 != 0) goto L_0x034b;
    L_0x0327:
        r0 = r0.c;
        if (r0 != 0) goto L_0x032d;
    L_0x032b:
        r0 = defpackage.axak.a;
    L_0x032d:
        r0 = java.lang.String.valueOf(r0);
        r6 = r0.length();
        r14 = new java.lang.StringBuilder;
        r6 = r6 + 30;
        r14.<init>(r6);
        r14.append(r7);
        r14.append(r0);
        r0 = r14.toString();
        defpackage.xtl.d(r0);
        goto L_0x040b;
    L_0x034b:
        r0 = r0.c;
        if (r0 == 0) goto L_0x0350;
    L_0x034f:
        goto L_0x0352;
    L_0x0350:
        r0 = defpackage.axak.a;
    L_0x0352:
        r7 = defpackage.augc.a;
        r7 = defpackage.anxl.checkIsLite(r7);
        r0.a(r7);
        r0 = r0.h;
        r14 = r7.d;
        r0 = r0.b(r14);
        if (r0 != 0) goto L_0x0368;
    L_0x0365:
        r0 = r7.b;
        goto L_0x036c;
    L_0x0368:
        r0 = r7.a(r0);
    L_0x036c:
        r0 = (defpackage.anze) r0;
        r7 = defpackage.ajxc.class;
        r0 = defpackage.ajzv.a(r0, r7);
        r0 = (defpackage.ajxc) r0;
        r7 = new ajwv;
        r7.<init>();
        r7.c = r0;
        r6.a(r7);
        goto L_0x040b;
    L_0x0382:
        r6.a();
        goto L_0x040b;
    L_0x0387:
        r6 = r0.b;
        r6 = defpackage.aubq.a(r6);
        if (r6 == 0) goto L_0x040b;
    L_0x038f:
        r14 = 3;
        if (r6 != r14) goto L_0x040b;
    L_0x0392:
        r6 = r21.j();
        if (r6 == 0) goto L_0x040b;
    L_0x0398:
        r14 = r0.a;
        r15 = 2;
        r14 = r14 & r15;
        if (r14 == 0) goto L_0x040b;
    L_0x039e:
        r14 = r0.c;
        if (r14 == 0) goto L_0x03a3;
    L_0x03a2:
        goto L_0x03a5;
    L_0x03a3:
        r14 = defpackage.axak.a;
    L_0x03a5:
        r15 = com.google.protos.youtube.api.innertube.LiveChatHeaderRendererOuterClass.liveChatHeaderRenderer;
        r15 = defpackage.anxl.checkIsLite(r15);
        r14.a(r15);
        r14 = r14.h;
        r15 = r15.d;
        r14 = r14.a(r15);
        if (r14 != 0) goto L_0x03db;
    L_0x03b8:
        r0 = r0.c;
        if (r0 != 0) goto L_0x03be;
    L_0x03bc:
        r0 = defpackage.axak.a;
    L_0x03be:
        r0 = java.lang.String.valueOf(r0);
        r6 = r0.length();
        r14 = new java.lang.StringBuilder;
        r6 = r6 + 30;
        r14.<init>(r6);
        r14.append(r7);
        r14.append(r0);
        r0 = r14.toString();
        defpackage.xtl.d(r0);
        goto L_0x040b;
    L_0x03db:
        r0 = r0.c;
        if (r0 == 0) goto L_0x03e0;
    L_0x03df:
        goto L_0x03e2;
    L_0x03e0:
        r0 = defpackage.axak.a;
    L_0x03e2:
        r7 = com.google.protos.youtube.api.innertube.LiveChatHeaderRendererOuterClass.liveChatHeaderRenderer;
        r7 = defpackage.anxl.checkIsLite(r7);
        r0.a(r7);
        r0 = r0.h;
        r14 = r7.d;
        r0 = r0.b(r14);
        if (r0 != 0) goto L_0x03f8;
    L_0x03f5:
        r0 = r7.b;
        goto L_0x03fc;
    L_0x03f8:
        r0 = r7.a(r0);
    L_0x03fc:
        r0 = (defpackage.audb) r0;
        r6.a(r0);
        goto L_0x040b;
    L_0x0402:
        r5 = 0;
        defpackage.aboq.a(r0, r3, r4);
        goto L_0x040b;
    L_0x0407:
        r5 = 0;
        defpackage.aboq.a(r0, r3, r4);
    L_0x040b:
        r13 = r13 + 1;
        r5 = 0;
        r6 = 1;
        r7 = 0;
        goto L_0x005b;
    L_0x0412:
        if (r9 == 0) goto L_0x0417;
    L_0x0414:
        r8.e();
    L_0x0417:
        if (r10 == 0) goto L_0x041c;
    L_0x0419:
        r8.h();
    L_0x041c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aboq.a(apxu[], abor, boolean):void");
    }

    private static void a(apxu apxu, abor abor, boolean z) {
        abor.f().a(apxu, z);
        abpe g = abor.g();
        if (g != null) {
            g.a.post(new abpg(g, apxu));
        }
    }

    private static void a(abov abov, audp audp, aubn aubn) {
        if (aubn != null) {
            int i = aubn.b;
            if (i > 0) {
                abov.a(audp, i);
            }
        }
    }
}
