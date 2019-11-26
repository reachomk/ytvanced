package defpackage;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.view.Display;
import android.view.WindowManager;
import com.google.vr.sdk.base.sensors.internal.GyroscopeBiasEstimator;
import com.google.vr.sdk.base.sensors.internal.Vector3d;

/* renamed from: ahpm */
final class ahpm {
    public final Object a = new Object();
    public SensorEventListener b;
    public boolean c;
    public Handler d;
    public float e;
    public float f;
    public float g;
    public int h;
    public float i;
    public boolean j;
    public long k;
    public final float[] l = new float[]{-1.0f, 1.0f};
    public final Display m;
    public final Object n = new Object();
    public final GyroscopeBiasEstimator o;
    public float[] p;
    public final Vector3d q = new Vector3d();
    public final Vector3d r = new Vector3d();
    public final Vector3d s = new Vector3d();
    private final SensorManager t;
    private boolean u;

    public ahpm(Context context) {
        this.t = (SensorManager) context.getSystemService("sensor");
        this.m = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.o = new GyroscopeBiasEstimator();
    }

    public final void a() {
        if (this.c) {
            a(false);
            synchronized (this.a) {
                this.c = false;
                Handler handler = this.d;
                if (handler != null) {
                    handler.post(new ahpr());
                }
            }
            this.d = null;
        }
    }

    /* JADX WARNING: Missing block: B:23:0x0065, code skipped:
            return;
     */
    public final synchronized void a(boolean r8) {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = 0;
        if (r8 == 0) goto L_0x0055;
    L_0x0004:
        r8 = r7.u;	 Catch:{ all -> 0x0066 }
        if (r8 != 0) goto L_0x0064;
    L_0x0008:
        r8 = r7.t;	 Catch:{ all -> 0x0066 }
        r1 = 1;
        r8 = r8.getDefaultSensor(r1);	 Catch:{ all -> 0x0066 }
        r2 = r7.t;	 Catch:{ all -> 0x0066 }
        r3 = 9;
        r2 = r2.getDefaultSensor(r3);	 Catch:{ all -> 0x0066 }
        r3 = r7.t;	 Catch:{ all -> 0x0066 }
        r4 = 16;
        r3 = r3.getDefaultSensor(r4);	 Catch:{ all -> 0x0066 }
        if (r3 == 0) goto L_0x002b;
    L_0x0021:
        r4 = android.os.Build.MANUFACTURER;	 Catch:{ all -> 0x0066 }
        r5 = "HTC";
        r4 = r4.equals(r5);	 Catch:{ all -> 0x0066 }
        if (r4 == 0) goto L_0x0032;
    L_0x002b:
        r3 = r7.t;	 Catch:{ all -> 0x0066 }
        r4 = 4;
        r3 = r3.getDefaultSensor(r4);	 Catch:{ all -> 0x0066 }
    L_0x0032:
        if (r2 == 0) goto L_0x0064;
    L_0x0034:
        if (r3 == 0) goto L_0x0064;
    L_0x0036:
        r4 = r7.t;	 Catch:{ all -> 0x0066 }
        r5 = r7.b;	 Catch:{ all -> 0x0066 }
        r6 = r7.d;	 Catch:{ all -> 0x0066 }
        r4.registerListener(r5, r8, r0, r6);	 Catch:{ all -> 0x0066 }
        r8 = r7.t;	 Catch:{ all -> 0x0066 }
        r4 = r7.b;	 Catch:{ all -> 0x0066 }
        r5 = r7.d;	 Catch:{ all -> 0x0066 }
        r8.registerListener(r4, r2, r0, r5);	 Catch:{ all -> 0x0066 }
        r8 = r7.t;	 Catch:{ all -> 0x0066 }
        r2 = r7.b;	 Catch:{ all -> 0x0066 }
        r4 = r7.d;	 Catch:{ all -> 0x0066 }
        r8.registerListener(r2, r3, r0, r4);	 Catch:{ all -> 0x0066 }
        r7.u = r1;	 Catch:{ all -> 0x0066 }
        monitor-exit(r7);
        return;
    L_0x0055:
        r8 = r7.u;	 Catch:{ all -> 0x0066 }
        if (r8 == 0) goto L_0x0064;
    L_0x0059:
        r8 = r7.t;	 Catch:{ all -> 0x0066 }
        r1 = r7.b;	 Catch:{ all -> 0x0066 }
        r8.unregisterListener(r1);	 Catch:{ all -> 0x0066 }
        r7.u = r0;	 Catch:{ all -> 0x0066 }
        monitor-exit(r7);
        return;
    L_0x0064:
        monitor-exit(r7);
        return;
    L_0x0066:
        r8 = move-exception;
        monitor-exit(r7);
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahpm.a(boolean):void");
    }
}
