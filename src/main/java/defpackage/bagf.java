package defpackage;

import android.app.ActivityManager;
import android.graphics.Point;
import android.opengl.GLSurfaceView.Renderer;
import android.os.Build.VERSION;
import android.os.Process;
import android.util.Log;
import com.google.vr.ndk.base.GvrApi;
import com.google.vr.ndk.base.GvrSurfaceView;
import java.lang.reflect.InvocationTargetException;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: bagf */
public final class bagf implements Renderer {
    public GvrSurfaceView a;
    private final GvrApi b;

    public bagf(GvrApi gvrApi) {
        if (gvrApi != null) {
            this.b = gvrApi;
            return;
        }
        throw new IllegalArgumentException("GvrApi must be supplied for proper scanline rendering");
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        String str;
        String valueOf;
        Thread.currentThread().setPriority(10);
        int myTid = Process.myTid();
        if (baew.a()) {
            try {
                try {
                    ActivityManager.class.getMethod("setVrThread", new Class[]{Integer.TYPE}).invoke(null, new Object[]{Integer.valueOf(myTid)});
                } catch (IllegalAccessException | RuntimeException | InvocationTargetException e) {
                    str = baew.a;
                    valueOf = String.valueOf(e);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 30);
                    stringBuilder.append("Failed to invoke setVrThread: ");
                    stringBuilder.append(valueOf);
                    Log.e(str, stringBuilder.toString());
                }
            } catch (NoSuchMethodException | RuntimeException e2) {
                String str2 = "Failed to acquire setVrThread method: ";
                StringBuilder stringBuilder2;
                if ("NMR1".equals(VERSION.CODENAME) || VERSION.SDK_INT >= 25) {
                    str = baew.a;
                    valueOf = String.valueOf(e2);
                    stringBuilder2 = new StringBuilder(valueOf.length() + 38);
                    stringBuilder2.append(str2);
                    stringBuilder2.append(valueOf);
                    Log.e(str, stringBuilder2.toString());
                } else {
                    str = baew.a;
                    valueOf = String.valueOf(e2);
                    stringBuilder2 = new StringBuilder(valueOf.length() + 38);
                    stringBuilder2.append(str2);
                    stringBuilder2.append(valueOf);
                    Log.w(str, stringBuilder2.toString());
                }
            }
        }
        this.b.onSurfaceCreatedReprojectionThread();
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.b.onSurfaceChangedReprojectionThread();
    }

    public final void onDrawFrame(GL10 gl10) {
        Point renderReprojectionThread = this.b.renderReprojectionThread();
        if (renderReprojectionThread != null) {
            bagi.a(new bage(this, renderReprojectionThread.x, renderReprojectionThread.y));
        }
    }

    public final void a() {
        this.b.onPauseReprojectionThread();
    }
}
