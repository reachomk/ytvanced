package defpackage;

/* renamed from: attm */
final class attm implements anxx {
    public static final anxx a = new attm();

    private attm() {
    }

    public final boolean isInRange(int i) {
        return i == 0 || i == 1 || i == 2 || i == 4 || i == 8 || i == 16 || i == 32 || i == 64 || i == 128 || i == 256 || i == 512 || i == 1024 || i == 2048;
    }
}
