package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.google.vr.sdk.base.sensors.internal.Vector3d;

/* renamed from: ahpp */
final class ahpp implements SensorEventListener {
    private final /* synthetic */ ahpm a;

    ahpp(ahpm ahpm) {
        this.a = ahpm;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        SensorEvent sensorEvent2 = sensorEvent;
        ahpm ahpm = this.a;
        if (sensorEvent2.sensor.getType() == 1) {
            ahpm.q.set((double) sensorEvent2.values[0], (double) sensorEvent2.values[1], (double) sensorEvent2.values[2]);
            synchronized (ahpm.n) {
                ahpm.o.processAccelerometer(ahpm.q, sensorEvent2.timestamp);
            }
        } else if (sensorEvent2.sensor.getType() == 4 || sensorEvent2.sensor.getType() == 16) {
            if (sensorEvent2.sensor.getType() == 16) {
                if (ahpm.p == null && sensorEvent2.values.length == 6) {
                    ahpm.p = new float[]{sensorEvent2.values[3], sensorEvent2.values[4], sensorEvent2.values[5]};
                }
                if (ahpm.p != null) {
                    ahpm.r.set((double) (sensorEvent2.values[0] - ahpm.p[0]), (double) (sensorEvent2.values[1] - ahpm.p[1]), (double) (sensorEvent2.values[2] - ahpm.p[2]));
                } else {
                    ahpm.r.set((double) sensorEvent2.values[0], (double) sensorEvent2.values[1], (double) sensorEvent2.values[2]);
                }
            } else {
                ahpm.r.set((double) sensorEvent2.values[0], (double) sensorEvent2.values[1], (double) sensorEvent2.values[2]);
            }
            synchronized (ahpm.n) {
                ahpm.o.processGyroscope(ahpm.r, sensorEvent2.timestamp);
                ahpm.o.getGyroBias(ahpm.s);
                Vector3d vector3d = ahpm.r;
                Vector3d.sub(vector3d, ahpm.s, vector3d);
            }
            if (ahpm.k != -1) {
                double d;
                int i = ahpm.h;
                if (i == 0) {
                    d = ahpm.r.x;
                } else if (i != 1) {
                    d = ahpm.r.z;
                } else {
                    d = ahpm.r.y;
                }
                long j = sensorEvent2.timestamp;
                long j2 = ahpm.k;
                float f = ahpm.f;
                float f2 = ahpm.i;
                d = (double) ((float) d);
                double d2 = (double) (((float) (j - j2)) * 1.0E-9f);
                Double.isNaN(d);
                Double.isNaN(d2);
                ahpm.f = f + (f2 * angz.a((float) (d * d2), -0.1f, 0.1f));
            }
            ahpm.k = sensorEvent2.timestamp;
        } else if (sensorEvent2.sensor.getType() == 9) {
            float f3 = sensorEvent2.values[0];
            float f4 = sensorEvent2.values[1];
            float f5 = sensorEvent2.values[2];
            ahpm.h = Math.abs(f3) > Math.abs(f4) ? 0 : 1;
            int rotation = ahpm.m.getRotation();
            float f6 = -1.0f;
            if (!(rotation == 0 || rotation == 3)) {
                f6 = 1.0f;
            }
            int i2 = (rotation == 0 || rotation == 2) ? 0 : 1;
            ahpm.g = (float) Math.atan2((double) (f6 * sensorEvent2.values[i2]), 9.806650161743164d);
            if (ahpm.h == 0) {
                float f7;
                if (f3 >= 0.0f) {
                    f7 = ahpm.l[0];
                } else {
                    f7 = ahpm.l[1];
                }
                ahpm.i = f7;
            } else {
                ahpm.i = f4 <= 0.0f ? ahpm.l[1] : ahpm.l[0];
            }
            ahpm.e = (f5 * 1.5707964f) / 9.80665f;
        }
    }
}
