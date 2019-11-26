package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

/* renamed from: bamo */
public final class bamo extends bamr {
    private boolean a;
    private byte b;
    private UUID c;

    public final String a() {
        return "seig";
    }

    public final void a(ByteBuffer byteBuffer) {
        boolean z = true;
        if (cio.b(byteBuffer) != 1) {
            z = false;
        }
        this.a = z;
        this.b = (byte) cio.d(byteBuffer);
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        byteBuffer = ByteBuffer.wrap(bArr);
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        this.c = new UUID(byteBuffer.getLong(), byteBuffer.getLong());
    }

    public final ByteBuffer b() {
        ByteBuffer allocate = ByteBuffer.allocate(20);
        cin.a(allocate, this.a);
        if (this.a) {
            int i;
            cin.c(allocate, this.b);
            UUID uuid = this.c;
            long mostSignificantBits = uuid.getMostSignificantBits();
            long leastSignificantBits = uuid.getLeastSignificantBits();
            byte[] bArr = new byte[16];
            int i2 = 0;
            while (true) {
                i = 8;
                if (i2 >= 8) {
                    break;
                }
                bArr[i2] = (byte) ((int) (mostSignificantBits >>> ((7 - i2) << 3)));
                i2++;
            }
            while (i < 16) {
                bArr[i] = (byte) ((int) (leastSignificantBits >>> ((7 - i) << 3)));
                i++;
            }
            allocate.put(bArr);
        } else {
            allocate.put(new byte[17]);
        }
        allocate.rewind();
        return allocate;
    }

    public final String toString() {
        boolean z = this.a;
        byte b = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 79);
        stringBuilder.append("CencSampleEncryptionInformationGroupEntry{isEncrypted=");
        stringBuilder.append(z);
        stringBuilder.append(", ivSize=");
        stringBuilder.append(b);
        stringBuilder.append(", kid=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bamo bamo = (bamo) obj;
            if (this.a == bamo.a && this.b == bamo.b) {
                UUID uuid = this.c;
                UUID uuid2 = bamo.c;
                return uuid == null ? uuid2 == null : uuid.equals(uuid2);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((!this.a ? 19 : 7) * 31) + this.b) * 31;
        UUID uuid = this.c;
        return i + (uuid != null ? uuid.hashCode() : 0);
    }
}
