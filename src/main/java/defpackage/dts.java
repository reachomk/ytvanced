package defpackage;

import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;

/* renamed from: dts */
public final class dts implements baqa {
    public static final dts a = new dts();

    public final /* synthetic */ Object get() {
        Object obj;
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            Object obj2 = null;
            Object obj3 = null;
            for (int i = 0; i < numberOfCameras; i++) {
                CameraInfo cameraInfo = new CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    obj2 = 1;
                } else if (cameraInfo.facing == 1) {
                    obj3 = 1;
                }
            }
            obj = obj2 != null ? obj3 == null ? ashm.CAMERA_BACK : ashm.CAMERA_FRONT_AND_BACK : obj3 == null ? ashm.CAMERA_NONE : ashm.CAMERA_FRONT;
        } catch (Exception e) {
            xtl.a("Can't get camera type", e);
            obj = ashm.CAMERA_UNKNOWN;
        }
        return (ashm) baqd.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
