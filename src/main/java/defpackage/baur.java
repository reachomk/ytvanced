package defpackage;

import java.util.BitSet;
import java.util.Locale;

/* renamed from: baur */
public abstract class baur {
    private static final BitSet c;
    public final String a;
    public final byte[] b;
    private final String d;

    public static baur a(String str, baus baus) {
        return new baup(str, baus);
    }

    public abstract Object a(byte[] bArr);

    public abstract byte[] a(Object obj);

    public static baur a(String str, bauq bauq) {
        return new baun(str, bauq);
    }

    static baur a(String str, boolean z, baut baut) {
        return new bauu(str, z, baut);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((baur) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 12);
        stringBuilder.append("Key{name='");
        stringBuilder.append(str);
        stringBuilder.append("'}");
        return stringBuilder.toString();
    }

    /* synthetic */ baur(String str, boolean z) {
        Object obj = "name";
        this.d = (String) amqw.a((Object) str, obj);
        Object toLowerCase = this.d.toLowerCase(Locale.ROOT);
        amqw.a(toLowerCase, obj);
        amqw.a(toLowerCase.isEmpty() ^ 1, (Object) "token must have at least 1 tchar");
        int i = 0;
        while (i < toLowerCase.length()) {
            char charAt = toLowerCase.charAt(i);
            if ((z && charAt == ':' && i == 0) || c.get(charAt)) {
                i++;
            } else {
                throw new IllegalArgumentException(amrl.a("Invalid character '%s' in key name '%s'", Character.valueOf(charAt), toLowerCase));
            }
        }
        this.a = toLowerCase;
        this.b = this.a.getBytes(ampv.a);
    }

    static {
        int i;
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (i = 48; i <= 57; i = (char) (i + 1)) {
            bitSet.set(i);
        }
        for (i = 97; i <= afy.av; i = (char) (i + 1)) {
            bitSet.set(i);
        }
        c = bitSet;
    }
}
