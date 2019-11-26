package defpackage;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: ubl */
public final class ubl {
    public final ByteBuffer a;
    public final int b;
    public final ubs c;
    private final int[] d;
    private final ByteBuffer e;

    private ubl(ByteBuffer byteBuffer) {
        byteBuffer.rewind();
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        this.a = byteBuffer;
        this.e = byteBuffer.duplicate();
        do {
        } while (byteBuffer.get() != (byte) 0);
        int i = byteBuffer.getInt();
        this.b = i;
        uhy.b(i > 0);
        byteBuffer.getLong();
        int[] iArr = new int[12];
        iArr[2] = this.b;
        iArr[4] = 1;
        iArr[5] = 2;
        iArr[6] = 4;
        iArr[7] = 8;
        iArr[8] = 1;
        iArr[9] = 2;
        iArr[10] = 4;
        iArr[11] = 8;
        this.d = iArr;
        this.c = new ubs();
        i = this.b;
        ubo ubo = new ubo(this);
        ubo.a(137, i);
        ubo.a(255, i);
        ubo.a(139, i);
        ubo.a(144, i);
        ubo.a(138, i);
        ubo.a(5, i);
        ubo.a(7, i);
        ubo.a(140, i);
        ubo.a(141, i);
        ubo.a(1, i + i);
        int i2 = i + 8;
        ubo.a(3, i2);
        ubo.a(2, i2);
        ubo.a(8, i2);
        ubo.a(142, i2);
        i += 4;
        ubo.a(4, i);
        ubo.a(6, i);
    }

    public static boolean e(int i) {
        return i == 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033  */
    public static defpackage.ubl a(java.io.File r9) {
        /*
        r0 = 0;
        r1 = new java.io.FileInputStream;	 Catch:{ all -> 0x002a }
        r1.<init>(r9);	 Catch:{ all -> 0x002a }
        r9 = r1.getChannel();	 Catch:{ all -> 0x0028 }
        r3 = java.nio.channels.FileChannel.MapMode.READ_ONLY;	 Catch:{ all -> 0x0023 }
        r6 = r9.size();	 Catch:{ all -> 0x0023 }
        r4 = 0;
        r2 = r9;
        r0 = r2.map(r3, r4, r6);	 Catch:{ all -> 0x0023 }
        r2 = new ubl;	 Catch:{ all -> 0x0023 }
        r2.<init>(r0);	 Catch:{ all -> 0x0023 }
        r9.close();
        r1.close();
        return r2;
    L_0x0023:
        r0 = move-exception;
        r8 = r0;
        r0 = r9;
        r9 = r8;
        goto L_0x002c;
    L_0x0028:
        r9 = move-exception;
        goto L_0x002c;
    L_0x002a:
        r9 = move-exception;
        r1 = r0;
    L_0x002c:
        if (r0 == 0) goto L_0x0031;
    L_0x002e:
        r0.close();
    L_0x0031:
        if (r1 == 0) goto L_0x0036;
    L_0x0033:
        r1.close();
    L_0x0036:
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ubl.a(java.io.File):ubl");
    }

    public final String a(int i) {
        uhy.a(i >= 0);
        int i2 = this.e.getInt(i);
        int i3 = this.b;
        byte[] bArr = new byte[(i2 - i3)];
        this.e.position((i + 4) + i3);
        this.e.get(bArr);
        return new String(bArr, Charset.defaultCharset());
    }

    public final int b(int i) {
        i = this.d[i];
        uhy.b(i > 0);
        return i;
    }

    public final void c(int i) {
        uhy.a(i >= 0);
        int position = this.a.position() + i;
        if (position <= this.a.limit()) {
            this.a.position(position);
            return;
        }
        throw new BufferUnderflowException();
    }

    public final int a() {
        int i = this.b;
        if (i == 1) {
            return this.a.get();
        }
        if (i == 2) {
            return this.a.getShort();
        }
        if (i == 4) {
            return this.a.getInt();
        }
        throw new IllegalStateException();
    }

    public final int d(int i) {
        int i2 = this.b;
        if (i2 == 1) {
            return this.a.get(i);
        }
        if (i2 == 2) {
            return this.a.getShort(i);
        }
        if (i2 == 4) {
            return this.a.getInt(i);
        }
        throw new IllegalStateException();
    }
}
