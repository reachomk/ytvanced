package defpackage;

import android.os.Parcel;

/* renamed from: bahs */
public abstract class bahs extends dhx implements baht {
    public bahs() {
        super("com.google.vr.vrcore.common.api.IDaydreamListener");
    }

    /* Access modifiers changed, original: protected */
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                i = getTargetApiVersion();
                parcel2.writeNoException();
                parcel2.writeInt(i);
                break;
            case 2:
                bahr requestStopTracking = requestStopTracking();
                parcel2.writeNoException();
                dhw.b(parcel2, requestStopTracking);
                break;
            case 3:
                applyFade(parcel.readInt(), parcel.readLong());
                break;
            case 4:
                recenterHeadTracking();
                break;
            case 5:
                dumpDebugData();
                break;
            case 6:
                resumeHeadTracking((bahr) dhw.a(parcel, bahr.CREATOR));
                break;
            case 7:
                invokeCloseAction();
                break;
            case 8:
                deprecated_setLensOffsets(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
                break;
            case 9:
                setLensOffset(parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
                break;
            case 10:
                applyColorfulFade(parcel.readInt(), parcel.readLong(), parcel.readInt());
                break;
            default:
                return false;
        }
        return true;
    }
}
