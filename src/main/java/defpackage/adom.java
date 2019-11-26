package defpackage;

/* renamed from: adom */
final /* synthetic */ class adom implements bcvk {
    private final adoj a;

    adom(adoj adoj) {
        this.a = adoj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:77:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01f0  */
    /* JADX WARNING: Missing block: B:139:0x029d, code skipped:
            if (((r4.b.a() - r6) / 1000) <= ((long) r8.c)) goto L_0x01c3;
     */
    /* JADX WARNING: Missing block: B:171:0x033d, code skipped:
            r3 = r0.k;
     */
    /* JADX WARNING: Missing block: B:172:0x033f, code skipped:
            monitor-enter(r3);
     */
    /* JADX WARNING: Missing block: B:174:?, code skipped:
            r2 = r0.j;
     */
    /* JADX WARNING: Missing block: B:175:0x0342, code skipped:
            if (r2 == null) goto L_0x0354;
     */
    /* JADX WARNING: Missing block: B:176:0x0344, code skipped:
            r6 = (long) ((defpackage.adog) r0.c.get(r2.a())).e;
     */
    /* JADX WARNING: Missing block: B:177:0x0354, code skipped:
            r6 = 0;
     */
    /* JADX WARNING: Missing block: B:178:0x0356, code skipped:
            monitor-exit(r3);
     */
    /* JADX WARNING: Missing block: B:179:0x0357, code skipped:
            r0.a();
            r0.n = new defpackage.adol(r0);
            r2 = r0.k;
     */
    /* JADX WARNING: Missing block: B:180:0x0363, code skipped:
            monitor-enter(r2);
     */
    /* JADX WARNING: Missing block: B:183:0x0366, code skipped:
            if (r0.j == null) goto L_0x039f;
     */
    /* JADX WARNING: Missing block: B:184:0x0368, code skipped:
            java.lang.String.format(java.util.Locale.US, "Posting show after %d milliseconds delay for current promotion %s", new java.lang.Object[]{java.lang.Long.valueOf(r6), r0.j.a()});
            r3 = r0.i.iterator();
     */
    /* JADX WARNING: Missing block: B:186:0x038a, code skipped:
            if (r3.hasNext() == false) goto L_0x0398;
     */
    /* JADX WARNING: Missing block: B:187:0x038c, code skipped:
            ((defpackage.adoh) r3.next()).a(r0.j);
     */
    /* JADX WARNING: Missing block: B:188:0x0398, code skipped:
            r0.m.postDelayed(r0.n, r6);
     */
    /* JADX WARNING: Missing block: B:189:0x039f, code skipped:
            monitor-exit(r2);
     */
    /* JADX WARNING: Missing block: B:190:0x03a0, code skipped:
            return;
     */
    public final void a(java.lang.Object r19) {
        /*
        r18 = this;
        r1 = r18;
        r0 = r1.a;
        r2 = r19;
        r2 = (defpackage.adiu) r2;
        defpackage.amqw.a(r2);
        r3 = r0.l;
        r3 = r2.equals(r3);
        if (r3 != 0) goto L_0x03c1;
    L_0x0013:
        r3 = r0.l;
        r4 = 0;
        if (r3 == 0) goto L_0x0036;
    L_0x0018:
        r3 = r3.g();
        r5 = r2.g();
        if (r3 == r5) goto L_0x0036;
    L_0x0022:
        r3 = r0.k;
        monitor-enter(r3);
        r5 = r0.j;	 Catch:{ all -> 0x0033 }
        if (r5 == 0) goto L_0x0031;
    L_0x0029:
        r5.d();	 Catch:{ all -> 0x0033 }
        r0.a();	 Catch:{ all -> 0x0033 }
        r0.j = r4;	 Catch:{ all -> 0x0033 }
    L_0x0031:
        monitor-exit(r3);	 Catch:{ all -> 0x0033 }
        goto L_0x0036;
    L_0x0033:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0033 }
        throw r0;
    L_0x0036:
        r0.l = r2;
        r2 = r0.g;
        r2 = r2.c();
        if (r2 != 0) goto L_0x03c1;
    L_0x0040:
        r2 = r0.f;
        r2 = r2.a();
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x03c1;
    L_0x004c:
        r2 = new java.util.HashSet;
        r2.<init>();
        r3 = r0.d;
        r3 = r3.iterator();
    L_0x0057:
        r5 = r3.hasNext();
        r8 = 2;
        r9 = 1;
        if (r5 == 0) goto L_0x02ac;
    L_0x005f:
        r5 = r3.next();
        r5 = (defpackage.adov) r5;
        r11 = r0.l;
        r12 = 0;
    L_0x0068:
        r13 = r5.b;
        r13 = r13.size();
        if (r12 >= r13) goto L_0x009e;
    L_0x0070:
        r13 = r5.b;
        r13 = r13.keyAt(r12);
        r14 = r5.b;
        r14 = r14.valueAt(r12);
        r14 = (defpackage.adpa) r14;
        if (r13 == 0) goto L_0x0090;
    L_0x0080:
        if (r13 == r9) goto L_0x008b;
    L_0x0082:
        if (r13 == r8) goto L_0x0086;
    L_0x0084:
        r13 = 0;
        goto L_0x0094;
    L_0x0086:
        r13 = r11.c();
        goto L_0x0094;
    L_0x008b:
        r13 = r11.b();
        goto L_0x0094;
    L_0x0090:
        r13 = r11.a();
    L_0x0094:
        r6 = (long) r13;
        r6 = r14.a(r6);
        if (r6 == 0) goto L_0x0057;
    L_0x009b:
        r12 = r12 + 1;
        goto L_0x0068;
    L_0x009e:
        r6 = 0;
    L_0x009f:
        r7 = r5.c;
        r7 = r7.size();
        if (r6 >= r7) goto L_0x00d5;
    L_0x00a7:
        r7 = r5.c;
        r7 = r7.keyAt(r6);
        r12 = r5.c;
        r12 = r12.valueAt(r6);
        r12 = (defpackage.adpa) r12;
        if (r7 == 0) goto L_0x00c7;
    L_0x00b7:
        if (r7 == r9) goto L_0x00c2;
    L_0x00b9:
        if (r7 == r8) goto L_0x00bd;
    L_0x00bb:
        r7 = 0;
        goto L_0x00cb;
    L_0x00bd:
        r7 = r11.f();
        goto L_0x00cb;
    L_0x00c2:
        r7 = r11.e();
        goto L_0x00cb;
    L_0x00c7:
        r7 = r11.d();
    L_0x00cb:
        r13 = (long) r7;
        r7 = r12.a(r13);
        if (r7 == 0) goto L_0x0057;
    L_0x00d2:
        r6 = r6 + 1;
        goto L_0x009f;
    L_0x00d5:
        r6 = r5.d;
        if (r6 == 0) goto L_0x00e1;
    L_0x00d9:
        r6 = r11.g();
        r7 = r5.d;
        if (r6 != r7) goto L_0x0057;
    L_0x00e1:
        r6 = r5.e;
        if (r6 == 0) goto L_0x00f0;
    L_0x00e5:
        r7 = r11.h();
        r7 = (long) r7;
        r6 = r6.a(r7);
        if (r6 == 0) goto L_0x0057;
    L_0x00f0:
        r6 = r5.f;
        if (r6 == 0) goto L_0x00fa;
    L_0x00f4:
        r6 = r11.m();
        if (r6 == 0) goto L_0x0057;
    L_0x00fa:
        r6 = r5.g;
        if (r6 == 0) goto L_0x0109;
    L_0x00fe:
        r7 = r11.n();
        r7 = (long) r7;
        r6 = r6.a(r7);
        if (r6 == 0) goto L_0x0057;
    L_0x0109:
        r6 = r5.h;
        r6 = r6.size();
        if (r6 <= 0) goto L_0x012d;
    L_0x0111:
        r6 = r11.q();
        r8 = r5.h;
        r8 = r8.iterator();
    L_0x011b:
        r9 = r8.hasNext();
        if (r9 == 0) goto L_0x0057;
    L_0x0121:
        r9 = r8.next();
        r9 = (defpackage.adpa) r9;
        r9 = r9.a(r6);
        if (r9 == 0) goto L_0x011b;
    L_0x012d:
        r6 = r5.i;
        r6 = r6.size();
        if (r6 <= 0) goto L_0x01a8;
    L_0x0135:
        r6 = r11.q();
        r8 = r5.i;
        r8 = r8.iterator();
    L_0x013f:
        r9 = r8.hasNext();
        if (r9 == 0) goto L_0x0057;
    L_0x0145:
        r9 = r8.next();
        r9 = (defpackage.adoz) r9;
        r12 = new java.util.GregorianCalendar;
        r13 = java.util.TimeZone.getDefault();
        r12.<init>(r13);
        r12.setTimeInMillis(r6);
        r13 = 7;
        r13 = r12.get(r13);
        r13 = defpackage.auqx.a(r13);
        r14 = r9.a;
        r4 = r14.length;
        if (r4 != 0) goto L_0x0166;
    L_0x0165:
        goto L_0x0170;
    L_0x0166:
        r15 = 0;
    L_0x0167:
        if (r15 >= r4) goto L_0x01a6;
    L_0x0169:
        r10 = r14[r15];
        if (r13 == r10) goto L_0x0170;
    L_0x016d:
        r15 = r15 + 1;
        goto L_0x0167;
    L_0x0170:
        r4 = 11;
        r4 = r12.get(r4);
        r4 = r4 * 60;
        r10 = 12;
        r10 = r12.get(r10);
        r4 = r4 + r10;
        r10 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r4 = r4 * r10;
        r12 = (long) r4;
        r4 = r9.b;
        r4 = r4.size();
        if (r4 == 0) goto L_0x01a8;
    L_0x018d:
        r4 = r9.b;
        r4 = r4.iterator();
    L_0x0193:
        r9 = r4.hasNext();
        if (r9 == 0) goto L_0x01a6;
    L_0x0199:
        r9 = r4.next();
        r9 = (defpackage.adpa) r9;
        r9 = r9.a(r12);
        if (r9 == 0) goto L_0x0193;
    L_0x01a5:
        goto L_0x01a8;
    L_0x01a6:
        r4 = 0;
        goto L_0x013f;
    L_0x01a8:
        r4 = r5.j;
        r4 = r4.size();
        if (r4 <= 0) goto L_0x01c6;
    L_0x01b0:
        r4 = r11.o();
        if (r4 == 0) goto L_0x01c3;
    L_0x01b6:
        r4 = r5.j;
        r6 = r11.o();
        r4 = r4.contains(r6);
        if (r4 == 0) goto L_0x01c3;
    L_0x01c2:
        goto L_0x01c6;
    L_0x01c3:
        r4 = 0;
        goto L_0x0057;
    L_0x01c6:
        r4 = r5.k;
        r4 = r4.size();
        if (r4 <= 0) goto L_0x01e0;
    L_0x01ce:
        r4 = r11.p();
        if (r4 == 0) goto L_0x01c3;
    L_0x01d4:
        r4 = r5.k;
        r6 = r11.p();
        r4 = r4.contains(r6);
        if (r4 == 0) goto L_0x01c3;
    L_0x01e0:
        r4 = r0.b;
        r6 = r5.a;
        r7 = r5.l;
        r8 = r4.c;
        r8 = r8.get(r6);
        r8 = (defpackage.adog) r8;
        if (r8 != 0) goto L_0x0211;
    L_0x01f0:
        r4 = defpackage.adou.a;
        r5 = java.lang.String.valueOf(r6);
        r6 = r5.length();
        r7 = new java.lang.StringBuilder;
        r6 = r6 + 30;
        r7.<init>(r6);
        r6 = "No config for promotion type: ";
        r7.append(r6);
        r7.append(r5);
        r5 = r7.toString();
        defpackage.xtl.a(r4, r5);
        goto L_0x01c3;
    L_0x0211:
        r9 = r7.isEmpty();
        if (r9 != 0) goto L_0x0273;
    L_0x0217:
        r7 = r7.iterator();
    L_0x021b:
        r9 = r7.hasNext();
        if (r9 == 0) goto L_0x0273;
    L_0x0221:
        r9 = r7.next();
        r9 = (defpackage.adox) r9;
        r12 = r9.a;
        r13 = r4.c;
        r13 = r13.get(r12);
        r13 = (defpackage.adog) r13;
        if (r13 != 0) goto L_0x023b;
    L_0x0233:
        r4 = java.lang.String.valueOf(r12);
        r4.length();
        goto L_0x01c3;
    L_0x023b:
        r13 = r4.d;
        r12 = r13.get(r12);
        r12 = (defpackage.adot) r12;
        if (r12 == 0) goto L_0x0248;
    L_0x0245:
        r13 = r12.b;
        goto L_0x0249;
    L_0x0248:
        r13 = 0;
    L_0x0249:
        r14 = r9.c;
        r10 = (long) r13;
        r10 = r14.a(r10);
        if (r10 == 0) goto L_0x01c3;
    L_0x0252:
        r9 = r9.b;
        if (r9 <= 0) goto L_0x021b;
    L_0x0256:
        if (r12 == 0) goto L_0x01c3;
    L_0x0258:
        r10 = r12.a();
        r12 = 0;
        r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r14 == 0) goto L_0x01c3;
    L_0x0262:
        r12 = r4.b;
        r12 = r12.a();
        r12 = r12 - r10;
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r12 = r12 / r10;
        r9 = (long) r9;
        r11 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1));
        if (r11 > 0) goto L_0x021b;
    L_0x0271:
        goto L_0x01c3;
    L_0x0273:
        r7 = r4.d;
        r6 = r7.get(r6);
        r6 = (defpackage.adot) r6;
        if (r6 != 0) goto L_0x027e;
    L_0x027d:
        goto L_0x029f;
    L_0x027e:
        r7 = r6.b;
        r9 = r8.d;
        if (r7 >= r9) goto L_0x01c3;
    L_0x0284:
        r6 = r6.a();
        r16 = 0;
        r9 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1));
        if (r9 == 0) goto L_0x029f;
    L_0x028e:
        r4 = r4.b;
        r9 = r4.a();
        r9 = r9 - r6;
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r9 = r9 / r6;
        r4 = r8.c;
        r6 = (long) r4;
        r4 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1));
        if (r4 <= 0) goto L_0x01c3;
    L_0x029f:
        r4 = r5.a;
        r5 = r5.d;
        r4 = android.util.Pair.create(r4, r5);
        r2.add(r4);
        goto L_0x01c3;
    L_0x02ac:
        r16 = 0;
        r3 = r2.isEmpty();
        if (r3 != 0) goto L_0x03aa;
    L_0x02b4:
        r3 = new java.util.ArrayList;
        r3.<init>(r2);
        r2 = r0.o;
        java.util.Collections.sort(r3, r2);
        r2 = 0;
        r3 = r3.get(r2);
        r3 = (android.util.Pair) r3;
        r2 = r0.k;
        monitor-enter(r2);
        r4 = r0.j;	 Catch:{ all -> 0x03a7 }
        if (r4 == 0) goto L_0x02ee;
    L_0x02cc:
        r4 = r4.a();	 Catch:{ all -> 0x03a7 }
        r5 = r3.first;	 Catch:{ all -> 0x03a7 }
        if (r4 == r5) goto L_0x02de;
    L_0x02d4:
        r0 = r3.first;	 Catch:{ all -> 0x03a7 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x03a7 }
        r0.length();	 Catch:{ all -> 0x03a7 }
        goto L_0x02eb;
    L_0x02de:
        r0 = r0.j;	 Catch:{ all -> 0x03a7 }
        r0 = r0.a();	 Catch:{ all -> 0x03a7 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x03a7 }
        r0.length();	 Catch:{ all -> 0x03a7 }
    L_0x02eb:
        monitor-exit(r2);	 Catch:{ all -> 0x03a7 }
        goto L_0x03c1;
    L_0x02ee:
        r4 = r3.first;	 Catch:{ all -> 0x03a7 }
        r4 = (defpackage.adow) r4;	 Catch:{ all -> 0x03a7 }
        r5 = r3.second;	 Catch:{ all -> 0x03a7 }
        r5 = (defpackage.adiw) r5;	 Catch:{ all -> 0x03a7 }
        r6 = r0.e;	 Catch:{ all -> 0x03a7 }
        r6 = r6.iterator();	 Catch:{ all -> 0x03a7 }
    L_0x02fc:
        r7 = r6.hasNext();	 Catch:{ all -> 0x03a7 }
        if (r7 == 0) goto L_0x031b;
    L_0x0302:
        r7 = r6.next();	 Catch:{ all -> 0x03a7 }
        r7 = (defpackage.adoi) r7;	 Catch:{ all -> 0x03a7 }
        r10 = r7.a();	 Catch:{ all -> 0x03a7 }
        if (r10 != r4) goto L_0x02fc;
    L_0x030e:
        r10 = r7.b();	 Catch:{ all -> 0x03a7 }
        if (r10 == 0) goto L_0x031c;
    L_0x0314:
        r10 = r7.b();	 Catch:{ all -> 0x03a7 }
        if (r10 != r5) goto L_0x02fc;
    L_0x031a:
        goto L_0x031c;
    L_0x031b:
        r7 = 0;
    L_0x031c:
        r0.j = r7;	 Catch:{ all -> 0x03a7 }
        r4 = r0.j;	 Catch:{ all -> 0x03a7 }
        if (r4 != 0) goto L_0x033c;
    L_0x0322:
        r0 = defpackage.adoj.a;	 Catch:{ all -> 0x03a7 }
        r4 = java.util.Locale.US;	 Catch:{ all -> 0x03a7 }
        r5 = "No registered promotion for type: %s, page type: %s";
        r6 = new java.lang.Object[r8];	 Catch:{ all -> 0x03a7 }
        r7 = r3.first;	 Catch:{ all -> 0x03a7 }
        r8 = 0;
        r6[r8] = r7;	 Catch:{ all -> 0x03a7 }
        r3 = r3.second;	 Catch:{ all -> 0x03a7 }
        r6[r9] = r3;	 Catch:{ all -> 0x03a7 }
        r3 = java.lang.String.format(r4, r5, r6);	 Catch:{ all -> 0x03a7 }
        defpackage.xtl.a(r0, r3);	 Catch:{ all -> 0x03a7 }
        monitor-exit(r2);	 Catch:{ all -> 0x03a7 }
        return;
    L_0x033c:
        monitor-exit(r2);	 Catch:{ all -> 0x03a7 }
        r3 = r0.k;
        monitor-enter(r3);
        r2 = r0.j;	 Catch:{ all -> 0x03a4 }
        if (r2 == 0) goto L_0x0354;
    L_0x0344:
        r4 = r0.c;	 Catch:{ all -> 0x03a4 }
        r2 = r2.a();	 Catch:{ all -> 0x03a4 }
        r2 = r4.get(r2);	 Catch:{ all -> 0x03a4 }
        r2 = (defpackage.adog) r2;	 Catch:{ all -> 0x03a4 }
        r2 = r2.e;	 Catch:{ all -> 0x03a4 }
        r6 = (long) r2;	 Catch:{ all -> 0x03a4 }
        goto L_0x0356;
    L_0x0354:
        r6 = r16;
    L_0x0356:
        monitor-exit(r3);	 Catch:{ all -> 0x03a4 }
        r0.a();
        r2 = new adol;
        r2.<init>(r0);
        r0.n = r2;
        r2 = r0.k;
        monitor-enter(r2);
        r3 = r0.j;	 Catch:{ all -> 0x03a1 }
        if (r3 == 0) goto L_0x039f;
    L_0x0368:
        r3 = java.util.Locale.US;	 Catch:{ all -> 0x03a1 }
        r4 = "Posting show after %d milliseconds delay for current promotion %s";
        r5 = new java.lang.Object[r8];	 Catch:{ all -> 0x03a1 }
        r8 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x03a1 }
        r10 = 0;
        r5[r10] = r8;	 Catch:{ all -> 0x03a1 }
        r8 = r0.j;	 Catch:{ all -> 0x03a1 }
        r8 = r8.a();	 Catch:{ all -> 0x03a1 }
        r5[r9] = r8;	 Catch:{ all -> 0x03a1 }
        java.lang.String.format(r3, r4, r5);	 Catch:{ all -> 0x03a1 }
        r3 = r0.i;	 Catch:{ all -> 0x03a1 }
        r3 = r3.iterator();	 Catch:{ all -> 0x03a1 }
    L_0x0386:
        r4 = r3.hasNext();	 Catch:{ all -> 0x03a1 }
        if (r4 == 0) goto L_0x0398;
    L_0x038c:
        r4 = r3.next();	 Catch:{ all -> 0x03a1 }
        r4 = (defpackage.adoh) r4;	 Catch:{ all -> 0x03a1 }
        r5 = r0.j;	 Catch:{ all -> 0x03a1 }
        r4.a(r5);	 Catch:{ all -> 0x03a1 }
        goto L_0x0386;
    L_0x0398:
        r3 = r0.m;	 Catch:{ all -> 0x03a1 }
        r0 = r0.n;	 Catch:{ all -> 0x03a1 }
        r3.postDelayed(r0, r6);	 Catch:{ all -> 0x03a1 }
    L_0x039f:
        monitor-exit(r2);	 Catch:{ all -> 0x03a1 }
        return;
    L_0x03a1:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x03a1 }
        throw r0;
    L_0x03a4:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x03a4 }
        throw r0;
    L_0x03a7:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x03a7 }
        throw r0;
    L_0x03aa:
        r2 = r0.k;
        monitor-enter(r2);
        r0 = r0.j;	 Catch:{ all -> 0x03be }
        if (r0 == 0) goto L_0x03bc;
    L_0x03b1:
        r0 = r0.a();	 Catch:{ all -> 0x03be }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x03be }
        r0.length();	 Catch:{ all -> 0x03be }
    L_0x03bc:
        monitor-exit(r2);	 Catch:{ all -> 0x03be }
        return;
    L_0x03be:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x03be }
        throw r0;
    L_0x03c1:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adom.a(java.lang.Object):void");
    }
}
