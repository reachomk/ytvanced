package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.PrintWriter;

/* renamed from: nm */
final class nm extends nq implements atz, bi {
    private final /* synthetic */ nn e;

    public nm(nn nnVar) {
        this.e = nnVar;
        super(nnVar);
    }

    public final x y_() {
        return this.e.a;
    }

    public final bf R_() {
        return this.e.R_();
    }

    public final atv z_() {
        return this.e.f;
    }

    public final void a(String str, PrintWriter printWriter, String[] strArr) {
        this.e.dump(str, null, printWriter, strArr);
    }

    public final boolean c() {
        return this.e.isFinishing() ^ 1;
    }

    public final LayoutInflater f() {
        return this.e.getLayoutInflater().cloneInContext(this.e);
    }

    public final void g() {
        this.e.w_();
    }

    public final void a(nf nfVar, Intent intent, int i) {
        Activity activity = this.e;
        activity.c = true;
        if (i == -1) {
            try {
                mp.a(activity, intent, -1);
            } finally {
                activity.c = false;
            }
        } else {
            nn.b(i);
            mp.a(activity, intent, ((activity.a(nfVar) + 1) << 16) + ((char) i));
            activity.c = false;
        }
    }

    public final void a(nf nfVar, String[] strArr, int i) {
        Activity activity = this.e;
        if (i != -1) {
            nn.b(i);
            try {
                activity.b = true;
                mp.a(activity, strArr, ((activity.a(nfVar) + 1) << 16) + ((char) i));
            } finally {
                activity.b = false;
            }
        } else {
            mp.a(activity, strArr, -1);
        }
    }

    public final boolean a(String str) {
        return mp.a(this.e, str);
    }

    public final boolean h() {
        return this.e.getWindow() != null;
    }

    public final int i() {
        Window window = this.e.getWindow();
        return window != null ? window.getAttributes().windowAnimations : 0;
    }

    public final View a(int i) {
        return this.e.findViewById(i);
    }

    public final boolean a() {
        Window window = this.e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}
