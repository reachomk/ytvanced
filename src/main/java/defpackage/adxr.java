package defpackage;

/* renamed from: adxr */
public final class adxr extends Exception {
    adxr(int i) {
        String stringBuilder;
        StringBuilder stringBuilder2;
        switch (i) {
            case 1:
                stringBuilder2 = new StringBuilder(41);
                stringBuilder2.append(i);
                stringBuilder2.append(" - Network operation timed out");
                stringBuilder = stringBuilder2.toString();
                break;
            case 2:
                stringBuilder2 = new StringBuilder(27);
                stringBuilder2.append(i);
                stringBuilder2.append(" - Network error");
                stringBuilder = stringBuilder2.toString();
                break;
            case 3:
                stringBuilder2 = new StringBuilder(35);
                stringBuilder2.append(i);
                stringBuilder2.append(" - Audio recording error");
                stringBuilder = stringBuilder2.toString();
                break;
            case 4:
                stringBuilder2 = new StringBuilder(39);
                stringBuilder2.append(i);
                stringBuilder2.append(" - Server sends error status");
                stringBuilder = stringBuilder2.toString();
                break;
            case 5:
                stringBuilder2 = new StringBuilder(78);
                stringBuilder2.append(i);
                stringBuilder2.append(" - Client side error. Maybe an issue with your internet connection!");
                stringBuilder = stringBuilder2.toString();
                break;
            case 6:
                stringBuilder2 = new StringBuilder(29);
                stringBuilder2.append(i);
                stringBuilder2.append(" - No speech input");
                stringBuilder = stringBuilder2.toString();
                break;
            case 7:
                stringBuilder2 = new StringBuilder(92);
                stringBuilder2.append(i);
                stringBuilder2.append(" - No recognition result matched. Try turning on partial results as a workaround.");
                stringBuilder = stringBuilder2.toString();
                break;
            case 8:
                stringBuilder2 = new StringBuilder(37);
                stringBuilder2.append(i);
                stringBuilder2.append(" - RecognitionService busy");
                stringBuilder = stringBuilder2.toString();
                break;
            case 9:
                stringBuilder2 = new StringBuilder(79);
                stringBuilder2.append(i);
                stringBuilder2.append(" - Insufficient permissions. Request android.permission.RECORD_AUDIO");
                stringBuilder = stringBuilder2.toString();
                break;
            default:
                stringBuilder2 = new StringBuilder(31);
                stringBuilder2.append(i);
                stringBuilder2.append(" - Unknown exception");
                stringBuilder = stringBuilder2.toString();
                break;
        }
        super(stringBuilder);
    }
}
