package defpackage;

/* renamed from: qor */
public final class qor {
    public static int a(int i) {
        if (i >= 0 && i <= 2) {
            return i;
        }
        if (i >= 1000 && i <= 1000) {
            return 1000;
        }
        StringBuilder stringBuilder = new StringBuilder(43);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum EnumBoolean");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static int b(int i) {
        if (i >= 0 && i <= 2) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(41);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum ProtoName");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static int c(int i) {
        if (i >= 0 && i <= 3) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(48);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum EncryptionMethod");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
