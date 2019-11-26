package defpackage;

import com.google.android.youtube.R;

/* renamed from: vue */
public final class vue implements aiso, vua {
    private final vtx a;
    private aisr b;

    public vue(vtx vtx) {
        this.a = vtx;
    }

    public final String b() {
        return "skip_ad";
    }

    public final int d() {
        return R.drawable.quantum_ic_skip_next_white_36;
    }

    public final int e() {
        return R.string.playback_control_next;
    }

    public final void f() {
    }

    public final boolean h() {
        return true;
    }

    public final void a() {
        aisr aisr = this.b;
        if (aisr != null) {
            aisr.a();
        }
    }

    public final void c() {
        this.a.d.a(-1, -1);
    }

    public final boolean g() {
        return this.a.c == 1;
    }

    public final void a(aisr aisr) {
        this.b = aisr;
    }
}
