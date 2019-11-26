package defpackage;

/* renamed from: athi */
final class athi implements anxx {
    public static final anxx a = new athi();

    private athi() {
    }

    public final boolean isInRange(int i) {
        if (!(i == 18 || i == 22)) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
