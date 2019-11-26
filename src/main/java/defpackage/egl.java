package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.google.android.youtube.R;

/* renamed from: egl */
public final class egl extends nd {
    public int Z;
    public int aa;
    public egp ab;
    private double ac;
    private double ad;

    public final void a(Activity activity) {
        super.a(activity);
        ((egq) xse.a((Object) activity)).a(this);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        Object obj = this.j;
        amqw.a(obj, (Object) "Create fragment using ProgressBarDialogFragment.newInstance");
        this.ac = obj.getDouble("progressbar_height", 0.5d);
        this.ad = obj.getDouble("progressbar_width", 0.5d);
        a(1, 0);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.loader_dialog, viewGroup, false);
        inflate.post(new ego(this, inflate));
        return inflate;
    }

    public final void W() {
        if (F_()) {
            WindowManager windowManager = (WindowManager) p().getSystemService("window");
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            Window window = this.c.getWindow();
            window.setGravity(8388691);
            LayoutParams attributes = window.getAttributes();
            double d = (double) point.y;
            double d2 = this.ac;
            Double.isNaN(d);
            attributes.y = ((int) (d * d2)) - (this.aa / 2);
            d = (double) point.x;
            d2 = this.ad;
            Double.isNaN(d);
            attributes.x = ((int) (d * d2)) - (this.Z / 2);
            window.setAttributes(attributes);
        }
    }

    public final Dialog a(Bundle bundle) {
        Dialog a = super.a(bundle);
        a.setCanceledOnTouchOutside(false);
        a.getWindow().requestFeature(1);
        a.getWindow().setBackgroundDrawableResource(17170445);
        a.setOnKeyListener(new egn(this));
        return a;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        W();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        egp egp = this.ab;
        if (egp != null) {
            egp.g();
        }
    }
}
