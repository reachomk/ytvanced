package defpackage;

import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UnpluggedPauseMembershipDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand;
import java.util.Map;

/* renamed from: wql */
public final class wql implements aaap {
    private final acwa a;
    private final woy b;

    public wql(acwa acwa, woy woy) {
        this.a = acwa;
        this.b = woy;
    }

    public final void a(apxu apxu, Map map) {
        aphg aphg;
        anxr access$000 = anxl.checkIsLite(YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand.ypcPauseMembershipDialogCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        anxp anxp = ((YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand) b).b;
        if (anxp == null) {
            anxp = axak.a;
        }
        access$000 = anxl.checkIsLite(UnpluggedPauseMembershipDialogRendererOuterClass.unpluggedPauseMembershipDialogRenderer);
        anxp.a(access$000);
        b = anxp.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        aypv aypv = (aypv) b;
        akor akor = new akor();
        akor.a(this.a.t());
        woy woy = this.b;
        woy.j = aypv;
        woy.i.setOnShowListener(new wpc(woy));
        woy.i.setOnCancelListener(new wpf(woy));
        TextView textView = woy.c;
        arml arml = woy.j.b;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
        Spanned[] b2 = ajqy.b(woy.j.c);
        xpr.a(woy.d, woy.a(b2, 0));
        xpr.a(woy.e, woy.a(b2, 1));
        woy.f.setMax(woy.j.d.size() - 1);
        woy.f.setOnSeekBarChangeListener(new wpe(woy));
        int i = woy.j.e;
        woy.k = i;
        woy.f.setProgress(i);
        woy.a();
        acvx acvx = akor.a;
        akyy akyy = woy.g;
        aphj aphj = woy.j.f;
        if (aphj == null) {
            aphj = aphj.d;
        }
        if ((aphj.a & 1) == 0) {
            aphg = null;
        } else {
            aphj = woy.j.f;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
        }
        akyy.a(aphg, acvx);
        woy.g.c = new wpb(woy);
        akyy = woy.h;
        aphj = woy.j.g;
        if (aphj == null) {
            aphj = aphj.d;
        }
        if ((aphj.a & 1) == 0) {
            aphg = null;
        } else {
            aphj = woy.j.g;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
        }
        akyy.a(aphg, acvx);
        woy.h.c = new wpa(woy, acvx);
        woy.g.d = new wpd(woy);
        acvx.a((aypv.a & 32) != 0 ? aypv.h.d() : null, null);
        View findViewById = woy.b.findViewById(R.id.scroll_body);
        double d = (double) woy.i.getContext().getResources().getDisplayMetrics().heightPixels;
        Double.isNaN(d);
        int i2 = (int) (d * 0.5d);
        findViewById.getLayoutParams().height = -2;
        if (findViewById.getMeasuredHeight() > i2) {
            findViewById.getLayoutParams().height = i2;
        }
        woy.i.show();
    }
}
