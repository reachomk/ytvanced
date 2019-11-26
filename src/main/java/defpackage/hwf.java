package defpackage;

import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* renamed from: hwf */
public final class hwf extends exy {
    public final acvx e;
    public byte[] f;
    private TextView g;
    private CompoundButton h;

    public hwf(acvx acvx) {
        this.e = acvx;
    }

    /* Access modifiers changed, original: protected|final */
    public final void d() {
    }

    public final void a(boolean z, boolean z2) {
        super.a(z, z2);
        if (c()) {
            byte[] bArr = this.f;
            if (bArr != null) {
                this.e.a(new acvs(bArr), null);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void f() {
        this.g = (TextView) g().findViewById(R.id.autonav_toggle_title);
        this.h = (CompoundButton) g().findViewById(R.id.autonav_toggle_button);
        this.h.setOnCheckedChangeListener(new hwi());
        this.h.setOnClickListener(new hwh(this));
        if (g() != null) {
            this.h.setChecked(false);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void e() {
        aoyu aoyu = (aoyu) this.b;
        if (aoyu != null) {
            TextView textView = this.g;
            arml arml = aoyu.b;
            if (arml == null) {
                arml = arml.f;
            }
            textView.setText(ajqy.a(arml));
            if ((aoyu.a & 2) != 0) {
                anxp anxp = aoyu.c;
                if (anxp == null) {
                    anxp = axak.a;
                }
                anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.toggleButtonRenderer);
                anxp.a(access$000);
                if (anxp.h.a(access$000.d)) {
                    anxp anxp2 = aoyu.c;
                    if (anxp2 == null) {
                        anxp2 = axak.a;
                    }
                    anxr access$0002 = anxl.checkIsLite(ButtonRendererOuterClass.toggleButtonRenderer);
                    anxp2.a(access$0002);
                    Object b = anxp2.h.b(access$0002.d);
                    if (b == null) {
                        b = access$0002.b;
                    } else {
                        b = access$0002.a(b);
                    }
                    aphv aphv = (aphv) b;
                    if ((aphv.a & 16777216) != 0) {
                        this.f = aphv.r.d();
                    }
                }
            }
        }
    }
}
