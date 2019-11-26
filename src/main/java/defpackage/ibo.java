package defpackage;

import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.youtube.R;

/* renamed from: ibo */
public final class ibo implements ajkk {
    public boolean a;
    public final acvx b;
    public final ibq c;
    public TouchImageView d;
    public aibe e;
    private boolean f;

    public ibo(ibq ibq, ajjz ajjz, zyw zyw, acvx acvx) {
        this.c = ibq;
        this.b = acvx;
        if (foh.p(zyw)) {
            ajjz.a((ajkk) this);
        }
    }

    public final void a(int i, int i2) {
        this.f = i < i2;
        a();
    }

    public final void a() {
        int i = !this.a ? !this.f ? R.drawable.quantum_ic_fullscreen_white_24 : R.drawable.ic_fullscreen_vertical_button : R.drawable.quantum_ic_fullscreen_exit_white_24;
        this.d.setImageResource(i);
    }
}
