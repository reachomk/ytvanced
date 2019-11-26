package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: bbhz */
final class bbhz extends InputStream implements bate, batw {
    public anze a;
    public final anzq b;
    private ByteArrayInputStream c;

    bbhz(anze anze, anzq anzq) {
        this.a = anze;
        this.b = anzq;
    }

    public final int a(OutputStream outputStream) {
        int serializedSize;
        anze anze = this.a;
        if (anze != null) {
            serializedSize = anze.getSerializedSize();
            this.a.writeTo(outputStream);
            this.a = null;
        } else {
            ByteArrayInputStream byteArrayInputStream = this.c;
            if (byteArrayInputStream == null) {
                serializedSize = 0;
            } else {
                long a = bbic.a(byteArrayInputStream, outputStream);
                this.c = null;
                return (int) a;
            }
        }
        return serializedSize;
    }

    public final int read() {
        anze anze = this.a;
        if (anze != null) {
            this.c = new ByteArrayInputStream(anze.toByteArray());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream == null) {
            return -1;
        }
        return byteArrayInputStream.read();
    }

    public final int read(byte[] bArr, int i, int i2) {
        anze anze = this.a;
        if (anze != null) {
            int serializedSize = anze.getSerializedSize();
            if (serializedSize == 0) {
                this.a = null;
                this.c = null;
                return -1;
            } else if (i2 >= serializedSize) {
                anwm b = anwm.b(bArr, i, serializedSize);
                this.a.writeTo(b);
                b.i();
                b.j();
                this.a = null;
                this.c = null;
                return serializedSize;
            } else {
                this.c = new ByteArrayInputStream(this.a.toByteArray());
                this.a = null;
            }
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }

    public final int available() {
        anze anze = this.a;
        if (anze != null) {
            return anze.getSerializedSize();
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        return byteArrayInputStream.available();
    }
}
