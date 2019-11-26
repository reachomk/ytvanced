package defpackage;

/* renamed from: albd */
final class albd extends RuntimeException {
    albd(int i) {
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Unrecognized theme type ");
        stringBuilder.append(i);
        super(stringBuilder.toString());
    }
}
