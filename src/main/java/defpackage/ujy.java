package defpackage;

/* renamed from: ujy */
public enum ujy {
    MONO(1),
    STEREO(2);
    
    public final int a;

    private ujy(int i) {
        this.a = i;
    }

    public final boolean a() {
        return this == STEREO;
    }

    public static ujy a(int i) {
        if (i == 1) {
            return MONO;
        }
        if (i == 2) {
            return STEREO;
        }
        StringBuilder stringBuilder = new StringBuilder(34);
        stringBuilder.append("Invalid channel count: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
