package defpackage;

/* renamed from: dif */
final class dif implements Runnable {
    private final /* synthetic */ dic a;

    dif(dic dic) {
        this.a = dic;
    }

    /* JADX WARNING: Missing block: B:80:0x01c1, code skipped:
            throw new defpackage.dhy("Can not get merged report items for the tickers with different action names.");
     */
    public final void run() {
        /*
        r27 = this;
        r1 = "ReporterDefault";
        r2 = r27;
        r3 = r2.a;
    L_0x0006:
        r0 = r3.f;	 Catch:{ InterruptedException -> 0x0294 }
        r4 = new java.util.ArrayList;	 Catch:{ InterruptedException -> 0x0294 }
        r4.<init>();	 Catch:{ InterruptedException -> 0x0294 }
        r5 = 0;
        r6 = 0;
    L_0x000f:
        if (r6 >= r0) goto L_0x001f;
    L_0x0011:
        r7 = r3.c;	 Catch:{ InterruptedException -> 0x0294 }
        r7 = r7.take();	 Catch:{ InterruptedException -> 0x0294 }
        r7 = (defpackage.dik) r7;	 Catch:{ InterruptedException -> 0x0294 }
        r4.add(r7);	 Catch:{ InterruptedException -> 0x0294 }
        r6 = r6 + 1;
        goto L_0x000f;
    L_0x001f:
        r6 = new java.util.LinkedHashMap;	 Catch:{ InterruptedException -> 0x0294 }
        r6.<init>();	 Catch:{ InterruptedException -> 0x0294 }
        r0 = new java.util.LinkedHashMap;	 Catch:{ InterruptedException -> 0x0294 }
        r0.<init>();	 Catch:{ InterruptedException -> 0x0294 }
        r4 = r4.iterator();	 Catch:{ InterruptedException -> 0x0294 }
    L_0x002d:
        r7 = r4.hasNext();	 Catch:{ InterruptedException -> 0x0294 }
        if (r7 == 0) goto L_0x0057;
    L_0x0033:
        r7 = r4.next();	 Catch:{ InterruptedException -> 0x0294 }
        r7 = (defpackage.dik) r7;	 Catch:{ InterruptedException -> 0x0294 }
        r8 = r7.b;	 Catch:{ InterruptedException -> 0x0294 }
        r9 = r0.containsKey(r8);	 Catch:{ InterruptedException -> 0x0294 }
        if (r9 == 0) goto L_0x004b;
    L_0x0041:
        r8 = r0.get(r8);	 Catch:{ InterruptedException -> 0x0294 }
        r8 = (java.util.List) r8;	 Catch:{ InterruptedException -> 0x0294 }
        r8.add(r7);	 Catch:{ InterruptedException -> 0x0294 }
        goto L_0x002d;
    L_0x004b:
        r9 = new java.util.ArrayList;	 Catch:{ InterruptedException -> 0x0294 }
        r9.<init>();	 Catch:{ InterruptedException -> 0x0294 }
        r9.add(r7);	 Catch:{ InterruptedException -> 0x0294 }
        r0.put(r8, r9);	 Catch:{ InterruptedException -> 0x0294 }
        goto L_0x002d;
    L_0x0057:
        r0 = r0.entrySet();	 Catch:{ InterruptedException -> 0x0294 }
        r4 = r0.iterator();	 Catch:{ InterruptedException -> 0x0294 }
    L_0x005f:
        r0 = r4.hasNext();	 Catch:{ InterruptedException -> 0x0294 }
        if (r0 == 0) goto L_0x0238;
    L_0x0065:
        r0 = r4.next();	 Catch:{ InterruptedException -> 0x0294 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ InterruptedException -> 0x0294 }
        r8 = r0.getValue();	 Catch:{ InterruptedException -> 0x0294 }
        r8 = (java.util.List) r8;	 Catch:{ InterruptedException -> 0x0294 }
        r9 = new java.util.LinkedHashMap;	 Catch:{ InterruptedException -> 0x0294 }
        r10 = r3.b;	 Catch:{ InterruptedException -> 0x0294 }
        r9.<init>(r10);	 Catch:{ InterruptedException -> 0x0294 }
        r10 = new defpackage.dik[r5];	 Catch:{ dhy -> 0x0201 }
        r10 = r8.toArray(r10);	 Catch:{ dhy -> 0x0201 }
        r10 = (defpackage.dik[]) r10;	 Catch:{ dhy -> 0x0201 }
        r11 = new java.lang.StringBuilder;	 Catch:{ dhy -> 0x0201 }
        r11.<init>();	 Catch:{ dhy -> 0x0201 }
        r12 = new java.lang.StringBuilder;	 Catch:{ dhy -> 0x0201 }
        r12.<init>();	 Catch:{ dhy -> 0x0201 }
        r13 = 0;
        r14 = r13;
        r15 = r14;
        r7 = 0;
        r13 = 0;
    L_0x008f:
        r5 = r10.length;	 Catch:{ dhy -> 0x0201 }
        if (r13 >= r5) goto L_0x01d7;
    L_0x0092:
        r5 = r10[r13];	 Catch:{ dhy -> 0x0201 }
        r2 = new java.lang.StringBuilder;	 Catch:{ dhy -> 0x0201 }
        r2.<init>();	 Catch:{ dhy -> 0x0201 }
        r17 = r4;
        r4 = new java.lang.StringBuilder;	 Catch:{ dhy -> 0x01d1 }
        r4.<init>();	 Catch:{ dhy -> 0x01d1 }
        r18 = r3;
        r3 = r5.a;	 Catch:{ dhy -> 0x01cd }
        r3 = r3.iterator();	 Catch:{ dhy -> 0x01cd }
    L_0x00a8:
        r19 = r3.hasNext();	 Catch:{ dhy -> 0x01cd }
        if (r19 == 0) goto L_0x0102;
    L_0x00ae:
        r19 = r3.next();	 Catch:{ dhy -> 0x01cd }
        r20 = r3;
        r3 = r19;
        r3 = (defpackage.dil) r3;	 Catch:{ dhy -> 0x01cd }
        r19 = r1;
        r1 = r3.b;	 Catch:{ dhy -> 0x00ff }
        r21 = r8;
        r8 = r3.c;	 Catch:{ dhy -> 0x01cb }
        r3 = r3.a;	 Catch:{ dhy -> 0x01cb }
        if (r8 == 0) goto L_0x00f8;
    L_0x00c4:
        r22 = r3.longValue();	 Catch:{ dhy -> 0x01cb }
        r24 = 0;
        r26 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1));
        if (r26 <= 0) goto L_0x00f8;
    L_0x00ce:
        r22 = r3.longValue();	 Catch:{ dhy -> 0x01cb }
        r8 = r8.a;	 Catch:{ dhy -> 0x01cb }
        r24 = r8.longValue();	 Catch:{ dhy -> 0x01cb }
        r26 = r9;
        r8 = r22 - r24;
        r3.longValue();	 Catch:{ dhy -> 0x01cb }
        r2.append(r1);	 Catch:{ dhy -> 0x01cb }
        r1 = 46;
        r2.append(r1);	 Catch:{ dhy -> 0x01cb }
        r2.append(r8);	 Catch:{ dhy -> 0x01cb }
        r1 = 44;
        r2.append(r1);	 Catch:{ dhy -> 0x01cb }
        r1 = r19;
        r3 = r20;
        r8 = r21;
        r9 = r26;
        goto L_0x00a8;
    L_0x00f8:
        r1 = r19;
        r3 = r20;
        r8 = r21;
        goto L_0x00a8;
    L_0x00ff:
        r0 = move-exception;
        goto L_0x0208;
    L_0x0102:
        r19 = r1;
        r21 = r8;
        r26 = r9;
        r1 = r5.b;	 Catch:{ dhy -> 0x01cb }
        r3 = r5.c;	 Catch:{ dhy -> 0x01cb }
        r1 = defpackage.dik.a(r1, r3, r2, r4);	 Catch:{ dhy -> 0x01cb }
        if (r1 == 0) goto L_0x01c2;
    L_0x0112:
        r2 = "it";
        r3 = ",";
        r4 = "irt";
        r5 = "action";
        if (r13 != 0) goto L_0x014b;
    L_0x011c:
        r5 = r1.get(r5);	 Catch:{ dhy -> 0x01cb }
        r5 = (java.lang.String) r5;	 Catch:{ dhy -> 0x01cb }
        r8 = 0;
        r9 = r10[r8];	 Catch:{ dhy -> 0x01ff }
        r9 = r9.a();	 Catch:{ dhy -> 0x01ff }
        r14 = r1.containsKey(r4);	 Catch:{ dhy -> 0x01ff }
        if (r14 == 0) goto L_0x013c;
    L_0x012f:
        r4 = r1.get(r4);	 Catch:{ dhy -> 0x01ff }
        r4 = (java.lang.String) r4;	 Catch:{ dhy -> 0x01ff }
        r12.append(r4);	 Catch:{ dhy -> 0x01ff }
        r12.append(r3);	 Catch:{ dhy -> 0x01ff }
        r7 = 1;
    L_0x013c:
        r1 = r1.get(r2);	 Catch:{ dhy -> 0x01ff }
        r1 = (java.lang.String) r1;	 Catch:{ dhy -> 0x01ff }
        r11.append(r1);	 Catch:{ dhy -> 0x01ff }
        r11.append(r3);	 Catch:{ dhy -> 0x01ff }
        r14 = r5;
        r15 = r9;
        goto L_0x01a2;
    L_0x014b:
        r8 = 0;
        r9 = r10[r13];	 Catch:{ dhy -> 0x01ff }
        r9 = r9.a();	 Catch:{ dhy -> 0x01ff }
        r16 = r1.containsKey(r5);	 Catch:{ dhy -> 0x01ff }
        if (r16 == 0) goto L_0x0159;
    L_0x0158:
        goto L_0x015b;
    L_0x0159:
        if (r14 != 0) goto L_0x01ba;
    L_0x015b:
        r16 = r1.containsKey(r5);	 Catch:{ dhy -> 0x01ff }
        if (r16 == 0) goto L_0x016d;
    L_0x0161:
        r5 = r1.get(r5);	 Catch:{ dhy -> 0x01ff }
        r5 = (java.lang.String) r5;	 Catch:{ dhy -> 0x01ff }
        r5 = r5.equals(r14);	 Catch:{ dhy -> 0x01ff }
        if (r5 == 0) goto L_0x01ba;
    L_0x016d:
        if (r9 != 0) goto L_0x0171;
    L_0x016f:
        if (r15 != 0) goto L_0x017a;
    L_0x0171:
        if (r9 == 0) goto L_0x0182;
    L_0x0173:
        r5 = r9.equals(r15);	 Catch:{ dhy -> 0x01ff }
        if (r5 == 0) goto L_0x017a;
    L_0x0179:
        goto L_0x0182;
    L_0x017a:
        r0 = new dhy;	 Catch:{ dhy -> 0x01ff }
        r1 = "Can not get merged report items for the tickers with different customized parameter-value pairs.";
        r0.<init>(r1);	 Catch:{ dhy -> 0x01ff }
        throw r0;	 Catch:{ dhy -> 0x01ff }
    L_0x0182:
        r5 = r1.containsKey(r4);	 Catch:{ dhy -> 0x01ff }
        if (r5 != r7) goto L_0x01b2;
    L_0x0188:
        r2 = r1.get(r2);	 Catch:{ dhy -> 0x01ff }
        r2 = (java.lang.String) r2;	 Catch:{ dhy -> 0x01ff }
        r11.append(r2);	 Catch:{ dhy -> 0x01ff }
        r11.append(r3);	 Catch:{ dhy -> 0x01ff }
        if (r7 == 0) goto L_0x01a2;
    L_0x0196:
        r1 = r1.get(r4);	 Catch:{ dhy -> 0x01ff }
        r1 = (java.lang.String) r1;	 Catch:{ dhy -> 0x01ff }
        r12.append(r1);	 Catch:{ dhy -> 0x01ff }
        r12.append(r3);	 Catch:{ dhy -> 0x01ff }
    L_0x01a2:
        r13 = r13 + 1;
        r2 = r27;
        r4 = r17;
        r3 = r18;
        r1 = r19;
        r8 = r21;
        r9 = r26;
        goto L_0x008f;
    L_0x01b2:
        r0 = new dhy;	 Catch:{ dhy -> 0x01ff }
        r1 = "Can not get merged report items for the tickers with different latency variables.";
        r0.<init>(r1);	 Catch:{ dhy -> 0x01ff }
        throw r0;	 Catch:{ dhy -> 0x01ff }
    L_0x01ba:
        r0 = new dhy;	 Catch:{ dhy -> 0x01ff }
        r1 = "Can not get merged report items for the tickers with different action names.";
        r0.<init>(r1);	 Catch:{ dhy -> 0x01ff }
        throw r0;	 Catch:{ dhy -> 0x01ff }
    L_0x01c2:
        r8 = 0;
        r0 = new dhy;	 Catch:{ dhy -> 0x01ff }
        r1 = "The report items get from ticker is null.";
        r0.<init>(r1);	 Catch:{ dhy -> 0x01ff }
        throw r0;	 Catch:{ dhy -> 0x01ff }
    L_0x01cb:
        r0 = move-exception;
        goto L_0x020a;
    L_0x01cd:
        r0 = move-exception;
        r19 = r1;
        goto L_0x0208;
    L_0x01d1:
        r0 = move-exception;
        r19 = r1;
        r18 = r3;
        goto L_0x0208;
    L_0x01d7:
        r19 = r1;
        r18 = r3;
        r17 = r4;
        r21 = r8;
        r26 = r9;
        r8 = 0;
        r1 = defpackage.dik.a(r14, r15, r11, r12);	 Catch:{ dhy -> 0x01ff }
        r2 = r26;
        r2.putAll(r1);	 Catch:{ InterruptedException -> 0x0235 }
        r0 = r0.getKey();	 Catch:{ InterruptedException -> 0x0235 }
        r0 = (java.lang.String) r0;	 Catch:{ InterruptedException -> 0x0235 }
        r6.put(r0, r2);	 Catch:{ InterruptedException -> 0x0235 }
        r5 = 0;
        r2 = r27;
        r4 = r17;
        r3 = r18;
        r1 = r19;
        goto L_0x005f;
    L_0x01ff:
        r0 = move-exception;
        goto L_0x020b;
    L_0x0201:
        r0 = move-exception;
        r19 = r1;
        r18 = r3;
        r17 = r4;
    L_0x0208:
        r21 = r8;
    L_0x020a:
        r8 = 0;
    L_0x020b:
        r1 = java.lang.String.valueOf(r21);	 Catch:{ InterruptedException -> 0x0235 }
        r2 = r1.length();	 Catch:{ InterruptedException -> 0x0235 }
        r2 = r2 + 24;
        r3 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x0235 }
        r3.<init>(r2);	 Catch:{ InterruptedException -> 0x0235 }
        r2 = "failed to merge tickers:";
        r3.append(r2);	 Catch:{ InterruptedException -> 0x0235 }
        r3.append(r1);	 Catch:{ InterruptedException -> 0x0235 }
        r1 = r3.toString();	 Catch:{ InterruptedException -> 0x0235 }
        r2 = r19;
        android.util.Log.w(r2, r1, r0);	 Catch:{ InterruptedException -> 0x0295 }
        r5 = 0;
        r1 = r2;
        r4 = r17;
        r3 = r18;
        r2 = r27;
        goto L_0x005f;
    L_0x0235:
        r2 = r19;
        goto L_0x0295;
    L_0x0238:
        r2 = r1;
        r18 = r3;
        r8 = 0;
        r0 = r6.values();	 Catch:{ InterruptedException -> 0x0295 }
        r1 = r0.iterator();	 Catch:{ InterruptedException -> 0x0295 }
    L_0x0244:
        r0 = r1.hasNext();	 Catch:{ InterruptedException -> 0x0295 }
        if (r0 == 0) goto L_0x028d;
    L_0x024a:
        r0 = r1.next();	 Catch:{ InterruptedException -> 0x0295 }
        r3 = r0;
        r3 = (java.util.Map) r3;	 Catch:{ InterruptedException -> 0x0295 }
        r4 = r18;
        r0 = r4.g;	 Catch:{ InterruptedException -> 0x0295 }
        r5 = r0;
        r0 = 0;
    L_0x0257:
        if (r0 != 0) goto L_0x028a;
    L_0x0259:
        if (r5 <= 0) goto L_0x028a;
    L_0x025b:
        r0 = r4.h;	 Catch:{ dij -> 0x026a }
        r6 = (long) r0;	 Catch:{ dij -> 0x026a }
        java.lang.Thread.sleep(r6);	 Catch:{ dij -> 0x026a }
        r0 = r4.a;	 Catch:{ dij -> 0x026a }
        r6 = r4.d;	 Catch:{ dij -> 0x026a }
        r0.a(r6, r3);	 Catch:{ dij -> 0x026a }
        r0 = 1;
        goto L_0x0287;
    L_0x026a:
        r0 = move-exception;
        r6 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x0295 }
        r7 = 34;
        r6.<init>(r7);	 Catch:{ InterruptedException -> 0x0295 }
        r7 = "#";
        r6.append(r7);	 Catch:{ InterruptedException -> 0x0295 }
        r6.append(r5);	 Catch:{ InterruptedException -> 0x0295 }
        r7 = " failed to send report";
        r6.append(r7);	 Catch:{ InterruptedException -> 0x0295 }
        r6 = r6.toString();	 Catch:{ InterruptedException -> 0x0295 }
        android.util.Log.w(r2, r6, r0);	 Catch:{ InterruptedException -> 0x0295 }
        r0 = 0;
    L_0x0287:
        r5 = r5 + -1;
        goto L_0x0257;
    L_0x028a:
        r18 = r4;
        goto L_0x0244;
    L_0x028d:
        r1 = r2;
        r3 = r18;
        r2 = r27;
        goto L_0x0006;
    L_0x0294:
        r2 = r1;
    L_0x0295:
        r0 = "Reporter interrupted.";
        android.util.Log.w(r2, r0);
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dif.run():void");
    }
}
