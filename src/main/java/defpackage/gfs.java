package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.HashMap;
import java.util.Map;

/* renamed from: gfs */
public final class gfs {
    public final aaas a;
    public final acwa b;
    public final Map c = new HashMap();
    private final Context d;
    private final akvp e;

    public gfs(Context context, akvp akvp, aaas aaas, acwa acwa) {
        this.d = context;
        this.e = akvp;
        this.a = aaas;
        this.b = acwa;
    }

    public final void a(ViewGroup viewGroup, awwx awwx) {
        acvx t = this.b.t();
        t.b(new acvs(awwx.c.d()));
        for (axak axak : awwx.b) {
            anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            axak.a(access$000);
            if (axak.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
                axak.a(access$000);
                Object b = axak.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                aphg aphg = (aphg) b;
                ImageButton imageButton = (ImageButton) ((LayoutInflater) this.d.getSystemService("layout_inflater")).inflate(R.layout.reel_creation_tray_button, viewGroup, false);
                this.c.put(aphg, imageButton);
                if ((aphg.a & 16) != 0) {
                    akvp akvp = this.e;
                    arwf arwf = aphg.e;
                    if (arwf == null) {
                        arwf = arwf.c;
                    }
                    arwh a = arwh.a(arwf.b);
                    if (a == null) {
                        a = arwh.UNKNOWN;
                    }
                    imageButton.setImageResource(akvp.a(a));
                }
                if ((aphg.a & 16384) != 0) {
                    aodv aodv = aphg.p;
                    if (aodv == null) {
                        aodv = aodv.c;
                    }
                    imageButton.setContentDescription(aodv.b);
                }
                imageButton.setOnClickListener(new gfv(this, aphg, t));
                viewGroup.addView(imageButton);
            }
        }
    }

    public static void a(ImageButton imageButton, boolean z) {
        imageButton.setEnabled(z);
        imageButton.setImageAlpha(!z ? 85 : 255);
    }
}
