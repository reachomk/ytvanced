package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* renamed from: aklm */
public final class aklm implements bsp {
    private final bwb a;

    public aklm(bwb bwb) {
        this.a = bwb;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, bsq bsq) {
        return true;
    }

    public final /* synthetic */ bvw a(Object obj, int i, int i2, bsq bsq) {
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Object obj2 = (byte[]) this.a.a(65536, byte[].class);
        while (true) {
            int read = inputStream.read(obj2, 0, obj2.length);
            if (read != -1) {
                byteArrayOutputStream.write(obj2, 0, read);
            } else {
                byteArrayOutputStream.flush();
                this.a.a(obj2);
                return new cdg(byteArrayOutputStream.toByteArray());
            }
        }
    }
}
