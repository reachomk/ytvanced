package defpackage;

import android.util.JsonReader;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: bos */
final class bos {
    private static final Interpolator a = new LinearInterpolator();
    private static aaf b;

    bos() {
    }

    static bpf a(JsonReader jsonReader, bjj bjj, float f, box box, boolean z) {
        if (z) {
            return bos.a(bjj, jsonReader, f, box);
        }
        return new bpf(box.a(jsonReader, f));
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009d  */
    private static defpackage.bpf a(defpackage.bjj r17, android.util.JsonReader r18, float r19, defpackage.box r20) {
        /*
        r0 = r18;
        r1 = r19;
        r2 = r20;
        r3 = defpackage.bos.class;
        r18.beginObject();
        r6 = 0;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r13 = 0;
        r14 = 0;
        r15 = 0;
    L_0x0014:
        r11 = r18.hasNext();
        if (r11 == 0) goto L_0x00da;
    L_0x001a:
        r11 = r18.nextName();
        r12 = r11.hashCode();
        r4 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r5 = 1;
        if (r12 == r4) goto L_0x008a;
    L_0x0027:
        r4 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        if (r12 == r4) goto L_0x0080;
    L_0x002b:
        r4 = 3701; // 0xe75 float:5.186E-42 double:1.8285E-320;
        if (r12 == r4) goto L_0x0076;
    L_0x002f:
        r4 = 3707; // 0xe7b float:5.195E-42 double:1.8315E-320;
        if (r12 == r4) goto L_0x006c;
    L_0x0033:
        r4 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        if (r12 == r4) goto L_0x0062;
    L_0x0037:
        r4 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        if (r12 == r4) goto L_0x0058;
    L_0x003b:
        r4 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        if (r12 == r4) goto L_0x004e;
    L_0x003f:
        r4 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        if (r12 == r4) goto L_0x0044;
    L_0x0043:
        goto L_0x0094;
    L_0x0044:
        r4 = "t";
        r4 = r11.equals(r4);
        if (r4 == 0) goto L_0x0094;
    L_0x004c:
        r4 = 0;
        goto L_0x0095;
    L_0x004e:
        r4 = "s";
        r4 = r11.equals(r4);
        if (r4 == 0) goto L_0x0094;
    L_0x0056:
        r4 = 1;
        goto L_0x0095;
    L_0x0058:
        r4 = "i";
        r4 = r11.equals(r4);
        if (r4 == 0) goto L_0x0094;
    L_0x0060:
        r4 = 4;
        goto L_0x0095;
    L_0x0062:
        r4 = "h";
        r4 = r11.equals(r4);
        if (r4 == 0) goto L_0x0094;
    L_0x006a:
        r4 = 5;
        goto L_0x0095;
    L_0x006c:
        r4 = "to";
        r4 = r11.equals(r4);
        if (r4 == 0) goto L_0x0094;
    L_0x0074:
        r4 = 6;
        goto L_0x0095;
    L_0x0076:
        r4 = "ti";
        r4 = r11.equals(r4);
        if (r4 == 0) goto L_0x0094;
    L_0x007e:
        r4 = 7;
        goto L_0x0095;
    L_0x0080:
        r4 = "o";
        r4 = r11.equals(r4);
        if (r4 == 0) goto L_0x0094;
    L_0x0088:
        r4 = 3;
        goto L_0x0095;
    L_0x008a:
        r4 = "e";
        r4 = r11.equals(r4);
        if (r4 == 0) goto L_0x0094;
    L_0x0092:
        r4 = 2;
        goto L_0x0095;
    L_0x0094:
        r4 = -1;
    L_0x0095:
        switch(r4) {
            case 0: goto L_0x00d2;
            case 1: goto L_0x00cb;
            case 2: goto L_0x00c4;
            case 3: goto L_0x00bd;
            case 4: goto L_0x00b6;
            case 5: goto L_0x00ab;
            case 6: goto L_0x00a4;
            case 7: goto L_0x009d;
            default: goto L_0x0098;
        };
    L_0x0098:
        r18.skipValue();
        goto L_0x0014;
    L_0x009d:
        r4 = defpackage.boq.b(r18, r19);
        r14 = r4;
        goto L_0x0014;
    L_0x00a4:
        r4 = defpackage.boq.b(r18, r19);
        r15 = r4;
        goto L_0x0014;
    L_0x00ab:
        r4 = r18.nextInt();
        if (r4 != r5) goto L_0x00b2;
    L_0x00b1:
        goto L_0x00b3;
    L_0x00b2:
        r5 = 0;
    L_0x00b3:
        r6 = r5;
        goto L_0x0014;
    L_0x00b6:
        r4 = defpackage.boq.b(r18, r19);
        r8 = r4;
        goto L_0x0014;
    L_0x00bd:
        r4 = defpackage.boq.b(r18, r19);
        r7 = r4;
        goto L_0x0014;
    L_0x00c4:
        r4 = r2.a(r0, r1);
        r9 = r4;
        goto L_0x0014;
    L_0x00cb:
        r4 = r2.a(r0, r1);
        r10 = r4;
        goto L_0x0014;
    L_0x00d2:
        r4 = r18.nextDouble();
        r4 = (float) r4;
        r13 = r4;
        goto L_0x0014;
    L_0x00da:
        r18.endObject();
        if (r6 == 0) goto L_0x00e5;
    L_0x00df:
        r0 = a;
        r12 = r0;
        r11 = r10;
        goto L_0x0172;
    L_0x00e5:
        if (r7 != 0) goto L_0x00e9;
    L_0x00e7:
        goto L_0x016e;
    L_0x00e9:
        if (r8 == 0) goto L_0x016e;
    L_0x00eb:
        r0 = -r1;
        r2 = r7.x;
        r2 = defpackage.bpd.b(r2, r0, r1);
        r7.x = r2;
        r2 = r7.y;
        r4 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r5 = -1027080192; // 0xffffffffc2c80000 float:-100.0 double:NaN;
        r2 = defpackage.bpd.b(r2, r5, r4);
        r7.y = r2;
        r2 = r8.x;
        r0 = defpackage.bpd.b(r2, r0, r1);
        r8.x = r0;
        r0 = r8.y;
        r0 = defpackage.bpd.b(r0, r5, r4);
        r8.y = r0;
        r0 = r7.x;
        r2 = r7.y;
        r4 = r8.x;
        r5 = r8.y;
        r0 = defpackage.bpg.a(r0, r2, r4, r5);
        monitor-enter(r3);
        r2 = b;	 Catch:{ all -> 0x016b }
        if (r2 != 0) goto L_0x0128;
    L_0x0121:
        r2 = new aaf;	 Catch:{ all -> 0x016b }
        r2.<init>();	 Catch:{ all -> 0x016b }
        b = r2;	 Catch:{ all -> 0x016b }
    L_0x0128:
        r2 = b;	 Catch:{ all -> 0x016b }
        r2 = r2.a(r0);	 Catch:{ all -> 0x016b }
        r2 = (java.lang.ref.WeakReference) r2;	 Catch:{ all -> 0x016b }
        monitor-exit(r3);	 Catch:{ all -> 0x016b }
        if (r2 != 0) goto L_0x0136;
    L_0x0133:
        r16 = 0;
        goto L_0x013f;
    L_0x0136:
        r4 = r2.get();
        r5 = r4;
        r5 = (android.view.animation.Interpolator) r5;
        r16 = r5;
    L_0x013f:
        if (r2 != 0) goto L_0x0142;
    L_0x0141:
        goto L_0x0145;
    L_0x0142:
        if (r16 == 0) goto L_0x0145;
    L_0x0144:
        goto L_0x0167;
    L_0x0145:
        r2 = r7.x;
        r2 = r2 / r1;
        r4 = r7.y;
        r4 = r4 / r1;
        r5 = r8.x;
        r5 = r5 / r1;
        r6 = r8.y;
        r6 = r6 / r1;
        r1 = defpackage.acr.a(r2, r4, r5, r6);
        r2 = new java.lang.ref.WeakReference;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0165 }
        r2.<init>(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0165 }
        monitor-enter(r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0165 }
        r4 = b;	 Catch:{ all -> 0x0162 }
        r4.b(r0, r2);	 Catch:{ all -> 0x0162 }
        monitor-exit(r3);	 Catch:{ all -> 0x0162 }
        goto L_0x0165;
    L_0x0162:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0162 }
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0165 }
    L_0x0165:
        r16 = r1;
    L_0x0167:
        r11 = r9;
        r12 = r16;
        goto L_0x0172;
    L_0x016b:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x016b }
        throw r0;
    L_0x016e:
        r0 = a;
        r12 = r0;
        r11 = r9;
    L_0x0172:
        r0 = new bpf;
        r1 = 0;
        r8 = r0;
        r9 = r17;
        r5 = r14;
        r14 = r1;
        r8.<init>(r9, r10, r11, r12, r13, r14);
        r0.k = r15;
        r0.l = r5;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bos.a(bjj, android.util.JsonReader, float, box):bpf");
    }
}
