package defpackage;

/* renamed from: bahp */
public final class bahp extends Exception {
    public bahp(int i) {
        String str;
        switch (i) {
            case 0:
                str = "VR Service present";
                break;
            case 1:
                str = "VR Service missing";
                break;
            case 2:
                str = "VR Service disabled";
                break;
            case 3:
                str = "VR Service updating";
                break;
            case 4:
                str = "VR Service obsolete";
                break;
            case 5:
                str = "VR Service not connected";
                break;
            case 6:
                str = "No permission to do operation";
                break;
            case 7:
                str = "This operation is not supported on this device";
                break;
            case 8:
                str = "An unknown failure occurred";
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder(38);
                stringBuilder.append("Invalid connection result: ");
                stringBuilder.append(i);
                str = stringBuilder.toString();
                break;
        }
        super(str);
    }
}
