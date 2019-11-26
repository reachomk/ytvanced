package defpackage;

import java.io.DataInputStream;
import java.net.ProtocolException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: acil */
final class acil {
    public final DataInputStream a;

    acil(DataInputStream dataInputStream) {
        this.a = dataInputStream;
    }

    /* Access modifiers changed, original: final */
    public final double a() {
        a(0);
        return this.a.readDouble();
    }

    public final Map b() {
        HashMap hashMap = new HashMap();
        while (true) {
            String readUTF = this.a.readUTF();
            if (readUTF.length() != 0) {
                hashMap.put(readUTF, c());
            } else {
                a(9);
                return hashMap;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final Object c() {
        byte readByte = this.a.readByte();
        if (readByte == (byte) 0) {
            return Double.valueOf(this.a.readDouble());
        }
        if (readByte == (byte) 5) {
            return null;
        }
        if (readByte == (byte) 8) {
            this.a.readInt();
            return b();
        } else if (readByte == (byte) 2) {
            return this.a.readUTF();
        } else {
            if (readByte == (byte) 3) {
                return b();
            }
            StringBuilder stringBuilder = new StringBuilder(33);
            stringBuilder.append("Unsupported AMF type: ");
            stringBuilder.append(readByte);
            throw new ProtocolException(stringBuilder.toString());
        }
    }

    public final void a(int i) {
        byte readByte = this.a.readByte();
        if (readByte != i) {
            StringBuilder stringBuilder = new StringBuilder(47);
            stringBuilder.append("Expected AMF type ");
            stringBuilder.append(i);
            stringBuilder.append(", got: ");
            stringBuilder.append(readByte);
            throw new ProtocolException(stringBuilder.toString());
        }
    }
}
