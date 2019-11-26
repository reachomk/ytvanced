package defpackage;

import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* renamed from: azyg */
public final class azyg {
    public final azyf a;
    public final String b;
    public final int c;

    /* JADX WARNING: Missing block: B:15:?, code skipped:
            defpackage.azyg.a(r5, r1);
     */
    public azyg(java.lang.String r4, int r5) {
        /*
        r3 = this;
        r3.<init>();
        r0 = 2;
        r0 = new byte[r0];
        r1 = new java.io.RandomAccessFile;	 Catch:{ IOException -> 0x0029, IOException | IllegalArgumentException -> 0x0027 }
        r2 = "r";
        r1.<init>(r4, r2);	 Catch:{ IOException -> 0x0029, IOException | IllegalArgumentException -> 0x0027 }
        r1.readFully(r0);	 Catch:{ all -> 0x0020 }
        r2 = new azyf;	 Catch:{ all -> 0x0020 }
        r2.<init>(r0);	 Catch:{ all -> 0x0020 }
        r3.a = r2;	 Catch:{ all -> 0x0020 }
        r0 = 0;
        defpackage.azyg.a(r0, r1);	 Catch:{ IOException -> 0x0029, IOException | IllegalArgumentException -> 0x0027 }
        r3.b = r4;
        r3.c = r5;
        return;
    L_0x0020:
        r5 = move-exception;
        throw r5;	 Catch:{ all -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        defpackage.azyg.a(r5, r1);	 Catch:{ IOException -> 0x0029, IOException | IllegalArgumentException -> 0x0027 }
        throw r0;	 Catch:{ IOException -> 0x0029, IOException | IllegalArgumentException -> 0x0027 }
    L_0x0027:
        r5 = move-exception;
        goto L_0x002a;
    L_0x0029:
        r5 = move-exception;
    L_0x002a:
        r0 = new java.io.IOException;
        r4 = java.lang.String.valueOf(r4);
        r1 = "Wrong index file: ";
        r2 = r4.length();
        if (r2 != 0) goto L_0x003e;
    L_0x0038:
        r4 = new java.lang.String;
        r4.<init>(r1);
        goto L_0x0042;
    L_0x003e:
        r4 = r1.concat(r4);
    L_0x0042:
        r0.<init>(r4, r5);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azyg.<init>(java.lang.String, int):void");
    }

    public static int a(int i, RandomAccessFile randomAccessFile) {
        byte[] bArr = new byte[i];
        randomAccessFile.readFully(bArr);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 |= (bArr[i3] & 255) << (i3 << 3);
        }
        return i2;
    }

    public static String a(RandomAccessFile randomAccessFile) {
        int readByte = randomAccessFile.readByte() & 255;
        if (readByte == 0) {
            return null;
        }
        byte[] bArr = new byte[readByte];
        randomAccessFile.readFully(bArr);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public final void a(ArrayList arrayList, azyj azyj) {
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                size = 0;
                break;
            }
        } while (((azyj) arrayList.get(size)).c < azyj.c);
        size++;
        arrayList.add(size, azyj);
        if (arrayList.size() > this.c) {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    static {
        " ".codePointAt(0);
    }
}
