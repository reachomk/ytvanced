package defpackage;

import com.google.android.youtube.R;

/* renamed from: ikt */
final /* synthetic */ class ikt implements xar {
    private final iks a;

    ikt(iks iks) {
        this.a = iks;
    }

    public final void accept(Object obj) {
        iks iks = this.a;
        ajvr ajvr = (ajvr) obj;
        asrx asrx = ajvr.a;
        if (asrx == null || (asrx.a & 1) == 0) {
            iks.e.a(iks.a.getString(R.string.error_generic), false);
            return;
        }
        iks.e.b();
        iks.f.setVisibility(0);
        if (ajvr.c != null) {
            iks.b.t().a(new acvs(ajvr.c));
        }
        axez axez = ajvr.a.b;
        if (axez == null) {
            axez = axez.g;
        }
        axex axex = axez.d;
        if (axex == null) {
            axex = axex.c;
        }
        if (axex == null || axex.a != 222895468) {
            iks.f.setVisibility(8);
        } else {
            arri arri = (arri) axex.b;
            axak axak = arri.d;
            if (axak == null) {
                axak = axak.a;
            }
            iks.a(axak, iks.c, iks.h);
            axak = arri.c;
            if (axak == null) {
                axak = axak.a;
            }
            iks.a(axak, iks.d, iks.i);
            if (iks.i.getVisibility() == 0) {
                iks.d.d = new ikw(iks);
            }
            arml arml = arri.b;
            if (arml == null) {
                arml = arml.f;
            }
            iks.g.setText(ajqy.a(arml));
            iks.g.setContentDescription(ajqy.b(arml));
        }
        anze anze = ajvr.a.b;
        if (anze == null) {
            anze = axez.g;
        }
        iks.j.b(new aafn((akab) ajzv.a(anze, akab.class)));
    }
}
