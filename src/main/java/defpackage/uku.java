package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* renamed from: uku */
public final class uku {
    private static final Set a;
    private static final Set b;
    private static final Set c;

    public static ukz a(Context context, Uri uri) {
        return uku.a(context, uri, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:89:0x015b A:{Catch:{ IllegalArgumentException -> 0x017b, all -> 0x019e }} */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0168 A:{Catch:{ IllegalArgumentException -> 0x017b, all -> 0x019e }} */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0196 A:{Catch:{ IllegalArgumentException -> 0x017b, all -> 0x019e }} */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x015b A:{Catch:{ IllegalArgumentException -> 0x017b, all -> 0x019e }} */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0168 A:{Catch:{ IllegalArgumentException -> 0x017b, all -> 0x019e }} */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0196 A:{Catch:{ IllegalArgumentException -> 0x017b, all -> 0x019e }} */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x027c A:{Catch:{ all -> 0x04d9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ae A:{Catch:{ all -> 0x04d9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0495 A:{Catch:{ all -> 0x04d9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02c8 A:{Catch:{ all -> 0x04d9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x0539 A:{Catch:{ all -> 0x054e }} */
    public static defpackage.ukz a(android.content.Context r44, android.net.Uri r45, boolean r46) {
        /*
        r1 = r44;
        r2 = r45;
        r3 = defpackage.ukq.a;
        r3 = r3.a();
        r4 = defpackage.ujn.a(r44, r45);
        r5 = r4.b();	 Catch:{ RuntimeException -> 0x0531, IOException | RuntimeException -> 0x052f, all -> 0x052a }
        r7 = defpackage.ukc.a;	 Catch:{ RuntimeException -> 0x0531, IOException | RuntimeException -> 0x052f, all -> 0x052a }
        r8 = 0;
        r7 = r7.a(r4, r8);	 Catch:{ RuntimeException -> 0x0531, IOException | RuntimeException -> 0x052f, all -> 0x052a }
        r9 = r7 instanceof defpackage.cje;	 Catch:{ RuntimeException -> 0x0531, IOException | RuntimeException -> 0x052f, all -> 0x052a }
        if (r9 == 0) goto L_0x051c;
    L_0x001d:
        r7 = (defpackage.cje) r7;	 Catch:{ RuntimeException -> 0x0531, IOException | RuntimeException -> 0x052f, all -> 0x052a }
        r9 = b;	 Catch:{ RuntimeException -> 0x0531, IOException | RuntimeException -> 0x052f, all -> 0x052a }
        r10 = r7.a;	 Catch:{ RuntimeException -> 0x0531, IOException | RuntimeException -> 0x052f, all -> 0x052a }
        r9 = r9.contains(r10);	 Catch:{ RuntimeException -> 0x0531, IOException | RuntimeException -> 0x052f, all -> 0x052a }
        if (r9 == 0) goto L_0x002a;
    L_0x0029:
        goto L_0x0057;
    L_0x002a:
        r11 = r7.b;	 Catch:{ RuntimeException -> 0x0531, IOException | RuntimeException -> 0x052f, all -> 0x052a }
        r11 = r11.iterator();	 Catch:{ RuntimeException -> 0x0531, IOException | RuntimeException -> 0x052f, all -> 0x052a }
    L_0x0030:
        r12 = r11.hasNext();	 Catch:{ RuntimeException -> 0x0531, IOException | RuntimeException -> 0x052f, all -> 0x052a }
        if (r12 == 0) goto L_0x0055;
    L_0x0036:
        r12 = r11.next();	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        r12 = (java.lang.String) r12;	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        r13 = c;	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        r12 = r13.contains(r12);	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        if (r12 != 0) goto L_0x0045;
    L_0x0044:
        goto L_0x0030;
    L_0x0045:
        r9 = 1;
        goto L_0x0030;
    L_0x0047:
        r0 = move-exception;
        r1 = r0;
        r38 = r4;
        goto L_0x0550;
    L_0x004d:
        r0 = move-exception;
        goto L_0x0050;
    L_0x004f:
        r0 = move-exception;
    L_0x0050:
        r1 = r0;
        r38 = r4;
        goto L_0x0535;
    L_0x0055:
        if (r9 == 0) goto L_0x04f9;
    L_0x0057:
        r4.a(r5);	 Catch:{ RuntimeException -> 0x0531, IOException | RuntimeException -> 0x052f, all -> 0x052a }
        r5 = new ukb;	 Catch:{ RuntimeException -> 0x0531, IOException | RuntimeException -> 0x052f, all -> 0x052a }
        r5.<init>(r1);	 Catch:{ RuntimeException -> 0x0531, IOException | RuntimeException -> 0x052f, all -> 0x052a }
        r6 = new cil;	 Catch:{ RuntimeException -> 0x0531, IOException | RuntimeException -> 0x052f, all -> 0x052a }
        r7 = defpackage.ukc.a;	 Catch:{ RuntimeException -> 0x0531, IOException | RuntimeException -> 0x052f, all -> 0x052a }
        r6.<init>(r4, r7);	 Catch:{ RuntimeException -> 0x0531, IOException | RuntimeException -> 0x052f, all -> 0x052a }
        r7 = new ulb;	 Catch:{ RuntimeException -> 0x0531, IOException | RuntimeException -> 0x052f, all -> 0x052a }
        r7.<init>();	 Catch:{ RuntimeException -> 0x0531, IOException | RuntimeException -> 0x052f, all -> 0x052a }
        r7.a = r2;	 Catch:{ RuntimeException -> 0x0531, IOException | RuntimeException -> 0x052f, all -> 0x052a }
        r6 = r6.a();	 Catch:{ RuntimeException -> 0x0531, IOException | RuntimeException -> 0x052f, all -> 0x052a }
        if (r6 == 0) goto L_0x04ef;
    L_0x0073:
        r9 = defpackage.ckg.class;
        r6 = r6.a(r9);	 Catch:{ RuntimeException -> 0x0531, IOException | RuntimeException -> 0x052f, all -> 0x052a }
        r9 = r6.size();	 Catch:{ RuntimeException -> 0x0531, IOException | RuntimeException -> 0x052f, all -> 0x052a }
        r11 = -1;
        r13 = 0;
        r14 = -1;
        r15 = -1;
    L_0x0081:
        if (r13 >= r9) goto L_0x00e3;
    L_0x0083:
        r16 = r6.get(r13);	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        r16 = (defpackage.ckg) r16;	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        r16 = r16.h();	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        r8 = r16.h();	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        r8 = r8.a;	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        r12 = a;	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        r12 = r12.contains(r8);	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        if (r12 == 0) goto L_0x00c7;
    L_0x009b:
        r12 = "vide";
        r12 = r12.equals(r8);	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        if (r12 != 0) goto L_0x00a4;
    L_0x00a3:
        goto L_0x00a7;
    L_0x00a4:
        if (r14 != r11) goto L_0x00bf;
    L_0x00a6:
        r14 = r13;
    L_0x00a7:
        r12 = "soun";
        r8 = r12.equals(r8);	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        if (r8 != 0) goto L_0x00b0;
    L_0x00af:
        goto L_0x00b3;
    L_0x00b0:
        if (r15 != r11) goto L_0x00b7;
    L_0x00b2:
        r15 = r13;
    L_0x00b3:
        r13 = r13 + 1;
        r8 = 0;
        goto L_0x0081;
    L_0x00b7:
        r1 = new ula;	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        r2 = "Multiple audio tracks are not supported";
        r1.<init>(r2);	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        throw r1;	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
    L_0x00bf:
        r1 = new ula;	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        r2 = "Multiple video tracks are not supported";
        r1.<init>(r2);	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        throw r1;	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
    L_0x00c7:
        r1 = new ula;	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        r2 = "Unsupported track type found: ";
        r3 = java.lang.String.valueOf(r8);	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        r5 = r3.length();	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        if (r5 != 0) goto L_0x00db;
    L_0x00d5:
        r3 = new java.lang.String;	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        r3.<init>(r2);	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        goto L_0x00df;
    L_0x00db:
        r3 = r2.concat(r3);	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
    L_0x00df:
        r1.<init>(r3);	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        throw r1;	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
    L_0x00e3:
        if (r14 == r11) goto L_0x04e5;
    L_0x00e5:
        if (r15 == r11) goto L_0x0126;
    L_0x00e7:
        r8 = r6.get(r15);	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        r8 = (defpackage.ckg) r8;	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        r9 = defpackage.uku.a(r8);	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        if (r9 == 0) goto L_0x011e;
    L_0x00f3:
        r9 = defpackage.uku.b(r8);	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        if (r9 == 0) goto L_0x0116;
    L_0x00f9:
        r9 = defpackage.uku.e(r8);	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        if (r9 == 0) goto L_0x010e;
    L_0x00ff:
        r8 = defpackage.uku.d(r8);	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        if (r8 == 0) goto L_0x0106;
    L_0x0105:
        goto L_0x0126;
    L_0x0106:
        r1 = new ula;	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        r2 = "AudioTrack missing HandlerBox";
        r1.<init>(r2);	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        throw r1;	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
    L_0x010e:
        r1 = new ula;	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        r2 = "AudioTrack missing MediaInformationBox";
        r1.<init>(r2);	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        throw r1;	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
    L_0x0116:
        r1 = new ula;	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        r2 = "AudioTrack SampleTable missing ChunkOffsetBox";
        r1.<init>(r2);	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        throw r1;	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
    L_0x011e:
        r1 = new ula;	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        r2 = "AudioTrack missing SampleTableBox";
        r1.<init>(r2);	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
        throw r1;	 Catch:{ RuntimeException -> 0x004f, IOException | RuntimeException -> 0x004d, all -> 0x0047 }
    L_0x0126:
        r3.a(r1, r2);	 Catch:{ all -> 0x04db }
        r7.c = r14;	 Catch:{ all -> 0x04db }
        if (r46 == 0) goto L_0x01a6;
    L_0x012d:
        r1 = r3.b();	 Catch:{ all -> 0x019e }
        r8 = 0;
    L_0x0132:
        if (r8 >= r1) goto L_0x0157;
    L_0x0134:
        r9 = r5.a(r3, r2, r8);	 Catch:{ all -> 0x019e }
        r12 = -2;
        if (r9 == r12) goto L_0x014f;
    L_0x013b:
        r12 = defpackage.ukb.a(r9);	 Catch:{ all -> 0x019e }
        if (r12 != 0) goto L_0x0144;
    L_0x0141:
        r8 = r8 + 1;
        goto L_0x0132;
    L_0x0144:
        r1 = defpackage.ukb.b(r9);	 Catch:{ all -> 0x019e }
        if (r1 != 0) goto L_0x014c;
    L_0x014a:
        r1 = 1;
        goto L_0x0158;
    L_0x014c:
        r1 = 1;
        r2 = 1;
        goto L_0x0159;
    L_0x014f:
        r1 = new ula;	 Catch:{ all -> 0x019e }
        r2 = "Track with unknown format encountered";
        r1.<init>(r2);	 Catch:{ all -> 0x019e }
        throw r1;	 Catch:{ all -> 0x019e }
    L_0x0157:
        r1 = 0;
    L_0x0158:
        r2 = 0;
    L_0x0159:
        if (r1 == 0) goto L_0x0166;
    L_0x015b:
        if (r2 == 0) goto L_0x015e;
    L_0x015d:
        goto L_0x0166;
    L_0x015e:
        r1 = new ula;	 Catch:{ all -> 0x019e }
        r2 = "AudioTrack format unsupported";
        r1.<init>(r2);	 Catch:{ all -> 0x019e }
        throw r1;	 Catch:{ all -> 0x019e }
    L_0x0166:
        if (r15 == r11) goto L_0x0175;
    L_0x0168:
        if (r1 == 0) goto L_0x016d;
    L_0x016a:
        if (r15 == r11) goto L_0x0175;
    L_0x016c:
        goto L_0x0177;
    L_0x016d:
        r1 = new ula;	 Catch:{ all -> 0x019e }
        r2 = "Parsed audio track but could not extract one";
        r1.<init>(r2);	 Catch:{ all -> 0x019e }
        throw r1;	 Catch:{ all -> 0x019e }
    L_0x0175:
        if (r1 != 0) goto L_0x0196;
    L_0x0177:
        r3.b(r14);	 Catch:{ IllegalArgumentException -> 0x017b }
        goto L_0x01a6;
    L_0x017b:
        r0 = move-exception;
        r1 = r0;
        r2 = new ula;	 Catch:{ all -> 0x019e }
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x019e }
        r6 = 48;
        r5.<init>(r6);	 Catch:{ all -> 0x019e }
        r6 = "MediaExtractor could not find track: ";
        r5.append(r6);	 Catch:{ all -> 0x019e }
        r5.append(r14);	 Catch:{ all -> 0x019e }
        r5 = r5.toString();	 Catch:{ all -> 0x019e }
        r2.<init>(r5, r1);	 Catch:{ all -> 0x019e }
        throw r2;	 Catch:{ all -> 0x019e }
    L_0x0196:
        r1 = new ula;	 Catch:{ all -> 0x019e }
        r2 = "Extracted audio track but did not parse one";
        r1.<init>(r2);	 Catch:{ all -> 0x019e }
        throw r1;	 Catch:{ all -> 0x019e }
    L_0x019e:
        r0 = move-exception;
        r1 = r0;
        r39 = r3;
        r38 = r4;
        goto L_0x04e1;
    L_0x01a6:
        r1 = r6.get(r14);	 Catch:{ all -> 0x04db }
        r1 = (defpackage.ckg) r1;	 Catch:{ all -> 0x04db }
        r2 = defpackage.uku.a(r1);	 Catch:{ all -> 0x04db }
        if (r2 == 0) goto L_0x04cd;
    L_0x01b2:
        r2 = defpackage.uku.b(r1);	 Catch:{ all -> 0x04db }
        if (r2 == 0) goto L_0x04c1;
    L_0x01b8:
        r2 = defpackage.uku.e(r1);	 Catch:{ all -> 0x04db }
        if (r2 == 0) goto L_0x04b5;
    L_0x01be:
        r2 = defpackage.uku.d(r1);	 Catch:{ all -> 0x04db }
        if (r2 == 0) goto L_0x04a9;
    L_0x01c4:
        r2 = r1.h();	 Catch:{ all -> 0x04db }
        r5 = r2.a();	 Catch:{ all -> 0x04db }
        r5 = r5.a();	 Catch:{ all -> 0x04db }
        r6 = r2.g();	 Catch:{ all -> 0x04db }
        r8 = r6.c;	 Catch:{ all -> 0x04db }
        r2 = r2.g();	 Catch:{ all -> 0x04db }
        r12 = r2.d;	 Catch:{ all -> 0x04db }
        r14 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r12 = r12 * r14;
        r12 = r12 / r8;
        r7.g = r12;	 Catch:{ all -> 0x04db }
        r1 = r1.a();	 Catch:{ all -> 0x04db }
        r12 = r1.f;	 Catch:{ all -> 0x04db }
        r2 = (int) r12;	 Catch:{ all -> 0x04db }
        r12 = r1.g;	 Catch:{ all -> 0x04db }
        r6 = (int) r12;	 Catch:{ all -> 0x04db }
        if (r2 <= 0) goto L_0x049d;
    L_0x01f0:
        if (r6 <= 0) goto L_0x049d;
    L_0x01f2:
        r7.d = r2;	 Catch:{ all -> 0x04db }
        r7.e = r6;	 Catch:{ all -> 0x04db }
        r1 = r1.e;	 Catch:{ all -> 0x04db }
        r2 = new banj;	 Catch:{ all -> 0x04db }
        r12 = r1.d;	 Catch:{ all -> 0x04db }
        r14 = r1.e;	 Catch:{ all -> 0x04db }
        r10 = r1.f;	 Catch:{ all -> 0x04db }
        r37 = r7;
        r6 = r1.g;	 Catch:{ all -> 0x04db }
        r39 = r3;
        r38 = r4;
        r3 = r1.a;	 Catch:{ all -> 0x04d9 }
        r40 = r8;
        r8 = r1.b;	 Catch:{ all -> 0x04d9 }
        r29 = r8;
        r8 = r1.c;	 Catch:{ all -> 0x04d9 }
        r33 = 0;
        r35 = 0;
        r18 = r2;
        r19 = r12;
        r21 = r14;
        r23 = r10;
        r25 = r6;
        r27 = r3;
        r31 = r8;
        r18.<init>(r19, r21, r23, r25, r27, r29, r31, r33, r35);	 Catch:{ all -> 0x04d9 }
        r3 = defpackage.banj.h;	 Catch:{ all -> 0x04d9 }
        r3 = defpackage.uhv.a(r2, r3);	 Catch:{ all -> 0x04d9 }
        if (r3 != 0) goto L_0x0271;
    L_0x022f:
        r3 = defpackage.banj.i;	 Catch:{ all -> 0x04d9 }
        r3 = defpackage.uhv.a(r2, r3);	 Catch:{ all -> 0x04d9 }
        if (r3 != 0) goto L_0x026c;
    L_0x0237:
        r3 = defpackage.banj.j;	 Catch:{ all -> 0x04d9 }
        r3 = defpackage.uhv.a(r2, r3);	 Catch:{ all -> 0x04d9 }
        if (r3 != 0) goto L_0x0269;
    L_0x023f:
        r3 = defpackage.banj.k;	 Catch:{ all -> 0x04d9 }
        r2 = defpackage.uhv.a(r2, r3);	 Catch:{ all -> 0x04d9 }
        if (r2 != 0) goto L_0x0266;
    L_0x0247:
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x04d9 }
        r2 = r1.length();	 Catch:{ all -> 0x04d9 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x04d9 }
        r2 = r2 + 58;
        r3.<init>(r2);	 Catch:{ all -> 0x04d9 }
        r2 = "track contains rotation matrix other than simple rotation ";
        r3.append(r2);	 Catch:{ all -> 0x04d9 }
        r3.append(r1);	 Catch:{ all -> 0x04d9 }
        r1 = r3.toString();	 Catch:{ all -> 0x04d9 }
        defpackage.ujo.b(r1);	 Catch:{ all -> 0x04d9 }
        goto L_0x0271;
    L_0x0266:
        r12 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        goto L_0x026e;
    L_0x0269:
        r12 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        goto L_0x026e;
    L_0x026c:
        r12 = 90;
    L_0x026e:
        r1 = r37;
        goto L_0x0274;
    L_0x0271:
        r1 = r37;
        r12 = 0;
    L_0x0274:
        r1.f = r12;	 Catch:{ all -> 0x04d9 }
        r2 = r5.k();	 Catch:{ all -> 0x04d9 }
        if (r2 == 0) goto L_0x0298;
    L_0x027c:
        r2 = r5.k();	 Catch:{ all -> 0x04d9 }
        r2 = r2.a;	 Catch:{ all -> 0x04d9 }
        r2 = r2.iterator();	 Catch:{ all -> 0x04d9 }
    L_0x0286:
        r3 = r2.hasNext();	 Catch:{ all -> 0x04d9 }
        if (r3 == 0) goto L_0x0298;
    L_0x028c:
        r3 = r2.next();	 Catch:{ all -> 0x04d9 }
        r3 = (defpackage.ciw) r3;	 Catch:{ all -> 0x04d9 }
        r3 = r3.b;	 Catch:{ all -> 0x04d9 }
        if (r3 == 0) goto L_0x0286;
    L_0x0296:
        r2 = 1;
        goto L_0x0299;
    L_0x0298:
        r2 = 0;
    L_0x0299:
        r1.j = r2;	 Catch:{ all -> 0x04d9 }
        r3 = r5.i();	 Catch:{ all -> 0x04d9 }
        r3 = r3.a;	 Catch:{ all -> 0x04d9 }
        r4 = r3.iterator();	 Catch:{ all -> 0x04d9 }
        r6 = 0;
    L_0x02a6:
        r7 = r4.hasNext();	 Catch:{ all -> 0x04d9 }
        r8 = 0;
        if (r7 == 0) goto L_0x02c6;
    L_0x02ae:
        r7 = r4.next();	 Catch:{ all -> 0x04d9 }
        r7 = (defpackage.ckd) r7;	 Catch:{ all -> 0x04d9 }
        r10 = r7.a;	 Catch:{ all -> 0x04d9 }
        r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1));
        if (r7 < 0) goto L_0x02be;
    L_0x02ba:
        r6 = (long) r6;	 Catch:{ all -> 0x04d9 }
        r6 = r6 + r10;
        r6 = (int) r6;	 Catch:{ all -> 0x04d9 }
        goto L_0x02a6;
    L_0x02be:
        r1 = new ula;	 Catch:{ all -> 0x04d9 }
        r2 = "Frame time getCount < 0";
        r1.<init>(r2);	 Catch:{ all -> 0x04d9 }
        throw r1;	 Catch:{ all -> 0x04d9 }
    L_0x02c6:
        if (r6 <= 0) goto L_0x0495;
    L_0x02c8:
        r4 = r5.j();	 Catch:{ all -> 0x04d9 }
        if (r4 != 0) goto L_0x02d1;
    L_0x02ce:
        r4 = 0;
        r10 = -1;
        goto L_0x02e1;
    L_0x02d1:
        r4 = r4.a;	 Catch:{ all -> 0x04d9 }
        if (r4 == 0) goto L_0x048d;
    L_0x02d5:
        r7 = r4.length;	 Catch:{ all -> 0x04d9 }
        if (r7 == 0) goto L_0x048d;
    L_0x02d8:
        r10 = -1;
        r7 = r7 + r10;
        r11 = r4[r7];	 Catch:{ all -> 0x04d9 }
        r13 = (long) r6;	 Catch:{ all -> 0x04d9 }
        r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1));
        if (r7 > 0) goto L_0x0485;
    L_0x02e1:
        r5 = r5.k();	 Catch:{ all -> 0x04d9 }
        if (r5 != 0) goto L_0x02ea;
    L_0x02e7:
        r5 = 0;
        r12 = 0;
        goto L_0x0310;
    L_0x02ea:
        r5 = r5.a;	 Catch:{ all -> 0x04d9 }
        r7 = r5.iterator();	 Catch:{ all -> 0x04d9 }
        r12 = 0;
    L_0x02f1:
        r11 = r7.hasNext();	 Catch:{ all -> 0x04d9 }
        if (r11 == 0) goto L_0x0310;
    L_0x02f7:
        r11 = r7.next();	 Catch:{ all -> 0x04d9 }
        r11 = (defpackage.ciw) r11;	 Catch:{ all -> 0x04d9 }
        r11 = r11.a;	 Catch:{ all -> 0x04d9 }
        r13 = (long) r11;	 Catch:{ all -> 0x04d9 }
        r11 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1));
        if (r11 < 0) goto L_0x0308;
    L_0x0304:
        r11 = (long) r12;	 Catch:{ all -> 0x04d9 }
        r11 = r11 + r13;
        r12 = (int) r11;	 Catch:{ all -> 0x04d9 }
        goto L_0x02f1;
    L_0x0308:
        r1 = new ula;	 Catch:{ all -> 0x04d9 }
        r2 = "CTTS getCount < 0";
        r1.<init>(r2);	 Catch:{ all -> 0x04d9 }
        throw r1;	 Catch:{ all -> 0x04d9 }
    L_0x0310:
        if (r12 == 0) goto L_0x031d;
    L_0x0312:
        if (r12 != r6) goto L_0x0315;
    L_0x0314:
        goto L_0x031d;
    L_0x0315:
        r1 = new ula;	 Catch:{ all -> 0x04d9 }
        r2 = "Frame count != CTTS count";
        r1.<init>(r2);	 Catch:{ all -> 0x04d9 }
        throw r1;	 Catch:{ all -> 0x04d9 }
    L_0x031d:
        if (r4 == 0) goto L_0x0326;
    L_0x031f:
        r7 = new ukt;	 Catch:{ all -> 0x04d9 }
        r11 = r4.length;	 Catch:{ all -> 0x04d9 }
        r7.<init>(r6, r11);	 Catch:{ all -> 0x04d9 }
        goto L_0x032b;
    L_0x0326:
        r7 = new ukt;	 Catch:{ all -> 0x04d9 }
        r7.<init>(r6);	 Catch:{ all -> 0x04d9 }
    L_0x032b:
        r6 = r7.a;	 Catch:{ all -> 0x04d9 }
        r11 = r7.b;	 Catch:{ all -> 0x04d9 }
        if (r5 == 0) goto L_0x033e;
    L_0x0331:
        r12 = r5.size();	 Catch:{ all -> 0x04d9 }
        if (r12 <= 0) goto L_0x033e;
    L_0x0337:
        r5 = r5.iterator();	 Catch:{ all -> 0x04d9 }
        r17 = r5;
        goto L_0x0340;
    L_0x033e:
        r17 = 0;
    L_0x0340:
        r3 = r3.iterator();	 Catch:{ all -> 0x04d9 }
        r12 = r8;
        r14 = r12;
        r18 = r14;
        r20 = r18;
        r5 = 0;
    L_0x034b:
        r22 = r3.hasNext();	 Catch:{ all -> 0x04d9 }
        if (r22 == 0) goto L_0x0445;
    L_0x0351:
        r22 = r3.next();	 Catch:{ all -> 0x04d9 }
        r8 = r22;
        r8 = (defpackage.ckd) r8;	 Catch:{ all -> 0x04d9 }
        r22 = r10;
        r9 = r8.b;	 Catch:{ all -> 0x04d9 }
        r23 = 0;
        r25 = (r9 > r23 ? 1 : (r9 == r23 ? 0 : -1));
        if (r25 < 0) goto L_0x043d;
    L_0x0363:
        r25 = r12;
        r12 = r8.a;	 Catch:{ all -> 0x04d9 }
    L_0x0367:
        r8 = (r12 > r23 ? 1 : (r12 == r23 ? 0 : -1));
        if (r8 <= 0) goto L_0x0430;
    L_0x036b:
        if (r17 != 0) goto L_0x0370;
    L_0x036d:
        r27 = r25;
        goto L_0x0395;
    L_0x0370:
        r8 = (r14 > r23 ? 1 : (r14 == r23 ? 0 : -1));
        if (r8 > 0) goto L_0x038b;
    L_0x0374:
        r8 = r17.next();	 Catch:{ all -> 0x04d9 }
        r8 = (defpackage.ciw) r8;	 Catch:{ all -> 0x04d9 }
        r14 = r8.a;	 Catch:{ all -> 0x04d9 }
        r14 = (long) r14;	 Catch:{ all -> 0x04d9 }
        r8 = r8.b;	 Catch:{ all -> 0x04d9 }
        r18 = r14;
        r14 = (long) r8;	 Catch:{ all -> 0x04d9 }
        r23 = 0;
        r42 = r14;
        r14 = r18;
        r18 = r42;
        goto L_0x0370;
    L_0x038b:
        if (r5 != 0) goto L_0x038f;
    L_0x038d:
        r20 = r18;
    L_0x038f:
        r27 = r25 + r18;
        r27 = r27 - r20;
        r23 = 0;
    L_0x0395:
        r8 = (r27 > r23 ? 1 : (r27 == r23 ? 0 : -1));
        if (r8 < 0) goto L_0x0428;
    L_0x0399:
        r29 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r27 = r27 * r29;
        r27 = r27 / r40;
        r8 = r5;
    L_0x03a1:
        if (r8 <= 0) goto L_0x03bf;
    L_0x03a3:
        r44 = r3;
        r3 = r8 + -1;
        r31 = r6[r3];	 Catch:{ all -> 0x04d9 }
        r33 = (r31 > r27 ? 1 : (r31 == r27 ? 0 : -1));
        if (r33 <= 0) goto L_0x03c1;
    L_0x03ad:
        r6[r8] = r31;	 Catch:{ all -> 0x04d9 }
        if (r11 == 0) goto L_0x03bb;
    L_0x03b1:
        if (r22 < 0) goto L_0x03bb;
    L_0x03b3:
        r8 = r11[r22];	 Catch:{ all -> 0x04d9 }
        if (r3 != r8) goto L_0x03bb;
    L_0x03b7:
        r8 = r8 + 1;
        r11[r22] = r8;	 Catch:{ all -> 0x04d9 }
    L_0x03bb:
        r8 = r3;
        r3 = r44;
        goto L_0x03a1;
    L_0x03bf:
        r44 = r3;
    L_0x03c1:
        r6[r8] = r27;	 Catch:{ all -> 0x04d9 }
        if (r8 <= 0) goto L_0x03e1;
    L_0x03c5:
        r3 = r8 + -1;
        r31 = r6[r3];	 Catch:{ all -> 0x04d9 }
        r3 = (r31 > r27 ? 1 : (r31 == r27 ? 0 : -1));
        if (r3 == 0) goto L_0x03ce;
    L_0x03cd:
        goto L_0x03e1;
    L_0x03ce:
        r3 = 1;
        if (r8 != r3) goto L_0x03d9;
    L_0x03d1:
        r1 = new ula;	 Catch:{ all -> 0x04d9 }
        r2 = "CTTS adjusted first frame duration is 0";
        r1.<init>(r2);	 Catch:{ all -> 0x04d9 }
        throw r1;	 Catch:{ all -> 0x04d9 }
    L_0x03d9:
        r1 = new ula;	 Catch:{ all -> 0x04d9 }
        r2 = "CTTS adjusted non-final frame duration is 0";
        r1.<init>(r2);	 Catch:{ all -> 0x04d9 }
        throw r1;	 Catch:{ all -> 0x04d9 }
    L_0x03e1:
        r3 = 1;
        r27 = -1;
        if (r4 == 0) goto L_0x0412;
    L_0x03e6:
        r3 = r22 + 1;
        r31 = r6;
        r6 = r4.length;	 Catch:{ all -> 0x04d9 }
        if (r3 >= r6) goto L_0x040f;
    L_0x03ed:
        r37 = r1;
        r6 = r2;
        r1 = (long) r5;	 Catch:{ all -> 0x04d9 }
        r32 = r4[r3];	 Catch:{ all -> 0x04d9 }
        r32 = r32 + r27;
        r34 = (r1 > r32 ? 1 : (r1 == r32 ? 0 : -1));
        if (r34 != 0) goto L_0x0417;
    L_0x03f9:
        r11[r3] = r8;	 Catch:{ all -> 0x04d9 }
        if (r3 <= 0) goto L_0x040c;
    L_0x03fd:
        r1 = r3 + -1;
        r1 = r11[r1];	 Catch:{ all -> 0x04d9 }
        if (r1 >= r8) goto L_0x0404;
    L_0x0403:
        goto L_0x040c;
    L_0x0404:
        r1 = new ula;	 Catch:{ all -> 0x04d9 }
        r2 = "Sync samples not strictly ascending";
        r1.<init>(r2);	 Catch:{ all -> 0x04d9 }
        throw r1;	 Catch:{ all -> 0x04d9 }
    L_0x040c:
        r22 = r3;
        goto L_0x0417;
    L_0x040f:
        r37 = r1;
        goto L_0x0416;
    L_0x0412:
        r37 = r1;
        r31 = r6;
    L_0x0416:
        r6 = r2;
    L_0x0417:
        r5 = r5 + 1;
        r25 = r25 + r9;
        r14 = r14 + r27;
        r12 = r12 + r27;
        r3 = r44;
        r2 = r6;
        r6 = r31;
        r1 = r37;
        goto L_0x0367;
    L_0x0428:
        r1 = new ula;	 Catch:{ all -> 0x04d9 }
        r2 = "Found frame with negative PTS";
        r1.<init>(r2);	 Catch:{ all -> 0x04d9 }
        throw r1;	 Catch:{ all -> 0x04d9 }
    L_0x0430:
        r31 = r6;
        r29 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r10 = r22;
        r8 = r23;
        r12 = r25;
        goto L_0x034b;
    L_0x043d:
        r1 = new ula;	 Catch:{ all -> 0x04d9 }
        r2 = "Frame time getDelta < 0";
        r1.<init>(r2);	 Catch:{ all -> 0x04d9 }
        throw r1;	 Catch:{ all -> 0x04d9 }
    L_0x0445:
        r37 = r1;
        r6 = r2;
        r1 = r7.a;	 Catch:{ all -> 0x04d9 }
        r2 = r37;
        r2.h = r1;	 Catch:{ all -> 0x04d9 }
        r1 = r7.b;	 Catch:{ all -> 0x04d9 }
        if (r6 == 0) goto L_0x045d;
    L_0x0452:
        if (r1 == 0) goto L_0x0455;
    L_0x0454:
        goto L_0x045d;
    L_0x0455:
        r1 = new ula;	 Catch:{ all -> 0x04d9 }
        r2 = "VideoTrack contains CTTS but no SyncSampleBox";
        r1.<init>(r2);	 Catch:{ all -> 0x04d9 }
        throw r1;	 Catch:{ all -> 0x04d9 }
    L_0x045d:
        if (r1 == 0) goto L_0x0478;
    L_0x045f:
        r3 = r1.length;	 Catch:{ all -> 0x04d9 }
        if (r3 <= 0) goto L_0x0470;
    L_0x0462:
        r3 = 0;
        r3 = r1[r3];	 Catch:{ all -> 0x04d9 }
        if (r3 != 0) goto L_0x0468;
    L_0x0467:
        goto L_0x0478;
    L_0x0468:
        r1 = new ula;	 Catch:{ all -> 0x04d9 }
        r2 = "First sync sample is not first frame";
        r1.<init>(r2);	 Catch:{ all -> 0x04d9 }
        throw r1;	 Catch:{ all -> 0x04d9 }
    L_0x0470:
        r1 = new ula;	 Catch:{ all -> 0x04d9 }
        r2 = "VideoTrack has no sync samples";
        r1.<init>(r2);	 Catch:{ all -> 0x04d9 }
        throw r1;	 Catch:{ all -> 0x04d9 }
    L_0x0478:
        r2.i = r1;	 Catch:{ all -> 0x04d9 }
        r39.a();	 Catch:{ RuntimeException -> 0x0528, IOException | RuntimeException -> 0x0526 }
        r1 = r2.a();	 Catch:{ RuntimeException -> 0x0528, IOException | RuntimeException -> 0x0526 }
        r38.close();
        return r1;
    L_0x0485:
        r1 = new ula;	 Catch:{ all -> 0x04d9 }
        r2 = "VideoTrack contains sync sample outside of frames";
        r1.<init>(r2);	 Catch:{ all -> 0x04d9 }
        throw r1;	 Catch:{ all -> 0x04d9 }
    L_0x048d:
        r1 = new ula;	 Catch:{ all -> 0x04d9 }
        r2 = "VideoTrack SyncSampleBox contains 0 entries";
        r1.<init>(r2);	 Catch:{ all -> 0x04d9 }
        throw r1;	 Catch:{ all -> 0x04d9 }
    L_0x0495:
        r1 = new ula;	 Catch:{ all -> 0x04d9 }
        r2 = "Frame count <= 0";
        r1.<init>(r2);	 Catch:{ all -> 0x04d9 }
        throw r1;	 Catch:{ all -> 0x04d9 }
    L_0x049d:
        r39 = r3;
        r38 = r4;
        r1 = new ula;	 Catch:{ all -> 0x04d9 }
        r2 = "VideoTrack width or height is 0";
        r1.<init>(r2);	 Catch:{ all -> 0x04d9 }
        throw r1;	 Catch:{ all -> 0x04d9 }
    L_0x04a9:
        r39 = r3;
        r38 = r4;
        r1 = new ula;	 Catch:{ all -> 0x04d9 }
        r2 = "VideoTrack missing HandlerBox";
        r1.<init>(r2);	 Catch:{ all -> 0x04d9 }
        throw r1;	 Catch:{ all -> 0x04d9 }
    L_0x04b5:
        r39 = r3;
        r38 = r4;
        r1 = new ula;	 Catch:{ all -> 0x04d9 }
        r2 = "VideoTrack missing MediaInformationBox";
        r1.<init>(r2);	 Catch:{ all -> 0x04d9 }
        throw r1;	 Catch:{ all -> 0x04d9 }
    L_0x04c1:
        r39 = r3;
        r38 = r4;
        r1 = new ula;	 Catch:{ all -> 0x04d9 }
        r2 = "VideoTrack SampleTable missing ChunkOffsetBox";
        r1.<init>(r2);	 Catch:{ all -> 0x04d9 }
        throw r1;	 Catch:{ all -> 0x04d9 }
    L_0x04cd:
        r39 = r3;
        r38 = r4;
        r1 = new ula;	 Catch:{ all -> 0x04d9 }
        r2 = "VideoTrack missing SampleTableBox";
        r1.<init>(r2);	 Catch:{ all -> 0x04d9 }
        throw r1;	 Catch:{ all -> 0x04d9 }
    L_0x04d9:
        r0 = move-exception;
        goto L_0x04e0;
    L_0x04db:
        r0 = move-exception;
        r39 = r3;
        r38 = r4;
    L_0x04e0:
        r1 = r0;
    L_0x04e1:
        r39.a();	 Catch:{ RuntimeException -> 0x0528, IOException | RuntimeException -> 0x0526 }
        throw r1;	 Catch:{ RuntimeException -> 0x0528, IOException | RuntimeException -> 0x0526 }
    L_0x04e5:
        r38 = r4;
        r1 = new ula;	 Catch:{ RuntimeException -> 0x0528, IOException | RuntimeException -> 0x0526 }
        r2 = "No video tracks found";
        r1.<init>(r2);	 Catch:{ RuntimeException -> 0x0528, IOException | RuntimeException -> 0x0526 }
        throw r1;	 Catch:{ RuntimeException -> 0x0528, IOException | RuntimeException -> 0x0526 }
    L_0x04ef:
        r38 = r4;
        r1 = new ula;	 Catch:{ RuntimeException -> 0x0528, IOException | RuntimeException -> 0x0526 }
        r2 = "No moov atom found";
        r1.<init>(r2);	 Catch:{ RuntimeException -> 0x0528, IOException | RuntimeException -> 0x0526 }
        throw r1;	 Catch:{ RuntimeException -> 0x0528, IOException | RuntimeException -> 0x0526 }
    L_0x04f9:
        r38 = r4;
        r1 = new ula;	 Catch:{ RuntimeException -> 0x0528, IOException | RuntimeException -> 0x0526 }
        r2 = java.lang.String.valueOf(r7);	 Catch:{ RuntimeException -> 0x0528, IOException | RuntimeException -> 0x0526 }
        r3 = r2.length();	 Catch:{ RuntimeException -> 0x0528, IOException | RuntimeException -> 0x0526 }
        r3 = r3 + 27;
        r4 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0528, IOException | RuntimeException -> 0x0526 }
        r4.<init>(r3);	 Catch:{ RuntimeException -> 0x0528, IOException | RuntimeException -> 0x0526 }
        r3 = "Unsupported container type ";
        r4.append(r3);	 Catch:{ RuntimeException -> 0x0528, IOException | RuntimeException -> 0x0526 }
        r4.append(r2);	 Catch:{ RuntimeException -> 0x0528, IOException | RuntimeException -> 0x0526 }
        r2 = r4.toString();	 Catch:{ RuntimeException -> 0x0528, IOException | RuntimeException -> 0x0526 }
        r1.<init>(r2);	 Catch:{ RuntimeException -> 0x0528, IOException | RuntimeException -> 0x0526 }
        throw r1;	 Catch:{ RuntimeException -> 0x0528, IOException | RuntimeException -> 0x0526 }
    L_0x051c:
        r38 = r4;
        r1 = new ula;	 Catch:{ RuntimeException -> 0x0528, IOException | RuntimeException -> 0x0526 }
        r2 = "Not an ISO-14496-12 compatible file";
        r1.<init>(r2);	 Catch:{ RuntimeException -> 0x0528, IOException | RuntimeException -> 0x0526 }
        throw r1;	 Catch:{ RuntimeException -> 0x0528, IOException | RuntimeException -> 0x0526 }
    L_0x0526:
        r0 = move-exception;
        goto L_0x0534;
    L_0x0528:
        r0 = move-exception;
        goto L_0x0534;
    L_0x052a:
        r0 = move-exception;
        r38 = r4;
    L_0x052d:
        r1 = r0;
        goto L_0x0550;
    L_0x052f:
        r0 = move-exception;
        goto L_0x0532;
    L_0x0531:
        r0 = move-exception;
    L_0x0532:
        r38 = r4;
    L_0x0534:
        r1 = r0;
    L_0x0535:
        r2 = r1 instanceof java.io.IOException;	 Catch:{ all -> 0x054e }
        if (r2 != 0) goto L_0x0541;
    L_0x0539:
        r2 = r1.getCause();	 Catch:{ all -> 0x054e }
        r2 = r2 instanceof java.io.IOException;	 Catch:{ all -> 0x054e }
        if (r2 == 0) goto L_0x054d;
    L_0x0541:
        r2 = r1 instanceof defpackage.ula;	 Catch:{ all -> 0x054e }
        if (r2 != 0) goto L_0x054d;
    L_0x0545:
        r2 = new ula;	 Catch:{ all -> 0x054e }
        r3 = "Unable to parse file";
        r2.<init>(r3, r1);	 Catch:{ all -> 0x054e }
        throw r2;	 Catch:{ all -> 0x054e }
    L_0x054d:
        throw r1;	 Catch:{ all -> 0x054e }
    L_0x054e:
        r0 = move-exception;
        goto L_0x052d;
    L_0x0550:
        r38.close();
        goto L_0x0555;
    L_0x0554:
        throw r1;
    L_0x0555:
        goto L_0x0554;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uku.a(android.content.Context, android.net.Uri, boolean):ukz");
    }

    private static boolean a(ckg ckg) {
        return ckg.g() != null;
    }

    private static boolean b(ckg ckg) {
        return uku.a(ckg) && ckg.g().h() != null;
    }

    private static boolean c(ckg ckg) {
        return ckg.h() != null;
    }

    private static boolean d(ckg ckg) {
        return uku.c(ckg) && ckg.h().h() != null;
    }

    private static boolean e(ckg ckg) {
        return uku.c(ckg) && ckg.h().a() != null;
    }

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add("vide");
        a.add("soun");
        a.add("hint");
        hashSet = new HashSet();
        b = hashSet;
        hashSet.add("mp41");
        b.add("mp42");
        b.add("3gp4");
        b.add("qt  ");
        hashSet = new HashSet();
        c = hashSet;
        hashSet.addAll(b);
        c.add("isom");
        c.add("iso2");
    }
}
