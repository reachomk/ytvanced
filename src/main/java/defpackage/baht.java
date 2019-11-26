package defpackage;

import android.os.IInterface;

/* renamed from: baht */
public interface baht extends IInterface {
    void applyColorfulFade(int i, long j, int i2);

    void applyFade(int i, long j);

    void deprecated_setLensOffsets(float f, float f2, float f3, float f4);

    void dumpDebugData();

    int getTargetApiVersion();

    void invokeCloseAction();

    void recenterHeadTracking();

    bahr requestStopTracking();

    void resumeHeadTracking(bahr bahr);

    void setLensOffset(float f, float f2, float f3);
}
