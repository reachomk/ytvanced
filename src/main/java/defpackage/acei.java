package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/* renamed from: acei */
public final class acei {
    public static anze a(ObjectInputStream objectInputStream, anze anze, Class cls) {
        anze anze2;
        int readInt = objectInputStream.readInt();
        if (readInt > 0) {
            try {
                byte[] bArr = new byte[readInt];
                objectInputStream.readFully(bArr);
                anze2 = (anze) cls.cast(anze.toBuilder().mergeFrom(bArr, anxa.c()).build());
            } catch (anyg e) {
                throw new IllegalArgumentException(e);
            }
        } else if (readInt == 0) {
            return anze;
        } else {
            anze2 = null;
        }
        return anze2;
    }

    public static void a(ObjectOutputStream objectOutputStream, anze anze) {
        int serializedSize = anze != null ? anze.getSerializedSize() : -1;
        objectOutputStream.writeInt(serializedSize);
        if (serializedSize > 0) {
            anze.writeTo((OutputStream) objectOutputStream);
        }
    }
}
