package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.OrientationEventListener;
import android.view.WindowManager;

/* renamed from: xoa */
public final class xoa extends OrientationEventListener {
    public boolean a;
    private final xod b;
    private int c;

    @Deprecated
    public xoa(Context context, WindowManager windowManager, xoc xoc) {
        this(context, windowManager);
        a(xoc);
    }

    public xoa(Context context, WindowManager windowManager) {
        Handler handler = new Handler(context.getMainLooper());
        int rotation = windowManager.getDefaultDisplay().getRotation();
        int i = context.getResources().getConfiguration().orientation;
        boolean z = false;
        if (rotation == 0 || rotation == 2 ? i != 2 : i != 1) {
            z = true;
        }
        super(context, 3);
        this.c = -1;
        this.b = new xod(handler, z);
    }

    public final void onOrientationChanged(int i) {
        int i2 = 0;
        if (!(xty.a(i - 360, -20, 0) || xty.b(i, 0, 20))) {
            i2 = !xty.b(i + -90, -20, 20) ? !xty.b(i + -180, -20, 20) ? !xty.b(i + -270, -20, 20) ? -1 : 3 : 2 : 1;
        }
        if (this.c != i2) {
            this.c = i2;
            xod xod = this.b;
            if (i2 != -1) {
                xod.a.removeCallbacks(xod);
                xod.d = i2;
                xod.a.postDelayed(xod, !xod.c ? 200 : 0);
            }
        }
    }

    public final void enable() {
        this.a = true;
        super.enable();
    }

    public final void disable() {
        super.disable();
        this.a = false;
        this.c = -1;
        xod xod = this.b;
        xod.a.removeCallbacks(xod);
        xod.c = true;
        xod.d = -1;
    }

    public final void a(xoc xoc) {
        xod xod = this.b;
        amqw.a((Object) xoc);
        xod.b.add(xoc);
    }
}
