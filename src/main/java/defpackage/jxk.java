package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* renamed from: jxk */
public final class jxk implements akot {
    public final hwl a;
    public acvx b;
    public aphv c;
    private final View d;
    private final TextView e = ((TextView) this.d.findViewById(R.id.autonav_title));
    private final TextView f = ((TextView) this.d.findViewById(R.id.autonav_toggle_title));
    private final CompoundButton g = ((CompoundButton) this.d.findViewById(R.id.autonav_toggle));
    private final ahlo h = new jxn(this);
    private CharSequence i;
    private CharSequence j;

    public jxk(Context context, hwl hwl) {
        this.a = hwl;
        this.d = View.inflate(context, R.layout.autonav_toggle, null);
        this.g.setOnCheckedChangeListener(new jxm(hwl));
    }

    public final View K_() {
        return this.d;
    }

    public final void a(akpb akpb) {
        this.a.b(this.h);
    }

    public final void a(boolean z) {
        this.g.setChecked(z);
        this.f.setText(!z ? this.i : this.j);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        arml arml2;
        aoyu aoyu = (aoyu) obj;
        this.b = (acvx) amqw.a(akor.a);
        TextView textView = this.e;
        arml arml3 = null;
        if ((aoyu.a & 1) != 0) {
            arml = aoyu.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        this.e.setVisibility(0);
        anxp anxp = aoyu.c;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.toggleButtonRenderer);
        anxp.a(access$000);
        Object b = anxp.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        this.c = (aphv) b;
        aphv aphv = this.c;
        if ((aphv.a & 64) != 0) {
            arml2 = aphv.e;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        this.i = ajqy.a(arml2);
        aphv = this.c;
        if ((aphv.a & 4096) != 0) {
            arml3 = aphv.k;
            if (arml3 == null) {
                arml3 = arml.f;
            }
        }
        this.j = ajqy.a(arml3);
        if (TextUtils.isEmpty(this.j)) {
            this.j = this.i;
        }
        this.a.a(this.h);
        a(this.a.a());
    }
}
