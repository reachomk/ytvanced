package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

/* renamed from: barl */
public class barl {
    public static final Charset a = Charset.forName("UTF-8");
    public barn b;
    public boolean c;
    public byte[] d;
    public byte[] e;
    public transient int f;
    private transient String g;

    private static String a(byte[] bArr) {
        return new String(bArr, a);
    }

    private static int a(int i) {
        if (i >= 0) {
            return i;
        }
        throw new EOFException();
    }

    public static barl a(InputStream inputStream) {
        int i;
        byte a = (byte) barl.a(inputStream.read());
        int i2 = 0;
        boolean z = (a & 128) != 0;
        byte b = a & 15;
        for (barn barn : barn.values()) {
            if (barn.g == b) {
                break;
            }
        }
        barn barn2 = null;
        int i3 = a & 112;
        StringBuilder stringBuilder;
        if (i3 != 0) {
            String valueOf = String.valueOf(Integer.toBinaryString(i3));
            stringBuilder = new StringBuilder(valueOf.length() + 31);
            stringBuilder.append("The reserved bits (");
            stringBuilder.append(valueOf);
            stringBuilder.append(") must be 0.");
            throw new barm(1002, stringBuilder.toString());
        } else if (barn2 == null) {
            stringBuilder = new StringBuilder(56);
            stringBuilder.append("Received frame with reserved/unknown opcode ");
            stringBuilder.append(b);
            stringBuilder.append(".");
            throw new barm(1002, stringBuilder.toString());
        } else if (barn2.a() && !z) {
            throw new barm(1002, "Fragmented control frame.");
        } else {
            barl barl = new barl(barn2, z);
            byte a2 = (byte) barl.a(inputStream.read());
            i = a2 & 128;
            int i4 = a2 & 127;
            barl.f = i4;
            if (i4 == 126) {
                char a3 = (char) ((barl.a(inputStream.read()) << 8) | barl.a(inputStream.read()));
                barl.f = a3;
                if (a3 < '~') {
                    throw new barm(1002, "Invalid data frame 2byte length. (not using minimal length encoding)");
                }
            } else if (i4 == 127) {
                long a4 = (((((((((long) barl.a(inputStream.read())) << 56) | (((long) barl.a(inputStream.read())) << 48)) | (((long) barl.a(inputStream.read())) << 40)) | (((long) barl.a(inputStream.read())) << 32)) | ((long) (barl.a(inputStream.read()) << 24))) | ((long) (barl.a(inputStream.read()) << 16))) | ((long) (barl.a(inputStream.read()) << 8))) | ((long) barl.a(inputStream.read()));
                if (a4 < 65536) {
                    throw new barm(1002, "Invalid data frame 4byte length. (not using minimal length encoding)");
                } else if (a4 < 0 || a4 > 2147483647L) {
                    throw new barm(1009, "Max frame length has been exceeded.");
                } else {
                    barl.f = (int) a4;
                }
            }
            if (barl.b.a()) {
                if (barl.f > 125) {
                    throw new barm(1002, "Control frame with payload length > 125 bytes.");
                } else if (barl.b == barn.Close && barl.f == 1) {
                    throw new barm(1002, "Received close frame with payload len 1.");
                }
            }
            if (i != 0) {
                barl.d = new byte[4];
                i3 = 0;
                while (true) {
                    byte[] bArr = barl.d;
                    int length = bArr.length;
                    if (i3 >= length) {
                        break;
                    }
                    i3 += barl.a(inputStream.read(bArr, i3, length - i3));
                }
            }
            barl.e = new byte[barl.f];
            i3 = 0;
            while (true) {
                i4 = barl.f;
                if (i3 >= i4) {
                    break;
                }
                i3 += barl.a(inputStream.read(barl.e, i3, i4 - i3));
            }
            if (barl.b()) {
                while (true) {
                    byte[] bArr2 = barl.e;
                    if (i2 >= bArr2.length) {
                        break;
                    }
                    bArr2[i2] = (byte) (bArr2[i2] ^ barl.d[i2 % 4]);
                    i2++;
                }
            }
            if (barl.b == barn.Text) {
                barl.g = barl.a(barl.e);
            }
            return barl.b == barn.Close ? new baro(barl) : barl;
        }
    }

    public static byte[] a(String str) {
        return str.getBytes(a);
    }

    private barl(barn barn, boolean z) {
        this.b = barn;
        this.c = z;
    }

    public barl(barn barn, byte[] bArr) {
        this(barn, true);
        c(null);
        b(bArr);
    }

    public barl(barn barn, String str) {
        this(barn, true);
        c(null);
        this.e = barl.a(str);
        this.f = str.length();
        this.g = str;
    }

    public barl(barn barn, List list) {
        this.b = barn;
        this.c = true;
        long j = 0;
        for (barl barl : list) {
            j += (long) barl.e.length;
        }
        if (j < 0 || j > 2147483647L) {
            throw new barm(1009, "Max frame length has been exceeded.");
        }
        int i = (int) j;
        this.f = i;
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (barl barl2 : list) {
            byte[] bArr2 = barl2.e;
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += barl2.e.length;
        }
        b(bArr);
    }

    public barl(barl barl) {
        this.b = barl.b;
        this.c = barl.c;
        b(barl.e);
        c(barl.d);
    }

    public final String a() {
        if (this.g == null) {
            try {
                this.g = barl.a(this.e);
            } catch (CharacterCodingException e) {
                throw new RuntimeException("Undetected CharacterCodingException", e);
            }
        }
        return this.g;
    }

    public final boolean b() {
        byte[] bArr = this.d;
        return bArr != null && bArr.length == 4;
    }

    private final void b(byte[] bArr) {
        this.e = bArr;
        this.f = bArr.length;
        this.g = null;
    }

    private final void c(byte[] bArr) {
        if (bArr == null || bArr.length == 4) {
            this.d = bArr;
            return;
        }
        String valueOf = String.valueOf(Arrays.toString(bArr));
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 27);
        stringBuilder.append("MaskingKey ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" hasn't length 4");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("WS[");
        stringBuilder.append(this.b);
        String str = ", ";
        stringBuilder.append(str);
        stringBuilder.append(!this.c ? "inter" : "fin");
        stringBuilder.append(str);
        stringBuilder.append(!b() ? "unmasked" : "masked");
        stringBuilder.append(str);
        if (this.e == null) {
            str = "null";
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append('[');
            stringBuilder2.append(this.e.length);
            stringBuilder2.append("b] ");
            String str2 = "...";
            int i = 0;
            if (this.b == barn.Text) {
                String a = a();
                if (a.length() > 100) {
                    stringBuilder2.append(a.substring(0, 100));
                    stringBuilder2.append(str2);
                } else {
                    stringBuilder2.append(a);
                }
            } else {
                stringBuilder2.append("0x");
                while (i < Math.min(this.e.length, 50)) {
                    stringBuilder2.append(Integer.toHexString(this.e[i] & 255));
                    i++;
                }
                if (this.e.length > 50) {
                    stringBuilder2.append(str2);
                }
            }
            str = stringBuilder2.toString();
        }
        stringBuilder.append(str);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
