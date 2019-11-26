package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: afhn */
public final class afhn implements afhc, SensorEventListener {
    public static final int a = ((int) TimeUnit.SECONDS.toMicros(1));
    private static afhc e;
    public final SensorManager b;
    public Sensor c;
    public Handler d;
    private final HashSet f = new HashSet();
    private float g = -1.0f;
    private Thread h;

    public static afhc a(Context context) {
        afhc afhc = e;
        if (afhc != null) {
            return afhc;
        }
        afhn afhn = new afhn(context);
        e = afhn;
        return afhn;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    private afhn(Context context) {
        this.b = (SensorManager) context.getSystemService("sensor");
        SensorManager sensorManager = this.b;
        if (sensorManager != null) {
            this.c = sensorManager.getDefaultSensor(5);
        }
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.g = sensorEvent.values[0];
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((afhf) it.next()).p();
        }
    }

    public final void a(afhf afhf) {
        if (afhf instanceof afjt) {
            b();
        }
        this.f.add(afhf);
        if (this.h == null && this.c != null) {
            this.h = new Thread(new afhm(this), "mediaViewambientBrightnessSensor");
            this.h.start();
        }
    }

    public final void b(afhf afhf) {
        if (this.f.isEmpty() || !(afhf instanceof afjt)) {
            this.f.remove(afhf);
        } else {
            b();
        }
        if (this.h != null && this.f.isEmpty()) {
            Handler handler = this.d;
            if (handler != null) {
                handler.post(new afhp(this));
                this.d = null;
                this.h = null;
            }
        }
    }

    public final float a() {
        return this.g;
    }

    private final void b() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            if (((afhf) it.next()) instanceof afjt) {
                it.remove();
            }
        }
    }
}
